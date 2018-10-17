public class Egg2 {

	public static void main(String[] args) {
		writeEggTop();
		writeEggBottom();
		System.out.println();
		writeEggMid();
		System.out.println();
		writeEggTop();
		writeEggBottom();
		System.out.println();
		writeEggMid();
		writeEggBottom();
		System.out.println();
		writeEggTop();
		writeEggMid();
		writeEggBottom();
	}
	
	public static void writeEggTop() {
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}	
	public static void writeEggBottom() {
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}
	public static void writeEggMid() {
		System.out.println("-\"-'-\"-'-\"-");
	}


}
