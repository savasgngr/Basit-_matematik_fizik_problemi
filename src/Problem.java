/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAVAS
 */
public class Problem {
    
    public static  class  Matematik{
        
        public static  void Daire_alani(int yaricap){
            System.out.println("Dairenin alanı:"+(Math.PI*yaricap*yaricap));
            
        }
        public static  void Ucgen_cevresi(int kenar1,int kenar2,int kenar3){
            System.out.println("üçgenin çevresi:"+(kenar1+kenar2+kenar3));
            
        }
        
        
    }
    public static  class  Fizik{
        
        public static  void ic_carpım(Vector vector1,Vector vector2){
            
            
            int carpım=vector1.getI()*vector2.getI()+vector1.getJ()*vector2.getJ()+vector1.getK()*vector2.getK();
            
            System.out.println("vektörlerin iç çarpımı:"+carpım);
        }
        
    }
    
    
}
