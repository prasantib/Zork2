package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);
        String answer="yes";
        Connections connections=new Connections();
        ArrayList<Integer> rooms = new ArrayList<Integer>();
        Random random = new Random();
        int [][] location = new int[4][4];
        Collections.addAll(rooms,1,2,3,4,5,6,7,8,9);

        for (int room : rooms) {
            boolean ver=true;
            while(ver) {
                int random1 = random.nextInt(4);
                int random2 = random.nextInt(4);
                if (location[random1][random2] == 0) {
                    location[random1][random2] =room;
                     ver=false;
                }else{
                    ver=true;
                }
            }
    }
        System.out.println(location[3][3]);
        System.out.println(location[1][2]);
        System.out.println(Arrays.deepToString(location));

        while(answer.equalsIgnoreCase("yes")) {

            connections.makeMove(location, 2, 2);
            System.out.append("Do want to go to the next room?(yes/no)?");
            answer=key.next();
        }
    }
    }