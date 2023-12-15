package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/beans-annocation.xml");
        BeansLifeCycleAnnotion beansLifeCycleAnnotion = applicationContext.getBean("beansLifeCycleAnnotion",BeansLifeCycleAnnotion.class);

    }
}
