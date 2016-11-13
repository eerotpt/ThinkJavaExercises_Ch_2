/**
 * Created by a on 10/11/2016.
 */
public class Time {

    public static void main(String[] args){
        int hour=19,minute=39,second=27;
        int secondsSinceMidNight;
        //Seconds since midnight
         System.out.print("Seconds since midnight : ");
          secondsSinceMidNight=((hour*60*60)+(minute*60)+27);
           System.out.println(secondsSinceMidNight);
        //Number of seconds remaining in the day
         int remainingSeconds;
         int secondsInTheDay=24*60*60;
          remainingSeconds=secondsInTheDay-secondsSinceMidNight;
           System.out.println("Remaining amount of seconds in the day : "+remainingSeconds);
        //Percentage of the day that has passed.
         int percentage;
          percentage=secondsSinceMidNight*100/secondsInTheDay;
           System.out.println("Percentage of day that has passed : "+percentage);
        //Computing time since started exercise
         hour=20;
         minute=18;
         second=33;
        int currentTimeInSeconds=20*60*60+(18*60)+33;
        int computingTimeInSeconds=currentTimeInSeconds-secondsSinceMidNight;
        int computingHours=computingTimeInSeconds / 3600;
        int computingMinutes=computingTimeInSeconds % 3600 / 60;
        int computingSeconds=computingTimeInSeconds % 3600 % 60;
         System.out.print("Computing time : "+computingHours+" hours : ");
          System.out.print(computingMinutes+" minutes : "+computingSeconds+" seconds");
    }
}
