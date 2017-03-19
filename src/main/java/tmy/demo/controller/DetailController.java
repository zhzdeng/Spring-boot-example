package tmy.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tmy.demo.module.*;

@Controller
class DetailController {
    @GetMapping("/cuisine_detail/{name}")
    public String hello(@PathVariable("name") String name,Model model) {
        Food food = new Food("123", "345", "456", "678", "/images/img4.png"); 
        model.addAttribute("food", food);
        
        // 后面 model.addAttribute(findName(name));
        return "detail";
    }
}