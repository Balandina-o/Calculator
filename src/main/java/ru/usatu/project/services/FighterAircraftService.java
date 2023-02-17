package ru.usatu.project.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.usatu.project.models.FighterAircraft;
import ru.usatu.project.repositories.FighterAircraftRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class FighterAircraftService {
    private final FighterAircraftRepository fighterAircraftRepository;
    public List<FighterAircraft> FighterAircraftsList(String title) {
        List<FighterAircraft> fighterAircrafts = fighterAircraftRepository.findAll();
        if (title != null) fighterAircraftRepository.findByTitle(title);
        return fighterAircraftRepository.findAll();
    }

    public void saveFighterAircraft(FighterAircraft fighterAircraft){
        log.info("Saving new {}", fighterAircraft);
        fighterAircraftRepository.save(fighterAircraft);
    }

    public void deleteFighterAircraft(Long id){
        fighterAircraftRepository.deleteById(id);
        }


    public FighterAircraft getFighterAircraftByID(Long id) {
        return fighterAircraftRepository.findById(id).orElse(null);

    }
}

