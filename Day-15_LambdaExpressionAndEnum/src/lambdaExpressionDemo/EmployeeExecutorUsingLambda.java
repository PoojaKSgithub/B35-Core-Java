package lambdaExpressionDemo;

public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*implementing the functional interface -Employee
		Lambda Expression with no parameter*/
       /* Employee obj=()->{*/
        	/*Employee obj=(int a,int b)->{
        		int result=(a>b)?a:b;
        		System.out.println("The maximum number is:"+result);
        		return result;
	
       };
         obj.max(32,68);*/
		Employee obj=(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is:"+obj.max(32,68));
		
	}

}
