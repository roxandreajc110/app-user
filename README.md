# API REST Sistema de usuarios !

## Objetivo

Servicios REST en Spring para creación, listado y procesado de usuarios según los requerimientos.

## Tecnologías/Herramientas usadas

 - Desarrollo
	 - Java 8
	-  Spring Boot
	-  JPA
	-  Maven
- Persistencia
	-  H2 (BD Embebida)
- Documentación
	-  Swagger
- Versionamiento
	- Git
 - Otros
	- Postman


## Persistencia

Para el proyecto se manejo H2 que es un base de datos embebida escrita en Java; esto con fines prácticos, ya que en un contexto productivo no debe usarse este tipo de bases de datos.
Algunso datos de entrada se encuentran en la ruta ***src/main/resources/import.sql***

## Ejecución de la aplicación

Este proyecto se ejecuta por el puerto 8080 , si se requiere ejecutar desde otro puerto , se debe realizar el cambio en el archivo ***app-user\src\main\resources\application.properties*** en la linea ***server.port=8080***

### Generación ejecutable .jar

1.  Descargar el repositorio del proyecto de la rama "**master***".
2.  Mediante el IDE Eclipse, click derecho sobre el proyecto, seleccionamos la opción “***run as***” y luego “***maven build***”, en la ventana que nos arroja llamada “***Edit Configuration***” escribimos “***package***” en el campo de “***Goals***” y damos Click en "***Run***".
3. El punto anterior también puede realizarse mediante linea de comando ejecutando: *"**mvn package**" sobre el proyecto. Tener en cuenta tener instalado maven.*
4.  Después de que se terminé de construir nuestro proyecto se generará automáticamente un **.jar**. (Este .jar podremos encontrarlo en la ruta del proyecto en la carpeta ***/target***)
5. Para ejecutar el .jar, se realiza mediante el comando : 
	**java -jar app-user-0.0.1.jar****
	
### Ejecución por IDE

1. Descargar el repositorio del proyecto de la rama "**master***"  e importarlo en el IDE.
2. Ejecutar el main de la aplicación para este caso: 		    	    **com.valid.app.user***

## Documentación API REST

Se realiza la documentación usando **Swagger**, para ello se debe ir a la ruta:<br>
***PROTOCOLO://IP:PUERTO//swagger-ui.html***<br>
Para este caso en AWS es:<br>
***http://localhost:8080/swagger-ui.html***

## Consumo de servicios

Para mayor practicidad se envia colección de Postman (***\src\main\resources\Services.postman_collection***) con ejemplos de consumos sobre los servicios expuestos.

## Autor
Roxana A. Jaramillo Cobos<br>
[www.linkedin.com/in/roxanajc ](www.linkedin.com/in/roxanajc)
