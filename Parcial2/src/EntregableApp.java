public class EntregableApp {

 public static void main(String[] args) {

 Serie listaSeries[]=new Serie[5];
 VideoJuego listaVideoJuegos[]=new VideoJuego[5];

 listaSeries[0]=new Serie();
 listaSeries[1]=new Serie("Los simpson", "Humor");
 listaSeries[2]=new Serie("Stranger Things", "Thiller");
 listaSeries[3]=new Serie("The walking dead", "Humor");
 listaSeries[4]=new Serie("Breaking Bad", "Thriller");

 listaVideoJuegos[0]=new VideoJuego();
 listaVideoJuegos[1]=new VideoJuego("Crash", "Aventura");
 listaVideoJuegos[2]=new VideoJuego("God of war", "Santa Monica");
 listaVideoJuegos[3]=new VideoJuego("Black ops 2", "Accion");
 listaVideoJuegos[4]=new VideoJuego("Residen evil 7", "Suspenso");

 listaSeries[1].entregar();
 listaSeries[4].entregar();
 listaVideoJuegos[0].entregar();
 listaVideoJuegos[3].entregar();

 int entregados=0;

 for(int i=0;i<listaSeries.length;i++){
 if(listaSeries[i].isEntregado()){
 entregados+=1;
 listaSeries[i].devolver();

 }
 if(listaVideoJuegos[i].isEntregado()){
 entregados+=1;
 listaVideoJuegos[i].devolver();
 }
 }
 System.out.println("Hay "+entregados+" articulos entregados");

 Serie serieMayor=listaSeries[0];
 VideoJuego videojuegoMayor=listaVideoJuegos[0];

 for(int i=1;i<listaSeries.length;i++){
 if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
 serieMayor=listaSeries[i];
 }
 if(listaVideoJuegos[i].compareTo(videojuegoMayor)==VideoJuego.MAYOR)
{
 videojuegoMayor=listaVideoJuegos[i];
 }

 }

 System.out.println(videojuegoMayor);
 System.out.println(serieMayor);
 }

}
