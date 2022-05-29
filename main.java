class defence{
	void fighting() {
	  System.out.println("Fighting back is the best self defence");
	}
}
class Martialarts extends defence{
	void usedas() {
		 System.out.println("Martial arts has many technics but we want to use that for a defence and for any unwanted voilence ");
	}
	
}
class Muaythai extends Martialarts{
	void means() {
		System.out.println("Muay thai is a type of martial arts in thailand");
	}
}


class main {
     public static void main(String[] args) {		
    	 Muaythai muaythai = new Muaythai();
    	 muaythai.fighting();
    	 muaythai.usedas();
    	 muaythai.means();
	}
}