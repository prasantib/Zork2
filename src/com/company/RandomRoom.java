package com.company;

import java.util.ArrayList;
import java.util.Random;

public class RandomRoom {
    ArrayList<RandomRoom> roomsArrayList = new ArrayList<>();
    Random random = new Random();
        for (Rooms room : Rooms) {
        boolean ver=true;
        while(ver){
            int random1 = 1 + random.nextInt(4);
            int random2 = 1 + random.nextInt(4);
            if(location[random1][random2]==0){
                location[random1][random2]=room;
                ver=false;
            } else{
                ver=true;
            }
        }
    }
}