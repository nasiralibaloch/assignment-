
package ASSNT2;

/*
 * @author NASIR ALI BALOCH
 */

public class Car {
    private int car_number;
    private String car_make;
    public Car()                 //CONSTRACTOR NUMBER1
    {
        car_number=1214;
        car_make="N12_FJ Honda civic";
    }
    public Car(int car_number1,String car_make1)     //CONSTRACTOR NUMBER2
    {
        car_number=car_number1;
        car_make=car_make1;
    }
    public void setcar_number(int car_number2)      //SETTER
    {
      car_number=car_number2;        
    }
    public int getcar_number(int car_number7)      //GETTET
    {
        return car_number;
    }
    public void setcar_make(String car_make4)     //SETTER
    {
        car_make=car_make4;
    }
     public String getcar_make(String car_make6)    //GETTER
     {
          return car_make;
     }
    
    public void showCar()                     //FUNCTION SHOW
    {
        System.out.println("car_number is="+car_number);
        System.out.println("car_make is="+car_make);
    }
}
