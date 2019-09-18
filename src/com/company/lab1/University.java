package com.company.lab1;

public class University
{
	private String name;
	private int foundationYear;
	private Student students[] = new Student[10];
	
	public University(String name, int foundationYear, Student[] students)
	{
		this.name = name;
		this.foundationYear = foundationYear;
		this.students = students;
	}
	
	public void printAllStudents()
	{
		for (int i = 0; i < this.students.length; i++)
		{
			System.out.print(this.students[i].getName() + " - ");
			System.out.println(this.students[i].getMark());
		}
	}
	
	public float getAverageMark()
	{
		int nrStundents = this.students.length;
		float sum = 0;
		
		for (int i = 0; i < nrStundents; i++)
		{
			sum += this.students[i].getMark();
		}
		
		return sum / nrStundents;
	}
}