package challenges.strings.javaregex;

import java.util.Scanner;

/**
 * Created by nino on 3/20/17.
 */
public class JavaRegex {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

final class MyRegex{
    public static final String pattern = "(2[0-5]{0,1}[0-9]{0,1}|1[0-9]{2}|0{0,1}[0-9]{1,2}|[0]{0,2}[0-9]{1}|0{3})\\.(2[0-5]{0,1}[0-9]{0,1}|1[0-9]{2}|0{0,1}[0-9]{1,2}|[0]{0,2}[0-9]{1}|0{3})\\.(2[0-5]{0,1}[0-9]{0,1}|1[0-9]{2}|0{0,1}[0-9]{1,2}|[0]{0,2}[0-9]{1}|0{3})\\.(2[0-5]{0,1}[0-9]{0,1}|1[0-9]{2}|0{0,1}[0-9]{1,2}|[0]{0,2}[0-9]{1}|0{3})";
}
