package com.fitnessplanner.controller;

import com.fitnessplanner.models.Booking;
import com.fitnessplanner.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  Controller for working with booking service
 * Created by paula on 3/14/2017.
 */
@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/{workoutName}")
    public List<Booking> getBookingByWorkcenter(@PathVariable String workcenterName){
        return bookingService.getAllBookingForWorkout(workcenterName);
    }

    @GetMapping("/{trainerName}")
    public List<Booking> getBookingsByTrainer(@PathVariable String trainerName){
        return bookingService.getAllBookingForTrainer(trainerName);
    }
}
