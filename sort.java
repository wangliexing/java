/*
用Java编写一个能对数组比较的程序，需要输出按行升序排序的结果 如输入
王烈兴
*/
public class Helloword
{

   public static void main(String[] args)
   {	  
       
       int score[] = new int[args.length];
       for(int i=0;i<args.length;i++)
       {
       	  score[i]=Integer.parseInt(args[i]);
       }
       
       
        for (int i = 0; i < score.length -1; i++)
        {    
             for(int j = 0 ;j < score.length - i - 1; j++)
             {   
                 if(score[j] < score[j + 1])
                 {    
                    int temp = score[j];
                      score[j] = score[j + 1];
                     score[j + 1] = temp;
                }
             }            
             
         }
              System.out.print("排序结果：");
              for(int a = 0; a < score.length; a++)
              {
                  System.out.print(score[a] + "\t");
              }
   }
}

	 
