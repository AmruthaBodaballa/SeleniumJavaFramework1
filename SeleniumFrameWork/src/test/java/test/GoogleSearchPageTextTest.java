package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleSearchPageTextTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void SetUpTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void SetUpTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void SetUpTestTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTextTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTextTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void googleSearchTextTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void mainTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void mainTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void mainTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tearDownTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tearDownTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tearDownTestTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }
}
