package org.example;

public class Task2 {
    public int sum2d(String[][] arr){
        int sum = 0;
        CountExceptions(arr);
        for (int i = 0; i< arr.length; i++) {
            for(int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private void CountExceptions(String[][]arr){
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == null) {
                    throw new NullPointerException();
                }
                else if (i > arr.length || j > 5) {
                    throw new IndexOutOfBoundsException();
                }

            }
        }
    }
}
