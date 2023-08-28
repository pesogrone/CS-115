package RealEstate;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {

	public HashMap<String, Double> getBids();

	public Double getBid(String bidder);

	public Set<String> getBidders();

	public int getBidCount();

	public void newBid(String key, Double value);

}
