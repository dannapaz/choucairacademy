package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static  final Target BUTTON_UC = Target.the("Select Cursos y certificacioes")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE= Target.the("Search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search course")
            .located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target SELECT_COURSE= Target.the("Click to search course")
           .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));

   public static final Target NAME_COURSE=Target.the("Extract the course name")
            .located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));







}
