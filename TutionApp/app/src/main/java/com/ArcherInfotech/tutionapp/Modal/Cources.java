package com.ArcherInfotech.tutionapp.Modal;

public class Cources {

    String courceName;
    String duration;
    int rating;
    int bgimg;
    int maincourceimg;

    public Cources(String courceName,String duration,int rating,int bgimg,int maincourceimg)
    {
        this.courceName=courceName;
        this.duration=duration;
        this.rating=rating;
        this.bgimg=bgimg;
        this.maincourceimg=maincourceimg;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBgimg() {
        return bgimg;
    }

    public void setBgimg(int bgimg) {
        this.bgimg = bgimg;
    }

    public int getMaincourceimg() {
        return maincourceimg;
    }

    public void setMaincourceimg(int maincourceimg) {
        this.maincourceimg = maincourceimg;
    }
}
