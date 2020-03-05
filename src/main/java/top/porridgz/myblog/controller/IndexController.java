package top.porridgz.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/articles")
    public String articles(){
        return "articles";
    }

    @RequestMapping("/article")
    public String article(){
        return "article";
    }

    @RequestMapping("/simple")
    public String demo(){
        return "simple";
    }


}
