package cs.ualberta.ca.mamesserassign1;

public class Claims {
	public String claimName;
	public String status;
	
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
