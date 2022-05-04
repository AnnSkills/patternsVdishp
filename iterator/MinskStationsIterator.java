import java.util.Iterator;

public class MinskStationsIterator implements Iterator<StationItem> {

    StationItem[] stationItems;
    int position = 0;

    public MinskStationsIterator(StationItem[] stationItems) {
    this.stationItems = stationItems;
    }

    @Override
    public boolean hasNext() {
        if (stationItems.length <= position || stationItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public StationItem next() {
        StationItem stationItem = stationItems[position];
        position+=1;
        return stationItem;
    }

}
