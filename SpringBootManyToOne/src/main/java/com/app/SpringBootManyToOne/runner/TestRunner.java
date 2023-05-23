package com.app.SpringBootManyToOne.runner;

import com.app.SpringBootManyToOne.entity.Book;
import com.app.SpringBootManyToOne.entity.Student;
import com.app.SpringBootManyToOne.repo.BookRepository;
import com.app.SpringBootManyToOne.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository brepo;

    @Autowired
    private StudentRepository srepo;

    @Override
    public void run(String...args)throws Exception{
        //create the book obj
        Book bk1=new Book(101,"DS");
        Book bk2=new Book(102,"SB");

        //save this
        brepo.save(bk1);
        brepo.save(bk2);

        //create Student
        Student st1=new Student(50,"SAM",bk1);
        Student st2=new Student(60,"JHON",bk1);
        Student st3=new Student(70,"ANGELA",bk2);
        Student st4=new Student(80,"BROCK",bk2);

        srepo.save(st1);
        srepo.save(st2);
        srepo.save(st3);
        srepo.save(st4);

    }
}
