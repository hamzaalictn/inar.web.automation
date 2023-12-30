import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWebDriverTest {

	@Test
	void testSeleniumWebDriver() {
		WebDriver webDriver = new EdgeDriver();
		webDriver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");

	}

}
