//•	Write a program to demonstrate the use of arithmetic, relational, and logical operators.
public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
       // relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a== b = " + (a == b));
        System.out.println("a != b = " + (a !=b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a<= b = " + (a <= b));
        // Logical Operators
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("!b1 = " + (!b1));
    }
}



