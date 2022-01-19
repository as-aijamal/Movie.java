package com.company.service.impl;
import com.company.model.Movies;
import com.company.service.SortAble;
import java.util.*;

public class MovieStore implements SortAble {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void printAllMovies(List<Movies> movies) {
        System.out.println("~~~~~~~~~~~~~~~~~~ * All Movies * ~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Name: " + movies.get(i).getName());
            System.out.println("Year: " + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("Director: " + movies.get(i).getDirector());
            System.out.println("* Cast of " + movies.get(i).getName() + " *\n" +
                    "Actor: " + movies.get(i).getCast().getActor());
            System.out.println("Role: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovie(List<Movies> moviesName) {
        System.out.println("Write movie's name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < moviesName.size(); i++) {
            if (moviesName.get(i).getName().equals(name)) {
                System.out.println("Name: " + moviesName.get(i).getName());
                System.out.println("Year: " + moviesName.get(i).getYear());
                System.out.println("Description: " + moviesName.get(i).getDescription());
                System.out.println("Director: " + moviesName.get(i).getDirector());
                System.out.println("* Cast of " + moviesName.get(i).getName() + " *\n" +
                        "Actor: " + moviesName.get(i).getCast().getActor());
                System.out.println("Role: " + moviesName.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void sortByYear(List<Movies> movieYear) {
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int choice = scanner.nextInt();
        if(choice==1) {
            movieYear.sort(Movies.moviesComparator);
            for (int i = 0; i < movieYear.size(); i++) {
                System.out.println("Year: " + movieYear.get(i).getYear());
                System.out.println("Name: " + movieYear.get(i).getName());
                System.out.println("Description: " + movieYear.get(i).getDescription());
                System.out.println("Director: " + movieYear.get(i).getDirector());
                System.out.println("* Cast of " + movieYear.get(i).getName() + " *\n" +
                        "Actor: " + movieYear.get(i).getCast().getActor());
                System.out.println("Role: " + movieYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }else if(choice==2){
            movieYear.sort(Movies.moviesComparatorDesc);
            for (int i = 0; i < movieYear.size(); i++) {
                System.out.println("Year: " + movieYear.get(i).getYear());
                System.out.println("Name: " + movieYear.get(i).getName());
                System.out.println("Description: " + movieYear.get(i).getDescription());
                System.out.println("Director: " + movieYear.get(i).getDirector());
                System.out.println("* Cast of " + movieYear.get(i).getName() + " *\n" +
                        "Actor: " + movieYear.get(i).getCast().getActor());
                System.out.println("Role: " + movieYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }else {
            System.out.println("wrong enter");
        }
    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.sort(Movies.sortByName);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Name: " + movies.get(i).getName());
            System.out.println("Year" + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("Director: " + movies.get(i).getDirector());
            System.out.println("* Cast of " + movies.get(i).getName() + " *\n" +
                    "Actor: " + movies.get(i).getCast().getActor());
            System.out.println("Role: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        movies.sort(Movies.sortByDirector);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Director: " + movies.get(i).getDirector());
            System.out.println("Name: " + movies.get(i).getName());
            System.out.println("Year" + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("* Cast of " + movies.get(i).getName() + " *\n" +
                    "Actor: " + movies.get(i).getCast().getActor());
            System.out.println("Role: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}