import java.util.Scanner;
public class StringBuiltinMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sampleText = " Java Programming is Fun and Challenging! ";
        System.out.println(sampleText.length());
        System.out.println(sampleText.trim().length());
        System.out.println(sampleText.charAt(5));
        System.out.println(sampleText.substring(6,17));
        System.out.println(sampleText.indexOf("Fun"));
        System.out.println(sampleText.contains("Java"));
        System.out.println(sampleText.trim().indexOf("Java"));
        if(sampleText.trim().startsWith("Java")){
            System.out.println("The string starts with 'Java'");
        }else{
            System.out.println("String does not start with Java");
        }
        if(sampleText.endsWith("!")){
            System.out.println("String ends with !");
        }else{
            System.out.println("String does not ends with !");
        }
        sampleText = sampleText.toUpperCase();
        System.out.println(sampleText);
        sampleText = sampleText.toLowerCase();
        System.out.println(sampleText);
        System.out.println(countVowels(sampleText));
        System.out.print("Enter a character to find its occurrences: ");
        char target = scanner.next().charAt(0);
        findAllOccurrences(sampleText, target);
    }
        public static int countVowels(String text){
            int count =0;
            for(int i=0;i<text.length();i++){
                if(text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u'){
                    count++;
                }
            }
        return count;
    }
    public static void findAllOccurrences(String text,char target){
        int count = 0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)==target){
                count++;
            }
        }
        System.out.println("Character "+target+" is found "+count+" number of times.");
    }
}