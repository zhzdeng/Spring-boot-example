package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tmy.demo.module.Food;
import tmy.demo.module.Order;

@Controller
public class MenuController {
	@GetMapping("/menu")
	public String getMenu(Model model) {
		Food food = new Food("123", "345", "456", "678", "/images/img4.png");
		model.addAttribute(food);
		return "menu";
	}

	@PostMapping("/menu")
	@ResponseBody
	public String postMenu(@ModelAttribute Order order, BindingResult result) {
		if (result.hasErrors()) {
			return "表单错误";
		}
		return order.toString();
		
//	    return "/order";
	}
}
