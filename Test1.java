package day5.am;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * �����������ֵĴ����
		 * 
		 * �������壺����ͷ�ͷ�����
		 * �������η�   [��������] ��������  ��������([�����б�]){
		 * 		�������������
		 * }
		 * 
		 * �����ĵ���ʱ���Ż�ִ�з����еĴ����
		 * ͨ������������ȷ�Ĳ���ֵ���÷���
		 * 
		 * */
//		// println ���Ƿ���������
//		System.out.println("hello");
//		// sqrt ��������
//		Math.sqrt(81);
		
		
		//printSanjiao();
		 printSanjiao2(6);
		
	}
	
	//�������壺����ִ�����еĴ���
	public  static  void printSanjiao(){
		for(int l=1; l<=5; l++){
			for(int i=1; i<=l; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printSanjiao2(int line){
		for(int l=1; l<=line; l++){
			for(int i=1; i<=l; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	

}
