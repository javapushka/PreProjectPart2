import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");
        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");

        boolean testHelloWorld = bean1 == bean2;
        boolean testCat = catBean1 == catBean2;

        System.out.println("result test HelloWorld: " + testHelloWorld);
        System.out.println("result test Cat: " + testCat);

        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(catBean1.getName());
        System.out.println(catBean2.getName());
    }
}