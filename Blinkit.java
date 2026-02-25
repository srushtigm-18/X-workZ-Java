class Blinkit {
    public static double search(String foodItem) {
        double price = 0.0;
        
        if(foodItem == "Amul Milk 500ml") {
            price = 28.00;
            return price;
        } else if(foodItem == "Mother Dairy Curd 200g") {
            price = 22.00;
            return price;
        } else if(foodItem == "Britannia Bread 400g") {
            price = 38.00;
            return price;
        } else if(foodItem == "Amul Butter 100g") {
            price = 48.00;
            return price;
        } else if(foodItem == "Eggs Tray 6 pcs") {
            price = 45.00;
            return price;
        } else if(foodItem == "Paneer 200g") {
            price = 98.00;
            return price;
        } else if(foodItem == "Lassi 250ml") {
            price = 25.00;
            return price;
        } else if(foodItem == "Parle G Biscuits") {
            price = 15.00;
            return price;
        } else if(foodItem == "Good Day Butter Cookies") {
            price = 85.00;
            return price;
        } else if(foodItem == "Maggi Noodles 2 min") {
            price = 25.00;
            return price;
        } else if(foodItem == "Lays Magic Masala") {
            price = 20.00;
            return price;
        } else if(foodItem == "Haldirams Aloo Bhujia") {
            price = 112.00;
            return price;
        } else if(foodItem == "MTR Masala Upma") {
            price = 72.00;
            return price;
        } else if(foodItem == "Chings Schezwan Noodles") {
            price = 48.00;
            return price;
        } else if(foodItem == "Cadbury Dairy Milk") {
            price = 155.00;
            return price;
        } else if(foodItem == "KitKat Chocolate") {
            price = 25.00;
            return price;
        } else if(foodItem == "Kwality Walls Ice Cream") {
            price = 45.00;
            return price;
        } else if(foodItem == "Coke 250ml") {
            price = 25.00;
            return price;
        } else if(foodItem == "Pepsi 250ml") {
            price = 25.00;
            return price;
        } else if(foodItem == "Sprite 250ml") {
            price = 25.00;
            return price;
        } else if(foodItem == "Thums Up 250ml") {
            price = 25.00;
            return price;
        } else if(foodItem == "Cappuccino Instant Mix") {
            price = 120.00;
            return price;
        } else if(foodItem == "Bru Coffee 50g") {
            price = 165.00;
            return price;
        } else if(foodItem == "Lipton Green Tea") {
            price = 180.00;
            return price;
        } else if(foodItem == "Tata Tea 250g") {
            price = 195.00;
            return price;
        } else if(foodItem == "Horlicks 500g") {
            price = 295.00;
            return price;
        } else if(foodItem == "Bournvita 500g") {
            price = 285.00;
            return price;
        } else if(foodItem == "Complan 500g") {
            price = 415.00;
            return price;
        } else if(foodItem == "Boost 500g") {
            price = 265.00;
            return price;
        } else if(foodItem == "Maggi Hot & Sweet Sauce") {
            price = 45.00;
            return price;
        } else if(foodItem == "Kissan Jam 400g") {
            price = 135.00;
            return price;
        } else if(foodItem == "Amul Cheese Slice") {
            price = 145.00;
            return price;
        } else if(foodItem == "Yogurt Greek Style") {
            price = 65.00;
            return price;
        } else if(foodItem == "Nestle Everyday Dahi") {
            price = 35.00;
            return price;
        } else if(foodItem == "Bread Toast Butter") {
            price = 25.00;
            return price;
        } else if(foodItem == "Ready to Cook Paratha") {
            price = 85.00;
            return price;
        } else if(foodItem == "Idli Batter 500g") {
            price = 45.00;
            return price;
        } else if(foodItem == "Dosa Batter 500g") {
            price = 50.00;
            return price;
        } else if(foodItem == "Poha Ready Mix") {
            price = 55.00;
            return price;
        } else if(foodItem == "Vermicelli Instant") {
            price = 40.00;
            return price;
        } else if(foodItem == "Oats Instant 400g") {
            price = 95.00;
            return price;
        } else if(foodItem == "Muesli Fruit Nut") {
            price = 225.00;
            return price;
        } else if(foodItem == "Corn Flakes 250g") {
            price = 85.00;
            return price;
        } else if(foodItem == "Weetabix Cereal") {
            price = 195.0;
            return price;
        } else if(foodItem == "Milkmaid Condensed") {
            price = 95.00;
            return price;
        } else if(foodItem == "Oreo Cookies Pack") {
            price = 35.00;
            return price;
        } else if(foodItem == "Marie Gold Biscuits") {
            price = 45.00;
            return price;
        } else if(foodItem == "Monaco Crackers") {
            price = 55.00;
            return price;
        } else if(foodItem == "Act II Popcorn") {
            price = 35.00;
            return price;
        } else if(foodItem == "Uncle Chips Masala") {
            price = 15.00;
            return price;
        } else if(foodItem == "Bingo Mad Angles") {
            price = 20.00;
            return price;
        } else if(foodItem == "Kurkure Masala Munch") {
            price = 20.00;
            return price;
        } else {
            System.out.println("The searched food item is not found");
        }
        return price;
    }

public static double search(String foodItem, int quantity) {
    if(foodItem.equals("Amul Milk 500ml")) {
        return 28.00 * quantity;
    } else if(foodItem.equals("Mother Dairy Curd 200g")) {
        return 22.00 * quantity;
    } else if(foodItem.equals("Britannia Bread 400g")) {
        return 38.00 * quantity;
    } else if(foodItem.equals("Amul Butter 100g")) {
        return 48.00 * quantity;
    } else if(foodItem.equals("Eggs Tray 6 pcs")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Paneer 200g")) {
        return 98.00 * quantity;
    } else if(foodItem.equals("Lassi 250ml")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Parle G Biscuits")) {
        return 15.00 * quantity;
    } else if(foodItem.equals("Good Day Butter Cookies")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Maggi Noodles 2 min")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Lays Magic Masala")) {
        return 20.00 * quantity;
    } else if(foodItem.equals("Haldirams Aloo Bhujia")) {
        return 112.00 * quantity;
    } else if(foodItem.equals("MTR Masala Upma")) {
        return 72.00 * quantity;
    } else if(foodItem.equals("Chings Schezwan Noodles")) {
        return 48.00 * quantity;
    } else if(foodItem.equals("Cadbury Dairy Milk")) {
        return 155.00 * quantity;
    } else if(foodItem.equals("KitKat Chocolate")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Kwality Walls Ice Cream")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Coke 250ml")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Pepsi 250ml")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Sprite 250ml")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Thums Up 250ml")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Cappuccino Instant Mix")) {
        return 120.00 * quantity;
    } else if(foodItem.equals("Bru Coffee 50g")) {
        return 165.00 * quantity;
    } else if(foodItem.equals("Lipton Green Tea")) {
        return 180.00 * quantity;
    } else if(foodItem.equals("Tata Tea 250g")) {
        return 195.00 * quantity;
    } else if(foodItem.equals("Horlicks 500g")) {
        return 295.00 * quantity;
    } else if(foodItem.equals("Bournvita 500g")) {
        return 285.00 * quantity;
    } else if(foodItem.equals("Complan 500g")) {
        return 415.00 * quantity;
    } else if(foodItem.equals("Boost 500g")) {
        return 265.00 * quantity;
    } else if(foodItem.equals("Maggi Hot & Sweet Sauce")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Kissan Jam 400g")) {
        return 135.00 * quantity;
    } else if(foodItem.equals("Amul Cheese Slice")) {
        return 145.00 * quantity;
    } else if(foodItem.equals("Yogurt Greek Style")) {
        return 65.00 * quantity;
    } else if(foodItem.equals("Nestle Everyday Dahi")) {
        return 35.00 * quantity;
    } else if(foodItem.equals("Bread Toast Butter")) {
        return 25.00 * quantity;
    } else if(foodItem.equals("Ready to Cook Paratha")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Idli Batter 500g")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Dosa Batter 500g")) {
        return 50.00 * quantity;
    } else if(foodItem.equals("Poha Ready Mix")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Vermicelli Instant")) {
        return 40.00 * quantity;
    } else if(foodItem.equals("Oats Instant 400g")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Muesli Fruit Nut")) {
        return 225.00 * quantity;
    } else if(foodItem.equals("Corn Flakes 250g")) {
        return 85.00 * quantity;
    } else if(foodItem.equals("Weetabix Cereal")) {
        return 195.00 * quantity;
    } else if(foodItem.equals("Milkmaid Condensed")) {
        return 95.00 * quantity;
    } else if(foodItem.equals("Oreo Cookies Pack")) {
        return 35.00 * quantity;
    } else if(foodItem.equals("Marie Gold Biscuits")) {
        return 45.00 * quantity;
    } else if(foodItem.equals("Monaco Crackers")) {
        return 55.00 * quantity;
    } else if(foodItem.equals("Act II Popcorn")) {
        return 35.00 * quantity;
    } else if(foodItem.equals("Uncle Chips Masala")) {
        return 15.00 * quantity;
    } else if(foodItem.equals("Bingo Mad Angles")) {
        return 20.00 * quantity;
    } else if(foodItem.equals("Kurkure Masala Munch")) {
        return 20.00 * quantity;
    } else {
        System.out.println("The searched food item is not found");
        return 0.0;
    }
}
}