package challenges.advanced;

/**
 * Created by nino on 4/15/17.
 */
public class JavaSingletonPattern {
    private static JavaSingletonPattern instance;
    public String str;

    private JavaSingletonPattern(){}

    public static synchronized JavaSingletonPattern getSingleInstance() {
        if(instance == null)
            instance = new JavaSingletonPattern();
        return instance;
    }
}
