package com.training.namecheck.controller;

import com.training.namecheck.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name-check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    @GetMapping(value = "/name")
    public boolean checkName() {
        return checkService.checkName();
    }
}