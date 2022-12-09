package pack1;

import java.text.DecimalFormat;

public class P032_writing_double_value_without_scientfic_notation {
	public static void main(String[] args) {
		String a = "98765432155.001";
		
		Double num = Double.parseDouble(a);
		
		DecimalFormat df =new DecimalFormat("#");
		
		df.setMaximumFractionDigits(3);
		
		System.out.println(df.format(num));

	}
}
