package dao;
import entity.Guest;
import java.util.Set;


public interface GuestDao {
	void addGuest(Guest g);

    Guest findGuestById(int id);

    Set<Guest> allGuests();
}


