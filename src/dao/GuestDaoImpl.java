package dao;
import entity.Guest;
import exception.GuestNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



	public class GuestDaoImpl implements GuestDao{
		private Map<Integer,Guest> store=new HashMap<>();
		
		@Override
		public void addGuest(Guest g) {
			store.put(g.getId(), g);
			 
		}
		@Override
	    public Guest findGuestById(int id) {
			Guest g=store.get(id);
			if(g==null) {
				throw new GuestNotFoundException("Guest not found for id=" + id);

			}
			return g;
		}
		@Override
	    public Set<Guest> allGuests(){
			Collection<Guest> Guest = store.values();
			Set<Guest> guestSet=new TreeSet<>(new GuestComparator());
			guestSet.addAll(Guest);
			return guestSet;
		}
}



