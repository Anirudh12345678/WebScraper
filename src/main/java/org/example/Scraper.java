package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scraper {
    HtmlUnitDriver driver = new HtmlUnitDriver();

    public Scraper() throws IOException {
        //WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://news.google.com/topics/CAAqJQgKIh9DQkFTRVFvSUwyMHZNRE55YXpBU0JXVnVMVWRDS0FBUAE?hl=en-IN&gl=IN&ceid=IN%3Aen");
        System.out.println("Top news in your area: ");
    }
    public void parseDataOnPage() throws IOException {
        // list of WebElements that store all the links
        List<WebElement> raw_jobs = driver.findElements(By.className("gPFEn"));
        int c = 0;
        for (WebElement raw_job : raw_jobs) {
            if(c==10){
                break;
            }
            System.out.println(raw_job.getAttribute("textContent"));
            c++;
        }
        driver.close();
    }

}
