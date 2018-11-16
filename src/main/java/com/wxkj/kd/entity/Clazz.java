package com.wxkj.kd.entity;

public class Clazz {

	private int id;
	private String clazzid;
	public Clazz() {
		super();
	}
	public Clazz(int id, String clazzid) {
		super();
		this.id = id;
		this.clazzid = clazzid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClazzid() {
		return clazzid;
	}
	public void setClazzid(String clazzid) {
		this.clazzid = clazzid;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", clazzid=" + clazzid + "]";
	}
}
