/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Result
{
    public Integer Sum(int[] array)
    {
       int sum = 0;
       for (int i=0; i < array.length-1; i++)
       {
           if (array[i+1]<0 && array[i]>0)
           {
               sum+=array[i];
           }
       }
       return sum;
    }
}



public class Main
{
	public static void main(String[] args) {
	    int[] myArray = new int[]{1,2,1,2,-1,1,3,1,3,-1,0}; 
	    Result sol = new Result();
	    int res = sol.Sum(myArray);
		System.out.println(res);
	}
}
