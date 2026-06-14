# Patrón Iterator — Biblioteca Universitaria

## Descripción

Proyecto académico que implementa el **patrón de diseño Iterator** en Java, aplicado a la gestión del catálogo de una biblioteca universitaria.

## Caso de estudio

Una biblioteca universitaria necesita recorrer su catálogo de libros mostrando la información de cada ejemplar, sin exponer ni acceder directamente a la estructura interna de almacenamiento.

## Patrón utilizado

**Iterator** — permite recorrer los elementos de una colección de forma secuencial sin conocer su representación interna (lista, árbol, etc.).

## Modelo de datos

Cada libro cuenta con los siguientes atributos:

| Atributo      | Descripción                          |
|---------------|--------------------------------------|
| `id`          | Identificador único del ejemplar     |
| `titulo`      | Título del libro                     |
| `autor`       | Nombre del autor                     |
| `categoria`   | Categoría o género literario         |
| `disponible`  | Estado de disponibilidad (true/false)|

## Criterio de recorrido

Los libros se recorren ordenados **alfabéticamente por autor**.

## Estructura del proyecto

```
src/biblioteca
    modelo
    ├    ├── Libro.java                  # Clase modelo del libro
    iterator
    ├    ├── Iterator.java               # Interfaz Iterator
    ├    ├── LibroIterator.java       # Implementación del recorrido por autor
    aggregate
    ├    ├── Aggregate.java              # Interfaz Aggregate
    ├    └── CatalogoLibros.java         # Colección de libros
    └── Main.java                   # Demostración del patrón
```

## Historial de commits

```
feat: crear clase Libro
feat: implementar interfaz Iterator
feat: implementar interfaz Aggregate
feat: agregar catalogo de libros
feat: implementar recorrido por autor
feat: agregar demostracion del patron iterator
docs: agregar README del proyecto
```

## Estudiante

- Cardenas Vasquez Jairo Daniel

---

> Proyecto desarrollado como parte de la asignatura de Patrones de Diseño.