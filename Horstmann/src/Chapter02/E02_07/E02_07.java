package Chapter02.E02_07;

public class E02_07 {
	public static void main(String[] args) {
		String name = "Mississippi";
		System.out.println(name + "diventa "
						+name.replace("i","!")
						.replace("s", "$"));
	}
}
