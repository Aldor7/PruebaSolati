package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.PaginaEmpleados;

public class ValidarActualizacion implements Question<Boolean> {



    public static ValidarActualizacion delUsuario() {
        return new ValidarActualizacion();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PaginaEmpleados.MSG_DATOS_ACTUALIZADOS).viewedBy(actor).asBoolean();

    }
}
