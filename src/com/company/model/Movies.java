package com.company.model;

import java.util.Comparator;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast cast;


    public Cast getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

    public static Comparator<Movies> moviesComparator = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getYear() - o2.getYear();
        }
    };

    public static Comparator<Movies> sortByName = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movies> sortByDirector = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getDirector().getActor().compareTo(o2.getDirector().getActor());
        }
    };

    public static Comparator<Movies> sortByActor = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getCast().getActor().compareTo(o2.getCast().getActor());
        }
    };
    public static Comparator<Movies> moviesComparatorDesc = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getYear() - o1.getYear();
        }
    };


}
