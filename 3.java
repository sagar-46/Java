import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num = sc.nextInt();
        int i = 1, fact = 1;
        while (i<=num) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
