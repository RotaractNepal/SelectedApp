package np.com.rotaractnepalapp.rotaract.Class;

public class CalendarClass {

    private String Day;
    private String Month;
    private String Event;
    private String Host;
    private String Venue;
    private String Email;

    public CalendarClass() {
    }

    public CalendarClass(String day, String month, String event, String host, String venue, String email) {
        Day = day;
        Month = month;
        Event = event;
        Host = host;
        Venue = venue;
        Email = email;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
