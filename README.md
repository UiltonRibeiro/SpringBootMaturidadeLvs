<h1>Níveis de Maturidade de Aplicativos Spring Boot</h1>
<header>
  <p>Desenvolvendo uma aplicação Spring do zero e elevando níveis de maturidade</p>
  <p>Cada nível de maturidade é representado por uma branch no repositorio, com a versão mais recente do projeto na branch Main</p>
</header>

<section>
  <div>
  <h2>API REST Maturidade 1</h2>
  <p>Nesse nível de maturidade as APIs se tornam mais organizadas. Uma URL é criada para cada recurso que será consumido. por exemplo:</p>
      <ul>
        <li><strong>http://localhost:8080/Math/sum/{numA}/{numB}</strong>Para realizar a operação desomas.</li>
        <li><strong>http://localhost:8080/Math/sub/{numA}/{numB}</strong>Para realizar a operação desubtração.</li>
        <li><strong>http://localhost:8080/Math/mult/{numA}/{numB}</strong>Para realizar a operação de multicação.</li>
        <li><strong>http://localhost:8080/Math/div/{numA}/{numB}</strong>Para realizar a operação de divisão.</li>
        <li><strong>http://localhost:8080/Math/raiz/{numA}</strong>Para realizar a operação de raiz quadrada.</li>
      </ul>

  ##
  <p>Então, em vez de fazer todos os nossos pedidos a um simples endpoint, nós começamos a falar com recursos individuais, com isso temos recursos para cada operação matematica, mas ainda utlizando apenas o verbo POST.</p>

##
<footer>
  <h3>Agradecimento:</h3>
  <p> Quero expressar minha sincera gratidão por explorar os níveis de maturidade no desenvolvimento de aplicativos Spring Boot comigo. Espero que esta jornada tenha sido informativa e inspiradora. Se você tiver mais perguntas ou precisar de assistência adicional, não hesite em entrar em contato. Estou aqui para apoiar seu desenvolvimento contínuo. Obrigado!.</p>
</footer>
