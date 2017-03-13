
/**
 * @title 全排列
 * @author 王烈兴
 * @description 编写一个程序，输出字符串"abcd"的全排列。
 */
public class AllSort 
{  
  
  public static void main(String[] args){
  	    testPermutation();
  }
    public static void permutation(char[] buf, int start, int end) {  
        if (start == end) {
            for (int i = 0; i <= end; i++) {  
                System.out.print(buf[i]);  
            }  
            System.out.println();  
        } else {
            for (int i = start; i <= end; i++) {  
                char temp = buf[start];  
                buf[start] = buf[i];  
                buf[i] = temp;  
  
                permutation(buf, start + 1, end);  
  
                temp = buf[start];  
                buf[start] = buf[i];  
                buf[i] = temp;  
            }  
        }  
    }    
    public static void testPermutation()  {  
        char[] buf = new char[] { 'a', 'b', 'c', 'd'};  
        permutation(buf, 0, 3);  
    }  
}  
