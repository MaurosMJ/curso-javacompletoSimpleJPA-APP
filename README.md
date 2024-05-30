# curso-javacompletoSimpleJPA-APP


###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://hibernate.org/images/hibernate-logo.svg" alt="Descrição da imagem" width="100" height="100">
</div>
This repository contains a simple project using JPA / Hibernate for database access with the help of Professor Nélio Alves in the course 'Java Complete Object-Oriented Programming + Projects'. As the professor explained and taught, I replicated and implemented the logic in my project and published it here on GitHub to improve my learning.  

The objective of this project is to create a system that communicates with the database using JPA / Hibernate (Object-Relational Mapping), which is widely used in the job market due to its versatility in software development.

DOCS:  
http://download.oracle.com/otn-pub/jcp/persistence-2_1-fr-eval-spec/JavaPersistence.pdf

Technologies:

DBMS Tool: MySQL Workbench  
Build automation Tool: Maven  
Maven Dependencies: Mysql-connector-java, Hibernate-entitymanager and Hibernate-core  
IDE: Spring Tool Suite (STS)

##### More information:
Course Link: [Link](https://www.udemy.com/course/java-curso-completo)  
Section 22. Java EE - Object-Relational Mapping with JPA/Hibernate

## Index

- [Architecture](#architecture-1)
- [Worknotes & Commits](#Worknotes&Commits)
- [Credits](#Credits)

## Architecture:

### JPA OVERVIEW:

<div style="text-align:center;">
    <img src="https://imgur.com/S0jtibK.png" alt="Descrição da imagem">
</div>

### Entities:  

<div style="text-align:center;">
    <img src="https://imgur.com/zPV7wm7.png" alt="Descrição da imagem">
</div>

## Worknotes & Commits:

##### Worknote #1 - Created all entities and maven dependencies
Commit hash: [58e882e2b2c386580d79a954e17b74c08874bebf](https://github.com/MaurosMJ/curso-javacompletoSimpleJPA-APP/commit/58e882e2b2c386580d79a954e17b74c08874bebf)  
Checklist:
* Classes Pessoa, Program 
* Maven Dependencies (Pom.xml): Mysql-connector-java, Hibernate-entitymanager and Hibernate-core  
* JPA database conf: persistence.xml

##### Worknote #2 - Completed JPA mapping, performed code review, and tests
Commit hash: [31cd3ff3c8ed9f59d453b60c583e6c67bc6d894e](https://github.com/MaurosMJ/curso-javacompletoSimpleJPA-APP/commit/31cd3ff3c8ed9f59d453b60c583e6c67bc6d894e)  
Checklist:
* Create JPA mapping for entity 'Pessoa'
* Create EntityManagerFactory in 'Program' (Main class)
* Create EntityManager in 'Program' (Main class)

# Credits:
[@acenelio (Nelio Alves)](https://github.com/acenelio)  
[@Me :)](https://github.com/MaurosMJ)
