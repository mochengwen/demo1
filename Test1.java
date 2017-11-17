package day5.am;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 方法：有名字的代码块
		 * 
		 * 方法定义：方法头和方法体
		 * 访问修饰符   [其他修饰] 返回类型  方法名字([参数列表]){
		 * 		具体操作方法体
		 * }
		 * 
		 * 方法的调用时，才会执行方法中的代码块
		 * 通过方法名和正确的参数值调用方法
		 * 
		 * */
//		// println 就是方法的名字
//		System.out.println("hello");
//		// sqrt 方法名字
//		Math.sqrt(81);
		
		
		//printSanjiao();
		 printSanjiao2(6);
		
	}
	
	//方法定义：不会执行其中的代码
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
