package com.neosoft.hotel.controller;


import com.neosoft.hotel.entity.Hotel;
import com.neosoft.hotel.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @PostMapping("/save")
    public ResponseEntity<Hotel>  saveHotel(@RequestBody  Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotelData(hotel));
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<Hotel>  getHotelById(@PathVariable String hotelId){

        Hotel hotel =   hotelService.getHotel(hotelId);

        return ResponseEntity.ok(hotel);
    }


    @GetMapping("/all-hotel")
    public ResponseEntity<List<Hotel>>  getHotelById(){

        List<Hotel>  hotelList  = hotelService.findAllData();
        return ResponseEntity.ok(hotelList);

    }

}
