/**
 * Created by sin5 on 2017/5/21.
 */
public class UseFunctionService {
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
