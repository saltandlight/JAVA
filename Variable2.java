package day01;

public class Variable2 {
	public static void main(String[] args) {
		boolean b = true;
		char c = '��'; //Unicode ���� ��.
		byte by = 127;
		short sh = 10;
		int i1= 1200000000; 				//default
		int i2= 1200000000;
		int i = 20; 						//default 
		long ll = 2200000000000000000L;  
		//default �� int���̹Ƿ� 32����Ʈ�α����� ������ ��.(2200000000000000000�� ���)...
		//�̷� ��� �ڿ� L�� �ٿ��� ���� ������ ���� �ʰ� ��.
		
		sh = (short)(12+12); //���� �� �ž� ��. �׷��� eclipse���� ��ü������ �ٲ� ������ ���� ->casting���ִ� �� ��Ģ
		ll = (long)(i1+i2);
		by = (byte)(12+12);
		
		float f = 1.0F;  //float �� �� ��.
		double d = 1.0;  //default
        //���ڰ� Ŀ���� �������� double���
		
		float ff = 1.0F+1.0F;
		
		final int a=10;
	
	}
}
