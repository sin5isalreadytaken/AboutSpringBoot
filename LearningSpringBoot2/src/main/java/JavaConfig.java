import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sin5 on 2017/5/21.
 */
@Configuration//此处没有用包扫描，是因为所有的Bean都在此类中定义了
public class JavaConfig {
    @Bean//声明方法的返回值是一个Bean，Bean的名称是方法名
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
