public class Main {
    public static void main(String[] args) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13};
        System.out.println(primeNumbers[2]);
        System.out.println(primeNumbers.length);
    }
}
////////////////////////////////////////

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        
        list.remove(0);
        
        System.out.println(list.get(2));
        // 7
        System.out.println(list.toString());
        // [3, 5, 7]

    }
}

/////////////////////////////////////////

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List countries = new ArrayList();
        countries.add("Bangladesh");
        countries.add("Argentina");
        countries.add("Portugal");
        
        System.out.println(countries.toString());
        
        countries.remove(1);
        countries.add("Saudi Arabia");
        
        System.out.println(countries.toString());
    }
}
///////////////////////////////////////
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map map = new HashMap();
        
        map.put("Father", "Habibur Rahman");
        map.put("Mother", "Abida Sultana");
        map.put("Son", "Mahin Sarker");
        
        System.out.println(map.get("Father"));
        System.out.println(map.get("Mother"));
        System.out.println(map.get("Son"));
        System.out.println(map.toString());
        System.out.println(map.size());
    }
}
// Habibur Rahman
// Abida Sultana
// Mahin Sarker
// {Son=Mahin Sarker, Mother=Abida Sultana, Father=Habibur Rahman}
// 3
//////////////////////////////////////
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map map = new LinkedHashMap();
        
        map.put("Father", "Habibur Rahman");
        map.put("Mother", "Abida Sultana");
        map.put("Son", "Mahin Sarker");
        
        System.out.println(map.get("Father"));
        System.out.println(map.get("Mother"));
        System.out.println(map.get("Son"));
        System.out.println(map.toString());
        
        map.remove("Son");
        System.out.println(map.toString());
    }
}
// Habibur Rahman
// Abida Sultana
// Mahin Sarker
// {Father=Habibur Rahman, Mother=Abida Sultana, Son=Mahin Sarker}
// {Father=Habibur Rahman, Mother=Abida Sultana}