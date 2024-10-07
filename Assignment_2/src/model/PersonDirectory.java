/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nanik
 */
import java.util.ArrayList;

public class PersonDirectory {
    private ArrayList<Person> personList;

    // Constructor
    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    // Method to add a person to the directory
    public void addPerson(Person person) {
        personList.add(person);
    }

    // Method to delete a person from the directory
    public void deletePerson(Person person) {
        personList.remove(person);
    }

    // Method to get the list of persons
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    // Method to search for a person by first name, last name, or street address
    public Person searchPerson(String firstName, String lastName, String streetAddress) {
        for (Person person : personList) {
            // Check if the first name matches
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
            // Check if the last name matches
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                return person;
            }
            // Check if the home address street matches
            if (person.getHomeAddress().getAddressLine1().equalsIgnoreCase(streetAddress) ||
                person.getHomeAddress().getAddressLine2().equalsIgnoreCase(streetAddress)) {
                return person;
            }
            // Check if the work address street matches
            if (person.getWorkAddress().getAddressLine1().equalsIgnoreCase(streetAddress) ||
                person.getWorkAddress().getAddressLine2().equalsIgnoreCase(streetAddress)) {
                return person;
            }
        }
        // If no match found, return null
        return null;
    }
}
