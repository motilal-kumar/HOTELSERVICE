package com.neosoft.hotel.service;

import com.neosoft.hotel.entity.Hotel;

import java.util.List;

public interface IHotelService {


    public Hotel saveHotelData(Hotel hotel);

    public List<Hotel> findAllData();

    public Hotel getHotel(String id);



}
