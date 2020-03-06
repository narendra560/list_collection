package maven.list;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	DataList list = new DataList();
    	Scanner sc=new Scanner(System.in);
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println("1.Add 2.Delete 3.Fetch 4.Display 5.Exit");
        int ch;
        while(true)
        {
        	System.out.print("Enter your choice:");
        	ch=sc.nextInt();
        	switch(ch)
        	{
        	case 1:int e;
        		   System.out.print("Enter element:");
        		   e=sc.nextInt();
        		   list.add(e);
        		   break;
        	case 2:int p;
 		   			System.out.print("Enter index to delete");
 		   			p=sc.nextInt();
 		   			list.remove(p);
 		   			break;
        	case 3:int f;
 		   			System.out.print("Enter index to fetch:");
 		   			f=sc.nextInt();
 		   			list.get(f);
 		   			break;
        	case 4:System.out.println(list);
        			break;
        	default:sc.close();
        			return;
        	}
        }
     
    }
}
