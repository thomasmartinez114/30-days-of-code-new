package com.martinez;

public class Main {

    public static void main(String[] args) {
        // init the array
        double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
        int numbers[] = new int[10];

        // Loop through
        for (int i = 0; i <= 5; i++) {
            System.out.println("Grade number " + i + " is " + grades[i]);
        }

        for (int i = 0; i <= 9; i++){
            numbers[i] = i + 10;
        }

        for(int i = 0; i <= 9; i++){
            System.out.println(numbers[i]);
        }
    }
}
