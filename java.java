class Karate {
    void fighting() {
		System.out.println("fighting back is the best self defence ");
	}
}
class Kyokushin_karate extends  Karate {
	void means() {
		System.out.println("kyokushin karate is a type of strongest type practice in japan");
	}
}
class Shotokan_Karate extends Karate{
	void about() {
		System.out.println("shotokan karate is the famous karate in the world");
	}
}

class java{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Kyokushin_karate karate = new Kyokushin_karate();
	    Shotokan_Karate shotokan= new Shotokan_Karate();
	    shotokan.about();
	    shotokan.fighting();
	    karate.fighting();
	    karate.means();
    }
}
	