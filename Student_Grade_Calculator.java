import java.util.Scanner;
public class  Student_Grade_Calculator {
    static void Menu() {
        // Menu method is used for displaying a components for entering a marks from user  to finding overall grades
        System.out.println ( "-------------------------------Welcome to Grade Calculator-------------------------------" );
        System.out.println ( " To Know Your Overall Grades , Enter a total  marks of  :" );
        System.out.println ( " 1. Assignments " );
        System.out.println ( " 2. Quizzes " );
        System.out.println ( " 3. Mid-term" );
        System.out.println ( " 4. Final Exam" );
        System.out.println ( "------------------------------------------------------------------------------------------" );
    }
    // Assignment method is used for holding overall marks of all assignments
    static double Assignment() {
        // Scanner Class Taking Assignment marks from user input
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter Assignment Marks out of 100 : " );
        return sc.nextDouble ();
    }
    // Quizzes method is used for holding overall marks of all Quizzes.
    static double Quizzes() {
        // Scanner Class  Taking the  Quizzes marks from user input
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter Quiz marks Marks out of 100 : " );
        return sc.nextDouble ();
    }
    // MidTerm method is used for holding overall marks of all MidTerm Exams.
    static double MidTerm() {
        // Scanner Class Taking marks of Mid-Term Exams  from user input
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter midterm marks Marks out of 100: " );
        return sc.nextDouble ();
    }
    // FinalExam method is used for holding overall marks of all Final Exams.
    static double FinalExam() {
        // Scanner Class Taking marks of Final Exams from user input
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter Final Exam Marks out of 100 : " );
        return sc.nextDouble ();
    }

    public static void main(String[] args) {
        // Static Menu method is displaying  all components of method in a main method
            Menu ();
            double p;
            // Adding all the 4 methods for overall marks and stored in a variable "p".
            p = Assignment () + Quizzes () + MidTerm () + FinalExam ();
            // After Adding the method finds overall percentage and stored in the variable "per".
            double per = (p / 400) * 100;
            System.out.println ( "Your Percentage is : " + per + " %" );
            System.out.println ( "Total marks of Assignments , Quizzes , Mid-Term , Final Exam : " + p );
            // Grades are  Given on the basis of the percentage.
         if(per>=95){
             System.out.println ("Grade is A , Excellent!!");
         } else if ( per>=85 ) {
             System.out.println ("Grade is B, very good");
         } else if ( per>=75 ) {
             System.out.println ("Grade is C, Satisfactory");
         } else if ( per>=60 ) {
             System.out.println ("Grade is D, Not so good");
         }
         else if(per<35){
             System.out.println ("Grade F , You are Failed ");
         }
        System.out.println ("Do you want to re-use the Calculator : ? Yes/No");
            Scanner sc=new Scanner ( System.in );
            // "while" loop is used for doing calculations for multiple times.
        while (true){
            String ans=sc.nextLine ().toLowerCase ();
            if(ans.equals ( "yes" )){
                Student_Grade_Calculator.Menu ();
                p = Assignment () + Quizzes () + MidTerm () + FinalExam ();
                 per = (p / 400) * 100;
                System.out.println ( "Your Percentage is : " + per + " %" );
                System.out.println ( "Total marks of Assignments , Quizzes , Mid-Term , Final Exam : " + p );
                if ( per >= 95 ) {
                    System.out.println ( "Grade is A, Excellent !!" );
                } else if ( per >= 85 ) {
                    System.out.println ( "Grade is B, Very Good " );
                } else if ( per >= 75 ) {
                    System.out.println ( "Grade is C, Satisfactory" );
                } else if ( per >= 60 ) {
                    System.out.println ( "Grade is D, Not so Good" );
                } else if ( per <= 35 ) {
                    System.out.println ( "Grade is F , You have to Work hard" );
                    System.out.println ( "you are Failed" );
                } else {
                    System.out.println ( " Your Grade is Poor , Kindly Work Hard" );
                }
                System.out.println ("-----------------------------------------------------------------------------------");
                System.out.println ("Do you want to re-use the Calculator : ? Yes/No");
            } else if ( ans.equals ( "no" ) ) {
                System.out.println ("Thanks for using Grade Calculator ");
                break;
            }
        }
    }
}