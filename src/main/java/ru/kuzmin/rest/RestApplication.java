package ru.kuzmin.rest;

import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApplication {

	//@Transactional
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(RestApplication.class, args);
		MyRepoDep mrd = ctx.getBean(MyRepoDep.class);

		Department dp1 = new Department("RnD", "4 floor");
		dp1.employeeSet.add(new Employee("Alex",dp1));
		dp1.employeeSet.add(new Employee("Vova",dp1));
		dp1.employeeSet.add(new Employee("Rita",dp1));
		dp1.employeeSet.add(new Employee("Elena",dp1));

 		mrd.saveAndFlush(dp1);



	}

}
