package com.ArcherInfotech.tutionapp;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.ArcherInfotech.tutionapp.SQLiteDB.DataBase;

import java.util.Calendar;

public class AdmissionForm extends AppCompatActivity {

    EditText fullName,email,phone;
    TextView datetextView;
    Spinner courseLevel;
    AppCompatButton submitButton;
    DataBase DB;

    @SuppressLint("CutPasteId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_form);

        fullName = findViewById(R.id.full_name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        courseLevel = findViewById(R.id.level);
        submitButton = findViewById(R.id.submit_button);

        DB = new DataBase(this);

        // Get reference to the Spinner
        Spinner courseSpinner = findViewById(R.id.level);

        // Set up the ArrayAdapter for Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.course_list, R.layout.spinner_selected_item); // Selected item layout

        adapter.setDropDownViewResource(R.layout.spinner_item); // Dropdown items layout

        courseSpinner.setAdapter(adapter);

        // Get reference to the TextView for date display
        datetextView = findViewById(R.id.dateTextView);

        // Set up a listener for Spinner selection
        courseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (position == 0) {
                    // The user selected the prompt item "Select a course"
                } else {
                    // Handle course selection
                    String selectedCourse = parentView.getItemAtPosition(position).toString();
                    Toast.makeText(AdmissionForm.this, "Selected: " + selectedCourse, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });

        // Initialize the date picker
        datetextView.setOnClickListener(v -> showDatePicker());

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullNameText = fullName.getText().toString();
                String emailText = email.getText().toString();
                String phoneText = phone.getText().toString();
                String courseDateText = datetextView.getText().toString();
                String courseLevelText = courseLevel.getSelectedItem().toString();

                Boolean insert = DB.insertAdmissionData(fullNameText, emailText, phoneText, courseDateText, courseLevelText);
                if(insert) {
                    Toast.makeText(AdmissionForm.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AdmissionForm.this, "Data Insertion Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showDatePicker() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    datetextView.setText(selectedDate); // Set selected date on TextView
                },
                year, month, day
        );

        datePickerDialog.show();
    }
}
