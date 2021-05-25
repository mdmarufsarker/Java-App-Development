// For Loop
public class MyClass {
    public static void main(String args[]) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
public class MyClass {
    public static void main(String args[]) {
        for(int i = 5; i > 0; i--){
            System.out.println(i * 2);
        }
    }
}
// 10
// 8
// 6
// 4
// 2
////////////////////////////////////////
// While Loop
public class MyClass {
    public static void main(String args[]) {
        int x = 1;
        while(x <= 5){
            System.out.println(2 * x);
            x++;
        }
    }
}
////////////////////////////////////////
// Do While Loop



// challenges

// print the numbers form 1 to 30 which is multiples of 3
public class MyClass {
    public static void main(String args[]) {
        for(int i = 1; i <= 30; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}

// Triangular Numbers
// A number is termed as triangular number if we can represent it in the form of triangular grid of points such that the points form an equilateral triangle and each row contains as many points as the row number, i.e., the first row has one point, second row has two points, third row has three points and so on. The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).

public class MyClass {
    public static void main(String args[]) {
        int x = 1;
        int triangularNumber = 1;
        
        while(x <= 10){
            System.out.println(triangularNumber);
            x++;
            
            triangularNumber = triangularNumber + x;
            // triangularNumber = 1 + 2 = 3
            // triangularNumber = 3
            // triangularNumber = 3 + 3 = 6
            // triangularNumber = 6
            // triangularNumber = 6 + 4 = 10
            // triangularNumber = 10
            
        }
    }
}
// 1
// 3
// 6
// 10
// 15
// 21
// 28
// 36
// 45
// 55

/////////////////////////////////////////

// For each loop
public class Main {
    public static void main(String args[]) {
        
        String[] familyMembers = {"Maruf","Mahin","Maria"};
        
        for(String name : familyMembers){
            System.out.println(name);
        }
        
    }
}
// Maruf
// Mahin
// Maria


/////////////////////////////////////////
import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        List<String> familyMembers = new ArrayList<String>();
        
        familyMembers.add("Maruf");
        familyMembers.add("Mahin");
        familyMembers.add("Maria");
        
        for(String name : familyMembers){
            System.out.println(name);
        }
        
    }
}
// Maruf
// Mahin
// Maria
