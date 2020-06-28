package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Mazda", "3", "Riga, Latvia", "44444444", "mazda3@mazda.com", "6", "June", "2019"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomepage();
  }
}
