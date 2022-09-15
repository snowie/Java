import java.util.*;
public class Snowie{
    public static void main(String[] args){
        System.out.print("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator(+,-) : ");
        char o = sc.next().charAt(0);
        switch (o){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            
            default : System.out.println("invalid operator");
        }
    }
}
