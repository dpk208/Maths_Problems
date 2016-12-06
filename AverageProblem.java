import java.util.Scanner;

public class AverageProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] start = {94.6,84.6,81.4,66.7};
		double sum = 0.0;
		double avg = 0.0;
		Scanner s = new Scanner(System.in);
		double newNum = 0.0;
		for(double i:start){
			sum += i;
		}
		System.out.println("Sum :"+sum);
		int d = 4;
		avg = sum / d;
		System.out.println("Avg :"+avg);
		while(d>0)
		{			
			newNum = s.nextDouble();
			sum += newNum;
			System.out.println("Sum :"+sum);
			d++;
			avg = sum/d;
			System.out.println("Avg :"+avg+ "\td :"+d);
		}
		s.close();
	}

}
