# HOJA DE TRABAJO 8, SOBRE COLAS CON PRIORIDAD Y SU IMPLEMENTACIÓN CON HEAPS.
## Autores:
Oscar Ignacio Escribá Rodas, 21474
## Descripcion: 
sted fue contratado para desarrollar el sistema de atención de pacientes que llegan a la sección de Emergencias de un hospital. Al llegar un paciente, se llena su ficha de ingreso con:
Nombre del paciente, descripción del síntoma, código de emergencia.
El código de emergencia es una letra de la A a la E, que indica la prioridad con que debe ser atendido el paciente. La prioridad A es la que más rápido debe ser atendida y la E es la que puede atenderse más lentamente, ya que no presenta una condición mortal o de gran peligro para el paciente. Usted decide hacer el sistema basado en una Priority Queue en la que se ingresan las fichas del paciente y se r etir a de esa cola al paciente que tenga la prioridad de atención más rápida. Las fichas del paciente vendrán en un archivo de tex to ( debe llamarse pacientes.txt) con los campos separados por comas. 

Por ejemplo:
Juan Perez, fractura de pierna, C
Maria Ramirez, apendicitis, A
Lorenzo Toledo, chikunguya, E
Carmen Sarmientos, dolores de parto, B

El sistema permite indicar cual paciente debe ser atendido. Así, que cuando el doctor pide el siguiente paciente, se retira de la cola y se muestra su nombre, síntoma y prioridad. El orden en que serán retirados los pacientes, uno a la vez:

Maria Ramirez, apendicitis, A
Carmen Sarmientos, dolores de parto, B
Juan Perez, fractura de pierna, C
Lorenzo Toledo, chikunguya, E

Hoja de trabajo #8: sin utilizar Java Collection Framework para el priority queue. 
![image](https://github.com/OscarEscriba/HT8---ED-Oscar-Escriba/assets/128449179/23656406-caa6-4ada-b0dd-cb9d9e6e7c4e)

Hoja de trabajo #8: utilizando Java Collection Framework para el priority queue. 
![image](https://github.com/OscarEscriba/HT8---ED-Oscar-Escriba/assets/128449179/9608c6c4-853c-4fd0-9df6-3faf9242a9f3)

