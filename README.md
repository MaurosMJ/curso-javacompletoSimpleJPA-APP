# Complete Java Course - Object-Oriented Programming - Simple JPA App

###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://hibernate.org/images/hibernate-logo.svg" alt="Hibernate Logo" width="100" height="100">
</div>

This repository contains a simple project using JPA/Hibernate for database access, developed with guidance from Professor Nélio Alves in the course 'Java Complete Object-Oriented Programming + Projects'. As taught by the professor, I replicated and implemented the logic in my project and published it here on GitHub to enhance my learning.

The objective of this project is to create a system that communicates with the database using JPA/Hibernate (Object-Relational Mapping), a technology widely used in the job market due to its versatility in software development.

**Documentation:**  
[Java Persistence API Specification](http://download.oracle.com/otn-pub/jcp/persistence-2_1-fr-eval-spec/JavaPersistence.pdf)

**Technologies:**

- **DBMS Tool:** MySQL Workbench  
- **Build Automation Tool:** Maven  
- **Maven Dependencies:** mysql-connector-java, hibernate-entitymanager, hibernate-core  
- **IDE:** Spring Tool Suite (STS)

##### More Information:
**Course Link:** [Udemy Java Complete Course](https://www.udemy.com/course/java-curso-completo)  
**Section 22:** Java EE - Object-Relational Mapping with JPA/Hibernate

## Index

- [Architecture](#architecture)
- [Worknotes & Commits](#worknotes--commits)
- [Credits](#credits)

## Architecture:

### JPA Overview:

<div style="text-align:center;">
    <img src="https://imgur.com/S0jtibK.png" alt="JPA Overview">
</div>

### Entities:

<div style="text-align:center;">
    <img src="https://imgur.com/zPV7wm7.png" alt="Entities">
</div>

### ORM Example:

<div style="text-align:center;">
    <img src="https://imgur.com/08fuxl1.png" alt="ORM Example">
</div>

## Worknotes & Commits:

##### Worknote #1 - Created all entities and Maven dependencies
Commit hash: [58e882e2b2c386580d79a954e17b74c08874bebf](https://github.com/MaurosMJ/curso-javacompletoSimpleJPA-APP/commit/58e882e2b2c386580d79a954e17b74c08874bebf)  
**Checklist:**
* Classes: `Pessoa`, `Program`
* Maven Dependencies (pom.xml): mysql-connector-java, hibernate-entitymanager, hibernate-core  
* JPA database configuration: `persistence.xml`

##### Worknote #2 - Completed JPA mapping, performed code review, and tests
Commit hash: [31cd3ff3c8ed9f59d453b60c583e6c67bc6d894e](https://github.com/MaurosMJ/curso-javacompletoSimpleJPA-APP/commit/31cd3ff3c8ed9f59d453b60c583e6c67bc6d894e)  
**Checklist:**
* Created JPA mapping for entity `Pessoa`
* Created `EntityManagerFactory` in `Program` (Main class)
* Created `EntityManager` in `Program` (Main class)

## Credits:
This repository is maintained by [MaurosMJ](https://github.com/MaurosMJ). The Projects are based on the 'Java COMPLETO Programação Orientada a Objetos + Projetos' course.
