import java.util.Scanner;
class player
{
	String name;
	int no_of_matches_played;
	int run_scored;
	int wicket_taken;

	player()
		{
			this.name="virat";
			this.no_of_matches_played=100;
			this.run_scored=1000;
			this.wicket_taken=50;
			
		}
		
	player(String a,int b,int c,int d)
		{
			this.name=a;
			this.no_of_matches_played=b;
			this.run_scored=c;
			this.wicket_taken=d;
			
		}

	void setname(String s)
		{
			this.name=s;
		}

	void setno_of_matches_played(int a)
			{
				this.no_of_matches_played=a;
			}

	void setrun_scored(int a)
		{
			this.run_scored=a;
		}
	
	void setwicket_taken(int a)
		{
			this.wicket_taken=a;
		}


	String getname()
		{
			return this.name;
		}

	int getno_of_matches_played()
			{
				return this.no_of_matches_played;
			}

	int getrun_scored()
		{
			return this.run_scored;
		}
	
	int getwicket_taken()
		{
			return this.wicket_taken;
		}


	void display()
		{
			System.out.println("name="+this.name+ "\tno_of_matches_played ="+this.no_of_matches_played+ "\trun_scored" +this.run_scored+ "\twicket_taken"+this.wicket_taken);

		}


}

class testplayer
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	
		player[] prr=new player[5];

				
		for(int i=0;i<prr.length;i++)
		{
			
			System.out.println("enter name, runs, wickets, matches for player"+(i+1));
			String n = sc.next();   
         	  	int r = sc.nextInt();      // runs
            		int w = sc.nextInt();      // wickets
            		int m = sc.nextInt(); 	
			prr[i] = new player(n, r, w, m);
		}
		
		prr[0]=new player();


		for(int i=0;i<prr.length;i++)
		{
			prr[i].display();
		}
			
		int n = prr[0].getrun_scored();
		for (int i = 0; i < prr.length; i++)
 		{

   		      		
		if (prr[i].getrun_scored() > n) 
		 	{
				n=prr[i].getrun_scored();
			}
		
		}
		System.out.println("Max scored player is: " + n);

		int p = prr[0].getwicket_taken();
		for (int i = 0; i < prr.length; i++)
 		{

   		      		
		  if (prr[i].getwicket_taken() > p) 
		 	{
				n=prr[i].getwicket_taken()();
			}
		
		}
		System.out.println("Max scored player is: " + p);



		
		
	}
}