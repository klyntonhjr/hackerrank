package challenges.oop;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

/**
 * Created by nino on 4/10/17.
 */
public class CalculatingVolume {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T--> 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class Calculate {
    private Scanner sc = new Scanner(System.in);
    public static Display output = new Display();

    public int get_int_val() {
        return sc.nextInt();
    }

    public double get_double_val() {
        return sc.nextDouble();
    }

    public static Calculate do_calc() {
        return new Calculate();
    }

    public double get_volume(int a) {
        checkPos(a);
        return a*a*a;
    }

    public double get_volume(int l, int b, int h) {
        checkPos(l, b, h);
        return l*b*h;
    }

    public double get_volume(double r) {
        checkPos(r);
        return (2.0/3.0)*Math.PI*r*r*r;
    }

    public double get_volume(double r, double h) {
        checkPos(r, h);
        return Math.PI*h*r*r;
    }

    private void checkPos(double... a) {
        for(double x: a) {
            if(x <= 0.0) {
                throw new NumberFormatException("All the values must be positive\n");
            }
        }
    }
}

class Display {
    public void display(double volume) throws IOException{
        System.out.println(String.format("%.3f", volume));
    }
}

class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {}
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

