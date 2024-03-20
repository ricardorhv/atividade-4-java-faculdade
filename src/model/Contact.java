package model;

public class Contact {
  private String email;
  private String phoneNumber;
  private String description;

  public Contact(String email, String phoneNumber, String description) {
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.description = description;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
