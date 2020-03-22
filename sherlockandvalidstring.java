import java.io.*;
import java.util.*;
public class sherlockstring
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        int count[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        int print[]=new int[256];
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]!=0 && print[str.charAt(i)]==0)
            {
              //  System.out.println(count[str.charAt(i)]+" "+ str.charAt(i));
                print[str.charAt(i)]++;
                int c = count[str.charAt(i)];
                String s = String.valueOf(c);
                if(hash.containsKey(s))
                {
                    hash.put(s,hash.get(s)+1);
                }
                else
                {
                    hash.put(s,1);
                }
            }
        }
      // System.out.println(hash);
       int sum =0,value=0,diff=0,total=0,key=0;
        if(hash.size()==1)
        {
            System.out.println("YES");
        }
        else if(hash.size()<=2)
        {
             for(Map.Entry entry:hash.entrySet())
             {     
                  value =(Integer)entry.getValue();
                  String s = entry.getKey().toString();
                  key = Integer.parseInt(s);
                sum += value;
                total +=key;
             }
            sum =sum-value;
            total = total-key;
            if(Math.abs(sum)>value)
            {
             diff = sum - value;
             if(Math.abs(diff)==(sum-1) && Math.abs(total-key)==total-1)
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
            }
            else
            {
             diff = sum - value;
             if(Math.abs(diff)==(value-1))
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
            }
          
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
