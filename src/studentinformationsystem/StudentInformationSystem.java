/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author MP1
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String studentName = "Your Name";
        String studentID = "Your ID";

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);

        // Store two marks using variables
        double mark1 = 85.0;
        double mark2 = 90.0;

        // Calculate total mark
        double totalMark = mark1 + mark2;
        System.out.println("Total Mark: " + totalMark);

        // Display message based on total
        if (totalMark >= 160) {
            System.out.println("Status: Excellent");
        } else if (totalMark >= 100) {
            System.out.println("Status: Good");
        } else {
            System.out.println("Status: Needs Improvement");
        }
    }
    
}
