package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tmy.demo.buiness.entities.MenuMessage;

@Controller
public class MenuController {
	@GetMapping("/menu")
	public String getMenu(Model model) {
		return "menu";
	}

	@PostMapping("/menu")
	public String postMenu(@ModelAttribute MenuMessage menuMessage, Model model) {
	    return "/order";
	}
}
