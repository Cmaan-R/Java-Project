package streams;


import java.util.Arrays;
import java.util.List;

public class DesafioMap {
	
	public static void main(String[] args) {
				
		List<Integer> nums = Arrays.asList( 1 , 2 , 3, 4, 5, 6 , 7, 8,9);

		
		nums.stream()
		.map(Integer::toBinaryString)
		.forEach(System.out::println);		 
		
		
		
		
		
			
		//String stream = Integer.toBinaryString(nums);
		
		
		
//		1. N�mero para string bin�ria... 6=> "110";
//		2. Inverter a String... "110" => "011";
//		3. Converter de volta para inteiro => "011" => 3;
		//Integer.
	}

}
