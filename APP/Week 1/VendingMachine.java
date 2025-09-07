import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for juice");
        System.out.println("Press 2 for soda");
        System.out.print("Enter Your Choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Dispensing Juice");
                break;
            case 2:
                System.out.println("Dispensing soda");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}