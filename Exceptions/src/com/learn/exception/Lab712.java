package com.learn.exception;


public class Lab712 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try{
		String data=args[0];
		int x=Integer.parseInt(data);
		int res=10/x;
		System.out.println("Result os: "+res);
		}catch(Exception e){
			System.out.println("Provide Currect value");
		}//catch(ArrayIndexOutOfBoundsException e )
		//Unreachable catch block for 
		//ArrayIndexOutOfBoundsException. 
		//It is already handled by 
		// the catch block for Exception
		//{System.out.println("Provide One value as CLA");
		//}catch (NumberFormatException e)
		//Unreachable catch block for 
		//NumberFormatException. 
		//It is already handled by the catch 
		 //block for Exception
		 
		
		//{
		//System.out.println("proveide int value as CLA");
		//}catch (ArithmeticException e)
		//Unreachable catch block for ArithmeticException.
		//It is already handled by the catch 
		 //block for Exception
		//{
			//System.out.println("proveide non Zero value as CLA");
		//	}
		
		System.out.println("Main ends");
	}
}



// output:

/*
				Main Starts
				Provide One value as CLA
				Main ends		 
					
 */
