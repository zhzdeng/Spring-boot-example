package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	// 返回主页
    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
        return "index";
    }

   @PostMapping("/index")
   public String postIndex(Model model) {
	   return "redirect:/detail";
   }
}
