
# Backend

 projeto Spring Boot com autenticação do Spring Security e API REST. Este projeto é uma aplicação web criada com o framework Spring Boot, que permite aos usuários se autenticarem e utilizar uma API REST com o banco de dados H2 e Java 8. O objetivo deste documento é fornecer uma visão geral do projeto e suas principais funcionalidades.


![Logo](https://s.financesonline.com/uploads/2019/08/Spring-Boot-logo1.png)


## Autores

- [@jrcantador](https://www.github.com/jrcantador)


## Instalação

Após clonar o repositório do projeto, abra um terminal e navegue até a pasta raiz do projeto. Em seguida, execute o seguinte comando para compilar o projeto:


```bash
mvn clean install
```

## Executando o projeto

Antes de executar o projeto, você deve verificar as propriedades de banco de dados no arquivo application.properties. Por padrão, este projeto utiliza o banco de dados H2, que é um banco de dados em memória. O usuário e a senha também estão nesse arquivo.

Execute o seguinte comando para iniciar o projeto:

```bash
mvn spring-boot:run
```

Isso irá iniciar o servidor de desenvolvimento e a API REST estará acessível em http://localhost:8080/.

## Funcionalidades
Este projeto possui as seguintes funcionalidades principais:

 - Autenticação: O usuário pode fazer login na aplicação utilizando o Spring Security.
 - API REST: A aplicação expõe endpoints RESTful para realizar operações CRUD em uma tabela de produtos.


## Arquitetura

Este projeto segue a arquitetura de camadas do Spring Framework, com a camada de modelo representada pelas entidades JPA, a camada de acesso a dados representada pelos repositórios JPA e a camada de controle representada pelos controladores REST. O Spring Security é utilizado para realizar a autenticação e autorização dos usuários.
    
## Documentação da API

#### Login

```http
  GET /login
```


#### Retorna todas as compras

```http
  GET /purchase/
```


#### Retorna compra por id

```http
  GET /purchase/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID da compra que você quer |

### Registra uma compra

```http
  POST /purchase
```

Passando no body da requisição os seguintes campos:

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `description`      | `string` | **Obrigatório**. Descrição da compra  |
| `product`      | `string` | **Obrigatório**. Nome do produto  |
| `amount`      | `string` | **Obrigatório**. Quantidade do produto  |

### Remove uma compra
```http
  DELETE /purchase/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID da compra que você quer remover |
