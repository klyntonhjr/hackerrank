package challenges.datastructures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by nino on 4/15/17.
 */
public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        Queue<PriorityStudent> pq = new PriorityQueue<>();
        int id;
        String fname;
        double cgpa;
        while(totalEvents>0){
            String event = in.next();

            switch (event){
                case "ENTER":
                    fname = in.next();
                    cgpa = in.nextDouble();
                    id = in.nextInt();
                    pq.add(new PriorityStudent(id, fname, cgpa));
                    break;
                case "SERVED":
                    if(!pq.isEmpty())
                        pq.remove().getFname();
                    break;
                default:
                    System.out.println("ERROR: Unexpected event=" + event);
            }

            totalEvents--;
        }

        if(pq.isEmpty())
            System.out.println("EMPTY");
        else
            for (int i = pq.size(); i > 0; i--)
                System.out.println(pq.remove().getFname());
    }
}

class PriorityStudent implements Comparable<PriorityStudent>{
    private int token;
    private String fname;
    private double cgpa;
    public PriorityStudent(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(PriorityStudent s) {
        if(this.cgpa > s.getCgpa()){
            return -1;
        } else if (this.cgpa < s.getCgpa()){
            return 1;
        } else if (this.getFname().compareTo(s.getFname()) == 0) {
            return this.getToken() < s.getToken() ? -1 : 1;
        } else
            return this.getFname().compareTo(s.getFname());
    }
}

