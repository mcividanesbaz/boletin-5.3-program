
package boletin5.pkg3;


public class Circulo {
    private double radio;
    private static double PI=3.14;
   //constructores
    
    public Circulo(){              //sin parametros 
    }
    public Circulo(double radio){  //con parametros
       this.radio = radio;   
     }
   //metodos
 /**
  *    public void setRadio(double radio){
        this.radio=radio;
    }
  * @return 
  */
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        double area = (Math.pow(radio,2))*PI;
        return area;
    }
    public double calcularLonxitude(){      
       double longitud= radio*2*PI;
        return longitud;  
    }
    
    
    }
    