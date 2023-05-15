/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;


/**
 *
 * @author Administrator
 */
public class HouseCreater {

    private static House houses[] = {
        new House(1, 9, 109.5, 1, 6,
        "Луговая 9", BuildingType.RESIDENTIAL, 24.5),
        new House(2, 43, 40.6, 3, 6,
        "Чкалово 19", BuildingType.RESIDENTIAL, 5),
        new House(3, 249, 60.8, 5, 4,
        "Людникова 17", BuildingType.RESIDENTIAL, 28.4),
        new House(4, 1, 500, 6, 1,
        "Московский 72", BuildingType.PUBLIC, 100),
        new House(5, 2, 410.3, 2, 8,
        "Петруся Бровки 13А", BuildingType.INDUSTRIAL, 47),
        new House(6, 3, 19.5, 4, 2,
        "Цветочная 16", BuildingType.AGRICULTURE, 7.5),
        new House(7, 5, 4.11, 10, 9,
        "Берестеня 5", BuildingType.INDUSTRIAL, 45),
        new House(8, 49, 85.8, 7, 10,
        "Смоленская 45", BuildingType.RESIDENTIAL, 28.4),
        new House(9, 65, 668, 8, 3,
        "Ленина 72", BuildingType.PUBLIC, 11),
        new House(10, 30, 410.3, 9, 5,
        "Петруся Бровки 15", BuildingType.AGRICULTURE, 7)
    };

    public static House[] getHouses() {
        return houses;
    }

}
