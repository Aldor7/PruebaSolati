package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaEmpleados extends PageObject {
    /* EMPLEADO CREAR*/
    public static final Target BTN_CLICK_EMPLEADO =Target.the("LLENAR CAMPO USUARIO").locatedBy("//li//a[text()='Agregar datos']");
    public static final Target TXT_LLENAR_CODIGO =Target.the("LLENAR CODIGO USUARIO").locatedBy("//input[@name='codigo']");
    public static final Target BTN_LLENAR_NOMBRE =Target.the("LLENAR NOMBRE").locatedBy("//input[@name='nombres']");


    public static final Target BTN_LLENAR_LUGAR_NACIMIENTO =Target.the("LLENAR LUGAR DE NACIMIENTO").locatedBy("//input[@name='lugar_nacimiento']");
    public static final Target BTN_FECHA =Target.the("LLENAR FECHA NACIMIENTO").locatedBy("//input[@name='fecha_nacimiento']");



    public static final Target BTN_LLENAR_DIRECCION =Target.the("LLENAR CAMPO DIRECCION").locatedBy("//textarea[@name='direccion']");


    public static final Target BTN_LLENAR_TELEFONO =Target.the("LLENAR CAMPO TELEFONO").locatedBy("//input[@name='telefono']");
    public static final Target BTN_LLENAR_PUESTO =Target.the("LLENAR CAMPO PUESTO").locatedBy("//input[@name='puesto']");
    public static final Target BTN_ESTADO =Target.the("LLENAR ESTADO").locatedBy("//select[@name='estado']");


    public static final Target BTN_GUARDAR =Target.the("BOTON GUARDAR").locatedBy("//input[@name='add']");

    public static final Target TDD_MENSAJE_CREACION_CORRECTA =Target.the("MENSAJE DE CREACION CORRECTA").locatedBy("//div[contains(text(), 'Bien hecho!')]");

    /*EMPLEADO ACTUALIZAR*/


    public static final Target BTN_ACTUALIZAR_USUARIO =Target.the("BOTON ACTUALIZAR USUARIO").locatedBy("//input[@name='save']");

    public static final Target BTN_ACTUALIZAR =Target.the("LLENAR ACTUALIZAR").locatedBy("(//table//a[@title='Editar datos'])[3]");

    public static final Target MSG_DATOS_ACTUALIZADOS =Target.the("MENSAJE DATOS ACTUALIZADOS").locatedBy("//div[contains(text(), 'Los datos han sido guardados con éxito.')]");

    /*EMPLEADO LEER*/

    public static final Target CLICK_EMPLEADO =Target.the("CLICK EN EL EMPLEADO").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target TDD_EMPLEADO_ENCOTNRADO =Target.the("TEXTO EMPLEADO ENCONTRADO").locatedBy("//tbody//tr//td[contains(text(),'{0}')]");


    /* EMPLEADO BORRAR*/

    public static final Target BTN_BORRAR =Target.the("BOTON BORRAR").locatedBy("(//table//a[@title='Eliminar'])[3]");
    public static final Target MSG_BORRAR_CORRECTO =Target.the("MSG DE BORRADO CORRECTAMENTE").locatedBy("//div[contains(text() ,'Datos eliminado correctamente')]");



}

