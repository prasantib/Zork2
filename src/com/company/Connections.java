package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Connections {

    public int makeMove(int[][] arr, int row, int col,int choose) {
        boolean ver = true;

        while (ver) {
            Random r = new Random();

            ArrayList<Integer> newArr=new ArrayList<>();
            isFilledAt(newArr,arr,row,(col+1));
            isFilledAt(newArr,arr,(row -1),(col));
            isFilledAt(newArr,arr,row,(col-1));
            isFilledAt(newArr,arr,(row+1),(col));

            int random = r.nextInt(newArr.size());

            choose = newArr.get(random);
            if (!(choose == 0)) {
                System.out.println("you are in room " + choose);
                ver = false;
                break;


            }


        }

        return choose;
    }



    public ArrayList<Integer> isFilledAt(ArrayList<Integer> arrNew,int[][] arr, int row, int col)
    {

        // Calls the method that fills tempArray datas
        try {
            if (( row < 4 && row >=0)||(col<= 4 && col >= 0)) {
                arrNew.add(arr[row][col]);
            }

        } catch (IndexOutOfBoundsException e) {
            // log an error, or do something

        }


    return arrNew;

}
}