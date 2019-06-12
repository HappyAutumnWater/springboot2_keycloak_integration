package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
class TestController {

    @GetMapping(path = "/phones")
    @ResponseBody
    public List getProducts() {
        return Arrays.asList("Mate20 pro", "Galaxy S10+", "P30 pro", "Oneplus 7pro");
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
