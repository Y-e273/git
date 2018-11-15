package com.wxkj.kd.entity;

public class Clazz {

	private String clazzid;
	private int num;
	public Clazz() {
		super();
	}
	public Clazz(String clazzid, int num) {
		super();
		this.clazzid = clazzid;
		this.num = num;
	}
	public String getClazzid() {
		return clazzid;
	}
	public void setClazzid(String clazzid) {
		this.clazzid = clazzid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Clazz [clazzid=" + clazzid + ", num=" + num + "]";
	}
}
