class Swiggy {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName == "Mutton Biryani") {
            price = 320.00;
            return price;
        } else if(itemName == "Egg Biryani") {
            price = 160.00;
            return price;
        } else if(itemName == "Fish Fry") {
            price = 280.00;
            return price;
        } else if(itemName == "Prawn Masala") {
            price = 450.00;
            return price;
        } else if(itemName == "Aloo Gobi") {
            price = 140.00;
            return price;
        } else if(itemName == "Dal Tadka") {
            price = 130.00;
            return price;
        } else if(itemName == "Rajma") {
            price = 150.00;
            return price;
        } else if(itemName == "Chicken Hakka Noodles") {
            price = 190.00;
            return price;
        } else if(itemName == "Chilli Chicken") {
            price = 270.00;
            return price;
        } else if(itemName == "Coke") {
            price = 45.00;
            return price;
        } else if(itemName == "Pepsi") {
            price = 45.00;
            return price;
        } else if(itemName == "Sprite") {
            price = 45.00;
            return price;
        } else if(itemName == "Mountain Dew") {
            price = 45.00;
            return price;
        } else if(itemName == "Thums Up") {
            price = 45.00;
            return price;
        } else if(itemName == "7UP") {
            price = 45.00;
            return price;
        } else if(itemName == "Cold Coffee") {
            price = 85.00;
            return price;
        } else if(itemName == "Hot Coffee") {
            price = 75.00;
            return price;
        } else if(itemName == "Cappuccino") {
            price = 110.00;
            return price;
        } else if(itemName == "Espresso") {
            price = 90.00;
            return price;
        } else if(itemName == "Latte") {
            price = 120.00;
            return price;
        } else if(itemName == "Masala Tea") {
            price = 35.00;
            return price;
        } else if(itemName == "Green Tea") {
            price = 50.00;
            return price;
        } else if(itemName == "Lassi") {
            price = 60.00;
            return price;
        } else if(itemName == "Mango Shake") {
            price = 90.00;
            return price;
        } else if(itemName == "Chocolate Shake") {
            price = 95.00;
            return price;
        } else if(itemName == "Puri Bhaji") {
            price = 110.00;
            return price;
        } else if(itemName == "Idli Sambar") {
            price = 70.00;
            return price;
        } else if(itemName == "Uttapam") {
            price = 95.00;
            return price;
        } else if(itemName == "Poori") {
            price = 80.00;
            return price;
        } else if(itemName == "Appam") {
            price = 90.00;
            return price;
        } else if(itemName == "Chicken Kebab") {
            price = 240.00;
            return price;
        } else if(itemName == "Seekh Kebab") {
            price = 220.00;
            return price;
        } else if(itemName == "Mutton Curry") {
            price = 310.00;
            return price;
        } else if(itemName == "Fish Curry") {
            price = 290.00;
            return price;
        } else if(itemName == "Veg Spring Roll") {
            price = 120.00;
            return price;
        } else if(itemName == "Chicken Momos") {
            price = 160.00;
            return price;
        } else if(itemName == "Veg Momos") {
            price = 130.00;
            return price;
        } else if(itemName == "Fried Momos") {
            price = 170.00;
            return price;
        } else if(itemName == "Sandwich") {
            price = 110.00;
            return price;
        } else if(itemName == "French Fries") {
            price = 85.00;
            return price;
        } else if(itemName == "Onion Rings") {
            price = 90.00;
            return price;
        } else if(itemName == "Cheesecake") {
            price = 140.00;
            return price;
        } else if(itemName == "Brownie") {
            price = 110.00;
            return price;
        } else if(itemName == "Tiramisu") {
            price = 160.00;
            return price;
        } else if(itemName == "Pasta") {
            price = 200.00;
            return price;
        } else if(itemName == "Chicken Pasta") {
            price = 240.00;
            return price;
        } else if(itemName == "Maggi") {
            price = 65.00;
            return price;
        } else {
            System.out.println("The searched item is not found");
        }
        return price;
    }
	public static double search(String foodItem, int quantity) {
    if(foodItem.equals("Mutton Biryani")) {
        return 320.00 * quantity;
    } else if(foodItem.equals("Egg Biryani")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Fish Fry")) {
        return 280.00 * quantity;
    } else if(foodItem.equals("Prawn Masala")) {
        return 450.00 * quantity;
    } else if(foodItem.equals("Aloo Gobi")) {
        return 140.00 * quantity;
    } else if(foodItem.equals("Dal Tadka")) {
        return 130.00 * quantity;
    } else if(foodItem.equals("Rajma")) {
        return 150.00 * quantity;
    } else if(foodItem.equals("Chicken Hakka Noodles")) {
        return 190.00 * quantity;
    } else if(foodItem.equals("Chilli Chicken")) {
        return 270.00 * quantity;
    } else if(foodItem.equals("Coke")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Pepsi")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Sprite")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Mountain Dew")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Thums Up")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("7UP")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Cold Coffee")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Hot Coffee")) {
        return 75.00 * quantity;
    } else if(foodItem.equals("Cappuccino")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Espresso")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Latte")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Masala Tea")) {
        return 35.00 * quantity;
    } else if(foodItem.equals("Green Tea")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Lassi")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Mango Shake")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Chocolate Shake")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Puri Bhaji")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Idli Sambar")) {
        return 70.00 * quantity;
    } else if(foodItem.equals("Uttapam")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Poori")) {
        return 80.00 * quantity;
    } else if(foodItem.equals("Appam")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Chicken Kebab")) {
        return 240.00 * quantity;
    } else if(foodItem.equals("Seekh Kebab")) {
        return 220.00 * quantity;
    } else if(foodItem.equals("Mutton Curry")) {
        return 310.00 * quantity;
    } else if(foodItem.equals("Fish Curry")) {
        return 290.00 * quantity;
    } else if(foodItem.equals("Veg Spring Roll")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Chicken Momos")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Veg Momos")) {
        return 130.00 * quantity;
    } else if(foodItem.equals("Fried Momos")) {
        return 170.00 * quantity;
    } else if(foodItem.equals("Sandwich")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("French Fries")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Onion Rings")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Cheesecake")) {
        return 140.00 * quantity;
    } else if(foodItem.equals("Brownie")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Tiramisu")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Pasta")) {
        return 200.00 * quantity;
    } else if(foodItem.equals("Chicken Pasta")) {
        return 240.00 * quantity;
    } else if(foodItem.equals("Maggi")) {
        return 65.00 * quantity;
    } else {
        System.out.println("The searched item is not found");
        return 0.0;
    }
}

}
