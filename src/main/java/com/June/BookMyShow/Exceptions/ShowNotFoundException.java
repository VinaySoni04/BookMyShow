package com.June.BookMyShow.Exceptions;

import com.June.BookMyShow.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public class ShowNotFoundException extends Exception {
    public ShowNotFoundException(String message){
        super(message);
    }
}
