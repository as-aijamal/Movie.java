package com.company.service;

import com.company.model.Movies;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies);

    void findMoviesByDirector(List<Movies> movies);

    void findMoviesByYear(List<Movies> movies);

    void findMoviesAndRoleByActor(List<Movies> movies);

    void showActorRoles(List<Movies> movies);
}
