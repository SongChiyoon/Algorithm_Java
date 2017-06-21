package DataStructure.DS.collection;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student newStudent) {
        return Integer.compare(this.age, newStudent.age);
    }
}
