public class AsciiProcessor {
    public static void main(String[] args) {
        String sampleText = "Hello, World!";
        int vowelCount = countVowels(sampleText);
        System.out.println("Number of vowels: " + vowelCount);
        findAllOccurrences(sampleText, 'o');
    }
    public static int countVowels(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void findAllOccurrences(String text, char target) {
        int index = text.indexOf(target);
        while (index != -1) {
            System.out.println("Found at index: " + index);
            index = text.indexOf(target, index + 1);
        }
    }
}