import java.util.Scanner;

public class JavaExercise {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter school number: (1 = business,"
            + " 2 = engineering, 0 = exit\n");
        
        int schoolType = input.nextInt();
        int grade = 0; //default storage
        
        
        switch(schoolType){
            case 1:
                System.out.print("Enter your grade: ");
                grade = input.nextInt();
                
                gradeConverter(schoolType, grade);
                break;
                
            case 2:
                System.out.print("Enter your grade: ");
                grade = input.nextInt();
                gradeConverter(schoolType, grade);
                break;
                
            default:
                System.out.println("Goodbye.");
  
        }
    }
    
    public static void gradeConverter(int schoolType, int grade){
        
        if(schoolType == 1){
            if(grade < 50){
                System.out.println("F");
            }
            else if(grade < 54){
                System.out.println("D");
            }
            else if (grade < 59){
                System.out.println("C");
            }
            else if (grade < 64){
                System.out.println("C+");
            }
            else if(grade < 69){
                System.out.println("B");
            }
            else if(grade < 79){
                System.out.println("B+");
            }
            else if(grade < 89){
                System.out.println("A");
            }
            else{
                System.out.println("A+");
            }
        }
        
        if(schoolType == 2){
            if(grade < 50){
                System.out.println("F");
            }
            else if(grade < 69){
                System.out.println("D");
            }
            else if (grade < 74){
                System.out.println("C");
            }
            else if (grade < 79){
                System.out.println("C+");
            }
            else if(grade < 84){
                System.out.println("B");
            }
            else if(grade < 89){
                System.out.println("B+");
            }
            else if(grade < 94){
                System.out.println("A");
            }
            else{
                System.out.println("A+");
            }
        }

    }
}
