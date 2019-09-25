package pdflambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Object , String> {
    @Override
    public String handleRequest(Object input, Context context) {
        System.out.println(context.getAwsRequestId());
        System.out.println("Lambda initiated");
        return "Hello Lambda";
    }
}
