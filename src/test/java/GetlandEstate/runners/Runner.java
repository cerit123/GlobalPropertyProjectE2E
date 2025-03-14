package GetlandEstate.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
<<<<<<< HEAD
<<<<<<< HEAD
        glue = {"GetlandEstate/stepdefs"},
<<<<<<< HEAD
        tags = "@Manager",
=======
        tags = "@US-17",
=======
        glue = {"GetlandEstate/stepdefs","GetlandEstate/hooks"},
        tags = "",
>>>>>>> fcc1a42614fb10302cfa0d28fa1f76f432abaf77
>>>>>>> master
=======

        glue = {"GetlandEstate/stepdefs"},
        tags = "@US-17",


>>>>>>> 26d1763fcfb43df0c09ac1ed201a1a54e5768d47
        dryRun = false
)
public class Runner {

}
