package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.PaginaEmpleados;

public class Leer implements Task {

private String usuario;

    public Leer(String usuario) {
        this.usuario = usuario;
    }

    public static Leer enElUsuario(String usuario) {
        return new Leer(usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaEmpleados.CLICK_EMPLEADO.of(usuario))
        );
    }
}
