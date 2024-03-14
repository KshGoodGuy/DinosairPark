package com.dino.controllerller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dino.model.Dinosaur;
import com.dinosaur.Dino.DinosaurManager; // 변경된 부분

@Controller
public class DinosaurController {

    private DinosaurManager dinosaurManager; // 변경된 부분

    // 생성자를 통해 DinosaurManager 객체를 주입받도록 변경
    public DinosaurController(DinosaurManager dinosaurManager) {
        this.dinosaurManager = dinosaurManager;
    }

    @GetMapping("/dinosaurs")
    public String showDinosaurs(Model model) {
        ArrayList<Dinosaur> dinosaurs = dinosaurManager.getAllDinosaurs();
        model.addAttribute("dinosaurs", dinosaurs);
        return "dinosaurs"; 
    }
}
