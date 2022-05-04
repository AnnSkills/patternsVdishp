import java.time.LocalDate;

public class Ticket {
    String name;
    LocalDate date;

    public Ticket() {
        this.name = "ДС Восточный";
        this.date = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Билет{" +
                "пункт назничения='" + name + '\'' +
                ", дата=" + date +
                '}';
    }
}
