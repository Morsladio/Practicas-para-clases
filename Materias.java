import java.util.*;


 public class Materias{
   public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    int reprobadas = 0;
    
    System.out.print("Idioma: "); 
    double espanol = in.nextDouble();
    System.out.print("Matematicas: "); 
    double matematicas = in.nextDouble();
    System.out.print("Historia: ");
    double historia = in.nextDouble();
    System.out.print("Formacion Civica: "); 
    double force = in.nextDouble();
    System.out.print("Educacion Fisica: "); 
    double eduf = in.nextDouble();
    System.out.print("Fisica: ");
    double fisica = in.nextDouble();
    System.out.print("Quimica: ");
    double qui = in.nextDouble();
    
double promedio = (espanol + matematicas + historia + force + eduf + fisica + qui) / 7;
   
    System.out.println("\nReporte de Calificacion"); 
    System.out.println("-------------------------"); 
    System.out.println("Idioma: " + espanol); 
    System.out.println("Matematicas: " + matematicas); 
    System.out.println("Historia: " + historia);
    System.out.println("Formacion Civica: " + force); 
    System.out.println("Educacion Fisica: " + eduf); 
    System.out.println("Fisica: " + fisica);
     System.out.println("Quimica: " + qui);
    System.out.println("-------------------------"); 
    System.out.println("\n|Promedio: " + promedio);
    System.out.println("-------------------------");
    
    if(espanol <= 59.0){
      reprobadas = reprobadas+1;
    } 
    if(matematicas <= 59.0){
    reprobadas = reprobadas+1; 
    } 
    if(historia <= 59.0){
      reprobadas = reprobadas+1;
    } 
    if(force <= 59.0){
      reprobadas = reprobadas+1;
    } 
    if(eduf <= 59.0){
      reprobadas = reprobadas+1;
    } 
    if(fisica <= 59.0){
      reprobadas = reprobadas + 1;
    } 
    if(qui <= 59.0){
      reprobadas = reprobadas + 1;
    } 
    
    if(reprobadas >= 3){
      int respuesta = 0;
      System.out.println("Quedas retenido");
      System.out.println("Quieres meter regularizacion?: ");
      System.out.println("1.- Si ");
      System.out.println("2.- No ");
      respuesta = in.nextInt();
      
      if (respuesta == 1){
        System.out.println("Bienvenido a clases de regularizacion");
      } else if (respuesta == 2){
        System.out.print("Toca repetir");
      } else {
        System.out.print("Funcion no disponible"); 
      } 
      
    } else {
        System.out.print("Has aprobado!");
      }
    }
   
   
 }
