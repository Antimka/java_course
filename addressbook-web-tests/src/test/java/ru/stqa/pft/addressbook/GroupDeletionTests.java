package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }

}
