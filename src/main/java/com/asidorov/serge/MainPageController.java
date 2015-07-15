package com.asidorov.serge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = {"/index", "/"})
    public String startPage() {
        return "index";
    }
}
