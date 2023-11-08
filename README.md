<h1>Níveis de Maturidade de Aplicativos Spring Boot</h1>
<header>
  <p>Desenvolvendo uma aplicação Spring do zero e elevando níveis de maturidade</p>
  <p>Cada nível de maturidade é representado por uma branch no repositorio, com a versão mais recente do projeto na branch Main</p>
</header>

<section>
  <div>
  <h2>API REST Maturidade 0</h2>
  <p>Na API com nível mais baixo de maturidade encontramos apenas um verbo a ser utilizado como tipo de operação, o POST. Todas as URLs criadas sendo elas para ações de obter dados, atualizar dados, inserir e deletar são chamadas usando o POST.</p>

  <p>Olá, no nivel de maturidade 0 é utilizado apenas o verbo POST, então irei exemplificar com a soma de dois valores, use uma ferramenta para utilizar a requisição do tipo Post (<a href="https://www.postman.com">Por exemplo: Postman</a>) com o pathVariable <i>http://localhost:8080/Math/sum/5/8</i> lembrando que os valores podem ser trocados</p>

  <section>
  <h4>Explicação da construção da URL:</h4>
      <ul>
        <li><strong>http:</strong> Protocolo que permite a obtenção de recursos, como HTML.</li>
        <li><strong>localhost:8080:</strong> A porta onde nossa aplicação Java Spring está rodando.</li>
        <li><strong>/Math:</strong> O RequestMapping para a calculadora, onde encontramos as instruções.</li>
        <li><strong>/sum/{numA}/{numB}:</strong> O PostMapping que realiza a soma de dois valores, {numA} e {numB}. Anteriormente informei os valores 5 e 8 como podem observar.</li>
      </ul>
  </section>
  </div>
</section>

##
<footer>
  <h3>Agradecimento:</h3>
  <p> Quero expressar minha sincera gratidão por explorar os níveis de maturidade no desenvolvimento de aplicativos Spring Boot comigo. Espero que esta jornada tenha sido informativa e inspiradora. Se você tiver mais perguntas ou precisar de assistência adicional, não hesite em entrar em contato. Estou aqui para apoiar seu desenvolvimento contínuo. Obrigado!.</p>
</footer>
