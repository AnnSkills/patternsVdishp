import java.util.Arrays;
import java.util.List;

public class Iterator {
    public static void main(String[] args){
        List<Station> stationList = Arrays.asList(new MinskStation(),new GrodnoStation());
        User user = new User(stationList);
        user.printStations();
    }
}
