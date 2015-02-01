package cs.ualberta.ca.mamesserassign1;

import java.util.ArrayList;
import java.util.Collection;


public class ClaimsList {
	protected ArrayList<Claims> claimsList;
	protected ArrayList<ClaimsListListener> listeners;
	
	//Constructor for ClaimsList
	public ClaimsList(){
		claimsList = new ArrayList<Claims>();
		listeners = new ArrayList<ClaimsListListener>();
	}
	
	//Below are Getters and setters for the attributes of this class
	public Collection<Claims> getClaims(){
		return claimsList;
	}
	public void addClaim(Claims claim){
		claimsList.add(claim);
		notifyListeners();
	}
	
	public void removeClaim(Claims claim){
		claimsList.remove(claim);
	}
	//Listener Methods for updating ClaimsList list view
	private void notifyListeners() {
		for (ClaimsListListener listeners : listeners){
			listeners.update();
	}
		
	}
	
	public void addListener(ClaimsListListener listen){
		listeners.add(listen);
	}
	public void removeListener(ClaimsListListener listen){
		listeners.remove(listen);
	}
	//Gets size of list
	public int getNumberOfClaims(){
		return claimsList.size();
	}
}
