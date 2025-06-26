import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num = sc.nextInt();
        if((num&1)==1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
}
