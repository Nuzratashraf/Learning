package oct6;

public class Assignment1 {
	
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
		
		Assignment1 op=new Assignment1();
		int sum1 =op.add(10,2);
		int sub2=op.sub(sum1,2);
		int sum2=op.add(sub2,2);
		int mul1=op.mul(sum2,2);
		op.div(mul1,2);
		}

}
