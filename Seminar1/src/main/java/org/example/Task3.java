package org.example;

public class Task3 {
    public int[] getArray(int[] array1, int[] array2) {
        int result[] = null;

        if (array1 == null || array2 == null) {
            throw new RuntimeException("Array cannot be empty");
        } else if (array1.length != array2.length) {
            throw new RuntimeException("Array lengths are not equal");
        } else {
            result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] - array2[i];
            }
        }

        return result;
    }
}
