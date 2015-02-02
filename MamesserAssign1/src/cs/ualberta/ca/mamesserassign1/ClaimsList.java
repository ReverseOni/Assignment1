/*
<This program is designed to track travel expenses.>
    
Copyright (C) <2015>  <Mitchell Messerschmidt>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */
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
		for (ClaimsListListener listeners : this.listeners){
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
