package ru.kuzmin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.kuzmin.rest.entity.Department;
import ru.kuzmin.rest.entity.Employee;
import ru.kuzmin.rest.repo.MyRepoDep;

@SpringBootApplication
public class RestApplication {

	//@Transactional
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(RestApplication.class, args);
		MyRepoDep mrd = ctx.getBean(MyRepoDep.class);

		Department dp1 = new Department("RnD", "4 floor");
		dp1.getEmployeeSet().add(new Employee("Alex",dp1));
		dp1.getEmployeeSet().add(new Employee("Vova",dp1));
		dp1.getEmployeeSet().add(new Employee("Rita",dp1));
		dp1.getEmployeeSet().add(new Employee("Elena",dp1));

 		mrd.saveAndFlush(dp1);



	}

}
