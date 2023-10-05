package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Monu_Bhaiya_String {

 public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastOccurrence = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastOccurrence.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.next();
        String result = removeDuplicateLetters(input);
        System.out.println(result);
    }
}