# Informe: App de gestión interna para Vivero Da Vinci

Este documento resume la propuesta del proyecto "Vivero Da Vinci" y describe las pantallas y funcionalidades principales para una aplicación de gestión de ventas e inventario. El trabajo actual incluye una muestra (formulario de alta de productos) como demostración.

## Resumen

Vivero Da Vinci es una aplicación orientada a digitalizar las operaciones de venta y el control de stock de un vivero. El prototipo actual implementa un formulario de alta de producto. Esta pantalla es la única desarrollada, cumpliendo con el requerimiento de seleccionar solo una de las posibles vistas de la app. El objetivo futuro es extender las funcionalidades hacia inventario, clientes, reportes y gestión de usuarios.

## Descripción de la pantalla

La pantalla permite al usuario ingresar información sobre nuevos productos para el vivero. Incluye:

- Un encabezado con el logo y el nombre del vivero.
- Un subtítulo que indica la función de la pantalla.
- Un formulario con campos para nombre, tipo y precio de la planta.
- Un botón para agregar el producto.
- Un área donde se muestran dinámicamente los productos agregados.

El layout base de la pantalla es un `ConstraintLayout`, que permite posicionar el contenido principal de forma flexible y adaptable a diferentes tamaños de pantalla. Dentro de este, el contenido está organizado con `LinearLayout` vertical. Se utiliza:

- Un `LinearLayout` vertical para organizar todos los elementos de la pantalla.
- Un `LinearLayout` horizontal en el encabezado para alinear el logo y el nombre del vivero en una misma fila.
- Un `LinearLayout` vertical para el área donde se agregan dinámicamente los productos (tarjetas).

Los campos de texto están implementados con `TextView` para el nombre del vivero, el título y las tarjetas de producto (estas creadas desde Java). Por otro lado, los campos del formulario son del tipo `EditText`, cada uno con su correspondiente `inputType` según el dato que le corresponde. En el caso particular del campo *Tipo*, al ser valores pre-definidos (en este caso *hardcodeados* por ser un mockup), se usa un campo tipo `AutoCompleteTextView`.

El formulario también incluye un botón que permite al usuario agregar un nuevo producto a la lista. Esto ocurre mediante un `setOnClickListener` que valida el formulario y, si es correcto, agrega un nuevo producto a la lista.
