package com.example.gestionhotel.Controllers.Client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @GetMapping("/team")
    String index( Model model) {
        return "team";
    }
}
