package com.elasticteam.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.elasticteam.demo.error.MethodNotAllowedException;

@RestController
@RequestMapping(value = "/")
public class OtherRoutesController {
    @RequestMapping(value = "/**")
    public ModelAndView noHandlerMappingFound() throws MethodNotAllowedException {
        throw new MethodNotAllowedException("Invalid endpoint");
    }
}
