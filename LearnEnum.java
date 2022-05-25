public class LearnEnum {
	public static void main(String[] args) throws Exception {
		House hariHouse = House.FOURBHK;

		System.out.println("hari house : " + hariHouse);

		if(hariHouse == House.TWOBHK) {
			System.out.println("hari lives in 2 bhk");
		} else if(hariHouse == House.ONEBHK) {
			System.out.println("hari lives in one bhk");
		} else if (hariHouse == House.FOURBHK) {
			System.out.println("hari lives in four bhk");
		} else {
			System.out.println("hari lives in three bhk");
		}
		
 	}
}

enum House {
	ONEBHK, TWOBHK, THREEBHK, FOURBHK
}