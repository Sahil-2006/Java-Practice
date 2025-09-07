import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius:");
        int temperature = sc.nextInt();
        if(temperature>30){
            System.out.println("It's hot");
        }else if(temperature>=20 && temperature<=30){
            System.out.println("It's warm");
        }else if(temperature>=10 && temperature<20){
            System.out.println("It's cool");
        }else{
            System.out.println("It's cold");
        }
        sc.close();
    }
}