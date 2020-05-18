package Replit_Practices;

public class ProfitLoss {
    public static void main(String[] args) {
        /*
        c_profits gets the buyPrice(int) and sellPrice(int) and determines
        if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
         */

       String result =  c_profits(100,100);
        System.out.println(result);

    }
    public static String c_profits (int buyPrice,int sellPrice) {
        //your code here
        int profit = sellPrice - buyPrice;
        String result = "";

        if(profit == 0){

            result = "no loss";

        }else if (profit > 0){

            result = "profit";

        }else if(profit < 0){

            result = "loss";

        }
        return result;
    }
}
