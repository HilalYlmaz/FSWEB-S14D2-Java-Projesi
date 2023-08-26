package com.workintech.javacomposition.main;

import com.workintech.javacomposition.enums.LampType;
import com.workintech.javacomposition.enums.PaintColor;
import com.workintech.javacomposition.models.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom= new Bedroom("Hilal", new Wall("north"), new Wall("west"), new Wall("south"), new Wall("east"),
                new Ceiling(3, PaintColor.BLUE),new Lamp(LampType.LAVA,true, 6),
                new Wardrobe(2,3,35), new Carpet(2,3,PaintColor.WHITE),
                new Bed("Bazalı yatak",4,1,2,2));
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        System.out.println(bedroom);
    }
}