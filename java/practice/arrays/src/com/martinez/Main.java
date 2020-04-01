package com.martinez;

public class Main {

    public static void main(String[] args) {
        // init the array
        double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
        double max;

        max = grades[0];

        // Loop through
        for (int i = 0; i <= 5; i++) {
            if (grades[i] > max)
                max = grades[i];
        }
        System.out.println("The max grade in the class is: " + max);
    }
}
