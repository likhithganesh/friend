package interview_problums;

public class remove_speclchars {
	public static void main(String[] args) {
		String name ="2343$@#!#abdfdf";
	 name=	name.replaceAll("[^a-zaA-Z0-9]", "");
		
		System.out.println(name);
	}

}
