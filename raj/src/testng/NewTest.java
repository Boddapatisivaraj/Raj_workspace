package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void tc001() {
	  Reporter.log("test1 executed", true);
  }
  @Test
  public void tc002()
  {
	  Reporter.log("test2 executed", true);
  }
  @Test
  public void tc003()
  {
	  Reporter.log("tc003 executed",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test is setup");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("test is close");
  }

}
