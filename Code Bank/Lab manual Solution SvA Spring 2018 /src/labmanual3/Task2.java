/*
Task – 2
(Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years’ 
worth of tuition after the tenth year.
*/



package labmanual3;

public class Task2 {
	public static void main(String argd[]) {
		
		double tution=10000;
		double tutionten=0;
		double totalcost=0;
		
		
		
		for(int year=1; year<=14; year++ ) {
			
			
			if(year==10) { 
		     tutionten =10*(tution + (tution* 0.05));
			}
			
			else if (year>10) {
			 totalcost += tution;
				
			}
		}
		
		System.out.println("Tution fee after 10 years: "+ tutionten);
		System.out.println("The total cost of four years’ worth of tuition after the tenth year.: "+ totalcost);
		
		
	}

}
