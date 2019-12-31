package ui;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import dao.GuestComparator;
import dao.GuestDaoImpl;
import entity.Guest;
import service.GuestService;
import service.GuestServiceImpl;
public class GuestMain {
	private GuestService service= new GuestServiceImpl(new GuestDaoImpl());
	public static void main(String[] args) {
		 GuestMain ui = new GuestMain();
	        ui.run();
	    }

	    public void run() {
	        try {
	        	GuestComparator comparator= new GuestComparator();
	            Guest g1 = new Guest(2,"chandra");
	            Guest g2 = new Guest(1, "satya");
	            service.addGuest(g1);
	            service.addGuest(g2);
	            Guest fetched1 = service.findGuestByid(1);
	            Guest fetched2 = service.findGuestByid(2);
	            System.out.println(fetched1.getId());
	            System.out.println(fetched2.getId());
	            System.out.println("********printing all guests****");
	            Set<Guest> guests = service.allGuests();
	            print(guests);
	            
	        }
	        catch (Throwable g){
	            g.printStackTrace();
	            System.out.println("something went wrong");
	        }
	    }

	    void print(Collection<Guest>guests){
	        for (Guest g:guests){
	            System.out.println(g.getId());
	        }
	    }
		
	}


