import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    System.out.println ("Enter the sides of the triangle: ");
    Scanner input = new Scanner (System.in);
    int side1 = input.nextInt ();
    System.out.println ("Еnter the second side of triangle");
    int side2 = input.nextInt();
    System.out.println ("Еnter the third side of triangle");
    int side3 = input.nextInt();
    System.out.println ("Аll sides of the triangle have been successfully entered");
    if (side1 + side2>side3) {
        System.out.println ("Тhe triangle successfully created");
    };
    if (side1 == side2 && side2 == side3) {
        System.out.println ("Тhe triangle is equilateral");
    }
    else {
        System.out.println ("Тhe triangle does not exist");}
        int p = side1+side2+side3;
        System.out.println ("Тhe perimeter of the triangle is " +p);
}
}




