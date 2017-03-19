package challenges.introduction.javastaticinitializerblock;

import java.util.Scanner;

/**
 * Created by nino on 3/18/17.
 */
public class JavaStaticInitializerBlock {
    public static int B;
    public static int H;
    public static boolean flag = init();

    /*
    *  Did it using a static method for testability purposes, else would
    *  have just used a static{} initializer block without a method name
    */
    public static boolean init(){
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        flag = true;
        if (B<=0 || H<=0){
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }

        return flag;
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
