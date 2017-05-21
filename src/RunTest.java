import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by DIPAK on 5/8/2017.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features =".",format="html:target/Cucumber/reports",tags ="@Testraja")
public class RunTest
{

}
