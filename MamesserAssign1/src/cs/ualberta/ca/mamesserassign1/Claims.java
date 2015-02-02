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


import java.util.Date;

public class Claims {
	public String claimName;
	public String status;
	public Date startDate;
	public Date endDate;
	public ExpenseListController elc;
	//Constructor for Claims
	//Date removed as it was causing issues with ListView 
	public Claims(String claimName, String status){
		this.claimName = claimName;
		this.status = status;
		this.elc = new ExpenseListController();
		//this.startDate = startDate;
		//this.endDate = endDate;
	}
	
	//Getters and Setters for all the attributes of Claims class
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void claimStatus(String status){
		this.status = status;
	}
	
	public String getClaimName() {
		return claimName;
	}

	public void setClaimName(String claimName) {
		this.claimName = claimName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}
	//To String for what I want to see in the ListView
	public String toString(){
		return getClaimName()+"                           "+getStatus();
	}

}
