package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.PaginaEmpleados;

public class ValidarBorrado implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PaginaEmpleados.MSG_BORRAR_CORRECTO).viewedBy(actor).asBoolean();
    }
}
