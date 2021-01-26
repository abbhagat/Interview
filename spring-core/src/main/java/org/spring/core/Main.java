package org.spring.core;

import org.spring.core.empDept.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("config", "shape");
        context.refresh();
        context.registerShutdownHook();

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            employeeList.add(context.getBean("emp", Employee.class));
        }
        employeeList.forEach(emp -> System.out.println(emp + "\t" + emp.hashCode()));
        context.close();
    }
}
