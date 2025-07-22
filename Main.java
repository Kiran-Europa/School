import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        JOptionPane.showMessageDialog(null, "Insert your student name");
        student.setStdName(JOptionPane.showInputDialog(null));

        JOptionPane.showMessageDialog(null, "Insert your student number");
        student.setStdNum(JOptionPane.showInputDialog(null));

        JOptionPane.showMessageDialog(null, "Insert your mark 1");
        student.setM1(Integer.parseInt(JOptionPane.showInputDialog(null)));

        JOptionPane.showMessageDialog(null, "Insert your mark 2");
        student.setM2(Integer.parseInt(JOptionPane.showInputDialog(null)));

        JOptionPane.showMessageDialog(null, "Insert your assignment mark");
        student.setAssignment(Integer.parseInt(JOptionPane.showInputDialog(null)));

        JOptionPane.showMessageDialog(null, "Insert your exam mark");
        student.setExam(Integer.parseInt(JOptionPane.showInputDialog(null)));

        // Calculate DP Mark and Final Mark using the student object's methods
        student.calculateDpMark(); // Calls the no-argument version which uses instance variables
        student.calculateFinalMark(); // Calls the no-argument version which uses instance variables

        // Get the results
        double finalMark = student.getFinalMark();
        String result = student.determineResult();

        // Display all the results
        String output = "Student Details:\n" +
                "Student Name: " + student.getStdName() + "\n" +
                "Student Number: " + student.getStdNum() + "\n" +
                "Mark 1: " + student.getM1() + "\n" +
                "Mark 2: " + student.getM2() + "\n" +
                "Assignment Mark: " + student.getAssignment() + "\n" +
                "Exam Mark: " + student.getExam() + "\n" +
                "DP Mark: " + String.format("%.2f", student.getDpMark()) + "\n" +
                "Final Mark: " + String.format("%.2f", finalMark) + "\n" +
                "Result: " + result;

        JOptionPane.showMessageDialog(null, output, "Student Results", JOptionPane.INFORMATION_MESSAGE);
    }
}