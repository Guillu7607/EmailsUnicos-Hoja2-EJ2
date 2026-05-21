# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para gestionar un registro de direcciones de correo electrónico. 
El objetivo principal de este ejercicio es comprender el funcionamiento de la interfaz Set y la colección HashSet para garantizar de forma 
nativa la unicidad de los datos, impidiendo la introducción de elementos duplicados.
## Características 
Estructura de Datos No Duplicada: Emplea HashSet para almacenar los correos, una colección basada en una tabla hash que no permite elementos repetidos.Búsqueda en Tiempo Constante: Aprovecha la eficiencia del método .contains(), el cual verifica la existencia de un elemento casi instantáneamente ($O(1)$), sin necesidad de recorrer la colección elemento por elemento.Interfaz de Usuario Iterativa: Implementa un menú por consola guiado mediante un bucle do-while y una estructura de control switch-case tradicional.Limpieza de Canal de Entrada: Realiza el vaciado del salto de línea residual (sc.nextLine()) después de leer la opción numérica
, asegurando que las capturas de texto posteriores funcionen correctamente.
