import java.util.*;

public class Stackqueue
{
	public static void main(String[] args) {
		
		Queue <Integer> q=new PriorityQueue<Integer>();
		Stack <Integer> s=new Stack<Integer>();

		
		//Adding elements to queue
		for(int i=1;i<7;i++)
		 {
			q.add(i);
		 }
		
		
		//Calculating sum of elements and printing sum
		Integer sum=0;
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())
		{
			sum=sum+itr.next();
		}
		System.out.println("sum:"+sum);
		
		//Printing elements in queue
		System.out.println("elements in queue");
		itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//removing 2 elements in queue and pushing them into stack
		s.push(q.remove());
		s.push(q.remove());
		
		
		//printing removed elements using stack
		System.out.println("removed elements--stack elements");
		Iterator<Integer> j=s.iterator();
		while(j.hasNext())								
		{
				System.out.print(j.next()+" ");
		}
	
		//Copying remaining elements in queue to stack
		Integer k;
		 itr=q.iterator();
		while(itr.hasNext())
		{
			k=(Integer) itr.next();
			s.push(k);
		}
		
		
		
		//Printing remaining elements in queue using stack
        Integer v=1;
		
		System.out.println("\nexisted elements");
		 j=s.iterator();
		while(j.hasNext())								
		{
			if(v>2)
			{	
				System.out.print(j.next()+" ");
			}
			else
			{
				v++;
				j.next();
			}
	
		}
	}
}
