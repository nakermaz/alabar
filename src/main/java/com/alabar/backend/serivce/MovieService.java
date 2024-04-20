package com.alabar.backend.serivce;

import com.alabar.backend.convertors.ConvertMainPageDTO;
import com.alabar.backend.dto.movieDTO.ListMainPageDTO;
import com.alabar.backend.dto.movieDTO.MainPageDTO;
import com.alabar.backend.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final ConvertMainPageDTO convertMainPageDTO;

    @Autowired
    public MovieService(MovieRepository movieRepository, ConvertMainPageDTO convertMainPageDTO) {
        this.movieRepository = movieRepository;
        this.convertMainPageDTO = convertMainPageDTO;
    }

    public ListMainPageDTO getMainPage(){
        //Average
        List<MainPageDTO> averageMovie = movieRepository.findAverageMovie()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> averageAnime = movieRepository.findAverageAnime()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> averageCartoon = movieRepository.findAverageCartoon()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> averageCartoonSeries = movieRepository.findAverageCartoonSeries()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());

        //New
        List<MainPageDTO> newMovie = movieRepository.findNewMovie()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> newAnime = movieRepository.findNewAnime()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> newCartoon = movieRepository.findNewCartoon()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> newCartoonSeries = movieRepository.findNewCartoonSeries()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());

        //Popular
        List<MainPageDTO> popularMovie = movieRepository.findPopularMovie()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> popularAnime = movieRepository.findPopularAnime()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> popularCartoon = movieRepository.findPopularCartoon()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());
        List<MainPageDTO> popularCartoonSeries = movieRepository.findPopularCartoonSeries()
                .stream()
                .map(convertMainPageDTO::mainPageResponse)
                .collect(Collectors.toList());


        ListMainPageDTO listMainPageDTO = new ListMainPageDTO(
                averageMovie, averageAnime, averageCartoon, averageCartoonSeries,
                newMovie, newAnime, newCartoon, newCartoonSeries,
                popularMovie, popularAnime, popularCartoon, popularCartoonSeries);

        return listMainPageDTO;
    }

}
