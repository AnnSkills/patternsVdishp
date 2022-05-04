import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MinskStation implements Station{
    ArrayList<StationItem> stationItems;

    public MinskStation() {
        stationItems = new ArrayList<>();
        addStation("Столетова","11:30");
        addStation("Партизанская","11:35");
        addStation("Ленина","11:40");
        addStation("Первая","11:50");
    }
        public void addStation(String name, String time){
        stationItems.add(new StationItem(name,time));
        }

    @Override
    public Iterator<StationItem> createIterator() {
        return stationItems.iterator();
    }
}
