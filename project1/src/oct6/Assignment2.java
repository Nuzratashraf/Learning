package oct6;

public class Assignment2 {
	
int c,f,k,l;
	
	public int add(int a,int b) {
		
		c=a+b;
		return c;
		}
     public int sub(int c,int e) {
		f=c-e;
		return f;
		}
     public int mul(int g,int h) {
    	 k=g*h;
    	 return k;
    	 }
	public void div(int k,int i) {
		l=k/i;
		System.out.println("The final result is "+ l);
		}
	
	  public static void main(String[] args) {
		  
		  Assignment2 ob=new Assignment2();
		  int result1=ob.mul(10,2);
		  int result2=ob.sub(result1,2);
		  int result3=ob.sub(result2,2);
		  int result4=ob.add(result3,2);
		  ob.div(result4,2);
		
	}

}
