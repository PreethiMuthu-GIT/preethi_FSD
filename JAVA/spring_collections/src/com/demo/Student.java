package com.demo;

import java.util.List;

public class Student {

	private  int stdid;
	private String stdname;
	private int stdmarks;
	private String stdadd;
	private List<String> subjects;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	public String getStdadd() {
		return stdadd;
	}
	public void setStdadd(String stdadd) {
		this.stdadd = stdadd;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdmarks=" + stdmarks + ", stdadd=" + stdadd
				+ ", subjects=" + subjects + "]";
	}
	public Student(int stdid, String stdname, int stdmarks, String stdadd, List<String> subjects) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
		this.stdadd = stdadd;
		this.subjects = subjects;
	}
	
	
}
