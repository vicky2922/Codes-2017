import java.util.Scanner;

public class A816codeforces
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char[] in = scan.next().toCharArray();
		int min = 0;
		while (!palindrome(in))
		{
			inc(in);
			min++;
		}
		System.out.println(min);
	}

	private static void inc(char[] in)
	{
		String s = new String(in);
		if (s.endsWith("59"))
		{
			in[3] = in[4] = '0';
			if (s.startsWith("23"))
				in[0] = in[1] = '0';
			else if (in[1] == '9')
			{
				in[1] = '0';
				in[0]++;
			}
			else
				in[1]++;
		}
		else if (s.endsWith("9"))
		{
			in[3]++;
			in[4] = '0';
		}
		else
			in[4]++;
	}

	private static boolean palindrome(char[] in)
	{
		String s = new String(in);
		//System.out.println(s);
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}


