import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catOne = applicationContext.getBean(Cat.class);
        Cat catTwo = applicationContext.getBean(Cat.class);

        System.out.println(beanOne.getMessage() + "\n" + beanTwo.getMessage());
        System.out.println(catOne.getName() + "\n" + catTwo.getName());
        System.out.println(beanOne == beanTwo);
        System.out.println(catOne == catTwo);
    }
}