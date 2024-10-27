## Ferramentas e tecnologias utilizadas

- java 17;
- Spring Boot 3;
- Swagger;
- Postgres
- Railway
- intellij

## Descrição básica
- Esta api visa criar um Back-end de uma aplicação bancaria.

## Diagrama de classes


```mermaid
classDiagram
  
class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  
class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  
class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  
class News {
    -String icon
    -String description
  }

  
User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## Extras

### acessar o console do h2 database 
- http://localhost:8080/h2-console


### acessar a url no swagger
- http://localhost:8080/swagger-ui/index.html

### json online edit
- https://jsoneditoronline.org/


