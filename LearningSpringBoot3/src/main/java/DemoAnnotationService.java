import org.springframework.stereotype.Service;

/**
 * Created by sin5 on 2017/5/21.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
