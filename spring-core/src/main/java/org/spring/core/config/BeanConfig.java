package org.spring.core.config;

import org.spring.core.shape.Point;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = {"org.spring.core.config", "org.spring.core.shape", "org.spring.core.events"})

public class BeanConfig {

    @Value("${point.X,10}")
    private int pointX;

    @Value("${point.X,20}")
    private int pointY;

    @Bean(name = "point", initMethod = "initPoint", destroyMethod = "destroyPoint")
    @Scope(value = "prototype")
    public Point getPoint() {
        return new Point(pointX, pointY);
    }

}
