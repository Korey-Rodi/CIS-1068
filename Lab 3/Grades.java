//Korey Rodi
// 9/16/25
//Assignment 3. Grades

//This programs purpose is to calculate a grade for a class

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
    	// User Inputs
        Scanner console = new Scanner(System.in);
        System.out.println("This program accepts your homework and two exam scores as input and computes your grade in the course.");
        System.out.println("Homework weight?");
        int hwWeight = console.nextInt();
        hwWeight = checkNegativeInt(hwWeight);
        System.out.println("Exam 1 weight?");
        int exam1Weight = console.nextInt();
        exam1Weight = checkNegativeInt(exam1Weight);
        int exam2Weight = 100 - hwWeight - exam1Weight;
        System.out.println("Using weights of " + hwWeight + " " + exam1Weight + " " + exam2Weight);
        System.out.println("Homework:");
        System.out.println("Number of assignments?");
        int numAssignments = console.nextInt();
        numAssignments = checkNegativeInt(numAssignments);
        System.out.println("Average Homework grade?");
        double avgHw = console.nextDouble();
        avgHw = checkNegativeDouble(avgHw);
        System.out.println("Number of late days used?");
        int lateDays = console.nextInt();
        lateDays = checkNegativeInt(lateDays);
        System.out.println("Labs attended?");
        int labsAttended = console.nextInt();
        labsAttended = checkNegativeInt(labsAttended);
        
        // Homework
        double hwWeighted = computeHw(hwWeight,numAssignments,avgHw,lateDays, labsAttended);

        // Exam 1
        System.out.println("Exam 1:");
        System.out.println("Score?");
        double exam1Score = console.nextDouble();
        exam1Score = checkNegativeDouble(exam1Score);
        System.out.println("Curve?");
        double exam1Curve = console.nextDouble();
        exam1Curve = checkNegativeDouble(exam1Curve);
        double exam1Weighted = computeExam1(exam1Score, exam1Curve, exam1Weight);
        
        // Exam 2
        System.out.println("Exam 2:");
        System.out.println("Score?");
        double exam2Score = console.nextDouble();
        exam2Score = checkNegativeDouble(exam2Score);
        System.out.println("Curve?");
        double exam2Curve = console.nextDouble();
        exam2Curve = checkNegativeDouble(exam2Curve);
        double exam2Weighted = computeExam2(exam2Score, exam2Curve, exam2Weight);

        // Course Grade
        computeCourseGrade(hwWeighted, exam1Weighted, exam2Weighted);
        console.close();
        
    }
    public static int checkNegativeInt(int num) {
    	if (num<0) {
    		return 0;
    	}
		return num;
    }
    public static double checkNegativeDouble(double num) {
    	if (num<0) {
    		return 0;
    	}
		return num;
    }
    public static double computeHw(int hwWeight,int numAssignments, double avgHw, int lateDays, int labsAttended) {
    	double hwPoints = avgHw * 10;
        double labPoints = labsAttended * 4;
        if (lateDays > numAssignments / 2) {
            hwPoints = hwPoints * 0.10;
        } else if (lateDays == 0 && hwPoints < numAssignments * 10) {
            hwPoints = hwPoints + 5;
        }
        double hwTotalPoints = hwPoints + labPoints;
        double hwMaxPoints = numAssignments * 10 + numAssignments * 4;
        if (hwTotalPoints > hwMaxPoints) {
            hwTotalPoints = hwMaxPoints;
        }
        double hwWeighted = hwTotalPoints * hwWeight / hwMaxPoints;
        System.out.println("Total points = " + hwTotalPoints + " / " + hwMaxPoints);
        System.out.printf("Weighted score = %.2f\n" , hwWeighted);
        return hwWeighted;
    }
    public static double computeExam1(double exam1Score, double exam1Curve, int exam1Weight) {
    	double exam1Total = exam1Score + exam1Curve;
        if (exam1Total > 100) exam1Total = 100;
        double exam1Weighted = exam1Total * exam1Weight / 100;
        System.out.println("Total points = " + exam1Total + " / 100");
        System.out.printf("Weighted score = %.2f\n", exam1Weighted);
        return exam1Weighted;
    } 
    public static double computeExam2(double exam2Score, double exam2Curve, int exam2Weight) {
        double exam2Total = exam2Score + exam2Curve;
        if (exam2Total > 100) exam2Total = 100;
        double exam2Weighted = exam2Total * exam2Weight / 100;
        System.out.println("Total points = " + exam2Total + " / 100");
        System.out.printf("Weighted score = %.2f\n", exam2Weighted);
        return exam2Weighted;
    }
    public static double computeCourseGrade(double hwWeighted, double exam1Weighted, double exam2Weighted) {
    	double courseGrade = hwWeighted + exam1Weighted + exam2Weighted;
        System.out.printf("Course grade = %.2f\n", courseGrade);
        return courseGrade;
    }
		
}
