package helloword;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("beans.xml");
        helloWorld helloworld=(helloword.helloWorld) context.getBean("hellobean");
        helloworld.printHello();
    }
}
