package uaMk;

public class Aplication {
	public static void main(String[] args) {
		
		byte x1 = 1;
		short x2 = 2;
		int x3 = 3;
		long x4 = 4;
		
		float x5;
		double x6;
		
		char x7;
		boolean x8;
		
		
		
		x5= (x1+x2+x3)/x4;
		System.out.println("x5 = " + x5);
		
		System.out.println("byte =" + Byte.MAX_VALUE);
		System.out.println("byte =" + Byte.MIN_VALUE);
		System.out.println("short=" + Short.MAX_VALUE);
		System.out.println("short=" + Short.MIN_VALUE);
		System.out.println("int=" + Integer.MAX_VALUE);
		System.out.println("int=" + Integer.MIN_VALUE);
		System.out.println("Long=" + Long.MAX_VALUE);
		System.out.println("Long=" + Long.MIN_VALUE);
		System.out.println("float=" + Float.MAX_VALUE);
		System.out.println("float=" + Float.MIN_VALUE);
		System.out.println("double=" + Double.MAX_VALUE);
		System.out.println("double=" + Double.MIN_VALUE);
		System.out.println("char=" + Character.MAX_VALUE);
		System.out.println("char=" + Character.MIN_VALUE);
		
		
		System.out.println();
		
		int array[] = new int[]{34, 11, 55, 4, 12, 51, 35, 452, 120};
	    
	    int max = getMax(array);
	    System.out.println("Максимальне число: "+max);
	    
	    int min = getMin(array);
	    System.out.println("Мінімальне число: "+min);
	  }
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	}

}
