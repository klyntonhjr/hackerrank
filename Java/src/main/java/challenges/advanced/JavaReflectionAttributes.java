package challenges.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nino on 4/15/17.
 */
public class JavaReflectionAttributes {
    public static void main(String[] args){
        Method[] methods = Student.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}
