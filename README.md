# Marvel-Spring

### Requisitos
* Sistema operacional Linux
* Docker version 19.03.8
* docker-compose version 1.25.0
* Java 8
* Apache Maven 3.6.3

### Inicialização

* Primeiro, abra o terminal e navege até a raiz do projeto.

* Em seguida é necessário inicializar o banco de dados postgresql utilizando o comando:
```
docker-compose -f postgresql/docker-compose.yml up -d
``` 
 O banco vai estar vazio e será populado no build utilizando o flyway.

* Para realizar o build:
* Obs: O banco de dados deve estar no ar para realizar o build
```
mvn clean install
``` 

* De permissão de execução ao jar do projeto: 
```
chmod +x target/marvel-spring-0.0.1-SNAPSHOT.jar
```

* Execute o jar do projeto:
``` 
java -jar marvel-spring-0.0.1-SNAPSHOT.jar
```

* Agora para ver os endpoints basta acessar o Swagger: http://localhost:8080/swagger-ui.html#/

* No Swagger, basta executar os endpoints e passar o id de um personagem quando solicitado.
