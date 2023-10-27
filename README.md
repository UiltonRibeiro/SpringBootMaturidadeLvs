<h1>Níveis de Maturidade de Aplicativos Spring Boot</h1>
<header>
  <p>Vamos observar a aplicação Spring do zero e elevar seu nível de maturidade. Cada estágio de desenvolvimento tem sua própria branch em nosso repositório, e a versão mais recente do projeto está sempre na branch principal (Main).</p>
</header>

<section>
  <div>
  <h2>API REST Maturidade 2</h2>
  <p>Neste nível de maturidade as APIs continuam se tornando cada vez mais organizadas utilizando request com os Verbos HTTP conforme foram idealizado. São eles:</p>
      <ul>
        <li><strong>GET:</strong> É o verbo principal do HTTP utilizado para obter informações da aplicação, em sua tradução seria como (Puxar ou obter).</li>
        <li><strong>POST:</strong> utilizado para informar dados a aplicação, a tradução seria como (Publicar ou Informar).</li>
        <li><strong>PUT:</strong> utilizado para informar dados para alteração de um objeto ou informação já existente, a tradução seria como (Colocar ou Atribuir).</li>
        <li><strong>DELETE:</strong> utilizado para deletar dados já existente da aplicação, a tradução seria como (Deletar ou Excluir).</li>
         <li><strong>PATCH:</strong> utilizado para realizar alterações parciais dados, na tradução seria como (Correção).</li>
      </ul>

  Esses verbos são utilizados nessa aplicação das seguintes formas:
  <p><i>OBS: A aplicação está utilizando o banco de dados H2 que funciona em tempo de runtime com o mapeamento da JPA, para quem não é tão familiarizado com essas ferramentas recomenda da um pesquisa para enteder melhor.</i></p>
  <ul>
      <li>
      <h4>POST</h4>
      <p>O verbo POST é utilizado para criar uma entidade de Pessoa, as requisão precisa de um JSON no corpo para ser recebido pela aplicação. URL: <i>http://localhost:8080/person</i></p>
      <pre>@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
        public Person createPerson(@RequestBody Person person){
            return personServices.CreatePerson(person);
}</pre>
    <p>Que consome um JSON enviado no corpo da requisição:</p>
     <pre>{   
    "fistName": "Person",
    "address": "address",
    "gender": "gender"
}</pre>
    </pre>
    <p>Que após o executar irá produzir e retornar um JSON, com os dados passados:</p>
    <pre>{   
    "id": "id",
    "fistName": "Person",
    "address": "address",
    "gender": "gender"
}</pre>
      </li>
    <li>
      <h4>GET:</h4>
      <p>O verbo GET nessa aplicação é utilizado para recuperar dados de pessoa. URL: <i>http://localhost:8080/person/{id}</i></p>
      <pre>@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id){
        return personServices.findById(id);
}</pre>
    <p>Que é exetado através da URL executa a query com o Path da URL após o executar irá retornar um JSON:</p>
    <pre>{   
    "id": "id",
    "fistName": "Person",
    "address": "address",
    "gender": "gender"
}</pre>
    </li>
    <li>
    <h4>PUT</h4>
    <p>O verbo PUT é utilizado no método de atualização de Pessoa,  e nessa aplicação é método. URL: <i>http://localhost:8080/person</i> </p>
    <pre> @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person UpdatePerson(@RequestBody Person person){
        return personServices.CreatePerson(person);
}</pre>
    <p>Que consome um JSON igual ao abaixo e produz um JSON e retornar um JSON com os dados de Pessoa atualizada</p>
     <pre>{   
    "id": "id",
    "fistName": "Person",
    "address": "address",
    "gender": "gender"
}</pre>
    </li>
    <li>
    <h4>DELETE</h4>
    <p>O verbo DELETE é o mais intuitivo, é utilizado para deletar. URL: <i>http://localhost:8080/person/1</i></p>
    <pre>@DeleteMapping("/{id}")
    public ResponseEntity<?> DeletePerson(@PathVariable Long id){
        personServices.DeletePerson(id);
        return ResponseEntity.noContent().build();
}</pre>
    <p> que deve retorna apenas o status: 204 No Content</p>
    </li>
  </ul>

  ##
Manutenibilidade  <p>Então continuamos deixando a aplicação mais organizada e semantica, tornando as operações mais segura e com maior manutenibilidade. Existem outros dois métodos que são o <strong>HEAD</strong> e o <strong>OPTIONS</strong> que são mais utilizados por nós desenvolvedor e não tanto por cliente por isso acabei não dando tanta atenção, mas vale a pesquisa sobre eles.</p>

##
<footer>
  <h3>Agradecimento:</h3>
  <p> Quero expressar minha sincera gratidão por explorar os níveis de maturidade no desenvolvimento de aplicativos Spring Boot comigo. Espero que esta jornada tenha sido informativa e inspiradora. Se você tiver mais perguntas ou precisar de assistência adicional, não hesite em entrar em contato. Estou aqui para apoiar seu desenvolvimento contínuo. Obrigado!</p>
</footer>
