package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the barcode");
        String barcode = input.next();
        int countEven = 0;
        int myInt = (int) barcode.charAt(countEven);
        myInt = myInt *3;
        if (myInt > 9) {
            myInt = myInt - 9;
        }
	// write your code here
    }
}
// for (int = 0; i < 12; i = i +2) {
//evens
// }
// for (int i = 1; i<12; i = i + 2) {
// odds
// }