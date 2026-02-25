class McDonalds {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName == "McAloo Tikki Burger") {
            price = 59.00;
            return price;
        } else if(itemName == "McChicken Burger") {
            price = 138.00;
            return price;
        } else if(itemName == "Chicken Maharaja Mac") {
            price = 241.00;
            return price;
        } else if(itemName == "McSpicy Chicken Burger") {
            price = 171.00;
            return price;
        } else if(itemName == "Filet O Fish") {
            price = 138.00;
            return price;
        } else if(itemName == "Veg Maharaja Mac") {
            price = 226.00;
            return price;
        } else if(itemName == "McSpicy Paneer") {
            price = 165.00;
            return price;
        } else if(itemName == "McEgg Burger") {
            price = 62.00;
            return price;
        } else if(itemName == "Masala McEgg") {
            price = 67.00;
            return price;
        } else if(itemName == "Big Spicy Chicken Wrap") {
            price = 166.00;
            return price;
        } else if(itemName == "McAloo Tikki Meal") {
            price = 177.00;
            return price;
        } else if(itemName == "McChicken Meal") {
            price = 244.00;
            return price;
        } else if(itemName == "Chicken Maharaja Mac Meal") {
            price = 307.00;
            return price;
        } else if(itemName == "McSpicy Chicken Meal") {
            price = 292.00;
            return price;
        } else if(itemName == "Veg Maharaja Mac Meal") {
            price = 296.00;
            return price;
        } else if(itemName == "McFlurry Oreo") {
            price = 192.00;
            return price;
        } else if(itemName == "Apple Pie") {
            price = 69.00;
            return price;
        } else if(itemName == "Hot Chocolate") {
            price = 85.00;
            return price;
        } else if(itemName == "McFlurry Chocolate") {
            price = 192.00;
            return price;
        } else if(itemName == "McNuggets 6 pcs") {
            price = 199.00;
            return price;
        } else if(itemName == "McNuggets 9 pcs") {
            price = 289.00;
            return price;
        } else if(itemName == "French Fries Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "French Fries Large") {
            price = 88.00;
            return price;
        } else if(itemName == "Coke Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "Pepsi Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "Sprite Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "Fanta Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "Thums Up Medium") {
            price = 71.00;
            return price;
        } else if(itemName == "Hash Brown") {
            price = 45.00;
            return price;
        } else if(itemName == "Sausage McMuffin") {
            price = 157.00;
            return price;
        } else if(itemName == "Egg McMuffin") {
            price = 124.00;
            return price;
        } else if(itemName == "McCafe Coffee") {
            price = 75.00;
            return price;
        } else if(itemName == "Cold Coffee") {
            price = 95.00;
            return price;
        } else if(itemName == "McShake Vanilla") {
            price = 129.00;
            return price;
        } else if(itemName == "McShake Chocolate") {
            price = 129.00;
            return price;
        } else if(itemName == "McShake Strawberry") {
            price = 129.00;
            return price;
        } else if(itemName == "American Cheese Supreme Veg") {
            price = 239.00;
            return price;
        } else if(itemName == "American Cheese Supreme Chicken") {
            price = 244.00;
            return price;
        } else if(itemName == "Mexican McAloo Tikki") {
            price = 59.00;
            return price;
        } else if(itemName == "McVeggie") {
            price = 219.00;
            return price;
        } else if(itemName == "McVeggie Delight") {
            price = 185.00;
            return price;
        } else if(itemName == "Chatpata Naan Kebab") {
            price = 76.00;
            return price;
        } else if(itemName == "Chatpata Naan Aloo") {
            price = 61.00;
            return price;
        } else if(itemName == "McSaver McChicken") {
            price = 149.00;
            return price;
        } else if(itemName == "McSaver McSpicy Paneer") {
            price = 175.00;
            return price;
        } else if(itemName == "McDouble Cheeseburger") {
            price = 129.00;
            return price;
        } else if(itemName == "Quarter Pounder") {
            price = 195.00;
            return price;
        } else if(itemName == "Crispy Chicken Wrap") {
            price = 139.00;
            return price;
        } else if(itemName == "Cheesy Mayo Burger") {
            price = 89.00;
            return price;
        } else if(itemName == "McPollo Tenders") {
            price = 159.00;
            return price;
        } else if(itemName == "Corn Cup") {
            price = 49.00;
            return price;
        } else if(itemName == "Masala Fries") {
            price = 79.00;
            return price;
        } else if(itemName == "Cheesy Fries") {
            price = 99.00;
            return price;
        } else if(itemName == "Pineapple Upside Down") {
            price = 152.00;
            return price;
        } else {
            System.out.println("The searched item is not found");
        }
        return price;
    }
		public static double search(String foodItem, int quantity) {
    if(foodItem.equals("McAloo Tikki Burger")) {
        return 59.00 * quantity;
    } else if(foodItem.equals("McChicken Burger")) {
        return 138.00 * quantity;
    } else if(foodItem.equals("Chicken Maharaja Mac")) {
        return 241.00 * quantity;
    } else if(foodItem.equals("McSpicy Chicken Burger")) {
        return 171.00 * quantity;
    } else if(foodItem.equals("Filet O Fish")) {
        return 138.00 * quantity;
    } else if(foodItem.equals("Veg Maharaja Mac")) {
        return 226.00 * quantity;
    } else if(foodItem.equals("McSpicy Paneer")) {
        return 165.00 * quantity;
    } else if(foodItem.equals("McEgg Burger")) {
        return 62.00 * quantity;
    } else if(foodItem.equals("Masala McEgg")) {
        return 67.00 * quantity;
    } else if(foodItem.equals("Big Spicy Chicken Wrap")) {
        return 166.00 * quantity;
    } else if(foodItem.equals("McAloo Tikki Meal")) {
        return 177.00 * quantity;
    } else if(foodItem.equals("McChicken Meal")) {
        return 244.00 * quantity;
    } else if(foodItem.equals("Chicken Maharaja Mac Meal")) {
        return 307.00 * quantity;
    } else if(foodItem.equals("McSpicy Chicken Meal")) {
        return 292.00 * quantity;
    } else if(foodItem.equals("Veg Maharaja Mac Meal")) {
        return 296.00 * quantity;
    } else if(foodItem.equals("McFlurry Oreo")) {
        return 192.00 * quantity;
    } else if(foodItem.equals("Apple Pie")) {
        return 69.00 * quantity;
    } else if(foodItem.equals("Hot Chocolate")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("McFlurry Chocolate")) {
        return 192.00 * quantity;
    } else if(foodItem.equals("McNuggets 6 pcs")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("McNuggets 9 pcs")) {
        return 289.00 * quantity;
    } else if(foodItem.equals("French Fries Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("French Fries Large")) {
        return 88.00 * quantity;
    } else if(foodItem.equals("Coke Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("Pepsi Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("Sprite Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("Fanta Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("Thums Up Medium")) {
        return 71.00 * quantity;
    } else if(foodItem.equals("Hash Brown")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Sausage McMuffin")) {
        return 157.00 * quantity;
    } else if(foodItem.equals("Egg McMuffin")) {
        return 124.00 * quantity;
    } else if(foodItem.equals("McCafe Coffee")) {
        return 75.00 * quantity;
    } else if(foodItem.equals("Cold Coffee")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("McShake Vanilla")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("McShake Chocolate")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("McShake Strawberry")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("American Cheese Supreme Veg")) {
        return 239.00 * quantity;
    } else if(foodItem.equals("American Cheese Supreme Chicken")) {
        return 244.00 * quantity;
    } else if(foodItem.equals("Mexican McAloo Tikki")) {
        return 59.00 * quantity;
    } else if(foodItem.equals("McVeggie")) {
        return 219.00 * quantity;
    } else if(foodItem.equals("McVeggie Delight")) {
        return 185.00 * quantity;
    } else if(foodItem.equals("Chatpata Naan Kebab")) {
        return 76.00 * quantity;
    } else if(foodItem.equals("Chatpata Naan Aloo")) {
        return 61.00 * quantity;
    } else if(foodItem.equals("McSaver McChicken")) {
        return 149.00 * quantity;
    } else if(foodItem.equals("McSaver McSpicy Paneer")) {
        return 175.00 * quantity;
    } else if(foodItem.equals("McDouble Cheeseburger")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Quarter Pounder")) {
        return 195.00 * quantity;
    } else if(foodItem.equals("Crispy Chicken Wrap")) {
        return 139.00 * quantity;
    } else if(foodItem.equals("Cheesy Mayo Burger")) {
        return 89.00 * quantity;
    } else if(foodItem.equals("McPollo Tenders")) {
        return 159.00 * quantity;
    } else if(foodItem.equals("Corn Cup")) {
        return 49.00 * quantity;
    } else if(foodItem.equals("Masala Fries")) {
        return 79.00 * quantity;
    } else if(foodItem.equals("Cheesy Fries")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Pineapple Upside Down")) {
        return 152.00 * quantity;
    } else {
        System.out.println("The searched item is not found");
        return 0.0;
    }
}

}
