package pack1;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
 
public class DateAPILegacySupport {
 
    public static void main(String[] args) {
         
    	/*Legacy Date Time Support: Legacy Date/Time classes are used in almost all the applications,
    	so having backward compatibility is a must. That�s why there are several utility methods through which we can convert Legacy classes 
    	to new classes and vice versa. Let�s see this with a simple example.
    	*/
    	
    	//Date to Instant
        Instant timestamp = new Date().toInstant();
        //Now we can convert Instant to LocalDateTime or other similar classes
        LocalDateTime date = LocalDateTime.ofInstant(timestamp, 
                        ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println("Date = "+date);
         
        //Calendar to Instant
        Instant time = Calendar.getInstance().toInstant();
        System.out.println(time);
        //TimeZone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);
         
        //ZonedDateTime from specific Calendar
        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
        System.out.println(gregorianCalendarDateTime);
         
        //Date API to Legacy classes
        Date dt = Date.from(Instant.now());
        System.out.println(dt);
         
        TimeZone tz = TimeZone.getTimeZone(defaultZone);
        System.out.println(tz);
         
        GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);
        System.out.println(gc);
         
    }
 
}