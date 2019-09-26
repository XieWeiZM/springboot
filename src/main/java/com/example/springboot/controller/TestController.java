package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Archer
 * @date 2019-08-28
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @RequestMapping("/rsa")
    public Map testRsa(@RequestBody Map param) {
        Map a = new HashMap();
        a.put("a", "1212");
        a.put("b", "45454");
        System.out.println("1");
        return a;

    }

    @RequestMapping("/ftl")
    public ModelAndView getFtl(HttpServletRequest request) throws Exception {
        HandlerExecutionChain handler = requestMappingHandlerMapping.getHandler(request);
        System.out.println(handler);
        ModelAndView view = new ModelAndView();
        view.setViewName("helloWord");
        view.getModel().put("name", "xiewei");
        view.getModel().put("sex", 1);
        view.getModel().put("list", Arrays.asList("fasf", "asdfds"));
        return view;

    }

    public static void main(String[] args) {


    }
}
