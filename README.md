# Aplicación Spring Boot con Arquitectura Hexagonal

Este proyecto es una implementación de una aplicación basada en Spring Boot siguiendo el patrón de **Arquitectura Hexagonal** (también conocida como **Arquitectura de Puertos y Adaptadores**). Este patrón promueve una separación clara entre las reglas de negocio del sistema (núcleo de la aplicación) y las interacciones con el exterior, como bases de datos, servicios externos, o interfaces de usuario.

## Estructura del Proyecto

La arquitectura hexagonal divide la aplicación en diferentes capas y módulos:

- **Core (Dominio):** Contiene las reglas de negocio de la aplicación, sin dependencia de frameworks ni detalles de infraestructura.
- **Application:** Controla el flujo de la aplicación y coordina las interacciones entre los puertos y los adaptadores.
- **Infrastructure:** Contiene los adapatadores relacionado con los elemento de infraestructura de la aplicacion

## Requisitos

Para ejecutar la aplicación, necesitarás tener instalados los siguientes elementos:

- **JDK 17 o superior**
- **Maven 3.8+** (o Gradle si prefieres usarlo)
- **Docker** (si deseas usar contenedores)
- **Spring Boot**: 2.5.x o superior (la versión está definida en el archivo `pom.xml`)
