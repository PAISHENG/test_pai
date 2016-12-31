package softLeaderTech;

public class CalApp {
   
	public static void main(String[] args) {
	
		CalService  result =new CalService ();
		int sum=result.add(10, 5);
		System.out.println(sum);
		int sum1=result.unad1(5,2);
		System.out.println(sum1);
		int sum2=result.ad1(5,2);
		System.out.println(sum2);
		//try {
			int sum3=result.unad1(5,2);
			System.out.println(sum3);
		//} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
