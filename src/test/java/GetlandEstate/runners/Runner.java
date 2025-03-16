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
        glue = {"GetlandEstate/stepdefs","GetlandEstate/hooks"},
        tags = "@US-16",
=======

        glue = {"GetlandEstate/stepdefs","GetlandEstate/hooks"},
        tags = "@US-13 @Manager",
>>>>>>> d60c684e859424c622a40d8823bc244af89436ba
        dryRun = false
)
public class Runner {
}




