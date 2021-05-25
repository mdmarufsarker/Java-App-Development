// import java.util.*;

public class Main {
    public static void main(String[] args) {

        int age = 16;
        
        if(age >= 18){
            System.out.println("User is over 18");
        }else{
            System.out.println("User is under 18");
        }
        
    }
}
//////////////////////////////////////////
// import java.util.*;

public class Main {
    public static void main(String[] args) {

        int age = 21;
        
        if(age == 18){
            // single equal means we redeclare the age variable 
            // which we wanna want.
            System.out.println("User is  18");
        }else if(age < 18){
            System.out.println("User is under 18");
        }else{
            System.out.println("User is over 18");
        }
        
    }
}
//////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {13, 34};
        
        if(numbers[0] > numbers[1]){
            System.out.println("LOW");
        }else{
            System.out.println("HIGH");
        }

    }
}
/////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {13, 34};
        
        if(numbers[0] > numbers[1]){
            System.out.println("The 1st number is greater");
        }else if(numbers[0] < numbers[1]){
            System.out.println("The 2nd number is greater ");
        }else{
            System.out.println("The numbers are the same");
        }

    }
}
////////////////////////////////////////