# VirtualMemSimulator [JAVA]

## ***Introducción***
Simulación de la administración de ***memoria virtual*** en un Sistema Operativo. El método de administración de dicha memoria será ***Paginación***. La simulación empezará con una selección de los tamaños de la *Memoria Principal*, *Memoria Secundaria* y de la *Página*. La simulación será en tiempo real y se verá como los procesos van *cambiando de estado* cada vez que se le termina el *tiempo de procesador*. El tiempo de ejecución de los procesos será un número random entre 1 y 5. La *política de reemplazo* que se usa en la simulación es la de **FIFO**.


## ***ScreenShots***

### *Selección de los tamaños*
![Selección de los tamaños](https://i.ibb.co/f4csW7t/Anotaci-nh.png)

### *Panel de control*
![Panel de control](https://i.ibb.co/pdP9fXT/Virtual-Mem-Simulator1.png)


## ***Especificaciones de desarrollo***
> Software desarrollado con el IDE *NetBeans*, en el lenguaje ***JAVA***


## ***Especificaciones del Sistema***
Usted ha sido contratado por una empresa de tecnología que se encuentra
desarrollando un nuevo sistema operativo. En particular, usted ha sido encargado
de escoger el modelo mediante el cual el sistema operativo administrará la
memoria virtual. Para ello, su supervisor le pide que realice una simulación en el
lenguaje de programación JAVA, de la *administración de la memoria virtual*. Para
la primera entrega, su supervisor le pide que realice esta simulación considerando
que el sistema operativo administra la memoria virtual utilizando ***paginación***.

La simulación deberá permitir al iniciar, establecer el tamaño de la memoria
principal, de la memoria secundaria y de las páginas. Luego, su supervisor deberá
poder crear tantos procesos como él desee, indicando la cantidad de memoria
que cada proceso ocupará y el nombre del mismo (tome en cuenta que el proceso
estará en la lista de activos, si y sólo si, la mitad o más páginas de cada proceso
se encuentran en memoria principal). Igualmente, su supervisor podrá bloquear ,
suspender y eliminar procesos.

Es importante para la toma de decisiones, llevar un registro de los procesos
creados y su estado, de los marcos de páginas utilizados actualmente, de la
cantidad de memoria disponible (principal y secundaria), y de las direcciones
físicas que ocupa cada página de cada proceso que se encuentra en la memoria
principal.

La simulación deberá contar con los siguientes requisitos:
1. La duración del proceso sera un aleatorio entre 1 y 5 segundos.
2. Cada 0,5 segundos el proceso sera cambiado por el siguiente (Siguiendo una política FIFO).
3. Como excepción a la parte anterior cada vez que se cree un nuevo proceso este entrara directamente a ejecución.

Finalmente, su supervisor le comenta que la simulación deberá venir
acompañada de una interfaz gráfica en donde se pueda visualizar los procesos
que se encuentran en memoria principal y los que se encuentran en memoria
secundaria, además su supervisor deberá poder realizar todas las operaciones
previamente planteadas a través de esta interfaz (crear, suspender y eliminar un
proceso), deberá poder visualizar el estado actual de los procesos y el uso de la
memoria principal y los marcos de páginas, y cualquier otro dato que fuera
nombrado previamente.