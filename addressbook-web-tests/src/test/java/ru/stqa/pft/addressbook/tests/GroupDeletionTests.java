package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
