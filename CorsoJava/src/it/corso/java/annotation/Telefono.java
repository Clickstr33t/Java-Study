package it.corso.java.annotation;

public class Telefono extends Prodotto {

	/* (non-Javadoc)
	 * @see it.corso.java.annotation.Prodotto#calcolaIva(double)
	 */
	@Override
	@Deprecated
	public double calcolaIva(double ivaperc) {
		return super.calcolaIva(ivaperc);
	}
}
