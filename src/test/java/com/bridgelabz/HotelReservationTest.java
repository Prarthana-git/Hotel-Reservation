package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class HotelReservationTest {
    @Test
    public void givenHotel_whenInvokeAddHotel_shouldBeAbleToAdd()
    {
        HotelReservation hotelReservation=new HotelReservation();
        Hotel hotel=new Hotel("Lakewood",110);
        hotelReservation.addHotel(hotel);
        List hotelList= hotelReservation.getHotels();
        Assert.assertTrue(hotelList.contains(hotel));
    }
}
