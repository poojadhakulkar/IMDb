package page.page.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.classes.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeTest
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "www.imdb.com/";
		
		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
  @Test
  public void test() {
	  driver.get(baseUrl);
	  SearchPage.IsPresentMoviesTvShowtimesMenu(driver);
	  SearchPage.MoviesTvShowtimesMenu(driver).click();
	  SearchPage.IsPresentTopRatedMovies(driver);
	  SearchPage.TopRatedMovies(driver).click();
	  SearchPage.IsPresentTopRatedMoviesPage(driver);
	  SearchPage.IsPresentTopRatedMoviesTittle(driver);
	  SearchPage.IsPresentRanking(driver);
  }
  
  @AfterTest
  public void tearDown() throws Exception {
	  driver.quit();
  }
}
