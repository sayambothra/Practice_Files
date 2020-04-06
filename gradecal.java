package grade.calculation;
import java.util.Scanner;
/**
 *
 * @author Sayam
 */
public class GradeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("enter your marks");
        Scanner s= new Scanner(System.in);         
        
        int marks= s.nextInt();
        if(marks>=90){
            System.out.println("A grade");            
        }
        else if(marks>=80){
            System.out.println("B grade");
        }
        else if(marks>=70){
            System.out.println("C grade");
                    }
        else if(marks>=60){
            System.out.println("D grade");
        }
        else{
            System.out.println("YOU Fail");
        }
        }
        
        
        
    }
