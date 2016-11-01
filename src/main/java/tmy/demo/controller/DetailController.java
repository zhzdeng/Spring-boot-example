package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class DetailController {
    @RequestMapping("/cuisine_detail/{name}")
    public String hello(@PathVariable("name") String name,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("summary", "后台测试summary");
        model.addAttribute("price", "后台测试价格");
        model.addAttribute("discount", "后台测试折扣");
        return "detail";
    }
}