/*
 * ICS314 Calendaring Project
 * @Bryson Yogi
 */

import java.io.*;
import java.util.*;

public class icsFileGenerator 
{
	public static void main (String[] args)
	{
		
		//will hold the details for the .ics file in this string
		String calendarDetails;
		//empty string to hold user input
		String classificationCheckString;
		//empty string to hold user input
		String classificationInputString;//change back after testing
		
		//will be what we use to check if user wants to input a classification
		Scanner classificationInput = new Scanner (System.in);
		
		
		
		System.out.println("Would you like to use the classification feature? "
						+  "\nIf you would please type 'y', if not please type 'n': ");
		
		classificationCheckString = classificationInput.next();
		
		if (classificationCheckString.compareTo("y")== 0)
		{
			System.out.println("Please type whether you would like your classifcation to be: PUBLIC, PRIVATE, or CONFIDENTIAL);"
					+ "\nPlease enter your classification now: ");
			
			classificationInputString = classificationInput.next();
			
		}
		
		else
		{
			System.out.println("By default classification will be set to: PUBLIC");
			classificationInputString = "PUBLIC";
		}
				
		
		
		
		
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
			+"CLASS:" + classificationInputString +"\n"//added for deliverable 2
			+"TRANSP:OPAQUE\n"
			+"END:VEVENT\n"
			+"END:VCALENDAR\n";
		
		//print writer will output the string as a .ics file
		//file can be found in the same directory as src folder and bin folder
		try (PrintWriter output = new PrintWriter ("Calendar.ics"))
		{
			output.print(calendarDetails);
			System.out.println("Successfully created Calendar.ics file!");
		}
		
		//catches file not found exception
		catch (IOException e)
		{
			System.out.println("File not found!");
		}
		
		classificationInput.close();//close scanner
		
	}

}
