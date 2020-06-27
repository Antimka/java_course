package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private final String phone;
  private final String email;
  private final String birthdate;
  private final String birthmonth;
  private final String birthyear;

  public ContactData(String firstname, String lastname, String address, String phone, String email, String birthdate, String birthmonth, String birthyear) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.birthdate = birthdate;
    this.birthmonth = birthmonth;
    this.birthyear = birthyear;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public String getBirthmonth() {
    return birthmonth;
  }

  public String getBirthyear() {
    return birthyear;
  }
}
