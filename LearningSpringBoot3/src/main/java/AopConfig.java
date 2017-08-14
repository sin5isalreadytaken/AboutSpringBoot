import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by sin5 on 2017/5/21.
 */
@Configuration
@ComponentScan("per.sin5.LearningSpringBoot3")
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class AopConfig {
}
