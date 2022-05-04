public class Composite {
    public static void main(String[] args){
        Screen busTicket = new BusTicket(30);
        Screen  planeTicket  = new PlaneTicket();
        PrintingTicket printer= new PrintingTicket();
        printer.add(busTicket);
        printer.add(planeTicket);
        printer.printTicket(new Ticket());




    }
}
