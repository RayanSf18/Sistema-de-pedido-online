
<h1>Sistema de Pedido Online</h1>

Sistema de pedido online completo desenvolvido em Java com Spring Boot, utilizando o Maven para gerenciamento de dependências e o banco de dados H2. Este sistema oferece uma API REST para gerenciar pedidos de forma eficiente.

<h2>Funcionalidades</h2>

- Cadastro de clientes

- Cadastro de produtos

- Gestão de pedidos

- Geração de relatórios de pedidos
  
<h2>Pré-requisitos</h2>

- Java 8 ou superior

- Maven 3.x

- IDE Java (recomendado: IntelliJ IDEA, Eclipse)

- Postman ou qualquer outra ferramenta para testar APIs REST

<h2>Instalação e execução</h2>

- Clone este repositório:

<code>git clone https://github.com/seu-usuario/sistema-pedido-online.git</code>

- Navegue até o diretório do projeto:

<code>cd sistema-pedido-online</code>

- Compile o projeto com Maven:

<code>mvn clean install</code>

Execute a aplicação:

<code>java -jar target/sistema-pedido-online-1.0.0.jar</code>

<h2>Uso</h2>
Após a execução da aplicação, a API estará disponível em http://localhost:8080. Você pode explorar os endpoints utilizando o Postman ou outra ferramenta similar.

<h2>Endpoints</h2>

- GET /clientes: Retorna todos os clientes cadastrados.

- POST /clientes: Cria um novo cliente.

- GET /produtos: Retorna todos os produtos disponíveis.

- POST /produtos: Adiciona um novo produto.

- GET /pedidos: Retorna todos os pedidos realizados.

- POST /pedidos: Realiza um novo pedido.

<h2>Configurações</h2>
O arquivo application.properties contém as configurações da aplicação, incluindo as configurações do banco de dados H2.

<h2>Contribuição</h2>
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias, correções de bugs, ou novas funcionalidades.

<h2>Licença</h2>
Este projeto está licenciado sob a MIT License.
