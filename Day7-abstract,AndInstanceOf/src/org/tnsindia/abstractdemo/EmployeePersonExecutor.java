package org.tnsindia.abstractdemo;

public class EmployeePersonExecutor {
	public static void main(String[] args)
	{
		Person p1=new Employee("raj","Male",23);
		Person p2=new Employee("Rani","Female",-4);
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p1.toString());
		p1.work();
		p2.work();
	}
}
