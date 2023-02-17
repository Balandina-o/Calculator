package ru.usatu.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.usatu.project.models.FighterAircraft;

import java.util.List;

public interface FighterAircraftRepository extends JpaRepository <FighterAircraft, Long> {
    List<FighterAircraft> findByTitle(String title);


}
