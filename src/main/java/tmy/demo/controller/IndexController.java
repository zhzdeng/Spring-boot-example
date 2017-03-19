package tmy.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tmy.demo.module.City;
import tmy.demo.module.Food;

@Controller
public class IndexController {

	// 返回主页
    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
    	Food food1 = new Food("烤鸭");
    	Food food2 = new Food("饺子");
    	Food food3 = new Food("包子");
    	
    	model.addAttribute("food1", food1);
    	model.addAttribute("food2", food2);
    	model.addAttribute("food3", food3);
        return "index";
    }

   @PostMapping("/index")
   public String postIndex(Model model) {
	   return "redirect:/detail";
   }
}
