package tmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OrderController {
    @RequestMapping("/order/{id}")
    public String hello(@PathVariable("id") String name) {
    	return "下定成功，返回首页";
    }
}