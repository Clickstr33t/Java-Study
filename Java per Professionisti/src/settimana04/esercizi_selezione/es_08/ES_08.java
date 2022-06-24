package settimana04.esercizi_selezione.es_08;

public class ES_08 {
	public static void main(String[] args) {
		int v = Integer.parseInt(args[0]);
		String voto = "";
		
		switch (v) {
		case 0:	 case 1:  case 2:	case 3:	 case 4:  case 5:
		case 6:	 case 7:  case 8:	case 9:	 case 10: case 11:
		case 12: case 13: case 14:	case 15: case 16: case 17:			
		voto="Insufficiente";
		break;
		
		case 18: case 19: case 20:
		voto="Sufficiente";
		break;	
		
		case 21: case 22: case 23:
		voto="Buono";
		break;	
		
		case 24: case 25: case 26:
		voto="Distinto";
		break;	
		
		case 27: case 28: case 29:
		voto="Ottimo";
		break;	
		
		case 30: 
		voto="Eccellente";
		break;
		
		default:
		voto="Inserisci un voto valido";
		break;
		}
		System.out.println(voto);
		
		
/*		
		if (v<18) {
			voto="Insufficiente";
		}else if(v>=18 & v<21) {
			voto="Sufficiente";
		}else if(v>=21 & v<24) {
			voto="Buono";
		}else if(v>=24 & v<27) {
			voto="Distinto";
		}else if(v>=27 & v<=29) {
			voto="Ottimo";		
		}else if(v>29) {
			voto="Eccellente";
		}
		System.out.println(voto);
*/		
		
	}
}
