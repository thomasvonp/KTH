
public class Up1
{
	public static void main (String [] args)
	{
	int    k = 0;
	int    m = 0;
	int    n = 10;
	
	for (int i = 0; i < 5; i++) //f�r varje g�ng denna forloop k�rs kommer n�sta loop k�ras 10 g�nger
	{
		k = i + 1;
		m = 0;
	
		for (int j = 0; j < 10; j++)
		{
			System.out.print ((n + m) + " ");
			m += k; //adderar k till varje m 
		}
	
		System.out.println ();
		n += 10; //adderar 10 mellan varje kolonn
	
	}
  }
}
