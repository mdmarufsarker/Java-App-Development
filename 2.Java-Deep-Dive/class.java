public class Main {
    public static void main(String args[]) {
        
        class User {
            int score;
            
        }
        
        User bob = new User();
        bob.score = 10;
        
        System.out.println(bob.score);
        
    }
}
// 10
////////////////////////////////////////

// To win a game a player need to score 100 points
public class Main {
    public static void main(String args[]) {
        
        class User {
            int score;
            public boolean hasWon(){
                if(score >= 100){
                    return true;
                }else{
                    return false;
                }
            }
        }
        
        User bob = new User();
        bob.score = 10;
        
        System.out.println(bob.hasWon());
        
    }
}
// false

/////////////////////////////////////////
// is the given number is positive or negative? 
// import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        class Number{
            int n;
            public boolean isPositive(){
                if(n > 0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        
        Number num = new Number();
        num.n = 10;
        
        if(num.isPositive()){
            System.out.println(num.n + " is Positive");
        }else{
            System.out.println(num.n + " is Negative");
        }
        
    }
}
// 10 is Positive
