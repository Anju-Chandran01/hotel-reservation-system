package com.blz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HotelReservation {

    //ArrayList of class Hotel
    private static final ArrayList<Hotel> hotelList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("--- Welcome to Miami Hotel Reservation system ---");

        //Added hotel name and their Rate for Regular Customer according to given use-case
        Hotel lakeWood = new Hotel("Lakewood", 110);
        Hotel bridgeWood = new Hotel("Bridgewood", 160);
        Hotel ridgeWood = new Hotel("Ridgewood", 220);
        hotelList.add(lakeWood);
        hotelList.add(bridgeWood);
        hotelList.add(ridgeWood);
        System.out.println(hotelList);

        findCheapestHotel();
    }

    public static void findCheapestHotel() {
        System.out.print("Cheapest among them is ");
        List cheapestHotel = hotelList.stream().map(Hotel::getRate).collect(Collectors.toList().min(Comparator.comparing(Hotel::getRate));
        System.out.println(cheapestHotel);
    }
}








