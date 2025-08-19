import java.util.Scanner;
public class EvenOrOddNumberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The Number is odd");
        }
        sc.close();
    }
}