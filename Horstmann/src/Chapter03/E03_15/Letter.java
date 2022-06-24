package Chapter03.E03_15;

public class Letter {
	private String start = "Dear ";
	private String middle = "";
	private String end = "\n\nSincerly,\n\n";
	
	public Letter(String destinatario, String mittente) {
		start = start.concat(destinatario).concat(":\n\n");
		end = end.concat(mittente);
	}
	
	public void addLine(String Text) {
		middle = middle.concat(Text).concat("\n");
	}
	
	public String getText() {
		return start.concat(middle).concat(end);
	}
	

}
