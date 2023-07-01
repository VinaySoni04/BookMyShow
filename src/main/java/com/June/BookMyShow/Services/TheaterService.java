package com.June.BookMyShow.Services;

import com.June.BookMyShow.DTOs.RequestDTOs.TheaterRequestDTO;
import com.June.BookMyShow.DTOs.RequestDTOs.TheaterSeatsRequestDTO;
import com.June.BookMyShow.Models.Theater;
import com.June.BookMyShow.Repository.TheaterRepository;
import com.June.BookMyShow.Transformers.TheaterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository theaterRepository;
    public String addTheater(TheaterRequestDTO theaterRequestDTO) {
        Theater theater= TheaterTransformer.convertDtoToEntity(theaterRequestDTO);
        theaterRepository.save(theater);
        return "Theater is added successfully";
    }

//    public String addTheaterSeats(TheaterSeatsRequestDTO theaterSeatsRequestDTO) {
//    }
}
