package assignment7_3;  //package declaration  

public class BufferExample {          //class definition 

	public static void main(String[] args) {  //main starts here 
		
		StringBuffer sb=new StringBuffer();  //creating  buffer 
		
		System.out.println("The default capacity of buffer : " + sb.capacity());      //printing default capacity of buffer 
		
		//if we append the string with less characters than capacity ,it remains same
		
		sb.append("Hello");//appending this 
		
		System.out.println("The capacity of buffer after appending string smaller than buffer capacity  : " +sb.capacity()); //printing capacity
		sb.append("This is demo for buffer");       //appending this string 
		
		System.out.println("The capacity of buffer after appending string bigger than buffer capacity  : " +sb.capacity());  //printing capacity after appending string  
		
		

	}

}//class ends 
