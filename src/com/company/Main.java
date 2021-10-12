package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("How tall are you in feet?");

    double howTall = scan.nextInt();

    if(howTall<5) {
        howTall = (howTall*.3058);
        System.out.println("You are " + (Math.round(howTall * 100.0)/100.0) + " meters tall. That's pretty short...");
    }
    if(howTall>=5) {
        howTall = (howTall*.3058);
        System.out.println("You are " + (Math.round(howTall * 100.0)/100.0) + " meters tall. That's pretty tall!");
        }
    }
}
