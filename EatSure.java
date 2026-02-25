class EatSure {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName == "Behrouz Biryani Chicken") {
            price = 299.00;
            return price;
        } else if(itemName == "Behrouz Biryani Mutton") {
            price = 399.00;
            return price;
        } else if(itemName == "Faasos Chicken Wrap") {
            price = 179.00;
            return price;
        } else if(itemName == "Faasos Paneer Wrap") {
            price = 169.00;
            return price;
        } else if(itemName == "Oven Story Margherita") {
            price = 249.00;
            return price;
        } else if(itemName == "Oven Story Chicken") {
            price = 349.00;
            return price;
        } else if(itemName == "Wendys Classic Burger") {
            price = 199.00;
            return price;
        } else if(itemName == "Wendys Crispy Chicken") {
            price = 219.00;
            return price;
        } else if(itemName == "Mad Over Donuts Choco") {
            price = 89.00;
            return price;
        } else if(itemName == "Mad Over Donuts Vanilla") {
            price = 89.00;
            return price;
        } else if(itemName == "SLAY Coffee Cold Brew") {
            price = 129.00;
            return price;
        } else if(itemName == "SLAY Coffee Cappuccino") {
            price = 149.00;
            return price;
        } else if(itemName == "Sweet Truth Red Velvet") {
            price = 199.00;
            return price;
        } else if(itemName == "Firangi Bake Pasta") {
            price = 225.00;
            return price;
        } else if(itemName == "Lunchbox Chicken Bowl") {
            price = 195.00;
            return price;
        } else if(itemName == "Good Bowl Dal Makhani") {
            price = 185.00;
            return price;
        } else if(itemName == "Biryani Life Chicken") {
            price = 279.00;
            return price;
        } else if(itemName == "Zomoz Chicken Momos") {
            price = 159.00;
            return price;
        } else if(itemName == "Baskin Robbins Vanilla") {
            price = 199.00;
            return price;
        } else if(itemName == "Kwality Walls Cornetto") {
            price = 79.00;
            return price;
        } else if(itemName == "Prasuma Chicken Momos") {
            price = 175.00;
            return price;
        } else if(itemName == "Naturals Ice Cream") {
            price = 189.00;
            return price;
        } else if(itemName == "Anand Sweets Gulab Jamun") {
            price = 99.00;
            return price;
        } else if(itemName == "Raaz-e-Kalimirch Biryani") {
            price = 325.00;
            return price;
        } else if(itemName == "Dum Gosht Biryani") {
            price = 389.00;
            return price;
        } else if(itemName == "Lazeez Bhuna Murgh") {
            price = 265.00;
            return price;
        } else if(itemName == "Zaikedaar Paneer Biryani") {
            price = 255.00;
            return price;
        } else if(itemName == "Angara Kebabs") {
            price = 229.00;
            return price;
        } else if(itemName == "Chicken Tikka Kathi") {
            price = 189.00;
            return price;
        } else if(itemName == "Go Zero Low Cal Pizza") {
            price = 299.00;
            return price;
        } else if(itemName == "Marrakesh Chicken") {
            price = 339.00;
            return price;
        } else if(itemName == "Red Velvet Cake Slice") {
            price = 125.00;
            return price;
        } else if(itemName == "Chocolate Lava Cake") {
            price = 139.00;
            return price;
        } else if(itemName == "Butter Chicken Bowl") {
            price = 245.00;
            return price;
        } else if(itemName == "Paneer Tikka Roll") {
            price = 195.00;
            return price;
        } else if(itemName == "Veg Hakka Noodles") {
            price = 145.00;
            return price;
        } else if(itemName == "Chicken Fried Rice") {
            price = 215.00;
            return price;
        } else if(itemName == "Schezwan Momos") {
            price = 169.00;
            return price;
        } else if(itemName == "Peri Peri Fries") {
            price = 99.00;
            return price;
        } else if(itemName == "Cheesy Garlic Bread") {
            price = 129.00;
            return price;
        } else if(itemName == "Pepsi 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Coke 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Sprite 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "7UP 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Mountain Dew 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Cold Coffee Shake") {
            price = 135.00;
            return price;
        } else if(itemName == "Mango Milkshake") {
            price = 145.00;
            return price;
        } else if(itemName == "Chocolate Shake") {
            price = 145.00;
            return price;
        } else if(itemName == "Lassi Sweet") {
            price = 65.00;
            return price;
        } else {
            System.out.println("The searched item is not found");
        }
        return price;
    }
	public static double search(String foodItem, int quantity) {
    if(foodItem.equals("Behrouz Biryani Chicken")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Behrouz Biryani Mutton")) {
        return 399.00 * quantity;
    } else if(foodItem.equals("Faasos Chicken Wrap")) {
        return 179.00 * quantity;
    } else if(foodItem.equals("Faasos Paneer Wrap")) {
        return 169.00 * quantity;
    } else if(foodItem.equals("Oven Story Margherita")) {
        return 249.00 * quantity;
    } else if(foodItem.equals("Oven Story Chicken")) {
        return 349.00 * quantity;
    } else if(foodItem.equals("Wendys Classic Burger")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("Wendys Crispy Chicken")) {
        return 219.00 * quantity;
    } else if(foodItem.equals("Mad Over Donuts Choco")) {
        return 89.00 * quantity;
    } else if(foodItem.equals("Mad Over Donuts Vanilla")) {
        return 89.00 * quantity;
    } else if(foodItem.equals("SLAY Coffee Cold Brew")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("SLAY Coffee Cappuccino")) {
        return 149.00 * quantity;
    } else if(foodItem.equals("Sweet Truth Red Velvet")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("Firangi Bake Pasta")) {
        return 225.00 * quantity;
    } else if(foodItem.equals("Lunchbox Chicken Bowl")) {
        return 195.00 * quantity;
    } else if(foodItem.equals("Good Bowl Dal Makhani")) {
        return 185.00 * quantity;
    } else if(foodItem.equals("Biryani Life Chicken")) {
        return 279.00 * quantity;
    } else if(foodItem.equals("Zomoz Chicken Momos")) {
        return 159.00 * quantity;
    } else if(foodItem.equals("Baskin Robbins Vanilla")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("Kwality Walls Cornetto")) {
        return 79.00 * quantity;
    } else if(foodItem.equals("Prasuma Chicken Momos")) {
        return 175.00 * quantity;
    } else if(foodItem.equals("Naturals Ice Cream")) {
        return 189.00 * quantity;
    } else if(foodItem.equals("Anand Sweets Gulab Jamun")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Raaz-e-Kalimirch Biryani")) {
        return 325.00 * quantity;
    } else if(foodItem.equals("Dum Gosht Biryani")) {
        return 389.00 * quantity;
    } else if(foodItem.equals("Lazeez Bhuna Murgh")) {
        return 265.00 * quantity;
    } else if(foodItem.equals("Zaikedaar Paneer Biryani")) {
        return 255.00 * quantity;
    } else if(foodItem.equals("Angara Kebabs")) {
        return 229.00 * quantity;
    } else if(foodItem.equals("Chicken Tikka Kathi")) {
        return 189.00 * quantity;
    } else if(foodItem.equals("Go Zero Low Cal Pizza")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Marrakesh Chicken")) {
        return 339.00 * quantity;
    } else if(foodItem.equals("Red Velvet Cake Slice")) {
        return 125.00 * quantity;
    } else if(foodItem.equals("Chocolate Lava Cake")) {
        return 139.00 * quantity;
    } else if(foodItem.equals("Butter Chicken Bowl")) {
        return 245.00 * quantity;
    } else if(foodItem.equals("Paneer Tikka Roll")) {
        return 195.00 * quantity;
    } else if(foodItem.equals("Veg Hakka Noodles")) {
        return 145.00 * quantity;
    } else if(foodItem.equals("Chicken Fried Rice")) {
        return 215.00 * quantity;
    } else if(foodItem.equals("Schezwan Momos")) {
        return 169.00 * quantity;
    } else if(foodItem.equals("Peri Peri Fries")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Cheesy Garlic Bread")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Pepsi 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Coke 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Sprite 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("7UP 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Mountain Dew 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Cold Coffee Shake")) {
        return 135.00 * quantity;
    } else if(foodItem.equals("Mango Milkshake")) {
        return 145.00 * quantity;
    } else if(foodItem.equals("Chocolate Shake")) {
        return 145.00 * quantity;
    } else if(foodItem.equals("Lassi Sweet")) {
        return 65.00 * quantity;
    } else {
        System.out.println("The searched item is not found");
        return 0.0;
    }
}

}
