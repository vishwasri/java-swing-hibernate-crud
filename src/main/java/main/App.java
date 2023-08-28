package main;

import dao.StudentDao;
import dao.UnitDao;
import java.util.List;
import model.MyUnit;
import model.Student;
import model.Unit;



public class App {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("test student 1");
        
        MyUnit unit = new MyUnit();
        unit.setName("Liters");
        
        
        new StudentDao().saveStudent(student);
        new UnitDao().saveUnit(unit);
        
        List<Student> students = new StudentDao().getAllStudents();
        
        students.stream().forEach((x) -> System.out.println(x.getName()));
    }

}
