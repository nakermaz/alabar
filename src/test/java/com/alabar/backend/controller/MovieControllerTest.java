package com.alabar.backend.controller;


import com.alabar.backend.dto.movieDTO.ListMainPageDTO;
import com.alabar.backend.dto.movieDTO.MainPageDTO;
import com.alabar.backend.serivce.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class MovieControllerTest {

    @InjectMocks
    private MovieController movieController;

    @Mock
    private MovieService movieService;
    private ListMainPageDTO fakeListMainPageDTO;

    @BeforeEach
    void init(){
        List<MainPageDTO> fakeMainPage = new ArrayList<>();
        fakeListMainPageDTO = new ListMainPageDTO(fakeMainPage, fakeMainPage, fakeMainPage,
                fakeMainPage, fakeMainPage, fakeMainPage, fakeMainPage, fakeMainPage, fakeMainPage,
                fakeMainPage, fakeMainPage, fakeMainPage);
    }

    @Test
    void getMainPageTest(){
        when(movieService.getMainPage()).thenReturn(fakeListMainPageDTO);
        assertEquals(movieController.getMainPage(), fakeListMainPageDTO);
    }

}
