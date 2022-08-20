import java.util.*;  
public class hash
{
	public static void main(String[] args) {
		
		 HashSet<Integer> set=new HashSet();
		 for(int i=1;i<=10;i++)
		 
           set.add(i);    
             
           Iterator<Integer> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
	}
}
