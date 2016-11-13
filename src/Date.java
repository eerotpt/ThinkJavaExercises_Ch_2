/**
 * Created by a on 10/11/2016.
 */
public class Date {

    public static void main(String[] args){
        String day="Thursday";
        int date=10;
        String month="November",year="YearOfTheMonkey";
         //American format
        System.out.println("American format:");
          System.out.println(day+", "+month+" "+date+", "+year);
         //European format
          System.out.println("European format:");
            System.out.println(day+", "+date+" "+month+" "+year);
    }
}
