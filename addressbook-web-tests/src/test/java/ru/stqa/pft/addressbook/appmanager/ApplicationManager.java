package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;

  private  SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper ;
  private  GroupHelper groupHelper;

  public void init() {
   wd = new ChromeDriver();
   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   wd.get("http://localhost/addressbook/");
   groupHelper = new GroupHelper(wd);
   sessionHelper = new SessionHelper(wd);
   navigationHelper = new NavigationHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.findElement(By.linkText("Logout")).click();
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
