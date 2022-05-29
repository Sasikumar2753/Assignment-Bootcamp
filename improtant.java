class Selfdefence {
	void fighting() {
		System.out.println("fighting back is the best self defence ");
	}
}
class Aikido extends Selfdefence{
	void means() {
		System.out.println("Aikido is a type of martial arts practice in japan");
	}
}


class improtant {  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Aikido aikido = new Aikido();
	    aikido.fighting();
	    aikido.means();
    }
}