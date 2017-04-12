package challenges.datastructures;

import java.util.*;

/**
 * Created by nino on 4/11/17.
 */
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new StudenChecker());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class StudenChecker implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa() > s2.getCgpa()) {
            return -1;
        } else if(s1.getCgpa() == s2.getCgpa()){
            int comparison = s1.getFname().compareTo(s2.getFname());
            if (comparison == 0){
                return Integer.compare(s1.getId(), s2.getId());
            }

            return comparison;
        }

        return 1;
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
