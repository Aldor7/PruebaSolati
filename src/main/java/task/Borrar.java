package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import userinterfaces.PaginaEmpleados;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Borrar implements Task {


    private String usuario;

    public Borrar(String usuario) {
        this.usuario = usuario;
    }
    public static Borrar elUsuario(String usuario){
        return Tasks.instrumented(Borrar.class,usuario);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaEmpleados.BTN_BORRAR)

        );
        try {
            Robot robot = new Robot();
            Thread.sleep(2000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
