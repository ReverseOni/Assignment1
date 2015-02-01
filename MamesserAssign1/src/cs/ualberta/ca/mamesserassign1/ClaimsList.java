package cs.ualberta.ca.mamesserassign1;

import java.util.ArrayList;
import java.util.Collection;


public class ClaimsList {
	protected ArrayList<Claims> claimsList;
	protected ArrayList<ClaimsListListener> listeners;
	
	public ClaimsList(){
		claimsList = new ArrayList<Claims>();
		listeners = new ArrayList<ClaimsListListener>();
	}
	public Collection<Claims> getClaims(){
		return claimsList;
	}
	public void addClaim(Claims claim){
		claimsList.add(claim);
		notifyListeners();
	}
	private void notifyListeners() {
		for (ClaimsListListener listeners : listeners){
			listeners.update();
	}
		
	}
	public void removeClaim(Claims claim){
		claimsList.remove(claim);
	}
	
	public void addListener(ClaimsListListener listen){
		listeners.add(listen);
	}
	public void removeListener(ClaimsListListener listen){
		listeners.remove(listen);
	}
	public int getNumberOfClaims(){
		return claimsList.size();
	}
}
