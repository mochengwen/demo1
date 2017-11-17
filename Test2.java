package day5.am;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 方法定义：独立（不能定义在其他方法中）
		 * 访问修饰   [其他修饰] 返回类型  方法名( [参数列表] )
		 * public static  void  标识符(){
		 * 	    具体代码
		 * }
		 * 
		 * 方法的调用：标识符(正确参数值)
		 * */
		Scanner input = new Scanner(System.in);
		//System.out.println("请输入要产生的随机数最大值");
		//int num = input.nextInt();
		for(int i=1; i<=7; i++){
			//random1To100();
			//random1ToN(50);//50 实参
			//random1ToN(num);
			//randomAtoB(1,100);
			randomAtoB(1,35);
		}
		System.out.print("蓝号：");
		randomAtoB(1,17);
		
	}
	
	
	//封装一个方法：输入一个数，输出是偶数还是奇数
	//封装一个方法：输出1~100之间的随机数
	//封装一个方法：接受一个int参数，在方法中根据参数打印三角形
	//封装一个方法：接受一个int参数,char参数，在方法中根据参数打印三角形
	//  (int n, char ch)
	//无参方法
	public static void random1To100(){
		int num = (int)(Math.random()*100+1);
		System.out.println(num);
	}
	
	//有参方法（n 形参）
	public static void random1ToN(int n){
		int num = (int)(Math.random()*n+1);
		System.out.println(num);
	}
	
	//有参数（int min, int max）
	public static void randomAtoB(int min, int max){
		// 1-100          6-10         35-123
		// 先0-100 再1-101       先0-5  再6-11       先 0-89 再35-123
		//  100-1+1       10-6+1       123-35+1
		int num = (int)(Math.random()*(max-min+1)+min);
		System.out.println(num);
	}
	
	

}
