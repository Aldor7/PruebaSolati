package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.PaginaEmpleados;

public class Actualizar implements Task {

    private String usuario;

    public Actualizar(String usuario) {
        this.usuario = usuario;
    }

    public static Actualizar elEmpleado(String usuario) {
        return new Actualizar(usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaEmpleados.BTN_ACTUALIZAR),
                Enter.keyValues("").into(PaginaEmpleados.BTN_LLENAR_NOMBRE),
                Enter.theValue(usuario).into(PaginaEmpleados.BTN_LLENAR_NOMBRE),
                Click.on(PaginaEmpleados.BTN_ACTUALIZAR_USUARIO)
        );
    }
}
