package com.ArcherInfotech.tutionapp.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ArcherInfotech.tutionapp.Listener.ItemClickListner;
import com.ArcherInfotech.tutionapp.Modal.Cources;
import com.ArcherInfotech.tutionapp.R;

import org.w3c.dom.Text;

import java.util.List;

public class CourceAdaptor extends RecyclerView.Adapter<CourceAdaptor.CourceViewHolder>{

    List<Cources> courcesList;
    static ItemClickListner clickListner;

    public void setClickListner(ItemClickListner clickListner) {
        CourceAdaptor.clickListner = clickListner;
    }

    public CourceAdaptor(List<Cources> courcesList)
    {
        this.courcesList=courcesList;
    }

    @NonNull
    @Override
    public CourceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cource_cards,parent,false);
        return new CourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourceViewHolder holder, int position) {

        Cources cource =courcesList.get(position);

        holder.courcenm.setText(cource.getCourceName());
        holder.duration.setText(cource.getDuration());
        holder.rating.setImageResource(cource.getRating());
        holder.bg.setImageResource(cource.getBgimg());
        holder.courimg.setImageResource(cource.getMaincourceimg());
    }

    @Override
    public int getItemCount() {

        if(courcesList != null)
        {
            return courcesList.size();
        }
        return 0;
    }

    public static class CourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView courcenm;
        TextView duration;
        ImageView rating;
        ImageView bg;
        ImageView courimg;

        public CourceViewHolder(@NonNull View itemView) {
            super(itemView);

            courcenm = itemView.findViewById(R.id.courcename);
            duration = itemView.findViewById(R.id.duration);
            rating = itemView.findViewById(R.id.ratings);
            bg = itemView.findViewById(R.id.courcebg);
            courimg = itemView.findViewById(R.id.courceimg);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListner != null)
            {
                clickListner.onClick(view,getAdapterPosition());
            }
        }
    }
}
