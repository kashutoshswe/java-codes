package Collections;

import java.util.TreeSet;

public class StudentTreeSetDemo
{
    public static void main(String[] args)
    {
        TreeSet<Student> treeSet=new TreeSet<>();
        Student s1=new Student(2,"A",30);
        Student s2=new Student(1,"B",40);
        Student s3=new Student(5,"C",80);
        Student s4=new Student(4,"D",90);
        Student s5=new Student(3,"E",50);

        //Run time exception : Class Cast Exception
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        System.out.println(treeSet);

        TreeSet<Student> treeSetN=new TreeSet<>(new StudentNameSort());
        treeSetN.add(s2);
        treeSetN.add(s5);
        treeSetN.add(s3);
        treeSetN.add(s4);
        treeSetN.add(s1);

        System.out.println(treeSetN);
    }
}
