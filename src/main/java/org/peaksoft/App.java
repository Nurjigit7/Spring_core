package org.peaksoft;


import org.peaksoft.model.University;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Student student =new Student();
//        student.walk();
//
//        Teacher teacher=new Teacher();
//        teacher.walk();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//      Student student= context.getBean("student", Student.class);
//      student.walk();
//
//        Teacher teacher=context.getBean("teacher", Teacher.class);
//        teacher.walk();
//


        University university=context.getBean("university", University.class);
//        university.getUniversity();
        System.out.println(university);


    }
}
