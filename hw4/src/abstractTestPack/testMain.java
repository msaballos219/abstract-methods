package abstractTestPack;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter greeting: ");
        String greetInput = scanner.next();
        XYZ xyz = new XYZ();
        xyz.foo();
        System.out.println(greetInput + " " + xyz.day());
        scanner.close();
    }
}
