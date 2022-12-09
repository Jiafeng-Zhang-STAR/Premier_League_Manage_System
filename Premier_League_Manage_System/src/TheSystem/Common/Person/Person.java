/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSystem.Common.Person;

/**
 *
 * @author Andrew Chou
 */
public class Person {
    private String username;
    private String password;
    private int enterprise_type;
    private int role_type;
    private String club;
    private int gender;
    private int age;
    private String nation;
    private String address;
    private String zip;

    public Person(String username, String password, int enterprise_type, int role_type, String club, int gender, int age, String nation, String address, String zip) {
        this.username = username;
        this.password = password;
        this.enterprise_type = enterprise_type;
        this.role_type = role_type;
        this.club = club;
        this.gender = gender;
        this.age = age;
        this.nation = nation;
        this.address = address;
        this.zip = zip;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnterprise_type() {
        return enterprise_type;
    }

    public void setEnterprise_type(int enterprise_type) {
        this.enterprise_type = enterprise_type;
    }

    public int getRole_type() {
        return role_type;
    }

    public void setRole_type(int role_type) {
        this.role_type = role_type;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
    
}
