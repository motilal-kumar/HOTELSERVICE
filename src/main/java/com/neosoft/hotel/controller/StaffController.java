package com.neosoft.hotel.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {


    @GetMapping("/all-staffs")
    public ResponseEntity<List<String>>   getStaff(){

        List<String> stringList  = Arrays.asList("Ashok", "Bob", "Khushboo","Rekha","Ram");
        return new ResponseEntity<>(stringList, HttpStatus.OK);

    }

}
