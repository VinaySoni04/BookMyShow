package com.June.BookMyShow.DTOs.RequestDTOs;

import com.June.BookMyShow.Enums.Genre;
import com.June.BookMyShow.Enums.Language;
import lombok.Data;

import java.util.Date;

@Data
public class MovieRequestDTO {
    private String movieName;
    private double duration;
    private double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
