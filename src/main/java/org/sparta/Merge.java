package org.sparta;

public class Merge {

    public Merge(int[] left, int[] right) {
    }

    public static int[] merge(int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;

        int[] mergedArray = new int[leftSize + rightSize];

        int leftPoint = 0;
        int rightPoint = 0;

        for (int arrayIndex = 0; arrayIndex < mergedArray.length; arrayIndex++){
            if (leftPoint < leftSize && rightPoint < rightSize) {
                if (left[leftPoint] < right[rightPoint]) {
                    mergedArray[arrayIndex] = left[leftPoint];
                    leftPoint++;
                } else {
                    mergedArray[arrayIndex] = right[rightPoint];
                    rightPoint++;
                }
            }else if (leftPoint < leftSize){
                mergedArray[arrayIndex] = left[leftPoint];
                leftPoint++;
                }
            else{
                mergedArray[arrayIndex] = right[rightPoint];
                rightPoint++;
                }
            }
        return mergedArray;





    }
}
