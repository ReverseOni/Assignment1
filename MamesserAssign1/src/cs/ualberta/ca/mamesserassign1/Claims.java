package cs.ualberta.ca.mamesserassign1;

import java.util.Date;

public class Claims {
	public String claimName;
	public String status;
	public Date startDate;
	public Date endDate;
	
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
	public Claims(String claimName){
		this.claimName = claimName;
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

}
