package model;

import java.util.ArrayList;

public class Person {
  private String name;
  private int age;
  private Contact mainContact;
  private ArrayList<Contact> contactList;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.contactList = new ArrayList<Contact>();
  }

  public Person(String name, int age, String email, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.mainContact = new Contact(email, phoneNumber, "Principal");
    this.contactList = new ArrayList<Contact>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Contact getMainContact() {
    return mainContact;
  }

  public void setMainContact(Contact mainContact) {
    this.mainContact = mainContact;
  }

  public ArrayList<Contact> getContactList() {
    return contactList;
  }

  public void setContactList(ArrayList<Contact> contactList) {
    this.contactList = contactList;
  }

  private boolean verifyIfHasAContactWithThisDescription(String description) {
    for (Contact contact : contactList) {
      if (contact.getDescription().equals(description)) {
        return true;
      }
    }

    return false;
  }

  public void addNewContact(String email, String phoneNumber, String description) {
    boolean hasAlreadyContactWithThisDescription = verifyIfHasAContactWithThisDescription(description);

    if (hasAlreadyContactWithThisDescription) {
      System.out.println("Você já tem um contato com essa descrição!");
      return;
    }

    Contact newContact = new Contact(email, phoneNumber, description);
    this.contactList.add(newContact);
    System.out.println("Você adicionou um novo contato!");
  }

  public void removeContact(String description) {
    boolean hasContactWithThisDescription = verifyIfHasAContactWithThisDescription(description);

    if (hasContactWithThisDescription) {
      for (Contact contact : contactList) {
        if (contact.getDescription().equals(description)) {
          this.contactList.remove(contact);
          System.out.println("Você removeu um contato!");
          break;
        } else {
          System.out.println("Não existe nenhum contato com essa descrição!");
        }
      }
    }
  }

  public void addMainContact(String email, String phoneNumber) {
    mainContact = new Contact(email, phoneNumber, "Principal");
  }

  public void showData() {
    System.out.println("Nome: " + this.name);
    System.out.println("Idade: " + this.age);

    System.out.println("\n**CONTATO PRINCIPAL**");
    System.out.println("Email: " + this.mainContact.getEmail());
    System.out.println("Telefone: " + this.mainContact.getPhoneNumber());

    System.out.println("\n**LISTA DE CONTATOS**");
    for (Contact contact : this.contactList) {
      System.out.println("Descrição: " + contact.getDescription());
      System.out.println("Email: " + contact.getEmail());
      System.out.println("Telefone: " + contact.getPhoneNumber() + "\n");
    }
  }

}
