## 🚀 Tecnologías y Herramientas

*   **Java 17**
*   **Spring Boot 3.2.5**: Framework principal.
*   **Lombok**: Reducción de código boilerplate (getters, setters, constructores).
*   **SpringDoc OpenAPI (Swagger UI)**: Documentación interactiva de la API.
*   **Docker & Docker Compose**: Contenerización de la base de datos MongoDB y Mongo Express.



## ⚙️ Configuración y Ejecución de la API  - Cuidado, Ver primero ** Despliegue**

La aplicación está configurada para ejecutarse bajo el puerto `8080` con el context-path `/api`.

### Compilar y probar:
```bash
./mvnw clean install -Dmaven.test.skip=true
```
*(Nota: El comando ejecuta los tests y comprueba la concurrencia. Si prefieres omitir los tests usa `./mvnw clean install -DskipTests`)*

### Ejecutar la aplicación:
```bash
./mvnw spring-boot:run
```

Una vez que la aplicación esté corriendo, puedes interactuar con los endpoints sin necesidad de Postman mediante la interfaz de Swagger UI.

*   **Swagger UI:** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
