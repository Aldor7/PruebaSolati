package certificacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = {"src/test/resources/features/crud_empleados.feature"},
        glue ={"certificacion"},
        snippets = SnippetType.CAMELCASE
)

public class CrudEmpleadosRunner {
}
