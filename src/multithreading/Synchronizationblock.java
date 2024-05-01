package multithreading;

class Ticketblock{
	int total_seat = 10;
	
	public void bookSeats(int seats) {
		System.out.println("Thread testing10");
		System.out.println("Thread testing20");
		synchronized(this) {
			if(total_seat>=seats) {
				System.out.println(seats+" Seats book successfully");
				total_seat =total_seat-seats;
				System.out.println("Seats left "+total_seat);
			}else{
				System.out.println("Seat can not be booked...");
				System.out.println("Seats left "+total_seat);
			}
		}
		System.out.println("Thread testing30");
		System.out.println("Thread testing40");	
	}
}
public class Synchronizationblock extends Thread {
	static Ticketblock m1;
	int seat;
	public void run() {
		m1.bookSeats(seat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1=new Ticketblock();
		Synchronizationblock amol = new Synchronizationblock();
		amol.seat=7;
		amol.start();
		
		Synchronizationblock sam = new Synchronizationblock();
		sam.seat=7;
		sam.start();
		
		
	}

}
