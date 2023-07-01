package com.June.BookMyShow.DTOs.RequestDTOs;

import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Data
public class ShowRequestDTO {

    private LocalTime showStartTime;
    private Date showDate;
    private int theaterId;
    private int movieId;
}
