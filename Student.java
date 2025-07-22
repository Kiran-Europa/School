public class Student extends Main implements iStudent { // Implement iStudent
    String stdNum;
    String stdName;
    int exam;
    int m1;
    int m2;
    int assignment;
    private double DpMark; // Make DpMark a class member
    private double FinalMark; // Make FinalMark a class member

    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdNum(){
        return stdNum;
    }
    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }

    public int getM1(){
        return m1;
    }
    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2(){
        return m2;
    }
    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getAssignment(){
        return assignment;
    }
    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public int getExam(){
        return exam;
    }
    public void setExam(int exam) {
        this.exam = exam;
    }

    // Overload calculateDpMark to be called from the interface
    @Override
    public void calculateDpMark() {
        // This will use the instance variables
        this.DpMark = (double) (this.m1 + this.m2 + this.assignment) / 3;
    }

    // Original calculateDpMark with parameters (can be kept or removed depending on usage)
    public void calculateDpMark(int m1, int m2, int assignment) {
        this.DpMark = (double) (m1 + m2 + assignment) / 3;
    }

    // Overload calculateFinalMark to be called from the interface
    @Override
    public void calculateFinalMark() {
        // This will use the instance variables
        this.FinalMark = (this.exam * 0.6) + (this.DpMark * 0.4);
    }

    // Original calculateFinalMark with parameters (can be kept or removed depending on usage)
    public void calculateFinalMark(int exam, double DpMark){
        this.FinalMark = (exam * 0.6) + (DpMark * 0.4);
    }

    public double getDpMark() {
        return DpMark;
    }

    public double getFinalMark() {
        return FinalMark;
    }

    public String determineResult() {
        if (FinalMark >= 0 && FinalMark <= 46) {
            return "Fail";
        } else if (FinalMark >= 47 && FinalMark <= 49) {
            return "Supplementary Exam";
        } else if (FinalMark >= 50 && FinalMark <= 74) {
            return "Pass";
        } else if (FinalMark >= 75 && FinalMark <= 100) {
            return "Pass with Distinction";
        } else {
            return "Invalid Mark"; // Handle cases outside 0-100
        }
    }
}