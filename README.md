# E-commerce Princing Service
Este servicio Spring Boot proporciona un endpoint REST para consultar precios en una base de datos de comercio electrónico. Los precios se definen en una tabla PRICES que refleja el precio final (PVP) y la tarifa que se aplica a un producto de una cadena entre fechas específicas

## Tabla de contenidos
1. Requisitos del sistema
2. Configuración del proyecto
3. Uso del servicio
4. Ejecución de pruebas
5. Contribuciones

## 1. Requisitos del sistema
- Java 11
- Maven
- IDE (opcional)

## 2. Configuración del proyecto
1. Clonar el repositorio - >

   ```java
   git clone https://github.com/chrisanre/inditex.git cd e-commerce-pricing-service
   ```
2. Configurar los datos de H2
- La base de datos H2 está configurada para automáticamente para inicializarse al arrancar la aplicación. Se puede ajustar la configuración en 'src/main/resources/application.properties'. En esta ruta tambien se encuentra el script de inicialización de la BD con los datos de ejemplo (data.sql)

3. Compile y building
   ```java
   mvn clean package
   ```
4. Ejecutar
   ```java
   java -jar target/e-commerce-pricing-service.jar
   ```
