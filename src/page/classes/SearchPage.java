package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.By;

//import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;
	
	/**
	 * Returns the Movies,TV,Showtimes menu element is present or not
	 * @param driver
	 * @return
	 */
	public static boolean IsPresentMoviesTvShowtimesMenu(WebDriver driver) {
		
	if(driver.findElements(By.xpath("//li[@id='navTitleMenu']")).size() != 0)
	{
		System.out.println("Element is Present");
		return true;
		}
	else
		{
		System.out.println("Element is Absent");
		return false;
		}
	}
	
	/**
	 * Returns the Movies,TV,Showtimes menu
	 * @param driver
	 * @return
	 */
	public static WebElement MoviesTvShowtimesMenu(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@id='navTitleMenu']"));
		return element;
		}
	
	/**
	 * Returns the Top Rated Movies element present or not
	 * @param driver
	 * @return
	 */
	public static boolean IsPresentTopRatedMovies(WebDriver driver) {
		if(driver.findElements(By.xpath("//li[@id='navTitleMenu']/div[@class='sub_nav']/div[2]/ul[1]//a[@href='/chart/top?ref_=nv_mv_250_6']")).size() != 0)
		{
			System.out.println("Element is Present");
			return true;
			}
		else
			{
			System.out.println("Element is Absent");
			return false;
			}
		
		}
	
	/**
	 * Returns the Top Rated Movies
	 * @param driver
	 * @return
	 */
	public static WebElement TopRatedMovies(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@id='navTitleMenu']/div[@class='sub_nav']/div[2]/ul[1]//a[@href='/chart/top?ref_=nv_mv_250_6']"));
		return element;
		}
	
	/**
	 * Returns the Top Rated Movies page is present or not
	 * @param driver
	 * @return
	 */
	public static boolean IsPresentTopRatedMoviesPage(WebDriver driver) {
		if(driver.findElements(By.xpath("//div[@id='main']/div[@class='article']")).size() != 0)
		{
			System.out.println("Element is Present");
			return true;
			}
		else
			{
			System.out.println("Element is Absent");
			return false;
			}
		}
	
	/**
	 * Returns the "Top Rated Movies" tittle is present or not
	 * @param driver
	 * @return
	 */
	public static boolean IsPresentTopRatedMoviesTittle(WebDriver driver) {
		if(driver.findElements(By.xpath("//div[@id='main']/div[@class='article']//h1[@class='header']")).size() != 0)
		{
			System.out.println("Element is Present");
			return true;
			}
		else
			{
			System.out.println("Element is Absent");
			return false;
			}
		}
	
	/**
	 * Returns the "Ranking"in dropdown is present or not by default
	 * @param driver
	 * @return
	 */
	public static boolean IsPresentRanking(WebDriver driver) {
		if(driver.findElements(By.xpath("//div[@id='main']/div[@class='article']//div[@class='seen-collection']//div[@class='controls float-right lister-activated']/select[@name='sort']")).size() != 0)
		{
			System.out.println("Element is Present");
			return true;
			}
		else
			{
			System.out.println("Element is Absent");
			return false;
			}
		}
}

	
	

