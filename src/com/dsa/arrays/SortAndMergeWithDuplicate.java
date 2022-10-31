package com.dsa.arrays;

import java.util.Arrays;

public class SortAndMergeWithDuplicate {
    public static void main(String[] a){
        int[] arr = {9,0,8},arr2 = {11,8,14,1};
        new SortAndMerge(arr,arr2);
    }
}

class SortAndMerge{
   public SortAndMerge(int[] arr,int[] arr2){
        mergeWithDupe(arr,arr2);
    }
    private void mergeWithDupe(int[] arr,int arr2[]){
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int[] res = new int[arr.length+arr2.length];
        int[] temp,temp2;
        if (arr.length > arr2.length){
            temp = arr;
            temp2=arr2;
        }else {
            temp = arr2;
            temp2 = arr;
        }
        int i,j=0,k=0;
        // {0,9,8},  {0,1,11,14};
        for (i=0;i<temp2.length;i++){
           if (temp2[i]<temp[i]){
               res[k++] = temp2[i];
           }else if (temp[i] > temp2[i]){
               res[k++] = temp[i];
           }else {
               res[k++] = temp2[i];
               res[k++] = temp[i];
           }
        }

        while (k<temp.length){
            res[i] = temp[i];
            i++;
        }
        System.out.println(Arrays.toString(res));
    }
}
