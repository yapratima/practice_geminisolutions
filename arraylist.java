import java.util.*;  
public class arraylist
{
	public static void main(String[] args) {
		
		 List<Integer> list=new ArrayList<Integer>();
		 for(int i=1;i<=10;i++)
		 
           list.add(i);    
             
           Iterator<Integer> i=list.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
	}
}
