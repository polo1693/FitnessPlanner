package com.fitnessplanner.repositories;

import com.fitnessplanner.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository to store booking data
 * Created by paula on 3/14/2017.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

    List<Booking> findAllByWorkoutWorkoutName(String workoutName);
    List<Booking> findAllByTrainerTrainerName(String trainerName);

}
