package com.wxkj.kd.entity;

public class Contro {

	private int id;
	private String name;
	private String password;
	private String contro;
	private String controname;
	private int status;
	public Contro() {
		super();
	}
	public Contro(int id, String name, String password, String contro, String controname, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contro = contro;
		this.controname = controname;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContro() {
		return contro;
	}
	public void setContro(String contro) {
		this.contro = contro;
	}
	public String getControname() {
		return controname;
	}
	public void setControname(String controname) {
		this.controname = controname;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Contro [id=" + id + ", name=" + name + ", password=" + password + ", contro=" + contro + ", controname="
				+ controname + ", status=" + status + "]";
	}
}
