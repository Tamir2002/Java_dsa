package Assigment_5_String;
import java.util.Scanner;
public class String_Comparision {

	public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i-1) == str.charAt(i)) {
                count ++;
            } else {
                stringBuilder.append(str.charAt(i-1));
                if (count != 0)
                    stringBuilder.append(count);
                count = 1;
            }
        }
        stringBuilder.append(str.charAt(str.length()-1));
        if (count != 0)
            stringBuilder.append(count);
        System.out.println(stringBuilder.toString());
    }
}
