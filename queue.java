import java.util.*;  
public class queue
{
	public static void main(String[] args) {
	    int s=0;
		
	Queue<Integer> q= new PriorityQueue<>();
	for(int i=1;i<=6;i++)
	      q.add(i);
	 //original queue     
	 System.out.println(q);
	//sum of 6 integers
	Iterator<Integer> itr=q.iterator();
	while(itr.hasNext())
	{
	    s=s+itr.next();
	    
	}
	System.out.println("Sum:" +s);
	//removed elements
	System.out.println("removed elements");
	System.out.println(q.remove());
	System.out.println(q.remove());
	
	//existing elements
	System.out.println("Existing elements");
	 itr=q.iterator();
	while(itr.hasNext())
	{
	    System.out.println(itr.next());
          
	}
	}
}
