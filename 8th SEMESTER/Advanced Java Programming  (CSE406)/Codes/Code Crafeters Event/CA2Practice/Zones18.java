import java.util.*;
import java.time.*;
class Zones18
{
    static public void main(String[] rk)
    {
	Set<String> ids = ZoneId.getAvailableZoneIds();
	for(String s : ids)
	{
		ZoneId z = ZoneId.of(s);	
		System.out.println(s + "\t" +LocalDate.now(z) + "\t" + 
		LocalTime.now(z));
	}
    }
}