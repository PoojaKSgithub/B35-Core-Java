package org.tnsindia.abstractdemo;

public class ATMMachineChild extends ATMMachine {
	//provided the implementation to abstract machine parent class
	@Override
	void withdraw() {
		int balance=50000;
		System.out.println(" withdrawing amount is:"+balance);
	}

}
