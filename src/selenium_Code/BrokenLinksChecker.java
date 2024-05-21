package selenium_Code;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinksChecker {

    public static void main(String[] args) {
  /*      System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com"); // Replace with the URL of the webpage to check

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("GET");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        System.out.println("Valid link: " + url);
                    } else {
                        System.out.println("Broken link: " + url + " (Response code: " + responseCode + ")");
                    }
                    connection.disconnect();
                } catch (Exception e) {
                    System.out.println("Error connecting to link: " + url);
                }
            }
        }

        driver.quit();

   */
    }

}
