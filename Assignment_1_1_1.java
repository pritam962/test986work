
public class Assignment_1_1_1 {

	public static void main(String[] args) {
		int n=10;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter I
				if(i==0 || i==n-1 || j==(n-1)/2)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
	for(int j=0;j<n;j++)
	{
		//letter N
		if(j==0 || i==j || j==n-1)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter E
				if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter U
				if((j==0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i<n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter R
			if(j==0 || (i==0 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j<(n-1)) || (i==j && i>(n-1)/2))
			System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter O
				if((j==0 && i>0 && i<n-1) || (i==0 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//letter N
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
