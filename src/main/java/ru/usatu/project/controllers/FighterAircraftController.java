package ru.usatu.project.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.usatu.project.models.FighterAircraft;
import ru.usatu.project.services.FighterAircraftService;

@Controller
@RequiredArgsConstructor
public class FighterAircraftController {
    private final FighterAircraftService fighterAircraftService;

    @GetMapping ("/")
    public String fighterAircraftPage (@RequestParam (name = "title", required = false) String title, Model model){
        model.addAttribute("fighterAircrafts", fighterAircraftService.FighterAircraftsList(title));
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

    @PostMapping("/fighterAircraft/goback")
    public String goBack(){
        return "redirect:/";
    }

}
