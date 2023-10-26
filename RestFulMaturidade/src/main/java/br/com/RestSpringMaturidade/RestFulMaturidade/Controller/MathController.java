package br.com.RestSpringMaturidade.RestFulMaturidade.Controller;

import br.com.RestSpringMaturidade.RestFulMaturidade.Exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Math")
public class MathController {
    @PostMapping(value = "/sum/{numbA}/{numB}")
    public Double sum(@PathVariable(value = "numbA") String numA,
                      @PathVariable(value = "numB") String numB) throws UnsupportedMathOperationException {
        try {
            return Double.parseDouble(numA.replaceAll(",",".")) + Double.parseDouble(numB.replaceAll(",","."));
        }catch(Exception e){
            throw new UnsupportedMathOperationException("Por favor, utilize apenas valores numericos");
        }
    }
}
