package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Connections {

    public int makeMove(int[][] arr, int row, int col) {
        boolean ver = true;
        int choose=0;
        while (ver) {
            Random r = new Random();

            ArrayList<Integer> newArr=new ArrayList<>();
            isFilledAt(newArr,arr,row,(col+1),"Right");
            isFilledAt(newArr,arr,(row -1),(col),"Up");
            isFilledAt(newArr,arr,row,(col-1),"Left");
            isFilledAt(newArr,arr,(row+1),(col),"Down");

            int random = r.nextInt(newArr.size());

            choose = newArr.get(random);
            if (!(choose == 0)) {
                System.out.println("you are in room " + choose);
                ver = false;


            }


        }


        return choose;
    }


    public ArrayList<Integer> isFilledAt(ArrayList<Integer> arrNew,int[][] arr, int row, int col,String dir)
    {

        // Calls the method that fills tempArray datas
        try {
            if (( row < 4 && row >=0)&&(col<= 4 && col >= 0)) {
                arrNew.add(arr[row][col]);
            }

        } catch (IndexOutOfBoundsException e) {
            // log an error, or do something

        }


        return arrNew;

    }
}