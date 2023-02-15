package ru.usatu.project.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.usatu.project.models.FighterAircraft;
import ru.usatu.project.services.FighterAircraftService;

@Controller
@RequiredArgsConstructor
public class FighterAircraftController {
    private final FighterAircraftService fighterAircraftService;

    @GetMapping ("/")
    public String fighterAircraftPage (Model model){
        model.addAttribute("fighterAircrafts", fighterAircraftService.getCalculatorFighterAircraftsList());
        return "fighterAircraftPage";
    }

    @GetMapping("/fighterAircraft/{id}")
    public String fighterAircraftInfo (@PathVariable Long id, Model model){
        model.addAttribute("fighterAircraft", fighterAircraftService.getFighterAircraftByID(id));
        return "fighterAircraftHistoryPage";
    }

    @PostMapping("/fighterAircraft/create")
    public String createFighterAircraft(FighterAircraft fighterAircraft){
        fighterAircraftService.saveFighterAircraft(fighterAircraft);
        return "redirect:/";

    }
    @PostMapping("/fighterAircraft/delete/{id}")
    public String deleteFighterAircraft(@PathVariable Long id){
        fighterAircraftService.deleteFighterAircraft(id);
        return "redirect:/";
    }

}
