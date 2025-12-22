# Étape 1 : Build Maven
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copier pom.xml et src
COPY pom.xml .
COPY src ./src

# Build Maven
RUN mvn clean package -DskipTests

# Étape 2 : Image finale légère
FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

# Copier le JAR depuis l'étape de build
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]