package day5.am;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * �������壺���������ܶ��������������У�
		 * ��������   [��������] ��������  ������( [�����б�] )
		 * public static  void  ��ʶ��(){
		 * 	    �������
		 * }
		 * 
		 * �����ĵ��ã���ʶ��(��ȷ����ֵ)
		 * */
		Scanner input = new Scanner(System.in);
		//System.out.println("������Ҫ��������������ֵ");
		//int num = input.nextInt();
		for(int i=1; i<=7; i++){
			//random1To100();
			//random1ToN(50);//50 ʵ��
			//random1ToN(num);
			//randomAtoB(1,100);
			randomAtoB(1,35);
		}
		System.out.print("���ţ�");
		randomAtoB(1,17);
		
	}
	
	
	//��װһ������������һ�����������ż����������
	//��װһ�����������1~100֮��������
	//��װһ������������һ��int�������ڷ����и��ݲ�����ӡ������
	//��װһ������������һ��int����,char�������ڷ����и��ݲ�����ӡ������
	//  (int n, char ch)
	//�޲η���
	public static void random1To100(){
		int num = (int)(Math.random()*100+1);
		System.out.println(num);
	}
	
	//�вη�����n �βΣ�
	public static void random1ToN(int n){
		int num = (int)(Math.random()*n+1);
		System.out.println(num);
	}
	
	//�в�����int min, int max��
	public static void randomAtoB(int min, int max){
		// 1-100          6-10         35-123
		// ��0-100 ��1-101       ��0-5  ��6-11       �� 0-89 ��35-123
		//  100-1+1       10-6+1       123-35+1
		int num = (int)(Math.random()*(max-min+1)+min);
		System.out.println(num);
	}
	
	

}
