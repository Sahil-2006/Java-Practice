import java.util.Scanner;
public class StringManipulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.trim());
        System.out.println(input.replace("Java", "Java Programming"));
        System.out.println(input.replaceAll("Hello", "Hi"));
        String[] words = input.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        System.out.println(String.join(" | ", words));
        System.out.println(removePunctuation(input.trim()));
        sc.close();
    }
    public static String removePunctuation(String text) {
        return text.replaceAll("[^a-zA-Z0-9 ]", "");
    }

        public static String capitalizeWords(String text) {
            String[] words = text.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (word.length() > 0) {
                    sb.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        sb.append(word.substring(1).toLowerCase());
                    }
                    sb.append(" ");
                }
            }
            return sb.toString().trim();
        }

    }
}