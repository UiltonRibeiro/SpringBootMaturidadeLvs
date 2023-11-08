<h1>Modelo de maturidade de Richardson</h1>
<header>
  <p>Vamos observar a aplicação Spring do zero e elevar seu nível de maturidade de acordo com o modelo de Richardson. Cada estágio de desenvolvimento tem sua própria branch em nosso repositório, e a versão mais recente do projeto está sempre na branch principal (Main).</p>
  <p>De acordo com o modelo de Richardson para sua aplicação atingir o nível de RestFul, ela tem que deve passar pelos 3 níveis de maturidade para atingir sua glória.</p>
</header>

<section>
  <h2>Níveis de Maturidade:</h2>
  <div>
    <h3>Nível 0 (Pantano de XML):</h3>
    <p> Esse é o nível mais básico de uma API esse nível não pode ser considerada REST. Nesse nível os nomes dos recursos não seguem padrão e estão sendo utilizados apenas para fazer chamadas de métodos remotos. Nesse nível usamos o protocolo HTTP apenas para comunicação, mas sem seguir qualquer tipo de regras para implementar os métodos, regras que serão implementadas nós proximos níveis:
    <br>Exemplo: <a href="https://github.com/UiltonRibeiro/SpringBootMaturidadeLvs/tree/MaturidadeLv0">Maturidade nível 0</a>.</p>
  </div>
  <div>
    <h3>Nível 1 (Recursos):</h3>
    <p>Neste nível a API se torna mais organizada com mais de um EndPoint, tendo um URL para cada recurso que será utilizando da aplicação, aqui começamos a falar sobre os recursos individuais, mas ainda é utilizado apenas o verbo POST para todos os recursos. <br>
    exemplo:<a href="https://github.com/UiltonRibeiro/SpringBootMaturidadeLvs/tree/MaturidadeLv1">Maturidade nível 1</a>.</p>
  </div>
  <div>
    <h3>Nível 2 (Verbos HTTP):</h3>
    <p>Como dito anteriormente começamos a pensar nos recursos de maneira individuais, então começamos a utilizar os verbos HTTP para cada método de acordo com o que ele o recurso próproe, os métodos mais utilizados são o <i>GET, POST, PUT, DELETE</i>, agora podendo compartilhar o EndPoint, mas com verbos diferentes o que ajuda na organização da API.<br>
    exemplo:<a href="https://github.com/UiltonRibeiro/SpringBootMaturidadeLvs/tree/MaturidadeLv2"> Maturidade nível 2</a>.</p>
  </div>
  <div>
    <h3>Nível 3 (HATEOAS)</h3>
    <p>
      O nível 3 (Hypertext As The Engine Of Application State). agora a aplicação também retorna hipermídias, também é trabalhado o "Content negotiaton" agora a aplicação é capaz de lidar com diversos formatos de arquivo, nesta API são eles: (JSON, XML e YAML).<br>
      Exemplo: <a href="https://github.com/UiltonRibeiro/SpringBootMaturidadeLvs/tree/MaturidadeLv3">Maturidade nível 3</a>.
    </p>
  </div>

  ##
  <p></p>
  
</section>
<section>
    <h3>Conclusão:</h3>
    <p>O modelo de maturidade de Richardson é uma ferramenta valiosa para avaliar o nível de maturidade de uma API RESTful. À medida que progredimos pelos quatro níveis, nossa API se torna mais organizada, escalável e fácil de manter. Isso não apenas beneficia os desenvolvedores, mas também melhora a experiência do usuário. API RESTful bem projetadas não apenas seguem as melhores práticas, mas também incentivam a busca contínua de aprimoramento para atender às crescentes demandas dos clientes.</p>
</section>

##
<footer>
  <h3>Agradecimento:</h3>
  <p> Quero expressar minha sincera gratidão por explorar os níveis de maturidade no desenvolvimento de aplicativos Spring Boot comigo. Espero que esta jornada tenha sido informativa e inspiradora. Se você tiver mais perguntas ou precisar de assistência adicional, não hesite em entrar em contato. Estou aqui para apoiar seu desenvolvimento contínuo. Obrigado!</p>
</footer>
