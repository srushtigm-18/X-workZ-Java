class Foodpanda {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName == "KFC Chicken Bucket") {
            price = 599.00;
            return price;
        } else if(itemName == "Pizza Hut Margherita") {
            price = 299.00;
            return price;
        } else if(itemName == "Domino's Farmhouse") {
            price = 349.00;
            return price;
        } else if(itemName == "McDonalds McAloo Tikki") {
            price = 59.00;
            return price;
        } else if(itemName == "Chicken Biryani") {
            price = 220.00;
            return price;
        } else if(itemName == "Paneer Butter Masala") {
            price = 250.00;
            return price;
        } else if(itemName == "Veg Hakka Noodles") {
            price = 145.00;
            return price;
        } else if(itemName == "Chicken Fried Rice") {
            price = 215.00;
            return price;
        } else if(itemName == "Pani Puri") {
            price = 99.00;
            return price;
        } else if(itemName == "Vada Pav") {
            price = 40.00;
            return price;
        } else if(itemName == "Chicken Shawarma") {
            price = 160.00;
            return price;
        } else if(itemName == "Veg Momos") {
            price = 130.00;
            return price;
        } else if(itemName == "Chicken Momos") {
            price = 160.00;
            return price;
        } else if(itemName == "Cold Coffee") {
            price = 85.00;
            return price;
        } else if(itemName == "Cappuccino") {
            price = 110.00;
            return price;
        } else if(itemName == "Pepsi 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Coke 500ml") {
            price = 55.00;
            return price;
        } else if(itemName == "Butter Chicken") {
            price = 280.00;
            return price;
        } else if(itemName == "Dal Makhani") {
            price = 190.00;
            return price;
        } else if(itemName == "Naan") {
            price = 50.00;
            return price;
        } else if(itemName == "Roti") {
            price = 30.00;
            return price;
        } else if(itemName == "Gulab Jamun") {
            price = 60.00;
            return price;
        } else if(itemName == "Rasmalai") {
            price = 85.00;
            return price;
        } else if(itemName == "Choco Lava Cake") {
            price = 99.00;
            return price;
        } else if(itemName == "French Fries") {
            price = 85.00;
            return price;
        } else if(itemName == "Chicken Nuggets") {
            price = 169.00;
            return price;
        } else if(itemName == "Cheese Garlic Bread") {
            price = 129.00;
            return price;
        } else if(itemName == "Schezwan Noodles") {
            price = 170.00;
            return price;
        } else if(itemName == "Veg Manchurian") {
            price = 180.00;
            return price;
        } else if(itemName == "Chicken Tikka") {
            price = 290.00;
            return price;
        } else if(itemName == "Pav Bhaji") {
            price = 120.00;
            return price;
        } else if(itemName == "Chole Bhature") {
            price = 130.00;
            return price;
        } else if(itemName == "Samosa") {
            price = 25.00;
            return price;
        } else if(itemName == "Chaat") {
            price = 70.00;
            return price;
        } else if(itemName == "Masala Dosa") {
            price = 140.00;
            return price;
        } else if(itemName == "Idli Vada") {
            price = 80.00;
            return price;
        } else if(itemName == "Plain Dosa") {
            price = 129.00;
            return price;
        } else if(itemName == "Veg Fried Rice") {
            price = 159.00;
            return price;
        } else if(itemName == "Jeera Rice") {
            price = 120.00;
            return price;
        } else if(itemName == "Mutton Biryani") {
            price = 320.00;
            return price;
        } else if(itemName == "Egg Biryani") {
            price = 160.00;
            return price;
        } else if(itemName == "Ice Cream Single Scoop") {
            price = 90.00;
            return price;
        } else if(itemName == "Chocolate Shake") {
            price = 95.00;
            return price;
        } else if(itemName == "Mango Shake") {
            price = 90.00;
            return price;
        } else if(itemName == "Lassi") {
            price = 60.00;
            return price;
        } else if(itemName == "Masala Tea") {
            price = 35.00;
            return price;
        } else if(itemName == "Sprite 500ml") {
            price = 55.00;
            return price;
        } else {
            System.out.println("The searched item is not found");
        }
        return price;
    }
	public static double search(String foodItem, int quantity) {
    if(foodItem.equals("KFC Chicken Bucket")) {
        return 599.00 * quantity;
    } else if(foodItem.equals("Pizza Hut Margherita")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Domino's Farmhouse")) {
        return 349.00 * quantity;
    } else if(foodItem.equals("McDonalds McAloo Tikki")) {
        return 59.00 * quantity;
    } else if(foodItem.equals("Chicken Biryani")) {
        return 220.00 * quantity;
    } else if(foodItem.equals("Paneer Butter Masala")) {
        return 250.00 * quantity;
    } else if(foodItem.equals("Veg Hakka Noodles")) {
        return 145.00 * quantity;
    } else if(foodItem.equals("Chicken Fried Rice")) {
        return 215.00 * quantity;
    } else if(foodItem.equals("Pani Puri")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Vada Pav")) {
        return 40.00 * quantity;
    } else if(foodItem.equals("Chicken Shawarma")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Veg Momos")) {
        return 130.00 * quantity;
    } else if(foodItem.equals("Chicken Momos")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Cold Coffee")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Cappuccino")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Pepsi 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Coke 500ml")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Butter Chicken")) {
        return 280.00 * quantity;
    } else if(foodItem.equals("Dal Makhani")) {
        return 190.00 * quantity;
    } else if(foodItem.equals("Naan")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Roti")) {
        return 30.00 * quantity;
    } else if(foodItem.equals("Gulab Jamun")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Rasmalai")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Choco Lava Cake")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("French Fries")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Chicken Nuggets")) {
        return 169.00 * quantity;
    } else if(foodItem.equals("Cheese Garlic Bread")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Schezwan Noodles")) {
        return 170.00 * quantity;
    } else if(foodItem.equals("Veg Manchurian")) {
        return 180.00 * quantity;
    } else if(foodItem.equals("Chicken Tikka")) {
        return 290.00 * quantity;
    } else if(foodItem.equals("Pav Bhaji")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Chole Bhature")) {
        return 130.00 * quantity;
    } else if(foodItem.equals("Samosa")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Chaat")) {
        return 70.00 * quantity;
    } else if(foodItem.equals("Masala Dosa")) {
        return 140.00 * quantity;
    } else if(foodItem.equals("Idli Vada")) {
        return 80.00 * quantity;
    } else if(foodItem.equals("Plain Dosa")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Veg Fried Rice")) {
        return 159.00 * quantity;
    } else if(foodItem.equals("Jeera Rice")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Mutton Biryani")) {
        return 320.00 * quantity;
    } else if(foodItem.equals("Egg Biryani")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Ice Cream Single Scoop")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Chocolate Shake")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Mango Shake")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Lassi")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Masala Tea")) {
        return 35.00 * quantity;
    } else if(foodItem.equals("Sprite 500ml")) {
        return 55.00 * quantity;
    } else {
        System.out.println("The searched item is not found");
        return 0.0;
    }
}

}
