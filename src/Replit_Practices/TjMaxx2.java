package Replit_Practices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TjMaxx2 {

    /*
    declare 4 private instance variables for name, catologNumber, quantity, price
    and access them thru getters and set their values thru setters,
     declare one constructor for initializing all instance variables
     */

    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public TjMaxx2(String name, int catalogNumber, int quantity, double price){

        this.catalogNumber = catalogNumber;
        this.name = name;
        this.price = price; this.quantity = quantity;
    }

    public String getName(){

        return name;
    }
    public double getPrice(){

        return price;
    }
    public int getCatalogNumber(){

        return catalogNumber;

    }
    public int getQuantity(){

        return quantity;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setPrice(double price){

        this.price = price;
    }
    public void setCatalogNumber(int catalogNumber){

        this.catalogNumber = catalogNumber;
    }
    public void setQuantity(int quantity){

        this.quantity = quantity;
    }
    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */

    public String toString(){

        return "Regular Item: "+getName()+", catologNumber: "+getCatalogNumber()
                +", quantity: "+getQuantity()+", price: "+getPrice();
    }


}
class OnSaleItems extends TjMaxx2{

        //extends TjMaxx2 class
    // private instance variable, used for discount percentage
    /*
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    private double discount;


    public OnSaleItems(String name, int catalogNumber, int quantity, double price, double discount) {
        super(name, catalogNumber, quantity, price -(discount / 100));
        this.discount = discount;
    }
    //create getter and setter for discount private variable
    public double getDiscount(){

        return discount;
    }
    public void setDiscount(double discount){

        this.discount = discount;
    }
    /*
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */

    public String toString(){

        return "OnSaleItem: discount ="+discount+", name="+getName()+", price="+getPrice();
    }
}
class TJMaxxShop{

    /*
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */

    private ArrayList<TjMaxx2> regularItems;
    private ArrayList<OnSaleItems> onSale;
    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxxShop(){

        regularItems = new ArrayList<>();
        onSale = new ArrayList<>();
    }
    /**
     * adds an item object to regularItems list
     * @param item
     */

    public void addItem(TjMaxx2 item){

        regularItems.add(item);
    }
    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addItemSale(OnSaleItems item){

        onSale.add(item);
    }

    //create getters for lists

    public ArrayList<TjMaxx2> getRegularItems(){

        return regularItems;

    }
    public ArrayList<OnSaleItems> getOnSale(){

        return onSale;
    }
    //return counts of regular and on sale items

    public int regularItemCount(){

        return regularItems.size();
    }
    public int onSaleCount(){

        return onSale.size();
    }
    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public ArrayList<String> getAllItems(){

        ArrayList<String> allItems = new ArrayList<>();

        for(int i = 0; i < regularItems.size(); i++){

            allItems.add(regularItems.get(i).getName());

        }
        for(int j = 0; j < onSale.size(); j++){

            allItems.add(onSale.get(j).getName());
        }

        return allItems;
    }
    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */

    public double getPrice(int catalogNumber){

        for(int i = 0; i < regularItems.size(); i++){

            if(regularItems.get(i).getCatalogNumber() == catalogNumber){

                return regularItems.get(i).getPrice();
            }
        }

        for(int i = 0; i < onSale.size(); i++){

            if(onSale.get(i).getCatalogNumber() == catalogNumber){

                return onSale.get(i).getPrice();
            }
        }

        return 0.0;
    }
    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */

    public OnSaleItems getSaleItem(String name){

        for(int i = 0;i < onSale.size(); i++){

            if(onSale.get(i).getName().equals(name)){

                return onSale.get(i);
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber){

        regularItems.removeIf(p -> p.getCatalogNumber() == catalogNumber);

        Predicate<OnSaleItems> byCatalog = p -> p.getCatalogNumber() == catalogNumber;

        onSale.removeIf(byCatalog);

    }
    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call
     *   removeItem method)
     *
     * @param catalogNumber
     *
     * below method is already completed
     */
    public void buyItem(int catalogNumber){

        for (TjMaxx2 each : regularItems) {

            if (each.getCatalogNumber() == catalogNumber) {

                int q = each.getQuantity()-1;

                if(q == 0) {

                    removeItem(each.getCatalogNumber());

                }else{
                    each.setQuantity(q);
                }
                break;
            }
        }

        for(OnSaleItems each : onSale){

            if(each.getCatalogNumber() == catalogNumber){

                int q = each.getQuantity();

                if(q == 0){

                    removeItem(each.getCatalogNumber());

                }else{

                    each.setQuantity(q);
                }
                break;
            }
        }
    }


}