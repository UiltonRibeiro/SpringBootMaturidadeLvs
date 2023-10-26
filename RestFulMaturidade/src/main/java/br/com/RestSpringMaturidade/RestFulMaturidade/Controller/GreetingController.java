package br.com.RestSpringMaturidade.RestFulMaturidade.Controller;

import br.com.RestSpringMaturidade.RestFulMaturidade.Entities.Greeting;
import br.com.RestSpringMaturidade.RestFulMaturidade.Exceptions.UnsupportedMathOperationException;
import br.com.RestSpringMaturidade.RestFulMaturidade.Message;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.jdbc.support.JdbcUtils.isNumeric;

@RestController()
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    Message message = new Message();
    private final AtomicLong counter = new AtomicLong();
    @GetMapping()
    public Greeting hello(@RequestParam(value = "name",defaultValue = "World")String name){
        Greeting greeting = new Greeting(counter.incrementAndGet(),
                String.format(template, name) + message.toString());
        return greeting;
    }
}
