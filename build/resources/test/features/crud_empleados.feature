#language:es
Característica:Prueba CRUD

  Antecedentes: Iniciar pagina
    Dado que el usuario ingresa a la pagina empleados

  Esquema del escenario:Crear
    Cuando el crea un empleado
      | nombreCompleto   | codigo   | lugarNacimiento   | fecha   | direccion   | telefono   | estado   | puesto   |
      | <usuario> | <codigo> | <lugarNacimiento> | <fecha> | <direccion> | <telefono> | <estado> | <puesto> |
    Entonces se mostrara que se creo un empleado satisfactoriamente <usuario>

    Ejemplos:

      | usuario     | codigo | lugarNacimiento | fecha      | direccion        | telefono | estado     | puesto   |
      | Pedro Perez | 1280   | Sabaneta        | 11-05-2022 | CARRERA 50 20-10 | 5302010  | Contratado | Empleado |


  Esquema del escenario:actualizar
    Cuando actualizar el empleado <usuario>
    Entonces se mostrar que el empleado se actualizo correctamente

    Ejemplos:
      | usuario          |
      | Rodrigo Gonzales |

  Esquema del escenario: leer
    Cuando cuando busca un empleado contratado <usuario>
    Entonces el debera ver a <usuario>

    Ejemplos:
      | usuario          |
      | Rodrigo Gonzales |


  Esquema del escenario:borrar
    Cuando borra el empleado <usuario>
    Entonces saldra un mensaje de borrado correctamente

    Ejemplos:
      | usuario     |
      | Pedro Perez |

