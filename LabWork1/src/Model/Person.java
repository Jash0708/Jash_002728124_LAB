/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jashpandav
 */
public class Person {

    public Address getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(Address apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public Address getPermapartmentNo() {
        return permapartmentNo;
    }

    public void setPermapartmentNo(Address permapartmentNo) {
        this.permapartmentNo = permapartmentNo;
    }
   

    public Address getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(Address currentCity) {
        this.currentCity = currentCity;
    }

    public Address getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(Address permanentCity) {
        this.permanentCity = permanentCity;
    }

    public Address getCurrentzipcode() {
        return currentzipcode;
    }

    public void setCurrentzipcode(Address currentzipcode) {
        this.currentzipcode = currentzipcode;
    }

    public Address getPermanentzipcode() {
        return permanentzipcode;
    }

    public void setPermanentzipcode(Address permanentzipcode) {
        this.permanentzipcode = permanentzipcode;
    }
    
    private String  NUID;
    private String firstName;
    private String lastName;
    private String collegeName; 
    
    Address address;
    Address permanentAddress;
    
    Address apartmentNo;
    Address permapartmentNo;
    
    Address currentCity;
    Address permanentCity;
    
    Address currentzipcode;
    Address permanentzipcode;
    
    
    Contact officemail;
    Contact personalemail;
    Contact officephone;
    Contact personalphone;
     public Person() {
        this.NUID = "";
        this.firstName="";
        this.lastName="";
        this.collegeName="";
        this.address = new Address();
        this.permanentAddress = new Address();
        this.currentCity = new Address();
        this.apartmentNo = new Address();
        this.permapartmentNo = new Address();
        this.permanentCity = new Address();
        this.currentzipcode = new Address();
        this.permanentzipcode = new Address();
        
        
        this.officemail = new Contact();
        this.personalemail = new Contact();
        this.officephone = new Contact();
        this.personalphone = new Contact();
        
    }

    public Contact getOfficemail() {
        return officemail;
    }

    public void setOfficemail(Contact officemail) {
        this.officemail = officemail;
    }

    public Contact getPersonalemail() {
        return personalemail;
    }

    public void setPersonalemail(Contact personalemail) {
        this.personalemail = personalemail;
    }

    public Contact getOfficephone() {
        return officephone;
    }

    public void setOfficephone(Contact officephone) {
        this.officephone = officephone;
    }

    public Contact getPersonalphone() {
        return personalphone;
    }

    public void setPersonalphone(Contact personalphone) {
        this.personalphone = personalphone;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

}
