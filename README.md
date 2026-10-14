## 🚀 Tecnologías y Herramientas

*   **Java 17**
*   **Spring Boot 3.2.5**: Framework principal.
*   **Spring Data MongoDB**: Integración con la base de datos NoSQL.
*   **Lombok**: Reducción de código boilerplate (getters, setters, constructores).
*   **SpringDoc OpenAPI (Swagger UI)**: Documentación interactiva de la API.
*   **Docker & Docker Compose**: Contenerización de la base de datos MongoDB y Mongo Express.
*   **JUnit 5 & Spring Boot Test**: Pruebas unitarias y de integración.



## ⚙️ Configuración y Ejecución de la API  - Cuidado, Ver primero ** Despliegue**

La aplicación está configurada para ejecutarse bajo el puerto `8080` con el context-path `/api`.

### Compilar y probar:
```bash
./mvnw clean install
```
*(Nota: El comando ejecuta los tests y comprueba la concurrencia. Si prefieres omitir los tests usa `./mvnw clean install -DskipTests`)*

### Ejecutar la aplicación:
```bash
./mvnw spring-boot:run
```
