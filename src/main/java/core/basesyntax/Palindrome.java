package core.basesyntax;

public class Palindrome {
    public boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedText = new StringBuilder(text).reverse().toString();

        return text.equals(reversedText);
    }
}
