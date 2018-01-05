rem Obteniendo primer comentario
SET arg1=%1

SET classpath="../luaj-3.0.1/lib/luaj-jse-3.0.1.jar;."
javac -cp %classpath% %arg1%.java
java -cp %classpath% %arg1%