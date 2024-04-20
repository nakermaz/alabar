package com.alabar.backend.dto.movieDTO;

import java.util.List;

public record ListMainPageDTO (
        //Average
        List<MainPageDTO> averageMovie,
        List<MainPageDTO> averageAnime,
        List<MainPageDTO> averageCartoon,
        List<MainPageDTO> averageCartoonSeries,
        //New
        List<MainPageDTO> newMovie,
        List<MainPageDTO> newAnime,
        List<MainPageDTO> newCartoon,
        List<MainPageDTO> newCartoonSeries,
        //Popular
        List<MainPageDTO> popularMovie,
        List<MainPageDTO> popularAnime,
        List<MainPageDTO> popularCartoon,
        List<MainPageDTO> popularCartoonSeries
) {
}
