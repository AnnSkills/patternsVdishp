public class PlaneTicket implements Screen{
   private int price;

    public PlaneTicket() {
        this.price = 10000;
    }

    public PlaneTicket(int price) {
        this.price = price;
    }

    @Override
    public void printTicket(Ticket ticket) {
        System.out.println("Печать билета на самолёт : " + ticket + " стоимость:" + this.price);
    }
}
