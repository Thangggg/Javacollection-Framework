package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ronaldo", "Portugal", 36);
        Student student1 = new Student("Messi", "Argentina", 35);
        Student student2 = new Student("Rooney", "England", 36);

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);

        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        for(Student st : students){
            System.out.println(st.toString());
        }

    }
}
