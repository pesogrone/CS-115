package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Listings implements Listable {
	//attributes
	
	 HashMap<String, Residential> listings = new HashMap<>();
	 // methods
	@Override
	public HashMap<String, Residential> getListings() {
		
	 return listings;
	}

	@Override
	public Residential getListing(String key) {
        if(listings.containsKey(key)) {
		return listings.get(key);
		}else {
			return null;
		}
	}

	@Override
	public Set<String> getStreetAddresses() {
		return listings.keySet();
	}

	@Override
	public Collection<Residential> getResidences() {
	
		return listings.values();
	}

	@Override
	public int getListingCount() {
		
		return listings.size();
	}

	@Override
	public void addListing(String key, Residential values) {
		listings.put(key, values);
		
	}
	
	
	
	

}
