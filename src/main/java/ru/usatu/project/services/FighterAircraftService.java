package ru.usatu.project.services;

import org.springframework.stereotype.Service;
import ru.usatu.project.models.FighterAircraft;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterAircraftService {
    private List<FighterAircraft> fighterAircrafts = new ArrayList<>();
    private int ID = 0;
    private long id;

    {
        fighterAircrafts.add (new FighterAircraft(++ID, "t", "e", "s", "t", "2"));
        fighterAircrafts.add (new FighterAircraft(++ID, "t", "e", "s", "t", "2"));
    }

    public List<FighterAircraft> getCalculatorFighterAircraftsList() {
        return fighterAircrafts;
    }

    public void saveFighterAircraft(FighterAircraft fighterAircraft){
        fighterAircraft.setId(++ID);
        fighterAircrafts.add(fighterAircraft);
    }

    public void deleteFighterAircraft(Long id){
        fighterAircrafts.removeIf(fighterAircraft -> fighterAircraft.getId() == (id));

    }

    public FighterAircraft getFighterAircraftByID(Long id) {
       for (FighterAircraft fighterAircraft : fighterAircrafts){
            if (fighterAircraft.getId() == (id)) return fighterAircraft;
        }
       return null;
    }
}

