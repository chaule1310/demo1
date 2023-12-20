package beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes/beans.xml");

        Account account1 = applicationContext.getBean("account1", Account.class);
        account1.setOwnerName("****");
        Account account2 = applicationContext.getBean("account1", Account.class);
        System.out.println("account: " + account2.getOwnerName());

        Account account3 = applicationContext.getBean("account2", Account.class);
        account3.setOwnerName("*****");
        Account account4 = applicationContext.getBean("account2", Account.class);
        System.out.println("account: " + account4.getOwnerName());
    }
}