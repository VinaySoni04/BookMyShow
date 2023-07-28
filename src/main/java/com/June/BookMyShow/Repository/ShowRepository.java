package com.June.BookMyShow.Repository;

import com.June.BookMyShow.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface ShowRepository extends JpaRepository<Show,Integer> {
    @Query(value = "select movie_id from shows group by movie_id order by count(*) desc limit 1;",nativeQuery = true)
    public int getMostShowedMovie(LocalDate showDate);
}
