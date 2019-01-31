package WebApplication;

public class alpha 
{
	int k=0;
public static void count(String name)
{
	String dat ="";
	char [] ch = name.toCharArray();
	for(int i =0;i<ch.length;i++)
	{
		
		while(ch[i] !=' ')
		{
		
		dat	= dat+ch[i];
		
		}
		i++;
		System.out.println(dat+"= "+dat.length());
	}
	
}

public static void main(String []args)
{
	String str = "Hello World";
    count(str);
}
}
