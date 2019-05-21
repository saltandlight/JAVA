package day01;

public class Variable2 {
	public static void main(String[] args) {
		boolean b = true;
		char c = '한'; //Unicode 값이 들어감.
		byte by = 127;
		short sh = 10;
		int i1= 1200000000; 				//default
		int i2= 1200000000;
		int i = 20; 						//default 
		long ll = 2200000000000000000L;  
		//default 가 int형이므로 32바이트로까지만 선언이 됨.(2200000000000000000인 경우)...
		//이런 경우 뒤에 L을 붙여서 선언에 에러가 나지 않게 함.
		
		sh = (short)(12+12); //원래 안 돼야 함. 그러나 eclipse에서 자체적으로 바꾼 것으로 추정 ->casting해주는 게 원칙
		ll = (long)(i1+i2);
		by = (byte)(12+12);
		
		float f = 1.0F;  //float 잘 안 씀.
		double d = 1.0;  //default
        //숫자가 커지면 정수여도 double사용
		
		float ff = 1.0F+1.0F;
		
		final int a=10;
	
	}
}
