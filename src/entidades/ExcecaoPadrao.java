package entidades;

public class ExcecaoPadrao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcecaoPadrao(String msg) {
		super(msg);
	}
}
