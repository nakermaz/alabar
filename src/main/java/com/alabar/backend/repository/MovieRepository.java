package com.alabar.backend.repository;

import com.alabar.backend.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    //Average Movie for MainPage
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'MOVIE' LIMIT 10", nativeQuery = true)
    List<Movie> findAverageMovie();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'ANIME' LIMIT 10", nativeQuery = true)
    List<Movie> findAverageAnime();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'CARTOON' LIMIT 10", nativeQuery = true)
    List<Movie> findAverageCartoon();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'CARTOON_SERIES' LIMIT 10", nativeQuery = true)
    List<Movie> findAverageCartoonSeries();

    //New Movie for MainPage
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'MOVIE' ORDER BY release_date DESC LIMIT 10", nativeQuery = true)
    List<Movie> findNewMovie();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'ANIME' ORDER BY release_date DESC LIMIT 10", nativeQuery = true)
    List<Movie> findNewAnime();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'CARTOON' ORDER BY release_date DESC LIMIT 10", nativeQuery = true)
    List<Movie> findNewCartoon();
    @Query(value = "select * from alabar_backend.movie u where u.format_movie = 'CARTOON_SERIES' ORDER BY release_date DESC LIMIT 10", nativeQuery = true)
    List<Movie> findNewCartoonSeries();

    //Popular Movie for MainPage
    @Query(value = "select s.* from alabar_backend.movie u where u.format_movie = 'MOVIE' s JOIN alabar_backend.rating r ON (s.id = r.movie_id) group by s.id order by AVG(value) desc LIMIT 10", nativeQuery = true)
    List<Movie> findPopularMovie();
    @Query(value = "select s.* from alabar_backend.movie u where u.format_movie = 'ANIME' s JOIN alabar_backend.rating r ON (s.id = r.movie_id) group by s.id order by AVG(value) desc LIMIT 10", nativeQuery = true)
    List<Movie> findPopularAnime();
    @Query(value = "select s.* from alabar_backend.movie u where u.format_movie = 'CARTOON' s JOIN alabar_backend.rating r ON (s.id = r.movie_id) group by s.id order by AVG(value) desc LIMIT 10", nativeQuery = true)
    List<Movie> findPopularCartoon();
    @Query(value = "select s.* from alabar_backend.movie u where u.format_movie = 'CARTOON_SERIES' s JOIN alabar_backend.rating r ON (s.id = r.movie_id) group by s.id order by AVG(value) desc LIMIT 10", nativeQuery = true)
    List<Movie> findPopularCartoonSeries();
}
