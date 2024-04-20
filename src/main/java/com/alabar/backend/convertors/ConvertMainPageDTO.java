package com.alabar.backend.convertors;

import com.alabar.backend.domain.Movie;
import com.alabar.backend.dto.movieDTO.MainPageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConvertMainPageDTO {

    public MainPageDTO mainPageResponse(Movie movie){
        return new MainPageDTO(movie.getId(), movie.getImage(), movie.getName());
    }

}
