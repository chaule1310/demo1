package helloword;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("beans.xml");
        helloworld helloworld=(helloword.helloworld) context.getBean("hellobean");
        helloworld.printHello();
    }
}
