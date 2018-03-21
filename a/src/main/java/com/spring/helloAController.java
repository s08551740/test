package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User:悔创阿里·杰克马
 * Created by Administrator on 2018/3/21.
 */
@RestController
public class helloAController {
    @RequestMapping(value = "/helloA", method = RequestMethod.GET)
    public String helloA() {

        return "{hello: A}";
    }
}
