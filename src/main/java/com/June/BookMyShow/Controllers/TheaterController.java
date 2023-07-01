package com.June.BookMyShow.Controllers;

import com.June.BookMyShow.DTOs.RequestDTOs.TheaterRequestDTO;
import com.June.BookMyShow.DTOs.RequestDTOs.TheaterSeatsRequestDTO;
import com.June.BookMyShow.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    private TheaterService theaterService;

    @PostMapping("/add")
    public String  addTheater(@RequestBody TheaterRequestDTO theaterRequestDTO){
        return theaterService.addTheater(theaterRequestDTO);
    }

//    @PostMapping("/addTheaterSeats")
//    public String addTheaterSeats(@RequestBody TheaterSeatsRequestDTO theaterSeatsRequestDTO){
//        return theaterService.addTheaterSeats(theaterSeatsRequestDTO);
//    }
}
