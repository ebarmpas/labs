import java.util.Scanner;
public class GradeMethods
{
    public static void main(String[]args){

    }
    public static int promtpForGrade(){
        //Assuming that the grade is an integer
         int grade;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter your grade : ");
            grade = scan.nextInt();
        }while(grade < 0 || grade > 100);

        return  grade;
    }
    public static boolean isPassGrade(int grade){

        if(grade >= 40){
            return  true;
        }

        return false;
    }
    public static boolean isFirstClass(int grade){

        if(grade >= 70){
            return true;
        }

        return false;
    }
    public static String findClassification(int grade){

        if(grade >= 70){
            return "Class I";
        }else if(grade >= 60){
            return "Class II.i";
        }else if(grade >= 50){
            return "Class II.ii";
        }else if(grade >= 45){
            return "Class III";
        }else if(grade >=40 ){
            return "Pass";
        }else if(grade >= 1){
            return "Fail";
        }

        return "Work didn't get submitted or is not worth of assessment";

        //According to the Student handbook 2019-2020 page 17
    }
    public static double calculateFinalGrade(double assignmentAvg, int finalExamGrade){

    return assignmentAvg * 0.3 + finalExamGrade* 0.7;
    //I am assuming I do not need to check whether the grade is of passing quality (For all 3, since all 3 need to be over 40 for a passing grade), since I am not explicitly asked to do so.
}

}