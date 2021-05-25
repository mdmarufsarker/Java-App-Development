// import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        class Number{
            int number;
            
            // any of the series of numbers (1, 3, 6, 10, 15, etc.) 
            // obtained by continued summation of the 
            // natural numbers 1, 2, 3, 4, 5, etc.
            
            public boolean isTriangular(){
                int x = 1;
                int triangularNumber = 1;
                
                while(triangularNumber < number){
                    x++;
                    
                    triangularNumber = triangularNumber + x;
                }
                
                if(triangularNumber == number){
                    return true;
                }else{
                    return false;
                }
            }
            
            // the product of a number 
            // multiplied by itself, e.g. 1, 4, 9, 16.
            
            public boolean isSquare(){
                double squareRoot = Math.sqrt(number);
                
                if (squareRoot == Math.floor(squareRoot)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        
        Number myNumber = new Number();
        
        myNumber.number = 49;
        
        System.out.println(myNumber.isTriangular());
        System.out.println(myNumber.isSquare());
    }
}
