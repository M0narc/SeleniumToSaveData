package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.xpath("//div[@class='figcaption']");

    public HoversPage(WebDriver driver){

        this.driver = driver;
    }

    /**
     * @param index starts at 1
     * */
    public FigureCaption HoverOverFigure(int index){
        WebElement figure = (WebElement) driver.findElements(figureBox).get(index - 1);

        //actions object from selenium
        Actions action = new Actions(driver);
        //we use move to element in order to Hover over it
        action.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
