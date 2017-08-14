import org.springframework.stereotype.Service;

/**
 * Created by sin5 on 2017/5/21.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
