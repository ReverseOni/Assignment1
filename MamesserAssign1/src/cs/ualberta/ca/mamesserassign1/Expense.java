package cs.ualberta.ca.mamesserassign1;

import java.util.Date;

//Expense Attributes
public class Expense {
	public String category;
	public Date date;
	public String description;
	public double amount;
	public String currency;
	//Constructor, this is supposed to have date but again was causing issues with compiling
	public Expense(String category, String description,double amount, String currency) {
		this.category = category;
		//this.date = date;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
	}
	//Below are getters and setters for the respective attributes

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String toString(){
		return getDescription()+"		"+getAmount();
	}
	
	
}
