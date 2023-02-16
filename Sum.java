import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scannerObj =  new Scanner(System.in);
        System.out.println("Enter 1st number");
        int one = scannerObj.nextInt();
        System.out.println("Enter 2nd number");
        int two = scannerObj.nextInt();
        int sum = one + two ;
        System.out.println("The sum of numbers = " + sum);

    }
    
}
