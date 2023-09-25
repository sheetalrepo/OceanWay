package classes.enums;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

enum Days{
    Sunday, Monday, Tuesday, Wednesday, Friday, Saturday
}

public class Enum2Collection {

    public static void main(String [] args){
        //Enum to Collections
        Collection<Days> coll = Arrays.asList(Days.values());
        List<Days> ls = Arrays.asList(Days.values());

        //Iterating on enums using for each loop
        for(Days days: Days.values()){
            //code
        }
    }

}
