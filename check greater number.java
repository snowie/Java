
import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Both are Equal");
        }else{
            if(a>b){
            System.out.println("A is greater than B");
            }
            else{
            System.out.println("b is greater than a");
            }
        }
    }
}
