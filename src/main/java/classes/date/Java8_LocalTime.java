package classes.date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class Java8_LocalTime {

    static Logger logger = LoggerFactory.getLogger(Java8_LocalDate.class);

    public void localTimeExample(){
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);  // 12:36:33.657

    }

    public static void main(String [] args){
        Java8_LocalTime obj = new Java8_LocalTime();
        obj.localTimeExample();
    }
}
