# API de Clientes - Spring Boot MVC

## Descrição
A API REST foi desenvolvida em Java com Spring Boot, seguindo o padrão arquitetural MVC.
O objetivo é disponibilizar dados de clientes para parceiros externos, permitindo operações CRUD completas.

Este é o trabalho final do bootcamp Arquitetura de Software da XP Educação.

## Arquitetura
- Model: Entidades de domínio
- Controller: Endpoints REST
- Service: Regras de negócio
- Repository: Persistência de dados

## Estrutura de pastas

<img width="377" height="482" alt="image" src="https://github.com/user-attachments/assets/9fb8e429-749a-46df-873b-89bbe82f2fe6" />

## Tecnologias
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco H2
- Maven

## Endpoints

| Método | Endpoint | Descrição |
|------|---------|----------|
| POST | /clientes | Criar cliente |
| GET | /clientes | Listar todos |
| GET | /clientes/{id} | Buscar por ID |
| GET | /clientes/nome/{nome} | Buscar por nome |
| PUT | /clientes/{id} | Atualizar cliente |
| DELETE | /clientes/{id} | Remover cliente |
| GET | /clientes/contar | Contagem |

## Diagrama C4
O projeto inclui um diagrama C4, em nível container, ilustrando a interação entre usuário, API, serviços e banco de dados.
