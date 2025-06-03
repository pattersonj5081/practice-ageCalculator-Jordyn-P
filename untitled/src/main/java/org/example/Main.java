package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

//Prompt user for their age:
        System.out.println("Enter your age");
        int userAge = scanner.nextInt();


// Calculate how many years they have left to 100.
int tillOneHundred = (100) - userAge;

//Return how many years the user has till 100
        System.out.println("You have "+ tillOneHundred +" years till you are 100 years old.");

        }
    }
