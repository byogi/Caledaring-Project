/*
 * ICS314 Calendaring Project
 * @Bryson Yogi
 */

import java.io.*;

public class icsFileGenerator 
{
	public static void main (String[] args)
	{
		String calendarDetails;
		
		calendarDetails = "BEGIN:VCALENDAR\n"
			+"PRODID:-\n"//Google Inc//Google Calendar 70.9054//EN
			+"VERSION:2.0\n"
			+"CALSCALE:GREGORIAN\n"
			+"METHOD:PUBLISH\n"
			+"X-WR-CALNAME:bapy92@gmail.com\n"
			+"X-WR-TIMEZONE:Pacific/Honolulu\n"
			+"BEGIN:VEVENT\n"
			+"DTSTART:20160229T220000Z\n"
			+"DTEND:20160229T230000Z\n"
			+"DTSTAMP:20160221T214356Z\n"
			+"UID:p5jn8goqda616apkjm2rfhcoq0@google.com\n"
			+"CREATED:20160221T214344Z\n"
			+"DESCRIPTION:Event description would go here.\n"
			+"LAST-MODIFIED:20160221T214344Z\n"
			+"LOCATION:Mililani\n"
			+"SEQUENCE:0\n"
			+"STATUS:CONFIRMED\n"
			+"SUMMARY:Test Event\n"
			+"TRANSP:OPAQUE\n"
			+"END:VEVENT\n"
			+"END:VCALENDAR\n";
		
		System.out.print(calendarDetails);
			
		
		
	}

}
