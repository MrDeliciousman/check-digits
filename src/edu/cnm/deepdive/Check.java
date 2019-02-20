package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {

  public static void main(String[] args) {
    // the main method args is info from the command line.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int pass = scanner.nextInt();
    Check.digitSum(pass);
    System.out.println(digitSum(pass));
    System.out.println(digitSum(pass) / 9);
    System.out.println(digitSum(pass));
    System.out.println(digitSum(pass) / 9);
  }

  public static int digitSum(int pass) {
    String str;
    str = Integer.toString(pass);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      count += str.charAt(i) - 48;
    }
    return count;
  }

}
