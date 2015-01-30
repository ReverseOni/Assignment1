package cs.ualberta.ca.mamesserassign1;

import java.util.Date;

public class Claims {
	public String claimName;
	public String status;
	public Date startDate;
	public Date endDate;
	
	public Claims(String claimName, String status, Date startDate, Date endDate){
		this.claimName = claimName;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		}
	
	
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
	public String getName(){
		return this.claimName;
	}
	public String getStatus(){
		return this.status;
	}
	
	public String toString(){
		return getName();
	}

}
