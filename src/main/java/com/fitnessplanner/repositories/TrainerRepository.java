package com.fitnessplanner.repositories;

import com.fitnessplanner.models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Paula on 08.05.2017.
 */
@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Integer>{

    List<Trainer> getAllBySpeciality(String speciality);

    List<Trainer> findAllByTrainerName(String trainerName);

}
