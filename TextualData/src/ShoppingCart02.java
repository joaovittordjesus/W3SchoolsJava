public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Joao";
        String itemDesc = "Earphones";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 23;
        double tax = 00.1 ;
        double quantity = 1;
       
        // Declare and assign a calculated totalPrice
       double totalPrice = ((tax * price) + price) * quantity;
        
        // Modify message to include quantity 
        message = custName + " wans to purchase " + quantity + " " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("Total cost: "+ totalPrice);
    }    
}
