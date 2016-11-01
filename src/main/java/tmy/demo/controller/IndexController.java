package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	// 返回主页
    @RequestMapping(value = {"/", "/index"}, method=RequestMethod.GET)
    public String getIndex(Model model) {
        return "index";
    }

   @RequestMapping(value = "/index", method=RequestMethod.POST)
   public String postIndex(Model model) {
	   return "redirect:/detail";
   }
}
