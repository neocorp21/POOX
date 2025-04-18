# Usa una imagen base de JDK
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR generado por Maven al contenedor
COPY target/*.jar app.jar

# Expone el puerto en el que tu aplicación se ejecutará
EXPOSE 8082

# Define el comando de inicio para tu aplicación
CMD ["java", "-jar", "app.jar"]
