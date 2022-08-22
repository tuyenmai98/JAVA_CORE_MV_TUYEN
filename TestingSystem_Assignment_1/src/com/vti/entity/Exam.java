package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public int id;
	public String code;
	public String title;
	public CategoryQuestion cQuestion;
	public int duration;
	public Account creator;
	public LocalDate createdate;
}
