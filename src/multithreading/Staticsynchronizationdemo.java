package multithreading;
class Ticketbook{
	static int total_seat = 20;
	
	synchronized static void bookSeats(int seats) {
		//System.out.println("Thread testing10");
		//System.out.println("Thread testing20");
			if(total_seat>=seats) {
				System.out.println(seats+" Seats book successfully");
				total_seat =total_seat-seats;
				System.out.println("Seats left "+total_seat);
			}else{
				System.out.println("Seat can not be booked...");
				System.out.println("Seats left "+total_seat);
			}
		}
		//System.out.println("Thread testing30");
		//System.out.println("Thread testing40");	
	
}

class Mythread1 extends Thread{
	Ticketbook b;
	int seat;
	Mythread1(Ticketbook b,int seat){
		this.b = b;
		this.seat=seat;
	}
	public void run() {
		b.bookSeats(seat);
	}
}

class MyThread2 extends Thread{
	Ticketbook b;
	int seat;
	MyThread2(Ticketbook b,int seat){
		this.b = b;
		this.seat=seat;
	}
	public void run() {
		b.bookSeats(seat);
	}
	
}

public class Staticsynchronizationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticketbook b1 = new Ticketbook();
		Mythread1 mt1 = new Mythread1(b1, 7);
		mt1.start();
		MyThread2 mt2 = new MyThread2(b1, 6);
		mt2.start();
		Ticketbook b2 = new Ticketbook();
		Mythread1 mt3 = new Mythread1(b1, 5);
		mt3.start();
		MyThread2 mt4 = new MyThread2(b1, 9);
		mt4.start();

	}

}
