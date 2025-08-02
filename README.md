# Conversor de Moneda

Aplicación de consola en Java que convierte monedas utilizando tasas de cambio en tiempo real obtenidas desde la API [ExchangeRate-API](https://www.exchangerate-api.com/).

## Funcionalidades

- Menú interactivo con opciones para convertir entre:
  - Dólar estadounidense (USD) ↔ Peso argentino (ARS)
  - Dólar estadounidense (USD) ↔ Real brasileño (BRL)
  - Dólar estadounidense (USD) ↔ Peso colombiano (COP)
- Consulta en vivo de tasas de cambio mediante la API
- Validación de entradas del usuario
- Mensajes claros en consola y pausa para continuar
- Manejo de opción para salir del programa

## Estructura del proyecto

- `com.aluracurso.conversorapp.menu`: Clases para mostrar y manejar el menú de opciones
- `com.aluracurso.conversorapp.service`: Lógica de conexión a API y conversión de moneda
- `com.aluracurso.conversorapp.util`: Clases utilitarias para validación y manejo de entradas
- `com.aluracurso.conversorapp.model`: Clases que representan la respuesta de la API y modelos de datos

## Requisitos

- Java 17 o superior
- Conexión a Internet para consultar la API de tasas
- Biblioteca Gson para parseo de JSON

## Cómo ejecutar

1. Clonar el repositorio o descargar el código fuente.
2. Crear un archivo llamado `config.properties` en el directorio raíz del proyecto (al mismo nivel que `src`).
3.  Dentro del archivo `config.properties`, agregar la siguiente línea con tu API key:
```
API_KEY=tu_clave_aquí
```
4.  Asegurarte de **no subir este archivo al repositorio**, ya que contiene información sensible (el archivo ya está ignorado mediante `.gitignore`).
5. Compilar y ejecutar la clase `Main`.
6. Seguir las instrucciones que aparecen en consola para seleccionar opciones y convertir montos.
7. Presionar ENTER cuando se indique para continuar o salir.

## Ejemplo de uso

```bash
Sea bienvenido al Conversor de Moneda

OPCIONES:
1 - Dólar => Peso Argentino
2 - Peso Argentino => Dólar
3 - Dólar => Real Brasileño
4 - Real Brasileño => Dólar
5 - Dólar => Peso Colombiano
6 - Peso Colombiano => Dólar
7 - SALIR

Seleccione una opción: 1
Ingrese el monto a convertir: 100
100.00 USD equivalen a 88050.00 ARS

Presione ENTER para continuar...
```

## Autor

Desarrollado por **Gabycrem** como parte del **Challenge ONE - Java Back-End** del programa de formación profesional [Oracle Next Education](https://www.oracle.com/lad/education/oracle-next-education/) en colaboración con [Alura Latam](https://www.aluracursos.com/).

📍 Tierra del Fuego, Argentina  
🔗 [LinkedIn](https://www.linkedin.com/in/macrenazarena)
