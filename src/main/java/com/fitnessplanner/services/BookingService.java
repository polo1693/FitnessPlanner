package com.fitnessplanner.services;

/**
 * Service for working with booking data
 * Created by paula on 3/14/2017.
 */

import com.fitnessplanner.models.Booking;
import com.fitnessplanner.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllBookingForWorkout(String workoutName){
        List<Booking> bookings = bookingRepository.findAllByWorkoutWorkoutName(workoutName);

        return bookings;
    }

    public List<Booking> getAllBookingForTrainer(String trainerName){
        List<Booking> bookings = bookingRepository.findAllByTrainerTrainerName(trainerName);

        return bookings;
    }
}
