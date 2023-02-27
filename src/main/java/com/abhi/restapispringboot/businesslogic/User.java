/**
 * Created by Abhimanyu
 * on 2023-02-26 February 2023
 **/
package com.abhi.restapispringboot.businesslogic;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
