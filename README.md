<h1>Níveis de Maturidade de Aplicativos Spring Boot</h1>
<header>
  <p>Vamos observar a aplicação Spring do zero e elevar seu nível de maturidade. Cada estágio de desenvolvimento tem sua própria branch em nosso repositório, e a versão mais recente do projeto está sempre na branch principal (Main).</p>
</header>

<section>
  <div>
  <h2>API REST Maturidade 3</h2>
  <p>O terceiro introduz algo que você ouvir muitas vezes referido pela sigla HATEOAS (Hypertext As The Engine Of Application State).
  Agora as consultas também retornam hipermídias. Por exemplo o método POST retornava um JSON: 
  </p>
   <pre>{   
    "fistName": "Person",
    "address": "address",
    "gender": "gender"
}</pre>
  <p>Agora vão retornar as informações com um link anexado, esse link já para ser redirecionado ao método GET:</p>
    <pre>{
    "id": 1,
    "fistName": "Person",
    "address": "address",
    "gender": "gender",
    "_links": {
        "self": {
            "href": "http://localhost:8080/person/1"
        }
    }
}</pre>
<p>A classe de service ficou responsável pela produção do retorno com todas as informações necessárias, a Biblioteca utilizada para criação do hipermídia:</p>

<pre>import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;</pre>

<p>As implementações no método POST e nós demais métodos seguem o mesmo padrão, agora estão retornado o serviço de findById, com o Build de HATEOAS</p>
<pre>public DTOPerson CreatePerson(DTOPerson DTOperson){
        logger.info("Created one Person");
        Person personEntity = MapperModel.parseObjetc(DTOperson, Person.class);
        DTOPerson DTOEntity = MapperModel.parseObjetc(personRepository.save(personEntity),DTOPerson.class);
        return DTOEntity.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PersonController.class).findById(DTOEntity.getKey())).withSelfRel());
}</pre>
</section>
<section>
<p>Nessa versão também foi adicionado o padrão de projeto DTO e o mecanisco de Content negotiation:</p>
  <h3>DTO (Data Transfer Objeto)</h3>
  <p>Um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.
  Nesse sistema a ideia seria utiliza-lo para que o usuário não tenha 100% da comprensão da regra de negocio e oque compoem a classe <i>Person</i>, apesar de <i>DTOPerson</i> estar como classe espelho de <i>Person</i>, como apenas a classe Person é persistida pela JPA temos um MapperModel para tranferir as informações de um para o outro..

  </p>
  <h3>Content negotiation</h3>
  Um mecanísmo de maneira simplificada de alteração de formato, deixando para o Cliente decidir o formato em que deseja receber essa informação, nesta aplicação sendo três formatos JSON, XML e YAML tendo também 3 classes responsáveis por esse proceso:<br>
  <ul>
    <li><strong>WebConfig:</strong> Com as configurações de parametro e os tipos de formato</li>
    <li><strong>YamlJacksonMessageConvert:</strong> responsável pelo serialização do YAML</li>
    <li><strong>MediaType:</strong> Que está resposável por manter e fornecer os formatos de maneira statica. </li>
  </ul>
  <p></p>
  
</section>
    
  
<footer>
  <h3>Agradecimento:</h3>
  <p> Quero expressar minha sincera gratidão por explorar os níveis de maturidade no desenvolvimento de aplicativos Spring Boot comigo. Espero que esta jornada tenha sido informativa e inspiradora. Se você tiver mais perguntas ou precisar de assistência adicional, não hesite em entrar em contato. Estou aqui para apoiar seu desenvolvimento contínuo. Obrigado!</p>
</footer>
