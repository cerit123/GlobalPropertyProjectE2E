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
                "junit:target/xml-report/cucumber.xml",



       glue = {"GetlandEstate/stepdefs","GetlandEstate/hooks"},

        tags = "@US-04",

        dryRun = true


        },
        features = "src/test/resources/features",

        glue = {"GetlandEstate/stepdefs","GetlandEstate/hooks"},
<<<<<<< HEAD
<<<<<<< Updated upstream
        tags = "@US09",
=======
        tags = "@US20",
>>>>>>> Stashed changes
=======
        tags = "@US-11",
>>>>>>> master
        dryRun = false

)
public class Runner {
}