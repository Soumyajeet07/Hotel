package service;
import java.util.Set;

import entity.Guest;

public interface GuestService {
	void addGuest(Guest g);

    Guest findGuestByid(int id);

    Set<Guest> allGuests();
}


