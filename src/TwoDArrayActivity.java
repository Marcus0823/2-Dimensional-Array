import java.text.DecimalFormat; 
import java.math.RoundingMode; 



public class TwoDArrayActivity{
   
  public static void main(String[] args) {
      double [] [] numCourses = {{53.24, 73.71, 98.67, 40.53},
                          {140.61, 148.19, 158.48, 170.00},
                          {181.33, 194.50, 107.00, 120.17}};
                 loopArray(numCourses);
                 loopArrayAverage(numCourses); 
                          
  }
  public static void loopArray(double  num [][]) {
   double result = 0; 
   int rows = 2;
   int cols = 3; 
    for(int row = 0; row <= rows; row++){
   
    
         for(int col = 0; col <= cols; col++){
         result += num[row][col]; 
  
  System.out.printf("The current sum is %.2f\n" , (result));
   
 }
       System.out.println("This salesperson recent quater sum is  " + result );
       result = 0;
    }

  } 
  
  public static void loopArrayAverage(double  num [][]) {
   double result = 0; 
   double average = 0; 
   int rows = 2;
   int cols = 3; 
    for(int col = 0; col <= cols; col++){
   
    
         for(int row = 0; row <= rows; row++){
         average += num[row][col]/3; 
  
  System.out.printf("The current average is %.2f\n" , (average));
   
 }
       System.out.printf("The average for this month is %.2f\n" , (average));
       average = 0;


}

   }
}