class Dominos {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName == "Margherita Pizza") {
            price = 99.00;
            return price;
        } else if(itemName == "Farmhouse Pizza") {
            price = 299.00;
            return price;
        } else if(itemName == "Peppy Paneer") {
            price = 369.00;
            return price;
        } else if(itemName == "Chicken Dominator") {
            price = 399.00;
            return price;
        } else if(itemName == "Cheese Burst Pizza") {
            price = 449.00;
            return price;
        } else if(itemName == "Veg Extravaganza") {
            price = 449.00;
            return price;
        } else if(itemName == "Mexican Green Wave") {
            price = 299.00;
            return price;
        } else if(itemName == "Paneer Makhani") {
            price = 369.00;
            return price;
        } else if(itemName == "Burger Pizza") {
            price = 129.00;
            return price;
        } else if(itemName == "Pepper Barbecue Chicken") {
            price = 449.00;
            return price;
        } else if(itemName == "Chicken Fiesta") {
            price = 399.00;
            return price;
        } else if(itemName == "Garlic Bread") {
            price = 99.00;
            return price;
        } else if(itemName == "Taco Mexicana") {
            price = 129.00;
            return price;
        } else if(itemName == "Choco Lava Cake") {
            price = 99.00;
            return price;
        } else if(itemName == "Butterscotch Mousse") {
            price = 99.00;
            return price;
        } else if(itemName == "Pepsi 500ml") {
            price = 60.00;
            return price;
        } else if(itemName == "7Up 500ml") {
            price = 60.00;
            return price;
        } else if(itemName == "Mirinda 500ml") {
            price = 60.00;
            return price;
        } else if(itemName == "Lipton Ice Tea") {
            price = 50.00;
            return price;
        } else if(itemName == "Slice Mango") {
            price = 50.00;
            return price;
        } else if(itemName == "Pepsi Black Can") {
            price = 60.00;
            return price;
        } else if(itemName == "Nimbooz") {
            price = 50.00;
            return price;
        } else if(itemName == "Drinking Water") {
            price = 20.00;
            return price;
        } else if(itemName == "Veg Loaded Pizza") {
            price = 135.00;
            return price;
        } else if(itemName == "Non Veg Loaded") {
            price = 155.00;
            return price;
        } else if(itemName == "Golden Corn Pizza") {
            price = 79.00;
            return price;
        } else if(itemName == "Onion Pizza") {
            price = 59.00;
            return price;
        } else if(itemName == "Capsicum Pizza") {
            price = 75.00;
            return price;
        } else if(itemName == "Cheesy Pizza") {
            price = 99.00;
            return price;
        } else if(itemName == "Chicken Sausage") {
            price = 95.00;
            return price;
        } else if(itemName == "Paneer & Onion") {
            price = 95.00;
            return price;
        } else if(itemName == "Chicken Pepperoni") {
            price = 835.00;
            return price;
        } else if(itemName == "Indi Chicken Tikka") {
            price = 835.00;
            return price;
        } else if(itemName == "Non Veg Supreme") {
            price = 835.00;
            return price;
        } else if(itemName == "Keema Do Pyaza") {
            price = 495.00;
            return price;
        } else if(itemName == "Deluxe Veggie") {
            price = 249.00;
            return price;
        } else if(itemName == "Indi Tandoori Paneer") {
            price = 249.00;
            return price;
        } else if(itemName == "Achari Do Pyaza") {
            price = 169.00;
            return price;
        } else if(itemName == "Chicken Golden Delight") {
            price = 695.00;
            return price;
        } else if(itemName == "Cheese Garlic Bread") {
            price = 129.00;
            return price;
        } else if(itemName == "Veg Pasta") {
            price = 179.00;
            return price;
        } else if(itemName == "Chicken Pasta") {
            price = 219.00;
            return price;
        } else if(itemName == "Mexican Pasta") {
            price = 199.00;
            return price;
        } else if(itemName == "Potato Wedges") {
            price = 119.00;
            return price;
        } else if(itemName == "Cheesy Breadsticks") {
            price = 149.00;
            return price;
        } else if(itemName == "Chicken Wings") {
            price = 299.00;
            return price;
        } else if(itemName == "Spicy Chicken Kickers") {
            price = 279.00;
            return price;
        } else if(itemName == "Veg Nuggets") {
            price = 129.00;
            return price;
        } else if(itemName == "Chicken Nuggets") {
            price = 169.00;
            return price;
        } else {
            System.out.println("The searched item is not found");
        }
        return price;
    }
	public static double search(String foodItem, int quantity) {
    if(foodItem.equals("Margherita Pizza")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Farmhouse Pizza")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Peppy Paneer")) {
        return 369.00 * quantity;
    } else if(foodItem.equals("Chicken Dominator")) {
        return 399.00 * quantity;
    } else if(foodItem.equals("Cheese Burst Pizza")) {
        return 449.00 * quantity;
    } else if(foodItem.equals("Veg Extravaganza")) {
        return 449.00 * quantity;
    } else if(foodItem.equals("Mexican Green Wave")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Paneer Makhani")) {
        return 369.00 * quantity;
    } else if(foodItem.equals("Burger Pizza")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Pepper Barbecue Chicken")) {
        return 449.00 * quantity;
    } else if(foodItem.equals("Chicken Fiesta")) {
        return 399.00 * quantity;
    } else if(foodItem.equals("Garlic Bread")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Taco Mexicana")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Choco Lava Cake")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Butterscotch Mousse")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Pepsi 500ml")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("7Up 500ml")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Mirinda 500ml")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Lipton Ice Tea")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Slice Mango")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Pepsi Black Can")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Nimbooz")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Drinking Water")) {
        return 20.00 * quantity;
    } else if(foodItem.equals("Veg Loaded Pizza")) {
        return 135.00 * quantity;
    } else if(foodItem.equals("Non Veg Loaded")) {
        return 155.00 * quantity;
    } else if(foodItem.equals("Golden Corn Pizza")) {
        return 79.00 * quantity;
    } else if(foodItem.equals("Onion Pizza")) {
        return 59.00 * quantity;
    } else if(foodItem.equals("Capsicum Pizza")) {
        return 75.00 * quantity;
    } else if(foodItem.equals("Cheesy Pizza")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Chicken Sausage")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Paneer & Onion")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Chicken Pepperoni")) {
        return 835.00 * quantity;
    } else if(foodItem.equals("Indi Chicken Tikka")) {
        return 835.00 * quantity;
    } else if(foodItem.equals("Non Veg Supreme")) {
        return 835.00 * quantity;
    } else if(foodItem.equals("Keema Do Pyaza")) {
        return 495.00 * quantity;
    } else if(foodItem.equals("Deluxe Veggie")) {
        return 249.00 * quantity;
    } else if(foodItem.equals("Indi Tandoori Paneer")) {
        return 249.00 * quantity;
    } else if(foodItem.equals("Achari Do Pyaza")) {
        return 169.00 * quantity;
    } else if(foodItem.equals("Chicken Golden Delight")) {
        return 695.00 * quantity;
    } else if(foodItem.equals("Cheese Garlic Bread")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Veg Pasta")) {
        return 179.00 * quantity;
    } else if(foodItem.equals("Chicken Pasta")) {
        return 219.00 * quantity;
    } else if(foodItem.equals("Mexican Pasta")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("Potato Wedges")) {
        return 119.00 * quantity;
    } else if(foodItem.equals("Cheesy Breadsticks")) {
        return 149.00 * quantity;
    } else if(foodItem.equals("Chicken Wings")) {
        return 299.00 * quantity;
    } else if(foodItem.equals("Spicy Chicken Kickers")) {
        return 279.00 * quantity;
    } else if(foodItem.equals("Veg Nuggets")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Chicken Nuggets")) {
        return 169.00 * quantity;
    } else if(foodItem.equals("Amritsari Chole Thali")) {
        return 207.00 * quantity;
    } else {
        System.out.println("The searched item is not found");
        return 0.0;
    }
}

}
