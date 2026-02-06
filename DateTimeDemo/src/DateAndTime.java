import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println("current date "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current time "+time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time "+current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		String formattedDateTime = current.format(format);
		System.out.println("formatted date "+formattedDateTime);
		
		
		
		
				
	}
}
