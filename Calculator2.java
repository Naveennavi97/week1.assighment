package week1.day2;


public class Calculator2 {
	public int add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
        return num1+num2+num3;
	}
     private int sub(int num1,int num2) {
    	 System.out.println(num1-num2);
    	 return num1-num2;
    	 
		
	}
     private double mul(double num1,double num2) {
    	 System.out.println(num1*num2);
    	 return num1*num2;
		// TODO Auto-generated method stub

	}
     private float div(float num1,float num2) {
    	 System.out.println(num1/num2);
    	 return num1/num2;
    	 
		// TODO Auto-generated method stub

	}
     public static void main(String[] args) {
		Calculator2 cal=new Calculator2();
		System.out.println(cal.add(3, 20, 5));
		System.out.println(cal.sub(5, 4));
		System.out.println(cal.mul(25d, 35d));
		System.out.println(cal.div(5.0f, 3.2f));
				
				
	}
}
