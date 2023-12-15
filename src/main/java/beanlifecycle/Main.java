package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/beans.xml");
        BeansLifeCycle beansLifeCycle = applicationContext.getBean("beansLifeCycle",BeansLifeCycle.class);
    }
}
