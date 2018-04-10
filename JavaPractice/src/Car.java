class Vehicle {}

public class Car extends Vehicle {
    public static void main(String args[]){
        Car c1 = new Car();

        Vehicle v2 = new Car();    // v2 �� Car ����
        Vehicle v3 = new Vehicle();

        //Car �� Vehicle����, Vehicle ���� Car ����
        boolean result1 =  c1 instanceof Vehicle;    // true
        boolean result5 =  c1 instanceof Car; 
        boolean result2 =  v2 instanceof Car;        // true
        boolean result3 =  v2 instanceof Vehicle;    // true
        boolean result4 =  v3 instanceof Car;          // false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
   }
}