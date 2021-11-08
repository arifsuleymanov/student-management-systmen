package com.youtube.studentmanagementsystem;

import com.youtube.studentmanagementsystem.entity.Student;
import com.youtube.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    private StudentRepository studentRepository;

    public StudentManagementSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1= new Student("Arif","Suleymanov","arif.suleymanov0@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2= new Student("Azer","Suleymanov","azer.suleymanov@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3= new Student("Vaqif","Suleymanov","vaqif.suleymanov@gmail.com");
//        studentRepository.save(student3);
    }
}
