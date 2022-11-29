
package org.tnsindia.instanceofdemo;
//abstract class
abstract class Animal
{
	abstract void accept();
	
}
// implementation child class for the abstract class
class Lion extends Animal
{
	 
	 void accept() {
	 System.out.println("Lion Roars");
}
}
//driver class
    public class InstanceOfDemo {
    	
    
	public static void main(String[] args){
           Lion l=new Lion();
             l.accept();
             //instance of operator
         System.out.println( l instanceof Lion);
         System.out.println( l instanceof Animal);
}
}