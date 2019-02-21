package se.lexicon.Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class App{
    public static void main( String[] args ) throws InterruptedException{
    	
    	//Before java.time we had Date, GregorianCalendar, Calendar -> we hated it!
        
    	//LocalDate - stores dates
    	
    	//LocalTime - stores time
    	
    	//LocalDateTime - stores LocalDate and LocalTime
    	
    	//ZonedDateTime - we will not cover this
    	
    	//Will create a ISO standard date (2019-02-13) of current date
    	LocalDate today =LocalDate.now();
    	System.out.println(today+"\n");
    	
    	//Vydaet datu kotoruyu vy napisali v skobkah
    	LocalDate fromString = LocalDate.parse("1963-05-27");
    	System.out.println(fromString+"\n");
    	
    	// Vydaet datu tysyachiletiya //Will add three millenia
    	LocalDate anotherDate = LocalDate.from(today).plus(3, ChronoUnit.MILLENNIA);
    	System.out.println(anotherDate+"\n");
    	
    	// Vydaet datu kotoruyu vy hotite //ISO date of 1983-01-23 
    	LocalDate myBirthDate = LocalDate.of(1983, 01, 23);
    	System.out.println(myBirthDate+"\n");
    	
    	// Vydaet datu kotoruyu vy hotite
    	LocalDate simonsBirthDate = LocalDate.of(1997, Month.MARCH, 18);
    	System.out.println(simonsBirthDate+"\n");
    	
    	// Vydaet datu neponyatnuyu //Adding days
    	LocalDate doomsDay = today.plusDays(256972);
    	System.out.println(doomsDay+"\n");
    	System.out.println(doomsDay.getDayOfWeek()+"\n");
    	
    	// Vydaet true ili false
    	boolean shouldBeTrue = today.isBefore(doomsDay);
    	System.out.println(shouldBeTrue+"\n");
    	
    	// Vydaet true ili false
    	boolean simonIsYounger = simonsBirthDate.isAfter(myBirthDate);
    	System.out.println(simonIsYounger+"\n");
    	
    	//If we want to see years, month and days between two dates we use...
    	//Period object
    	Period between =Period.between(myBirthDate, simonsBirthDate);
    	System.out.println(between.getYears()+ " years "+ between.getMonths()+" months "+ between.getDays()+" days\n");
    	
    	//Create a local time object of now in ISO format
    	LocalTime now = LocalTime.now();
    	System.out.println(now+"\n");
    	
    	// Vydaet vremya kotoruyu vy hotite
    	LocalTime ten = LocalTime.of(10, 0);
    	System.out.println(ten+"\n");
    	
    	// Vydaet vremya kotoruyu vy hotite
    	LocalTime someTime = LocalTime.parse("10:25");
    	System.out.println(someTime+"\n");
    	
    	// Mojete dobavit chasy k vremeni 
    	LocalTime later = now.plusHours(10);
    	System.out.println(later+"\n");
    	
    	//Similar to Period but measures smaller units
    	Duration duration = Duration.between(ten, someTime);
    	System.out.println(duration.getSeconds()+"\n");
    	
    	// Vydaet nastoyashee vremya
    	LocalDateTime dateTimeNow = LocalDateTime.now();
    	System.out.println(dateTimeNow+"\n");
    	
    	// Nepotno chto delaet
    	LocalDateTime dateTimeLater = dateTimeNow.plusHours(5);
    	System.out.println(dateTimeLater+"\n");
    	
    	// Vydaet vremya kotoruyu vy hotite
    	LocalDateTime date =LocalDateTime.of(2018, 12,10,8,30);
    	System.out.println(date+"\n");
    	
    	// Vydaet chislo mesyac god i vremya 
    	String formattedDate = date.format(DateTimeFormatter.ofPattern("YYY-MM-dd HH:mm"));
    	System.out.println(formattedDate+"\n");
    	
    	// Vydaet chislo mesyac god i vremya (08:30 måndag den 10 2018)
    	String moreCoolFormat = date.format(DateTimeFormatter.ofPattern("HH:mm EEEE 'den' dd YYY"));
    	System.out.println(moreCoolFormat+"\n");
    	  	
    }
}