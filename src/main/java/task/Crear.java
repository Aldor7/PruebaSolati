package task;

import models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.PaginaEmpleados;

public class Crear implements Task {

    private Usuario usuario;

    public Crear(Usuario usuario) {
        this.usuario = usuario;
    }

    public static Crear enLapagina( Usuario usuario) {
        return new Crear(usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PaginaEmpleados.BTN_CLICK_EMPLEADO),
                Enter.theValue(usuario.getCodigo()).into(PaginaEmpleados.TXT_LLENAR_CODIGO),
                Enter.theValue(usuario.getNombreCompleto()).into(PaginaEmpleados.BTN_LLENAR_NOMBRE),
                Enter.theValue(usuario.getLugarNacimiento()).into(PaginaEmpleados.BTN_LLENAR_LUGAR_NACIMIENTO),
                Enter.theValue(usuario.getFecha()).into(PaginaEmpleados.BTN_FECHA),
                Enter.theValue(usuario.getDireccion()).into(PaginaEmpleados.BTN_LLENAR_DIRECCION),
                Enter.theValue(usuario.getTelefono()).into(PaginaEmpleados.BTN_LLENAR_TELEFONO),
                Enter.theValue(usuario.getPuesto()).into(PaginaEmpleados.BTN_LLENAR_PUESTO),
                SelectFromOptions.byVisibleText(usuario.getEstado()).from(PaginaEmpleados.BTN_ESTADO),
                Click.on(PaginaEmpleados.BTN_GUARDAR)
        );
    }
}
