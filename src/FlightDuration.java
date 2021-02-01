import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class FlightDuration extends Record {
    private ZoneId departureZoneID;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private ZoneId arrivalZoneID;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;

    public ZoneId getDepartureZoneID() {
        return departureZoneID;
    }

    public void setDepartureZoneID(ZoneId departureZoneID) {
        this.departureZoneID = departureZoneID;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public ZoneId getArrivalZoneID() {
        return arrivalZoneID;
    }

    public void setArrivalZoneID(ZoneId arrivalZoneID) {
        this.arrivalZoneID = arrivalZoneID;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public void askData() {
        departureZoneID = ZoneId.of(Input.askString("Enter departure timezone"));
        departureDate = LocalDate.parse(Input.askString("Enter daparture date"));
        departureTime = LocalTime.parse(Input.askString("Enter departure time"));
        arrivalZoneID = ZoneId.of(Input.askString("Enter arrival timezone"));
        arrivalDate = LocalDate.parse(Input.askString("Enter arrival date"));
        arrivalTime = LocalTime.parse(Input.askString("Enter arrival time"));
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; departure timezone: %s; departure date: %s; departure time: %s; arrival timezone: %s; arrival date: %s; arrival time: %s", departureZoneID, departureDate, departureTime, arrivalZoneID, arrivalDate, arrivalTime);
    }
}
