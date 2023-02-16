// Calculation of the two user inserted number

import java.util.Scanner;

public class Calu {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int one = scannerObj.nextInt();
        System.out.println("Enter 2nd number");
        int two = scannerObj.nextInt();
        int mul = one * two ;
        System.out.println("The multiplication of numbers = " +mul);

    }
}
