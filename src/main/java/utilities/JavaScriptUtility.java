package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{
    //This is a common class for Java exec methods only

    public static void scrollToElementJS(By locator){ //this is a JavaScript based function
        WebElement element = driver.findElement(locator);

        //"arguments[0]" → refers to the first argument passed into the script
        //"scrollIntoView();" → is a built-in JavaScript function that makes the element visible in the viewport
        String jsScript = "arguments[0].scrollIntoView();";

        //JavascriptExecutor → A Selenium interface that allows running JavaScript in the browser
        //executeScript(jsScript, element) → Runs the script and passes element as an argument
        //The element is substituted for arguments[0] in the script, in our case formCards
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
