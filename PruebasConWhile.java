
/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
  public void multiplosde5(){
      int index = 10;
      
      while (index <= 95){
         System.out.println(index);
         index= index +5;
        }
      
      
    }
  public void sumaEntre1y10(){
      int indice=2;
      int resultado =0;
      while (indice <10){
          resultado = resultado + indice;
          indice++;
        }
        System.out.println(resultado);
    }
    public int sum(int primernum , int segunnum){
        int index = primernum +1;
        int resultado =0;
        while (index < segunnum){
            resultado = resultado + index;
            index++;
            
        }
        return resultado;
    }
    
    
    
    public boolean isPrime(int n){
        boolean primo = true;
        int cont =2;
        while ( cont < n && primo){
            
            int resultado = n % cont;
            if ( resultado == 0){
                primo=false;
                
                
            }else{
                primo = true;
                
            }
            cont++;
        }
        
       
        return primo;
    }
    
    
    
}
