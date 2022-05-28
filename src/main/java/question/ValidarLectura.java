package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.PaginaEmpleados;

public class ValidarLectura implements Question<Boolean> {


    private String usuario;

    public ValidarLectura(String usuario) {
        this.usuario = usuario;
    }

    public static ValidarLectura delUsuario(String usuario) {
        return new ValidarLectura(usuario);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PaginaEmpleados.TDD_EMPLEADO_ENCOTNRADO.of(usuario)).viewedBy(actor).asBoolean();

    }
}
