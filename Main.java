import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter your name:");
        Scanner scannerObj =  new Scanner(System.in);
        // String name="Ishan";//non primitive datatype
        // System.out.println(name);
        String name = scannerObj.nextLine();
        System.out.println("your name is " + name);
    }
}