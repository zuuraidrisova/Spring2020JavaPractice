package WarmUp_Practices;

public class FahrenheitToCelsius {
    public static void main(String []args){
        int Celsius = 35;
        double CelsiusToFahrenheit = Celsius*9/5 +32;
        //35 * 9/5+32
        System.out.println(Celsius +" Celsius degrees will be " +CelsiusToFahrenheit+" Fahrenheit");

        int Fahrenheit = 107;
        double FahrenheitToCelsius = (Fahrenheit - 32) *5/9;
                //(1 °F − 32) × 5/9 = -17,22 °C
        System.out.println(Fahrenheit + " F will be " + FahrenheitToCelsius+ " Celsius");

    }
}
