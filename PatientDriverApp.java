/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: Creates instances of Patient and Procedure with sample data.
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Guerlain Darisme
*/
public class PatientDriverApp {
    public static void main(String[] args) {
        Patient patient = new Patient("John", "Kite", "Doe", "123 Main St", "MyTown", "CA", "84231", "240-555-1234", "Jane Doe", "240-555-5678");

        Procedure procedure1 = new Procedure(); 
        procedure1.setProcedureName("Physical Exam");
        procedure1.setProcedureDate("2024-02-25");
        procedure1.setPractitionerName("Dr. Smith");
        procedure1.setCharges(3250.00);

        Procedure procedure2 = new Procedure("X-Ray", "2024-02-26");
        procedure2.setPractitionerName("Dr. Irvine");
        procedure2.setCharges(5500.43);

        Procedure procedure3 = new Procedure("Blood Test", "2024-02-28", "Dr. Smith", 1400.75); 
        displayPatient(patient);
        System.out.println();
        displayProcedure(procedure1);
        System.out.println();
        displayProcedure(procedure2);
        System.out.println();
        displayProcedure(procedure3);
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f\n", totalCharges);
        System.out.println("\nStudent Name: Guerlain Darisme");
        System.out.println("MC#: M21124795");
        System.out.println("Due Date: 02/26/2024");
       
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    public static double calculateTotalCharges(Procedure... procedures) {
        double total = 0.0;
        for (Procedure procedure : procedures) {
            total += procedure.getCharges();
        }
        return total;
    }
}
