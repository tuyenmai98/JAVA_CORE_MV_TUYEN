package com.vti.entity;

import java.time.LocalDate;

public class Group {
	public int id;
	public String name;
	public Account creator;
	public LocalDate createdate;
	public Account[] accounts;

}
