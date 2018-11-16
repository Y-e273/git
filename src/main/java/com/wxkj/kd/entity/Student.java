package com.wxkj.kd.entity;

public class Student {

	private int id;
	private String username;
	private String stuname;
	private String password;
	private String sex;
	private String nation;
	private String location;
	private Clazz clazz;
	private String stuid;
	private String grade;
	private String drom;
	private int dromid;
	private String religion;
	private String politics;
	private String health;
	private String phone;
	private String team;
	private String position;
	private String homestatus;
	public Student() {
		super();
	}
	public Student(int id, String username, String stuname, String password, String sex, String nation, String location,
			Clazz clazz, String stuid, String grade, String drom, int dromid, String religion, String politics,
			String health, String phone, String team, String position, String homestatus) {
		super();
		this.id = id;
		this.username = username;
		this.stuname = stuname;
		this.password = password;
		this.sex = sex;
		this.nation = nation;
		this.location = location;
		this.clazz = clazz;
		this.stuid = stuid;
		this.grade = grade;
		this.drom = drom;
		this.dromid = dromid;
		this.religion = religion;
		this.politics = politics;
		this.health = health;
		this.phone = phone;
		this.team = team;
		this.position = position;
		this.homestatus = homestatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDrom() {
		return drom;
	}
	public void setDrom(String drom) {
		this.drom = drom;
	}
	public int getDromid() {
		return dromid;
	}
	public void setDromid(int dromid) {
		this.dromid = dromid;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getHomestatus() {
		return homestatus;
	}
	public void setHomestatus(String homestatus) {
		this.homestatus = homestatus;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", stuname=" + stuname + ", password=" + password
				+ ", sex=" + sex + ", nation=" + nation + ", location=" + location + ", clazz=" + clazz + ", stuid="
				+ stuid + ", grade=" + grade + ", drom=" + drom + ", dromid=" + dromid + ", religion=" + religion
				+ ", politics=" + politics + ", health=" + health + ", phone=" + phone + ", team=" + team
				+ ", position=" + position + ", homestatus=" + homestatus + "]";
	} 
}
