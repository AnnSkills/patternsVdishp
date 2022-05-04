import java.time.LocalDate;

public class StationItem {
    String name;
    String time;

    public StationItem(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
    @Override
    public String toString() {
        return "Станция{" +
                "название станции='" + name + '\'' +
                ", время прибытия=" + time +
                '}';
    }
}
