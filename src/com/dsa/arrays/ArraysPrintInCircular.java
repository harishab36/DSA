package com.dsa.arrays;

public class ArraysPrintInCircular {
    public static void main(String[] a){
        ArrayCircular circular = new ArrayCircular();
        circular.printInClockwise();
    }
}

class ArrayCircular{
    int[][] array = {{1,2,3,4},
                    {5,6,7,8,},
                    {9,10,11,12}};

    public void printInClockwise(){
        for (int i=0;i<array.length;i++){
            int j = 0;
            if (i == 0){
                // print first row.
                for (;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
            }else if (i > 0 && i<array.length-1){
                // print last element in subsequent array
                System.out.print(array[i][array[i].length-1]+" ");
            }else if (i == array.length - 1){
                // print last array from right.
                for (j = array[i].length - 1;j>=0;j--){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
