import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 0;
        while (num>0) {
            num = num/10;
            i++;
        }
        System.out.println("No: of digits is : "+ i);
    }
}
