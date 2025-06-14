package practiceEx.encapsulationPrac2;

public class TemperatureConverter {

    private double celcius;

    public void setCelcius(double celcius) {
        if(celcius > 0){
            this.celcius = celcius;
        }else {
            System.out.println("Temperature cannot be set below Zero degree.!");
        }
    }

    public double cToF(){
        if(celcius > 0){
           return (this.celcius*9/5)+32;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "TemperatureConverter {" +
                "Temperature in C is :" + celcius + '\'' +
                "Temperature in F is: '" + cToF() +
                '}';
    }
}
