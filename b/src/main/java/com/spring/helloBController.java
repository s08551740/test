package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User:悔创阿里·杰克马
 * Created by Administrator on 2018/3/21.
 */
@RestController
public class helloBController {
    @RequestMapping(value = "/helloB",method = RequestMethod.GET)
    public String helloB(){

        return "{hello: B}";
    }
}
