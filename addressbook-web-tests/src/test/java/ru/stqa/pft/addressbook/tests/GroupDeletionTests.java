package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.goToGroupPage();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnToGroupPage();
  }

}