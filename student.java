package com.springcore;

public class student {
	private String name;
	private int stu_id;
	private String stu_adress;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the stu_id
	 */
	public int getStu_id() {
		return stu_id;
	}
	/**
	 * @param stu_id the stu_id to set
	 */
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", stu_id=" + stu_id + ", stu_adress=" + stu_adress + "]";
	}
	/**
	 * @return the stu_adress
	 */
	public String getStu_adress() {
		return stu_adress;
	}
	/**
	 * @param stu_adress the stu_adress to set
	 */
	public void setStu_adress(String stu_adress) {
		this.stu_adress = stu_adress;
	}
}
