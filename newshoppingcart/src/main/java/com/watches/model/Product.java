package com.watches.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@Column
	@NotEmpty(message="Enter the Product Name")
	private String pname;
	@Column
	private double pricetag;
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the pricetag
	 */
	public double getPricetag() {
		return pricetag;
	}

	/**
	 * @param pricetag the pricetag to set
	 */
	public void setPricetag(double pricetag) {
		this.pricetag = pricetag;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pricetag=" + pricetag + "]";
	}
}