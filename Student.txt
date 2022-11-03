import java.io.*;
import java.util.*;
public class Student {

    int age;
    String name;
    double cgpa;

    public Student(int age, String name, double cgpa) {
        this.age = age;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                "}\n";
    }

    public static void main(String[] args) throws IOException {

        PrintWriter dest  = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt")));
        BufferedReader source = new BufferedReader(new FileReader("E:\\JAVA_PROG\\Java End Module\\src\\Student.java"));
        String line = source.readLine();
        while (line != null){
            dest.println(line);
            line = source.readLine();
        }
        source.close();
        dest.close();
        System.out.println("By comparing Name in ascending Order: ");
        TreeSet<Student> s1 = new TreeSet<>(new Name_comparator());
        s1.add(new Student(23,"Tushar", 7.5));
        s1.add(new Student(22,"Deepak", 6.5));
        s1.add(new Student(22,"Lalit", 9.5));
        s1.add(new Student(23,"Vedant", 8.5));
        s1.add(new Student(21,"Shiv", 7.3));

        Iterator<Student> itr1 = s1.iterator();
        while (itr1.hasNext()){
            System.out.print(itr1.next());
        }
        System.out.println();

        System.out.println("By Comparing age in descending Order: ");
        TreeSet<Student> s2 = new TreeSet<>(new age_comparator());
        s2.add(new Student(21,"Tushar", 7.5));
        s2.add(new Student(20,"Deepak", 6.5));
        s2.add(new Student(22,"Lalit", 9.5));
        s2.add(new Student(23,"Vedant", 8.5));
        s2.add(new Student(19,"Shiv", 7.3));

        Iterator<Student> itr2 = s2.iterator();
        while (itr2.hasNext()){
            System.out.print(itr2.next());
        }
        System.out.println();

        System.out.println("By comparing gpa in ascending order: ");
        TreeSet<Student> s3 = new TreeSet<>(new gpa_comparator());
        s3.add(new Student(23,"Tushar", 7.5));
        s3.add(new Student(22,"Deepak", 6.5));
        s3.add(new Student(22,"Lalit", 9.5));
        s3.add(new Student(23,"Vedant", 8.5));
        s3.add(new Student(21,"Shiv", 7.3));


        Iterator<Student> itr3 = s3.iterator();
        while (itr3.hasNext()){
            System.out.print(itr3.next());
        }
        System.out.println();
    }
}
class Name_comparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
class age_comparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();
    }
}
class gpa_comparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return (int) (s1.getCgpa()-s2.getCgpa());
    }
}

