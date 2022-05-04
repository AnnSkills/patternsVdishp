import java.util.Iterator;
import java.util.List;

public class User {
    List<Station> stationList;

    public User(List<Station> stationList) {
        this.stationList = stationList;
    }
    public void printStations(){
        System.out.println("Stations : ");

        stationList.forEach(station -> {
            System.out.println("********");
            printStations(station.createIterator());
        });
    }
    private void printStations(Iterator<StationItem> iterator){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
