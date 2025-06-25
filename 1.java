import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("Entered year is Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
