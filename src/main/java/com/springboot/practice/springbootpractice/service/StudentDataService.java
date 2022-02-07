package com.springboot.practice.springbootpractice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.practice.springbootpractice.bean.StudentBean;

@Service
public class StudentDataService {
	public List<StudentBean> getStudentData() {
		List<StudentBean> studentList=new ArrayList<StudentBean>();
		StudentBean studentBean=new StudentBean(13, "Sai Anirudh");
		StudentBean studentBean1=new StudentBean(14, "Abhiram");
		StudentBean studentBean2=new StudentBean(15, "Asritha");
		StudentBean studentBean3=new StudentBean(16, "Sai Amrutha");
		StudentBean studentBean4=new StudentBean(17, "Shrestha");
		StudentBean studentBean5=new StudentBean(18, "Dhruvansh");
		StudentBean studentBean6=new StudentBean(19, "Eeshan Sai");
		studentList.add(studentBean);
		studentList.add(studentBean1);
		studentList.add(studentBean2);
		studentList.add(studentBean3);
		studentList.add(studentBean4);
		studentList.add(studentBean5);
		studentList.add(studentBean6);
		List<StudentBean> filterList=studentList.stream().
				filter(p->p.getName().startsWith("Sai"))
				.collect(Collectors.toList());
		Optional<StudentBean> maxrollnumberStudent= studentList.stream().max((p1,p2)->p1.getRollNo()-p2.getRollNo());
		Optional<StudentBean> minrollnumberStudent= studentList.stream().min((p1,p2)->p1.getRollNo()-p2.getRollNo());
		
		List<StudentBean> defaultSoretedList=studentList.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		System.out.println("Max rollnumber Name:"+maxrollnumberStudent.get().getName());
		System.out.println("Min rollnumber Name:"+minrollnumberStudent.get().getName());
		/*Printing the names in the list*/
		List<String> namesList=studentList.stream().map(p->p.getName()).collect(Collectors.toList());
		System.out.println("\"Printing Names using forEach Method Refrences :\"+");
		studentList.stream().map(p->p.getName()).forEach(System.out::println);
		studentList.stream().map(p->p.getName()).forEach(p->System.out.println("Element print using Lamda functions:"+p));
		boolean b=studentList.stream().anyMatch(p->p.getName().startsWith("Sai"));
		System.out.println(b);
		System.out.println(namesList);
		/*
		 * ResponseEntity<StudentBean > student= new
		 * ResponseEntity<StudentBean>(studentBean, HttpStatus.OK);
		 */
		return defaultSoretedList;
	}

}
