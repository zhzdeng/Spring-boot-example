package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tmy.demo.module.City;

@Controller
public class IndexController {

	// 返回主页
    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
    	City city = new City();
    	city.add("PakingDuck");
    	city.add("HotPot");
    	city.add("LambChop");
    	city.add("QingfengBaoZi");
    	model.addAttribute(city);
        return "index";
    }

   @PostMapping("/index")
   public String postIndex(Model model) {
	   return "redirect:/detail";
   }
}
