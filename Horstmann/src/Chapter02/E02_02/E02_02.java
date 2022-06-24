package Chapter02.E02_02;

public class E02_02 {
	public static void main(String[] args) {
		String name = new String("   Test     rimozione    degli    spazi     !!!");
		System.out.println(name);	
		System.out.println(name.trim());
		System.out.println(name.replace(" ", ""));
		
	}
}
