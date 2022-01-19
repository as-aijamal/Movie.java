package com.company;

import com.company.model.Cast;
import com.company.model.Director;
import com.company.model.Movies;
import com.company.service.FindAble;
import com.company.service.SortAble;
import com.company.service.impl.FindByMap;
import com.company.service.impl.MovieStore;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Movies> movies = new ArrayList<>();
    private static final SortAble s = (SortAble) new MovieStore();
    private static final FindAble f = (FindAble) new FindByMap();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String data = null;
        try {
            data = new String(Files.readAllBytes(Path.of("movies.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject obj = new JSONObject(data);
        JSONArray array = obj.getJSONArray("movies");
        for (int i = 0; i < array.length(); i++) {
            JSONObject movieIndexes = array.getJSONObject(i);
            Movies movie = new Movies();
            movie.setName(movieIndexes.getString("name"));
            movie.setYear(movieIndexes.getInt("year"));
            movie.setDescription(movieIndexes.getString("description"));
            JSONObject directorInfo = movieIndexes.getJSONObject("director");
            Director director = new Director();
            director.setActor(directorInfo.getString("actor"));
            movie.setDirector(director);
            JSONArray castsArr = movieIndexes.getJSONArray("cast");
            for (int j = 0; j < castsArr.length(); j++) {
                JSONObject castsObj = castsArr.getJSONObject(j);
                Cast cast = new Cast();
                cast.setActor(castsObj.getString("actor"));
                cast.setRole(castsObj.getString("role"));
                movie.setCast(cast);
            }
            movies.add(movie);
        }

        while (true) {
            commands();
            start();
        }
    }

    static void commands() {
        System.out.println("===================== Commands ====================");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to find a movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to list all movies and roles by actor's name");
        System.out.println("Press 10 to sort list of all actors with his roles");
        System.out.println("====================================================");
    }

    public static void start() {
        String command = in.nextLine();
        switch (command) {
            case "1":
                s.printAllMovies(movies);
                break;
            case "2":
                s.findMovie(movies);
                break;
            case "3":
                s.sortByYear(movies);
                break;
            case "4":
                s.sortByName(movies);
                break;
            case "5":
                s.sortByDirector(movies);
                break;
            case "6":
                f.findMoviesByActor(movies);
                break;
            case "7":
                f.findMoviesByDirector(movies);
                break;
            case "8":
                f.findMoviesByYear(movies);
                break;
            case "9":
                f.findMoviesAndRoleByActor(movies);
                break;
            case "10":
                f.showActorRoles(movies);
                break;
            default:
                System.out.println("Wrong enter!!! Write the correct number, please!");
                break;
        }
    }
}
