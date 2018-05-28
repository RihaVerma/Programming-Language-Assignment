/*
PL ASSIGNMENT(20 MARKS)
 Design & Develop a program in Java which will have the following string operations
    Operation 1:  Return the no of occurences of a particular character in a string.
    operation 2:  Capitalize the alternate characters of a string.
 */
package pl_project;
/**
 *
 * @author Riha Verma
 */
import java.util.*;

//Counting the number of occurances of each character
class Operation1
{
   String str;
   char c;
   int i,j,count,flag=0;
   public void NoOfOccurencesOfCharacters()
    {
        //Taking i/p
        System.out.println("ENTER STRING: ");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        for(i=0;i<str.length();i++)
        {
            count=0;
            j=0;
            c=str.charAt(i);
            /*Comparing every character in the string with each otheR AND
              Storing its number of occurance in 'count' variable
            */
            while(j<str.length())
            {
                if(c==str.charAt(j))
                {
                    count++;
                }
                j++;

            }
            //Constraining 'count' from being printed again and again
            for(int k=0;k<i;k++)
            {
                if(str.charAt(k)==c)
                {
                   flag=1;
                }
            }
            if(flag!=1)
            {
                System.out.println(c+"  occured  "+count+"  times");
            }
            flag=0;
        }
    }
}

//Converting alternate characters to Upper_Case
 class Operation2 extends Operation1 
 {
    void AlternateAlphabetToUpperCase()
    {
        //Converting the given string to character array
        char[] arr = str.toCharArray();
        //Converting alternate characters to Upper Case
        for(i=0;i<str.length();i=i+2)
        {
          arr[i] = Character.toUpperCase(arr[i]);
        }
        String str1 = new String(arr);
        //Printing the new String
        System.out.println(str1);
    }   
 }

public class PL_Project
{
    public static void main(String[] args)
    {
        /*Creating an object of the class 'Operation2' 
          called 'op'. Operation2 already inherits 'Operation1' 
        */
        Operation2 op=new Operation2();
        op.NoOfOccurencesOfCharacters();
        op.AlternateAlphabetToUpperCase();
               
    }
}
