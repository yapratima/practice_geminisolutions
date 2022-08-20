import java.util.*;  
public class HashuniqElements
{
	public static void main(String[] args) {
		
		 HashSet<Integer> set=new HashSet();
		 for(int i=1;i<=10;i++)
		      set.add(i);
		 //adding even numbers from 1 to 10 to set --0 2 4 6 8 10
		 for(int i=0;i<=10;i=i+2)
		 {
		     System.out.print(i+" ");
		      set.add(i);
		 }
    Iterator<Integer> i=set.iterator(); 
     System.out.println("hashset");  
           //now 2,4,6,8,10 removed from hashset and unique elements will print
          while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
	}
}
