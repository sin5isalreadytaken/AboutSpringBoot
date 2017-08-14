import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sin5 on 2017/5/21.
 */
public class Main {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //获得声明配置的UserFunctionService的Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("di"));
        context.close();
    }
}
