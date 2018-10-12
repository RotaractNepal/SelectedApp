package np.com.rotaractnepalapp.rotaract.Class.ClassEvents;

public class ZonalEventsClass {

    private String month;
    private String day;
    private String year;
    private String organizer;
    private String event;
    private String venue;
    private String time;
    private String information;
    private String call;
    private String googlemap;

    public ZonalEventsClass() {
    }

    public ZonalEventsClass(String month, String day, String year, String organizer, String event, String venue, String time, String information, String call, String googlemap) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.organizer = organizer;
        this.event = event;
        this.venue = venue;
        this.time = time;
        this.information = information;
        this.call = call;
        this.googlemap = googlemap;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getGooglemap() {
        return googlemap;
    }

    public void setGooglemap(String googlemap) {
        this.googlemap = googlemap;
    }
}
