package service;
import java.util.Set;
import dao.GuestDao;
import entity.Guest;
import exception.IncorrectidException;
public class GuestServiceImpl implements GuestService  {
	private GuestDao dao;
	
	public GuestServiceImpl(GuestDao dao) {
		this.dao=dao;
	}
	@Override
	public void addGuest(Guest g) {
		dao.addGuest(g);
	}
	@Override
	public Guest findGuestByid(int id) {
		if(id<0) {
			throw new IncorrectidException("id is incorrect");
		}
		Guest g=dao.findGuestById(id);
		return g;
	}
	@Override
	public Set<Guest> allGuests() {
		Set<Guest>guests=dao.allGuests();
		return guests;
		
	}

}
