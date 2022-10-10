package com.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hospitallog")
public class Hospitallog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="name")
      private String name;
	@Column(name="Address")
      private String Address;
	@Column(name="Mobile_no")
      private Long Mobile_no;
    @Column(name="admin_no")
      private LocalDate admin_no;
    @Column(name="discharge")
      private LocalDate discharge;
    @Column(name="ward_no")
	 private int ward_no;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Reservation_no")
	private patient patients;
	
      public Hospitallog()
      {
    	  
      }
	public Hospitallog( String name, String address, Long mobile_no, LocalDate admin_no,
			LocalDate discharge, int ward_no) {
		super();
		this.name = name;
		Address = address;
		Mobile_no = mobile_no;
		admin_no = admin_no;
		discharge = discharge;
		ward_no = ward_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}
	public LocalDate getadmin_no() {
		return admin_no;
	}
	public void setadmin_no(LocalDate admin_no) {
		admin_no = admin_no;
	}
	public LocalDate getdischarge() {
		return discharge;
	}
	public void setChech_out(LocalDate discharge) {
		discharge =discharge;
	}
	
	
	public String pname() {
		return pname;
	}
	public void setward_no(String pname) {
		pname = pname;
	}
	public patients getpatients() {
		return patients;
	}
	public void setpatients(patientspatients) {
		this.patients = patients;
}
}