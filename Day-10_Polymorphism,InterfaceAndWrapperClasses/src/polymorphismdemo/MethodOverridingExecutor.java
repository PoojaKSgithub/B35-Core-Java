package polymorphismdemo;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingChild m=new MethodOverridingChild();
		MethodOverridingExample m1=new MethodOverridingChild();
		System.out.println(m.mul(12, 10));//child class method
		System.out.println(m1.mul(10, 20));//parent class method

	}

}
