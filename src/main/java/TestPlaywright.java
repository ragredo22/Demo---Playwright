import com.microsoft.playwright.*;

import java.nio.file.Paths;


public class TestPlaywright {



    public static void main(String[] args) {


            /*try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.webkit().launch();
                Page page = browser.newPage();
                page.navigate("http://whatsmyuseragent.org/");
                page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
                playwright.close();
            }catch (Exception e){

            }*/


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().withHeadless(false));
        Page page = browser.newPage();
            page.navigate("https://www.saucedemo.com/");
            page.fill("//input[@id=\"user-name\"]","standard_user");
            page.fill("//input[@id=\"password\"]","secret_sauce");
            page.click("//input[@id=\"login-button\"]");
            page.screenshot(new Page.ScreenshotOptions().withFullPage(true));
        //page.screenshot(new Page.ScreenshotOptions()
        //BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideo());

        page.navigate("https://apolo-osp-qa-ui.todo-1.com/BC_SVE_User/Login");
        page.reload();
        page.waitForTimeout(10000);
        page.fill("//input[@id=\"InputUserName\"]", "usr1ap1204");
        page.waitForTimeout(10000);
        page.waitForSelector("//input[@id=\"InputUserPassword\"]");
        page.fill("//input[@id=\"InputUserPassword\"]", "Prueba.2");
        page.waitForTimeout(10000);
        //ElementHandle elementHandle = page.waitForSelector("//*[@id=\"ContinueButton\"]", Page.IsVisibleOptions);
        page.waitForSelector("//*[@id=\"ContinueButton\"]");
        page.click("//*[@id=\"ContinueButton\"]");


        page.fill("//input[@id=\"b20-ActivationTokenStep1SerialNumberInput\"]", "111111111");
        page.fill("//input[@id=\"b20-ActivationTokenStep1SerialConfirmationInput\"]", "111111111");
        page.click("//*[@id=\"b22-TokenActivationStep3ModalContinueButton\"]");

        page.fill("//input[@id=\"b19-b5-b2-Column1\"]","2");
        page.fill("//input[@id=\"b19-b5-b2-Column2\"]","2");
        page.fill("//input[@id=\"b19-b5-b2-Column3\"]","2");
        page.fill("//input[@id=\"b19-b5-b2-Column4\"]","2");
        page.fill("//input[@id=\"b19-b5-b2-Column5\"]","2");
        page.fill("//input[@id=\"b19-b5-b2-Column6\"]","2");
        page.click("//*[@id=\"b19-ContinueButton\"]");





        page.close();


    }

}


