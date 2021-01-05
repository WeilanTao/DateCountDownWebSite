package com.wlt.datecountdown.controller;

import com.wlt.datecountdown.entity.NewDate;
import com.wlt.datecountdown.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/date")
public class DateController {

//    private DateService dateService=new DateServiceImpl();

    @Autowired
    private DateService dateService;

    @GetMapping(value="/datelist")
    public List<NewDate> getDateListByAccount(){
        return dateService.getDateListByAccount();
    }
}
