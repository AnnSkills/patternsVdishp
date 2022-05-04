import java.util.ArrayList;
import java.util.List;

public class PrintingTicket implements Screen{

   private List<Screen> tickets = new ArrayList<>();


    @Override
    public void printTicket(Ticket ticket) {
        for(Screen screen:tickets){
            screen.printTicket(ticket);
        }
    }
    public void add(Screen screen){
        this.tickets.add(screen);

    }
    public void clear(){
        System.out.println();
        this.tickets.clear();
    }
}
