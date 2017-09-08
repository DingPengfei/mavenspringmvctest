package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Ding on 9/8/2017.
 */
@Controller
@RequestMapping
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public String index() {
        //输出日志文件
        logger.info("The first jsp pages");
        //return index.jsp view.
        return "index";
    }
}
