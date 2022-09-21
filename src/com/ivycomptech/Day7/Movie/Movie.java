package com.ivycomptech.Day7.Movie;

public class Movie {
    private String title;
    private String studio;
    private  String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public Movie[] getPG(Movie[] movies){
        Movie[] pgMov = new Movie[movies.length];
        int newArrayIndex=0;
        for(int i=0;i< movies.length;i++){
            if(movies[i].rating.equals("PG")){
                pgMov[newArrayIndex]=movies[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

}
