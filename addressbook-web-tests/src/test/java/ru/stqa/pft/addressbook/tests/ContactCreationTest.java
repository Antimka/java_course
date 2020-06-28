package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import ru.stqa.pft.addressbook.appmanager.ContactHelper;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest  extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().goToConcactPage();
    app.getContactHelper().fillContactForm(new ContactData("Mazda", "3", "Riga, Latvia", "22222222", "mazda3@mazda.com", "6", "June", "2019"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomepage();

  }


}
