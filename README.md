<h2>API REST com Java e Spring Boot para gerenciamento de pessoas</h2>

Este projeto foi realizado durante o curso de **Java Developer** da Digital Innovation One,
e nele, desenvolvi um sistema de gerenciamento básico de pessoas através de uma API REST, criada com o Spring Boot persistindo em um banco postgresql provisionado no Heroku.


Os seguintes endpoints foram criados:

* GET /persons
* GET /persons/{id}
* PUT /persons/{id}
* POST /persons
* DELETE /persons/{id}


Para fazer o clone do projeto utilize o comando:

```
git clone https://github.com/sidneymiranda/person-management-api.git
```

Para executar o projeto no terminal, digite o seguinte comando na raiz do projeto:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/persons
```

Foram utilizadas as seguintes tecnologias:

* Spring Boot.
* Spring Data JPA.
* Spring Web
* Spring Starter Validation
* JUnit  
* Lombok.
* PostgreSQL.
* MapStruct  
* Devtools | H2 Database - para ambiente de desenvolvimento.


Abaixo, seguem links de referência:

* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
