package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.*;
//import java.util.concurrent.TimeUnit;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
