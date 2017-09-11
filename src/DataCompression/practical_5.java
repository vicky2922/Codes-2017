package DataCompression;
import java.util.*;
/*
Integer Arithmetic encoding
*/
public class practical_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
				String stringtocode= "1321";
				int[] count = new int[4];
				count[0] = 0;
				count[1] = 40;
				count[2] = 1;
				count[3] = 9;
				
				int[] cum_count = new int[4];
				Arrays.fill(cum_count, 0);
				for(int i = 1; i< 4; i++){
					cum_count[i]=cum_count[i-1] + count[i];
					//System.out.println(cum_count[i]);
				}
				
				int total = cum_count[3];
				int lower = 0;
				int upper = 255;
				//String s = Integer.toBinaryString(lower);
				
				String lower_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(lower)));
				String upper_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(upper)));
				
				/*System.out.println(lower_bin);
				System.out.println(upper_bin);*/
				String finalstring="";
				int scale3 = 0;
				
				for(int i = 0 ; i  < stringtocode.length(); i++){
					int current_char = (int)stringtocode.charAt(i) - 48;
					
					//System.out.println(current_char);
					
					lower  = lower + ((upper-lower+1)*cum_count[current_char-1])/total;
					upper  = lower -1 + ((upper-lower+1)*cum_count[current_char])/total;
					
					lower_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(lower)));
					upper_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(upper)));
					System.out.println(lower+" "+upper);
					
					while(lower_bin.charAt(0) == upper_bin.charAt(0) || (lower_bin.charAt(0) == upper_bin.charAt(1)&&lower_bin.charAt(1) == upper_bin.charAt(0))){
						
						if(lower_bin.charAt(0) == upper_bin.charAt(0)){
							
							//System.out.println("E1/E2 mapping");
							
							finalstring += lower_bin.charAt(0);
							lower = lower << 1;
							upper = upper << 1;
							upper++;
							
							lower_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(lower)));
							upper_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(upper)));
							
							//System.out.println(lower+" "+upper);
							
							while(scale3 > 0){
								if(lower_bin.charAt(0) == '0'){
									finalstring += '1';
									scale3--;
								}
								else{
									finalstring += '0';
									scale3--;
								}
								
							}
							
							//System.out.println(finalstring);
							
						}
						else{
							
							lower = lower << 1;
							upper = upper << 1;
							upper++;
							
							lower_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(lower)));
							upper_bin = String.format("%08d", Integer.valueOf(Integer.toBinaryString(upper)));
							
							
							
							scale3++;
							
						}
						
						
						
					}
					
					
					
				}
				
	}

}
