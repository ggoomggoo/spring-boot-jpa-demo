package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}

	@Autowired
	EmpRepository empRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		selectList();
		
//		select(2L);
//		
//		delete(3L);
//		selectList();
//		
////		save(new Emp().setEname("park"));
//		save(new Emp().setUser(new User(null, "park")));
//		selectList();
//		
//		update(4L, "choi");
//		selectList();
		
	}

//	private void update(Long empno, String ename) {
//		Emp e = empRepository.findOne(empno);
//		e.setEname(ename);
//		empRepository.save(e);
//	}
//
//	private void save(Emp emp) {
//		Emp e = empRepository.save(emp);
//	}
//
//	private void select(Long empno) {
//		Emp emp = empRepository.findOne(empno);
//		System.out.println(emp);
//	}
//
//	private void delete(Long empno) {
//		empRepository.delete(empno);
//	}

	private void selectList() {
		List<Emp> emps = empRepository.findAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
}
