import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormat
{
    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")));
    }
}