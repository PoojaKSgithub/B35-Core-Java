package lambdaExpressionDemo;

public class RunnableInterfaceDemoUsingLambda {
	public static void main(String[] args) {
		/*Runnable interface is a functional an interface which isexactly consins
		 * one abstract method();*/
		 
		Runnable obj=()->
		{
			System.out.println("Implementing runnable interface");
		
		};
		obj.run();
		
		
	}

}
