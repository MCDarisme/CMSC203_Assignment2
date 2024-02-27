/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: Stores personal information such as name, address, phone number, and emergency contact details of a patient.
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Guerlain Darisme
*/
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    public Patient() {
        this.firstName = "Null";
        this.middleName = "Null";
        this.lastName = "Null";
        this.streetAddress = "Null";
        this.city = "Null";
        this.state = "Null";
        this.zipCode = "Null";
        this.phoneNumber = "Null";
        this.emergencyContactName = "Null";
        this.emergencyContactPhone = "Null";
    }

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

  
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this(firstName, middleName, lastName); 
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

  
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmergencyContactName() { return emergencyContactName; }
    public String getEmergencyContactPhone() { return emergencyContactPhone; }

  
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

  
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

  
    public String toString() {
        return "Patient Info:\n" +
               "Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
}

