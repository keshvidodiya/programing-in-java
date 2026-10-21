import java.util.Calendar;

class CalendarInfo
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + c.get(Calendar.DATE));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));
        System.out.println("Day of Week: " + c.get(Calendar.DAY_OF_WEEK));
    }
}