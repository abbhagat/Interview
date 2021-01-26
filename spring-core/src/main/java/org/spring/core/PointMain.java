package org.spring.core;

import org.spring.core.shape.Point;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("config");
        context.registerShutdownHook();
        Point point = context.getBean("point", Point.class);
        System.out.println(point);
    }
}
