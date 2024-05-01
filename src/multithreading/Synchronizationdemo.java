package multithreading;

class Movieticket {
	int total_seats = 10;

	synchronized void  bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + "Seatas book successfully");
			total_seats = total_seats - seats;
			System.out.println("seat left " + total_seats);
		} else {
			System.out.println("seats can not be booked...");
			System.out.println("Seats left " + total_seats);
		}
	}
}

public class Synchronizationdemo extends Thread {
	static Movieticket m;
	int seats;

	public void run() {
		m.bookSeat(seats);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m = new Movieticket();
		Synchronizationdemo amol = new Synchronizationdemo();
		amol.seats = 7;
		amol.start();

		Synchronizationdemo sam = new Synchronizationdemo();
		sam.seats = 6;
		sam.start();
	}

}
