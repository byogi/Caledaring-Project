/*
 * ICS314 Calendaring Project
 * @Bryson Yogi
 */

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;//added for deliverable 3

public class icsFileGenerator 
{
	public static void main (String[] args)
	{
		
		//will hold the details for the .ics file in this string
		String calendarDetails;
		//empty string to hold user input
		String classificationCheckString;
		//empty string to hold user input
		String classificationInputString;
		
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
	
	//---Method(s) for deliverable 3 start here---//
	
	
	
	//This Method will allow user to input any number of ICS Files 
	public static void inputIcsFile(ArrayList<File> files) throws IOException, FileNotFoundException
	{
		//below is the set up for variables we'll use//
		int totalNumFiles = 0;//the integer value of the number of files user plans to enter
		int currIndex = 0;//what current index of the arrayList we're on
		String icsFile;//will hold the name of the current ICS file name the user wishes to enter
		Scanner userInput = new Scanner (System.in);//For user input  when prompted
		
		//prompting the user for input is below
		System.out.println("How many ICS file would would you like to enter?");
		totalNumFiles = userInput.nextInt();//sets the users total number of ics files
		
		//below is the loop that will be putting the ICS files into our array list
		while (totalNumFiles > currIndex)
		{
			System.out.println("What is the name of the next file? Please be sure to type it as it appears on your computer: ");
			icsFile = userInput.next();
			
			try 
			{
				files.add(new File (icsFile));//add file to the arrayList
			}
			
			finally
			{
				currIndex ++;//after try block executes currIndex will be increased by a value of 1
			}
			
		}
		
		
		userInput.close();//close the scanner after loop completes
	}

}















