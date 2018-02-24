package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", "Fire Boy");
        model.addAttribute("power1", "He can burn you");
        model.addAttribute("power2", "He shoots fireballs at his enemies");
        model.addAttribute("power3", "");
        model.addAttribute("fact1", "It's Hot");
        model.addAttribute("fact2", "He never dies out");
        model.addAttribute("fact3", "This is the third ");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
