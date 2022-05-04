public class BusTicket implements Screen{

    private int busPrice;

    public BusTicket() {
        this.busPrice = 20;
    }

    public BusTicket(int busPrice) {
        this.busPrice = busPrice;
    }

    @Override
    public void printTicket(Ticket ticket) {
        System.out.println("Печать билета на автобус : " + ticket + " стоимость:" + this.busPrice);
    }
}
