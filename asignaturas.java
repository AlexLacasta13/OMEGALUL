package ficheros;

public class asignaturas {
	private int codNumerico;
	private int creditos;
	private int trimestre;
	private String tipAsignatura;
	
	public asignaturas(int codNumerico, int creditos, int trimestre, String tipAsignatura) {
		this.codNumerico=codNumerico;
		this.creditos=creditos;
		this.trimestre =trimestre;
		this.tipAsignatura=tipAsignatura;
	}
	
	public int getcodNumerico() {
		return codNumerico;
	}
	
	public void setcodNumerico(int codNumerico) {
		this.codNumerico = codNumerico;
	}
	
	public int getcreditos() {
		return creditos;
	}
	
	public void setcreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public int  gettrimestre() {
		return trimestre;
	}
	
	public void settrimestre(int trimestre) {
		this.trimestre = trimestre;
	}
	public String  gettipAsignatura() {
		return tipAsignatura;
	}
	
	public void settipAsignatura(String tipAsignatura) {
		this.tipAsignatura = tipAsignatura;
	}
	
	

}
