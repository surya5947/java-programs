import java.io.*;
import java.util.*;
public class highestvaluepalindrome
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str  = sc.next();
        StringBuffer sbr = new StringBuffer();
        int i=0,j=n-1,count=0,same=0;
        int palindrome[]=new int[n];
        boolean b[]=new boolean[n];
        Arrays.fill(b,false);
        if(n==1)
        {
            if(k>0)
            {
                sbr.append("9");
                System.out.println(sbr);
            }
            else
            {
                System.out.println("-1");
            }
        }
        else 
        {
        while(i<j)
        {

            if(str.charAt(i)==str.charAt(j))
            {
              same=1;
              palindrome[i]=Character.getNumericValue(str.charAt(i));
              palindrome[j]=Character.getNumericValue(str.charAt(j));
            }
            else
            {
                count++;
                 palindrome[i]=Character.getNumericValue(str.charAt(i));
              palindrome[j]=Character.getNumericValue(str.charAt(j));
              if(palindrome[i]> palindrome[j])
              {
                  same=1;
                  palindrome[j]=palindrome[i];
                  b[i]=true;
               }
              else
              {
                  palindrome[i]=palindrome[j];
                  b[i]=true;
              }
            }
            i++;
            j--;
            if(i==j)
            {
                 palindrome[j]=Character.getNumericValue(str.charAt(j));
                palindrome[i]=palindrome[j];
            }
        }
      // System.out.println(count);
        if(count<=k)
        {
            int diff = k-count;
            i=0;j=n-1;
            int min = diff;
          //  System.out.println(min);
        for(int l=0;l<diff;l++)
        {   
           while(i<j)
           {
            if(b[i])
            {
            if(palindrome[i]!=9)
            {
                if(min>0)
                {
                palindrome[i]=9;
                palindrome[j]=9;
                min--;
                }
                else
                {
                    l=diff+1;
                }
            }
            }
            else
            {
                if(min>=2)
                {
                if(palindrome[i]!=9)
                {
                palindrome[i]=9;
                palindrome[j]=9;
                min = min-2;
                }
                }
            }
         i++;
         j--;
    // System.out.println(i+" "+j);
        if(i==j)
         {
           //  System.out.println("SAME");
             if(min>0)
             {
                 palindrome[i]=9;
                 min--;
             }
             else
             {
                 l=diff+1;
             }
         }
        }
        }
          for(int l=0;l<n;l++)
        {
            sbr.append(palindrome[l]);
        }   
            System.out.println(sbr);
        }
        else
        {
            System.out.println("-1");
        }
        }
    }
    }

