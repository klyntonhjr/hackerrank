package challenges.strings;

import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();

        if(str1.length() != str2.length())
            return false;

        long charOccurrencesStr1;
        long charOccurrencesStr2;
        while(!str1.isEmpty()){
            char toRemove = str1.charAt(0);
            charOccurrencesStr1 = str1.chars().filter(num -> num == toRemove).count();
            charOccurrencesStr2 = str2.chars().filter(num -> num == toRemove).count();

            if(charOccurrencesStr1 != charOccurrencesStr2)
                return false;

            str1 = str1.replace(Character.toString(toRemove), "");
            str2 = str2.replace(Character.toString(toRemove), "");
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
