package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeTest {
    @Test
    @DisplayName("if left array or right array has same elements return ")
    void IfLeftRightArraySameElements(){
        int[] left = {3,7,9,11};
        int[] right = {1,5,11,21};
        int[] ans = {1,3,5,7,9,11,11,21};
        Assertions.assertEquals(Arrays.toString(ans), Arrays.toString(Merge.merge(left,right)));

    }

    @Test
    @DisplayName("if left array is empty and right array return ")
    void IfLeftArrayIsEmpty(){
        int[] left = {};
        int[] right = {1,5,11,21};
        int[] ans = {1,5,11,21};
        Assertions.assertEquals(Arrays.toString(ans), Arrays.toString(Merge.merge(left,right)));

    }

    @Test
    @DisplayName("if left array and right array return ")
    void IfSizesOfArrayDiffer(){
        int[] left = {3,7,9};
        int[] right = {1,5,11,21};
        int[] ans = {1,3,5,7,9,11,21};
        Assertions.assertEquals(Arrays.toString(ans), Arrays.toString(Merge.merge(left,right)));

    }

}
