package com.vti.entity;

import java.time.LocalDate;

public class Question {
	public int id;
	public String content;
	public CategoryQuestion cQuestion;
	public TypeQuestion tQuestion;
	public Account creator;
	public LocalDate createdate;
}
