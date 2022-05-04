import java.util.Hashtable;
import java.util.Iterator;

public class GrodnoStation implements Station{
    Hashtable<String, StationItem> stationItems = new Hashtable<>();

    public GrodnoStation() {

        addItem("Северная","10:30");
        addItem("Окружная","10:40");
        addItem("Советская","10:45");
        addItem("Северная","10:50");
    }

    public void addItem(String name, String time){
        StationItem stationItem = new StationItem(name,time);
        stationItems.put(stationItem.name,stationItem);
    }

    @Override
    public Iterator<StationItem> createIterator() {
        return stationItems.values().iterator();
    }
}
