// Static calculation

import java.util.Scanner;

public class Cal{
    public static void main(String[] args){
        Scanner scannerObj =  new Scanner(System.in);
        System.out.println("Enter your num");
        int name = scannerObj.nextInt();
        name = name * 50;
        System.out.println("The multiplication of numbers = " + name);
    }
}