package com.alumni.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by newaz on 5/7/17.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "api/test")
    @ResponseBody
    public Map getData(){
        Map<String,String >map = new HashMap<String, String>();
        map.put("one","two");
        map.put("one1","two");
        map.put("one2","two");
        map.put("one3","two");
        return map;
    }

}
