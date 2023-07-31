package com.neosoft.hotel.service;

import com.neosoft.hotel.entity.Hotel;
import com.neosoft.hotel.exception.ResourceNotFoundException;
import com.neosoft.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService{
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotelData(Hotel hotel) {

        String  hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);

        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAllData() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found!"));
    }
}
