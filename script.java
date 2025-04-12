import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PrintNameAndTime {
    public static void main(String[] args) {
        String lastName = "Филиппов";
        String firstName = "Юрий";
        
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Текущее время: " + formattedTime);
    }
}