package Replit_Practices;
import java.util.ArrayList;
public class DeliveryCalc {
    public static void main(String[] args) {

       /*

       A pizza delivery men has a scooter an a lot of deliveries to make,
       he will have to refuel a few times.

refuel_times gets an arraylist deliveries of the amount of fuel it will take
to get to destinations like:
[1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...
the max_fuel is the max fuel units in the vehicle fuel tank.
you will need to returns how meany refuels it will take to do all deliveries
(if the units are bigger then the tank he will refuel along the way in a gas station).

for example:

refuel_times([7,7,7],7)
returns:3 (3 fuel stops 7 units each delivery)

refuel_times([9,1],3)
returns:4 (3 fuel stops for first delivery and +1 stop for second)

refuel_times([100,200,10],10)
returns:31


first find the sum of all data in the array list,
and then find the sum remainder of Max_fuel,
        */


        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5

    }
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {

        int sum = 0;

        for(int i = 0; i < deliveries.size(); i++){

            sum += deliveries.get(i);
        }


        int total = max_fuel % sum;

        return total;
    }
}
