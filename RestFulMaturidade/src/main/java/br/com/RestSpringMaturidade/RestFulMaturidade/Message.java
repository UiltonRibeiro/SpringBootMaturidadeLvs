package br.com.RestSpringMaturidade.RestFulMaturidade;

public class Message {
    final String Message= " Olá no nivel de maturidade 0 é utilizado apenas o método post " +
            "então vamos utilizar uma calculadora, utilize uma ferramenta para " +
            " o método Post com o pathVariable http://localhost:8080/greeting/sum/5/8 " +
            "lembrando que os valores podem ser trocado";

    @Override
    public String toString() {
        return Message;
    }
}
