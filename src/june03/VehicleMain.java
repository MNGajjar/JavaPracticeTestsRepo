package june03;

public class VehicleMain {
    public static void main(String[] args) {

        Honda hondda = new Honda();
        Vehicle honda = new Honda();
        Vehicle hyundai = new Hyundai();
        Vehicle audi = new Audi();
        Honda honda1 = new Hyundai();

        honda1.start();
        honda1.accelerate();
        honda1.run();
        honda1.stop();

        System.out.println("------------------");

        hondda.start();
        hondda.accelerate();
        hondda.run();
        hondda.stop();

        System.out.println("------------------");

        honda.start();
        honda.accelerate();
        honda.run();
        honda.stop();

        System.out.println("------------------");

        hyundai.start();
        hyundai.accelerate();

        System.out.println("------------------");

        audi.start();
        audi.run();
        audi.stop();
    }
}
