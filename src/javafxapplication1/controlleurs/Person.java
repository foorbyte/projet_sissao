/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author freexx
 */
public class Person {
     private StringProperty firstName;

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void setFirstName(String value) { firstNameProperty().set(value); }
     public String getFirstName() { return firstNameProperty().get(); }
     public StringProperty firstNameProperty() {
         if (firstName == null) firstName = new SimpleStringProperty(this, "firstName");
         return firstName;
     }
     
      private StringProperty lastName;
     public void setLastName(String value) { lastNameProperty().set(value); }
     public String getLastName() { return lastNameProperty().get(); }
     public StringProperty lastNameProperty() {
         if (lastName == null) lastName = new SimpleStringProperty(this, "lastName");
         return lastName;
     }
     
     private IntegerProperty id_person;
     public void setid_person(int value) { id_personProperty().set(value); }
     public int getid_person() { return id_personProperty().get(); }
     public IntegerProperty id_personProperty() {
         if (id_person == null) id_person = new SimpleIntegerProperty(this, "id_person");
         return id_person;
     }
     
    public Person(Integer studentId, String firstName, String lastName) {
        this.id_person = new SimpleIntegerProperty(studentId);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }
}
