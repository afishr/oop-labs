package com.company.lab1;

import java.util.*;

public class Student
{
	private String name;
	private int age;
	private float mark;
	
	public static ArrayList<Student> instances = new ArrayList<Student>();
	
	public Student(String name, int age, float mark)
	{
		this.name = name;
		this.age = age;
		this.mark = mark;
		
		Student.instances.add(this);
	}
	
	public float getMark() {
		return this.mark;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void printAllStundents()
	{
		for (int i = 0; i < Student.instances.size(); i++)
		{
			System.out.println(Student.instances.get(i).name);
		}
	}
	
	public static float getAverageMark()
	{
		int nrStudents = Student.instances.size();
		int sum = 0;
		
		for (int i = 0; i < nrStudents; i++)
		{
			sum += Student.instances.get(i).mark;
		}
		
		return sum / nrStudents;
	}
}
