package day01;

//Java Application
public class Variable1 {
	
	public static void main(String[] args) {
		int a = 10; //Initialization
		int b = 20; //a,b가 메모리에 올라감.
		int c = 20;
		
		int temp = 0;
		/*min
		if(a < b) {
			temp = a;
			if(c < temp) temp=c;
		}
		else {
			temp = b;
			if(c < temp) temp=c;
		} 
		
		*/
		
		if(a < b) {
			temp=b;
			if(temp < c) temp = c;
		}
		else {
			temp=a;
			if(temp < c) temp=c;
		}
		
		System.out.println(temp);
		//7~10 line이 차례로 움직임
	}
}
