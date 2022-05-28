package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.PaginaEmpleados;

public class ValidarCreacion implements Question<Boolean> {
    private String usuario;

    public ValidarCreacion(String usuario) {
        this.usuario = usuario;
    }

    public static ValidarCreacion usuario(String usuario) {
       return new ValidarCreacion(usuario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PaginaEmpleados.TDD_MENSAJE_CREACION_CORRECTA).viewedBy(actor).asBoolean();
    }
}
