package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Connections {

    public void makeMove(int[][] arr, int row, int col) {
        boolean ver = true;
        while (ver) {
            Random r = new Random();

            ArrayList<Integer> newArr=new ArrayList<>();
            isFilledAt(newArr,arr,row,(col+1));
            isFilledAt(newArr,arr,(row -1),(col));
            isFilledAt(newArr,arr,row,(col-1));
            isFilledAt(newArr,arr,(row+1),(col));

            int random = r.nextInt(4);

            int choose = newArr.get(random);
            if (!(choose == 0)) {
                System.out.println("you are in room" + choose);
                ver = false;
                break;


            }


        }

    }
    public void checkIfAllowed (ArrayList<Integer> arrNew,int[][] arr, int rows, int columns){
        boolean areCorrect = checkIfRowColAllowed(rows) && checkIfRowColAllowed(columns);
        if(!areCorrect){
            throw new IndexOutOfBoundsException("Row or column ID is not acceptable.");
        }
    }

    private boolean checkIfRowColAllowed ( int row_or_column){
        return (row_or_column >=0 && row_or_column <=3);
    }

    public void getCellById(ArrayList<Integer> arrNew,int[][] arr, int rows, int columns) {
        try {
            checkIfAllowed(arrNew, arr, rows, columns);
            arrNew.add(arr[rows][columns]);

        } catch (IndexOutOfBoundsException e) {
            // log an error, or do something else
        }

    }

    public void isFilledAt(ArrayList<Integer> arrNew,int[][] arr, int row, int col)
    {

        // Calls the method that fills tempArray datas

        if ( (row >= 4 || row <0)  || (col >= 4 || col < 0)) {
            System.out.println("Out of Bounds!");
        }else {
            arrNew.add(arr[row][col]);
        }



}
}