package NewYearsGift.First;
import java.io.*;
import java.util.*;


public class Application
{
	
	public static void main( String[] args )throws IOException
	{
		int n,i,w,s=0;
		String nm;
		 InputStreamReader read= new InputStreamReader(System.in);
	        BufferedReader in=new BufferedReader(read);
		System.out.println("Enter Children's Gift Description:");
		System.out.println("Enter no. of type of toffees you want in the gift:");
    n=Integer.parseInt(in.readLine());
    Toffee[] st= new Toffee[n];
    for(i=0;i<n;i++)
    {
    	System.out.println("Enter name of the toffee :");
    nm=in.readLine();
    System.out.println("Enter weight of the toffee:");
   w=Integer.parseInt(in.readLine());
   s=s+w;
   
    	
		 st[i] = new Toffee(nm,w);
    }
		Arrays.sort(st);
		System.out.println(Arrays.toString(st));
		System.out.println("Total Weight="+s);
	}

		
	}
class Toffee implements Comparable<Toffee> {

	private String name;
	private int w;

	public Toffee(String name, int w) {
		this.name = name;
		this.w= w;
	}

	@Override
	public String toString() {
		return "\n" + "name of the toffee=" + name + '\n' +
					"Weight=" + w + '\n';
	}

	public String getName() {
		return name;
	}

	public int getW() {
		return w;
	}

	@Override
	public int compareTo(Toffee o) {
		if (this.w != o.getW()) {
			return this.w - o.getW();
		}
		return this.name.compareTo(o.getName());
	}
}

