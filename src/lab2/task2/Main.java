package lab2.task2;

public class Main
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		
		q.listElements();
		
		q.pop();
		q.listElements();
		
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
	}
}
