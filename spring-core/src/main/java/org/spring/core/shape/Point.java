package org.spring.core.shape;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@NoArgsConstructor
@Component
public class Point implements BeanNameAware, InitializingBean, ApplicationEventPublisherAware, DisposableBean {

    private int X;
    private int Y;
    private String beanName;
    private ApplicationEventPublisher applicationEventPublisher;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setY(int Y) {
        System.out.println("*****Setter of Lombok Overriden");
        this.Y = Y;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("BeanNameAware invoked() " + beanName);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBean invoked()" + beanName);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy() invoked");
    }

    public void initPoint() {
        System.out.println("InitPoint invoked()" + beanName);
    }

    public void destroyPoint() {
        System.out.println("DestroyPoint invoked()" + beanName);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct invoked()" + beanName);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy() invoked()" + beanName);
    }
}

/*
BeanFactoryPostProcessor --------------------------------------------------------------> postProcessBeanFactory()
       -> ApplicationListener ---------------------------------------------------------> ????????????
                   -> BeanNameAware ---------------------------------------------------> setBeanName()
                        -> BeanPostProcessor ------------------------------------------> postProcessBeforeInitialization()
                             -> @PostConstruct ----------------------------------------> Annotation
                                   -> InitializingBean --------------------------------> afterPropertiesSet()
                                         -> initPoint() -------------------------------> init-method
                                              -> BeanPostProcessor --------------------> postProcessAfterInitialization()
                                                        -> @PreDestroy ----------------> Annotation
                                                             -> destroy() -------------> DisposableBean
                                                                  -> destroyPoint() ---> destroy-method

*/
