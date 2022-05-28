package certificacion.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import exceptions.ExepcionCreacion;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.Usuario;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import question.ValidarActualizacion;
import question.ValidarCreacion;
import question.ValidarLectura;
import task.Actualizar;
import task.Borrar;
import task.Crear;
import task.Leer;
import userinterfaces.PaginaEmpleados;

import java.util.List;
import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CorriendoPrueba {
    @Before
    public void configuracion (){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina empleados$")
    public void queElUsuarioIngresaALaPaginaEmpleados()  {
    OnStage.theActorCalled("Aldo").attemptsTo(Open.browserOn().the(PaginaEmpleados.class));
    }

    @Cuando("^el crea un empleado$")
    public void elCreaUnEmpleado(List<Usuario> usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.enLapagina(usuario.get(0)));

    }

    @Entonces("^se mostrara que se creo un empleado satisfactoriamente (.*)$")
    public void seMostraraQueSeCreoUnEmpleadoSatisfactoriamente(String usuario)  {
    OnStage.theActorInTheSpotlight().should(seeThat((ValidarCreacion.usuario(usuario)),Matchers.is(true)).orComplainWith(ExepcionCreacion.class, "El usuario creado no existe"));
    }

    @Cuando("^actualizar el empleado (.*)$")
    public void actualizarElEmpleado(String usuario)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Actualizar.elEmpleado(usuario));
    }

    @Entonces("^se mostrar que el empleado se actualizo correctamente$")
    public void seMostrarQueElEmpleadoSeActualizoCorrectamente()  {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarActualizacion.delUsuario()),Matchers.is(true)).orComplainWith(ExepcionCreacion.class, "El usuario no se actualizo correctamente"));

    }

    @Cuando("^cuando busca un empleado contratado (.*)$")
    public void cuandoBuscaUnEmpleadoContratado(String usuario)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Leer.enElUsuario(usuario));
    }

    @Entonces("^el debera ver a (.*)$")
    public void elDeberaVerAPedroPerez(String usuario) {
        OnStage.theActorInTheSpotlight().should(seeThat((ValidarLectura.delUsuario(usuario)),Matchers.is(true)).orComplainWith(ExepcionCreacion.class, "El usuario no existe"));
    }
    @Cuando("^borra el empleado(.*)$")
    public void borraElEmpleadoJaimitoPerez(String usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(Borrar.elUsuario(usuario));
    }

    @Entonces("^saldra un mensaje de borrado correctamente$")
    public void noDeberaVerloEnLaLista() {

    }
@After
    public void closeDriver(){
        WebDriverManager.chromedriver().quit();
}

}
