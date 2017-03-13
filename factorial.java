/*
编写一个程序，计算自然数n的阶乘n!。（提示：可用循环完成）
*/
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("请输入一个自然数:");
		try{	
			n=in.nextInt();
			if(n<=0){
				System.out.println("输入错误！");
				return;
			}
			System.out.println(n+"!="+fac(n));
		}
		catch(Exception e){		e.printStackTrace();	}
	}
	public static long fac(int n){
		long sum=1;
		int i;
		for(i=1;i<=n;i++)
			sum=sum*i;
		return sum;
	}
}
