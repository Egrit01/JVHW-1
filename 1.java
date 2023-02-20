/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Result 
{
        public String reverseWords(String s) 
        {
        String[] strArray = s.split(" ");
        String res = "";
        for(int i = strArray.length - 1; i >= 0 ; i--)
            {
            if(strArray[i]== " "){
                continue;
            }
            else
            {
            res = res + " " + strArray[i];
            }
        }
        return res.substring(1).trim();
    }
}






  public class Main
  {
    public static void main (String[]args)
    {
      Result sol = new Result();
      String result = sol.reverseWords("Hello  World");
      System.out.println (result);
    }
  }
