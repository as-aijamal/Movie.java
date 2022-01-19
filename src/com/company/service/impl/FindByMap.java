package com.company.service.impl;

import com.company.model.Movies;
import com.company.service.FindAble;
import java.util.List;
import java.util.Scanner;
public class FindByMap implements FindAble {

    static Scanner scanner = new Scanner(System.in);
    @Override
    public void findMoviesByActor(List<Movies> movies) {
        System.out.println("Write actor's name: ");
        String actorName = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getCast().getActor().equals(actorName)) {
                System.out.println("Name: " + movies.get(i).getName());
                System.out.println("Year: " + movies.get(i).getYear());
                System.out.println("Description: " + movies.get(i).getDescription());
                System.out.println("Director: " + movies.get(i).getDirector());
                System.out.println("* Cast of " + movies.get(i).getName() + " *\n"
                        + "Actor: " + movies.get(i).getCast().getActor());
                System.out.println("Role: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies) {
        System.out.println("Write director's name: ");
        String director = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getDirector().getActor().equals(director)) {
                System.out.println("Director: " + movies.get(i).getDirector());
                System.out.println("Name: " + movies.get(i).getName());
                System.out.println("Year: " + movies.get(i).getYear());
                System.out.println("Description: " + movies.get(i).getDescription());
                System.out.println("* Cast of " + movies.get(i).getName() + " *\n"
                        + "Actor: " + movies.get(i).getCast().getActor());
                System.out.println("Role: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesByYear(List<Movies> moviesYear) {
        System.out.println("Write the year: ");
        int year = scanner.nextInt();
        for (int i = 0; i < moviesYear.size(); i++) {
            if (moviesYear.get(i).getYear() == year) {
                System.out.println("Year: " + moviesYear.get(i).getYear());
                System.out.println("Director: " + moviesYear.get(i).getDirector());
                System.out.println("Name: " + moviesYear.get(i).getName());
                System.out.println("Description: " + moviesYear.get(i).getDescription());
                System.out.println("* Cast of " + moviesYear.get(i).getName() + " *\n"
                        + "Actor: " + moviesYear.get(i).getCast().getActor());
                System.out.println("Role: " + moviesYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
        System.out.println("Write actor's name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getCast().getActor().equals(name)) {
                System.out.println("---------------------------------------------------");
                System.out.println("              Actor: " + movies.get(i).getCast().getActor());
                System.out.println("---------------------------------------------------");
                System.out.println("Movie: " + movies.get(i).getName());
                System.out.println("Role: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        movies.sort(Movies.sortByActor);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Actor: " + movies.get(i).getCast().getActor());
            System.out.println("Role: " + movies.get(i).getCast().getRole());
            System.out.println("Movie: " + movies.get(i).getName());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
