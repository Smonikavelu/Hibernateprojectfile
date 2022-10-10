package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private String patient;
	@Column(name="patient")
	 private int patient;
	@Column(mobile no="patient")
	 private String patient;
	@Column(address="patient")
	 private int patient;
	@Column(ward no="patient")
	 private String patient;
	@Column(name="Amount")
    private double Amount;
	 public patient()
	 {
		 
	 }
	public patient(int ward no, String address, String name , double amount,int mobile no) {
		super();
		ward no= ward no;
		address = address;
		name  = name ;
	    mobile no= mobile no;
		Amount = amount;

	}
	
	
	}
	public int getward no() {
		return ward no;
	}
	public void setRoom_No(int ward no) {
		ward no = ward no;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		address = address;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		name = name;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
    }
   public double get mobile no() {
		return  mobile no;
	}
	public void set mobile no(double  mobile no) {
		 mobile no =  mobile no;
}
}