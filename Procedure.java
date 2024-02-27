/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: Holds details such as the procedure name, date it was performed, the practitioner's name, and the charges for the procedure.
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Guerlain Darisme
*/
public class Procedure {

    private String procedureName;
    private String procedureDate; 
    private String practitionerName;
    private double charges; 

 
    public Procedure() {
        this.procedureName = "Null";
        this.procedureDate = "Null";
        this.practitionerName = "Null";
        this.charges = 0.0;
    }

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

  
    public String toString() {
        return 
               "Procedure: " + procedureName + "\n" +
               "Procedure Date: " + procedureDate + "\n" +
               "Practitioner Name: " + practitionerName + "\n" +
               "Charges: $" + String.format("%.2f", charges);
    }
}
