package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
    /**
     * here i have created an arraylist to store values of hotel name and rates
     */
    private List<Hotel> hotelList=new ArrayList<>();
    public void addHotel(Hotel hotel)
    {
        hotelList.add(hotel);
    }
    /**
     * this method will return the values.
     * @return
     */
    public List<Hotel> getHotels(){
        return hotelList;
    }
 }

