package day5.am;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 10;//�ֲ�����,���Լ������÷�Χ�����������Χ�Ͳ�����
//		change(num);
//		System.out.println("num = "+num);
		//System.out.println("n="+n);
		
		int[] num={10};
		change2(num);
		System.out.println("num[0]="+num[0]);

	}
	
	public static void change(int n){//n=num;
		n = 100;//�ֲ�����
		System.out.println("n="+n);
	}
	
	public static void change2(int[] n){
		n[0] = 100;
		System.out.println("n[0]="+n[0]);
	}

}
