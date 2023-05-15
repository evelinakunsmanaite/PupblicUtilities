/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Administrator
 */
public class ListGenerator {

    private static ArrayList<House> houses = new ArrayList<>(Arrays.asList(HouseCreater.getHouses()));
    private static ArrayList<House> listNumberOfRooms = new ArrayList<>();
    private static ArrayList<House> listFloorAndNumberOfRooms = new ArrayList<>();
    private static ArrayList<House> listApartmentAreaList = new ArrayList<>();

    public static ArrayList<House> getListNumberOfRooms(int num ) throws Exception {
       
        for (House house : houses) {
            if (num == house.getRoomsCount()) {
                listNumberOfRooms.add(house);
            }
        }
        return listNumberOfRooms;
    }

    public static ArrayList<House> getListFloorAndNumberOfRooms(String group) throws Exception {
        String[] values = group.split("[-\\s]+");
        int numberOfRooms = Integer.parseInt(values[0]);
        int fromFloor = Integer.parseInt(values[1]);
        int toFloor = Integer.parseInt(values[2]);
        for (House house : houses) {
            if (numberOfRooms == house.getRoomsCount() && house.getFloor() > fromFloor && house.getFloor() < toFloor) {
                listFloorAndNumberOfRooms.add(house);
            }
        }
        return listFloorAndNumberOfRooms;

    }

    public static ArrayList<House> getListApartmentAreaList(int num) throws Exception {
      
        for (House house : houses) {
            if (num < house.getApartmentArea()) {
                listApartmentAreaList.add(house);
            }
        }
        return listApartmentAreaList;

    }

//private static ArrayList<House> filterHousesByGroup(String group, Predicate<House> predicate) {
//        ArrayList<House> filteredHouses = new ArrayList<>();
//        for (House house : houses) {
//            if (predicate.test(house)) {
//                filteredHouses.add(house);
//            }
//        }
//        if (filteredHouses.isEmpty()) {
//            System.out.println("Данные по вашему запросу отсутствуют или вы ввели неверные данные");
//        }
//        return filteredHouses;
//    }         
//
//
//             public static ArrayList<House> getListNumberOfRooms(String group) {
//        return filterHousesByGroup(group, house -> house.getNumberOfRooms() == Integer.parseInt(group));
//
//       }       
//         
//              public static ArrayList<House> getListFloorAndNumberOfRooms(String group) {
//       String[] values = group.split("[-\\s]+");
//        int numberOfRooms = Integer.parseInt(values[0]);
//        int fromFloor = Integer.parseInt(values[1]);
//        int toFloor = Integer.parseInt(values[2]);
//        return filterHousesByGroup(group, house -> house.getNumberOfRooms() == numberOfRooms 
//                && house.getFloor() > fromFloor && house.getFloor() < toFloor);
//         
//        }
//         
//         public static ArrayList<House> getListApartmentAreaList(String group) {
//        return filterHousesByGroup(group, house -> house.getApartmentArea() > Integer.parseInt(group));
//
//         
//        }
//         
}
