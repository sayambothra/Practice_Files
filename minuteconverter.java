
package minutesconversion;


public class Minutesconversion {

    public static void main(String[] args) {
        convert(3456789);
    }
    public static void convert(int min){
        if(min>0){
            int year,days=0;
             int d=min/1440;
            year=d/365;
            if(d>365){
                days=d%365;
            }
            else{
                   d=days;
        }
            System.out.println(+min+" minutes is approximatley "+year+ "and " +days);
             
                     
            
        }
    }
    
}
