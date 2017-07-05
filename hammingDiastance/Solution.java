package hammingDiastance;

public class Solution {
	 public int hammingDistance(int x, int y) {
		 String binx = Long.toBinaryString( Integer.toUnsignedLong(x) | 0x100000000L ).substring(1); 
		 String biny = Long.toBinaryString( Integer.toUnsignedLong(y) | 0x100000000L ).substring(1);
		 int m=0;
		 int i; 
		 for(i=0;i<binx.length();i++){
			 if(binx.charAt(i) != biny.charAt(i)){
				 m++;
			 }
		 }
		 return m;
	 }
}