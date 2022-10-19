import java.util.*;


 class Dcoder{
   public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    int reprobadas = 0;
    
    System.out.print("Español: "); 
    double espanol = in.nextDouble();
    System.out.print("Matemáticas: "); 
    double matematicas = in.nextDouble();
    System.out.print("Historia: ");
    double historia = in.nextDouble();
    System.out.print("Formación Cívica "); 
    double force = in.nextDouble();
    System.out.print("Educación Física: "); 
    double eduf = in.nextDouble();
    System.out.print("Física ");
    double fisica = in.nextDouble();
    
double promedio = (espanol + matematicas + historia + force + eduf + fisica) / 6;
   
    System.out.print("Español: " + espanol); 
    System.out.print("Matemáticas: " + matematicas); 
    System.out.print("Historia: " + historia);
    System.out.print("Formación Cívica: " + force); 
    System.out.print("Educación Física: " + eduf); 
    System.out.print("Física: " + fisica);
    System.out.print("\nPromedio: " + promedio);
    
    if(espanol >= 59.0){
      reprobadas++;
    } 
    if(matematicas >= 59.0){
      reprobadas++;
    } 
    if(historia >= 59.0){
      reprobadas++;
    } 
    if(force >= 59.0){
      reprobadas++;
    } 
    if(eduf >= 59.0){
      reprobadas++;
    } 
    if(fisica >= 59.0){
      reprobadas++;
    } 
    
    if(reprobadas >= 3){
      int respuesta = 0;
      System.out.print("Quedas retenido");
      System.out.print("Quieres meter regularización?: ");
      System.out.print("1.- Sí ");
      System.out.print("2.- No ");
      respuesta = in.nextInt();
      
      if (respuesta == 1){
        System.out.println("Bienvenido a clases de regularización");
      } else if (respuesta == 2){
        System.out.print("Toca repetir");
      } else {
        System.out.print("Función no disponible"); 
      }
      
    }
    }
   
   
 }
