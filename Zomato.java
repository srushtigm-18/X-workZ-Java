class Zomato {
    public static double search(String foodName) {
        double price = 0.0;
        
        if (foodName == "Plain Dosa") {
            price = 129.00;
            return price;
        } else if (foodName == "Idli Vada") {
            price = 80.00;
            return price;
        } else if (foodName == "Veg fried rice") {
            price = 159.00;
            return price;
        } else if (foodName == "Jeera rice") {
            price = 120.00;
            return price;
        } else if (foodName == "Pani Puri") {
            price = 99.00;
            return price;
        } else if (foodName == "Pizza") {
            price = 199.00;
            return price;
        } else if (foodName == "Burger") {
            price = 99.00;
            return price;
        } else if (foodName == "Chicken Biryani") {
            price = 220.00;
            return price;
        } else if (foodName == "Butter Chicken") {
            price = 280.00;
            return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 250.00;
            return price;
        } else if (foodName == "Veg Manchurian") {
            price = 180.00;
            return price;
        } else if (foodName == "Chicken Manchurian") {
            price = 250.00;
            return price;
        } else if (foodName == "Veg Pakora") {
            price = 150.00;
            return price;
        } else if (foodName == "Chicken Tikka") {
            price = 290.00;
            return price;
        } else if (foodName == "Onion Masala Dosa") {
            price = 110.00;
            return price;
        } else if (foodName == "Pav Bhaji") {
            price = 120.00;
            return price;
        } else if (foodName == "Chole Bhature") {
            price = 130.00;
            return price;
        } else if (foodName == "Vada Pav") {
            price = 40.00;
            return price;
        } else if (foodName == "Chicken Shawarma") {
            price = 160.00;
            return price;
        } else if (foodName == "Chaat") {
            price = 70.00;
            return price;
        } else if (foodName == "Samosa") {
            price = 25.00;
            return price;
        } else if (foodName == "Gulab Jamun") {
            price = 60.00;
            return price;
        } else if (foodName == "Chicken Fried Rice") {
            price = 200.00;
            return price;
        } else if (foodName == "Noodles") {
            price = 140.00;
            return price;
        } else if (foodName == "Schezwan Noodles") {
            price = 170.00;
            return price;
        } else if (foodName == "Paneer Tikka") {
            price = 260.00;
            return price;
        } else if (foodName == "Dal Makhani") {
            price = 190.00;
            return price;
        } else if (foodName == "Naan") {
            price = 50.00;
            return price;
        } else if (foodName == "Roti") {
            price = 30.00;
            return price;
        } else if (foodName == "Chicken 65") {
            price = 260.00;
            return price;
        } else if (foodName == "Egg Curry") {
            price = 150.00;
            return price;
        } else if (foodName == "Veg Biryani") {
            price = 180.00;
            return price;
        } else if (foodName == "Hyderabadi Biryani") {
            price = 300.00;
            return price;
        } else if (foodName == "Masala Dosa") {
            price = 140.00;
            return price;
        } else if (foodName == "Mysore Dosa") {
            price = 160.00;
            return price;
        } else if (foodName == "Onion Pakoda") {
            price = 80.00;
            return price;
        } else if (foodName == "Paneer Chilly") {
            price = 250.00;
            return price;
        } else if (foodName == "Chicken Lollipop") {
            price = 280.00;
            return price;
        } else if (foodName == "Falooda") {
            price = 110.00;
            return price;
        } else if (foodName == "Ice Cream") {
            price = 90.00;
            return price;
        } else if (foodName == "Kulfi") {
            price = 70.00;
            return price;
        } else if (foodName == "Rasmalai") {
            price = 85.00;
            return price;
        } else if (foodName == "Jalebi") {
            price = 60.00;
            return price;
        } else if (foodName == "Chicken Tikka Masala") {
            price = 300.00;
            return price;
        } else if (foodName == "Malai Kofta") {
            price = 240.00;
            return price;
        } else if (foodName == "Aloo Paratha") {
            price = 110.00;
            return price;
        } 
		 else if (foodName == "Chicken Biryani") {
            price = 220.00;
            return price;
        } else if (foodName == "Butter Chicken") {
            price = 280.00;
            return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 250.00;
            return price;
        } else if (foodName == "Veg Manchurian") {
            price = 180.00;
            return price;
        } else if (foodName == "Chicken Manchurian") {
            price = 250.00;
            return price;
			} else if (foodName == "Veg Pakora") {
            price = 150.00;
            return price;
        } else if (foodName == "Chicken Tikka") {
            price = 290.00;
            return price;
        } else if (foodName == "Onion Masala Dosa") {
            price = 110.00;
            return price;
        } else if (foodName == "Pav Bhaji") {
            price = 120.00;
            return price;
        } 
		else {
            System.out.println("The searched food is not found");
        }
        return price;
    }
		public static double search(String foodItem, int quantity) {
    if(foodItem.equals("Plain Dosa")) {
        return 129.00 * quantity;
    } else if(foodItem.equals("Idli Vada")) {
        return 80.00 * quantity;
    } else if(foodItem.equals("Veg fried rice")) {
        return 159.00 * quantity;
    } else if(foodItem.equals("Jeera rice")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Pani Puri")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Pizza")) {
        return 199.00 * quantity;
    } else if(foodItem.equals("Burger")) {
        return 99.00 * quantity;
    } else if(foodItem.equals("Chicken Biryani")) {
        return 220.00 * quantity;
    } else if(foodItem.equals("Butter Chicken")) {
        return 280.00 * quantity;
    } else if(foodItem.equals("Paneer Butter Masala")) {
        return 250.00 * quantity;
    } else if(foodItem.equals("Veg Manchurian")) {
        return 180.00 * quantity;
    } else if(foodItem.equals("Chicken Manchurian")) {
        return 250.00 * quantity;
    } else if(foodItem.equals("Veg Pakora")) {
        return 150.00 * quantity;
    } else if(foodItem.equals("Chicken Tikka")) {
        return 290.00 * quantity;
    } else if(foodItem.equals("Onion Masala Dosa")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Pav Bhaji")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Chole Bhature")) {
        return 130.00 * quantity;
    } else if(foodItem.equals("Vada Pav")) {
        return 40.00 * quantity;
    } else if(foodItem.equals("Chicken Shawarma")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Chaat")) {
        return 70.00 * quantity;
    } else if(foodItem.equals("Samosa")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Gulab Jamun")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Chicken Fried Rice")) {
        return 200.00 * quantity;
    } else if(foodItem.equals("Noodles")) {
        return 140.00 * quantity;
    } else if(foodItem.equals("Schezwan Noodles")) {
        return 170.00 * quantity;
    } else if(foodItem.equals("Paneer Tikka")) {
        return 260.00 * quantity;
    } else if(foodItem.equals("Dal Makhani")) {
        return 190.00 * quantity;
    } else if(foodItem.equals("Naan")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Roti")) {
        return 30.00 * quantity;
    } else if(foodItem.equals("Chicken 65")) {
        return 260.00 * quantity;
    } else if(foodItem.equals("Egg Curry")) {
        return 150.00 * quantity;
    } else if(foodItem.equals("Veg Biryani")) {
        return 180.00 * quantity;
    } else if(foodItem.equals("Hyderabadi Biryani")) {
        return 300.00 * quantity;
    } else if(foodItem.equals("Masala Dosa")) {
        return 140.00 * quantity;
    } else if(foodItem.equals("Mysore Dosa")) {
        return 160.00 * quantity;
    } else if(foodItem.equals("Onion Pakoda")) {
        return 80.00 * quantity;
    } else if(foodItem.equals("Paneer Chilly")) {
        return 250.00 * quantity;
    } else if(foodItem.equals("Chicken Lollipop")) {
        return 280.00 * quantity;
    } else if(foodItem.equals("Falooda")) {
        return 110.00 * quantity;
    } else if(foodItem.equals("Ice Cream")) {
        return 90.00 * quantity;
    } else if(foodItem.equals("Kulfi")) {
        return 70.00 * quantity;
    } else if(foodItem.equals("Rasmalai")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Jalebi")) {
        return 60.00 * quantity;
    } else if(foodItem.equals("Chicken Tikka Masala")) {
        return 300.00 * quantity;
    } else if(foodItem.equals("Malai Kofta")) {
        return 240.00 * quantity;
    } else if(foodItem.equals("Aloo Paratha")) {
        return 110.00 * quantity;
    } else {
        System.out.println("The searched food is not found");
        return 0.0;
    }
}

}
