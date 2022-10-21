
public class VideoJuego implements Entregable{

 private final static int HORAS_ESTIMADAS_DEF=100;

 public final static int MAYOR=1;

 public final static int MENOR=-1;

 public final static int IGUAL=0;

 private String titulo;

 private int horasEstimadas;

 private boolean entregado;

 private String genero;

 private String compañia;

 public String getTitulo() {
 return titulo;
 }

 public void setTitulo(String titulo) {
 this.titulo = titulo;
 }

 public int getHorasEstimadas() {
 return horasEstimadas;
 }

 public void setHorasEstimadas(int horasEstimadas) {
 this.horasEstimadas = horasEstimadas;
 }

 public String getGenero() {
 return genero;
 }

 public void setGenero(String genero) {
 this.genero = genero;
 }

 public String getcompañia() {
 return compañia;
 }
 
 public void setcompañia(String compañia) {
 this.compañia = compañia;
 }

 @Override
 public void entregar() {
 entregado=true;
 }

 @Override
 public void devolver() {
 entregado=false;
 }

 @Override
 public boolean isEntregado() {
 if(entregado){
 return true;
 }
 return false;
 }

 @Override
 public int compareTo(Object a) {
 int estado=MENOR;

 VideoJuego ref = (VideoJuego)a;
 if (horasEstimadas>ref.getHorasEstimadas()){
 estado=MAYOR;
 }else if(horasEstimadas==ref.getHorasEstimadas()){
 estado=IGUAL;
 }

 return estado;
 }

 @Override
 public String toString(){
 return "Informacion del videojuego: \n" +
 "\tTitulo: "+titulo+"\n" +
 "\tHoras estimadas: "+horasEstimadas+"\n" +
 "\tGenero: "+genero+"\n" +
 "\tcompañia: "+compañia;
 }

 public boolean equals(VideoJuego a){
 
	 if (titulo.equalsIgnoreCase(a.getTitulo()) &&
			 compañia.equalsIgnoreCase(a.getcompañia())){
		 return true;
	 }
 return false;
 }

 public VideoJuego(){
 this("",HORAS_ESTIMADAS_DEF, "", "");
 }

 public VideoJuego(String titulo, String compañia){
 this(titulo,HORAS_ESTIMADAS_DEF, "", compañia);
 }

 public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia){
 this.titulo=titulo;
 this.horasEstimadas=horasEstimadas;
 this.genero=genero;
 this.compañia=compañia;
 this.entregado=false;
 }
} 
 