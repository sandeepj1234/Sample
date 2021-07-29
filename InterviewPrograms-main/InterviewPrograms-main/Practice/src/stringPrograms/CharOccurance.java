package stringPrograms;

public class CharOccurance {

	public static void main(String[] args) {
		String s = "My name is vikas reddy";
		s=s.toLowerCase();
		for(int i = 0;i<=s.length()-1;i++) {
			int count =0;
			for(int j = 0;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)&& i>j) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					s = s.replaceAll("\\s+", "");
					count++;
				}	
			}
			if(count>0)
				System.out.println(s.charAt(i)+" Occurance "+ count);
		}

	}

}
