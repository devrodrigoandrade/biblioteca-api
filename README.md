# 📚 Biblioteca API

API REST desenvolvida com Spring Boot para gerenciamento de livros, permitindo operações completas de cadastro, consulta, atualização e remoção de registros.

O projeto foi criado para consolidar conhecimentos em desenvolvimento Back-end com Java, APIs REST, persistência de dados e arquitetura de aplicações utilizando o ecossistema Spring.

---

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Swagger / OpenAPI

---

## 📌 Funcionalidades

* Cadastrar livros
* Listar todos os livros
* Buscar livro por ID
* Atualizar informações de um livro
* Remover livros do sistema

---

## 🏗️ Arquitetura

O projeto segue uma estrutura em camadas:

```text
src/main/java
├── controller
├── service
├── repository
├── model
└── dto
```

### Camadas

**Controller**

* Recebe as requisições HTTP

**Service**

* Regras de negócio

**Repository**

* Persistência de dados

**Model**

* Entidades da aplicação

---

## 🔗 Endpoints

### Listar livros

```http
GET /livros
```

### Buscar livro por ID

```http
GET /livros/{id}
```

### Cadastrar livro

```http
POST /livros
```

### Atualizar livro

```http
PUT /livros/{id}
```

### Remover livro

```http
DELETE /livros/{id}
```

---

## 🗄️ Banco de Dados

O projeto utiliza MySQL para armazenamento das informações.

Exemplo de configuração:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=root
spring.datasource.password=sua_senha
```

---

## 📖 Documentação da API

Após iniciar a aplicação:

```text
http://localhost:8080/swagger-ui/index.html
```

A documentação interativa pode ser utilizada para testar todos os endpoints da API.

---

## ▶️ Como Executar

### Clonar o projeto

```bash
git clone https://github.com/devrodrigoandrade/biblioteca-api.git
```

### Entrar na pasta

```bash
cd biblioteca-api
```

### Configurar o banco de dados

Criar um banco MySQL chamado:

```sql
biblioteca
```

### Executar

Pelo IntelliJ IDEA ou:

```bash
mvn spring-boot:run
```

---

## 🎯 Objetivos de Aprendizado

Este projeto foi desenvolvido para praticar:

* Desenvolvimento Back-end com Java
* Spring Boot
* APIs REST
* Persistência com JPA
* Integração com MySQL
* Documentação com Swagger
* Arquitetura em Camadas

---

## 👨‍💻 Autor

Rodrigo Andrade

GitHub:
https://github.com/devrodrigoandrade

LinkedIn:
https://linkedin.com/in/rodrigoandrade-dev
