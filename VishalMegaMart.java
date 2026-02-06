class VishalMegaMart{
public static void main(String[] needs){
	
String staples[]={"wheat","Moong Dal","Sugar","Toor Dal","jeera","Sunflower oil",
"Rava","Chana dal","Kaju","Badam","Walnut kernels","Makhana","Jaggery","Besan flour","Soyabean oil",
"Rice bran oil","Mustard oil","Desi ghee","Olive oil","Cashew","Pista","Figs","Tata Salt","Haldi powder","Garam masala","Chilli powder"};

String biscuitsCakes[]={"Butter cookies","Jeera mini biscuit","Cream bourbon",
"Nutrichoice digestive biscuits","Choco chip cookies","Cashew almond cookies","Fruit and nut",
"Digestive biscuits","Coconut cookies","Choco pie","Cashew biscuits","Pista butter cookies","Choco kiss cookies",
"Marie gold biscuits","Toastea Rusk","Good day biscuits","Salted biscuit","Potato Crackers","Mom's magic Chashew and almond cookies",
"Milk cookies","Jim Jam Pops","Fruity Fun cake","20-20 gold chashew biscuit","chocolate cake","Little hearts"};

String breakfastCereals[]={"Plain oats","fruit and nut muesli","fruit and nut cereals",
"choco fills","kelloggs chocos","kellogs oats","corn flakes chocos","choco duet","corn flakes","Veggie twist oats","Classic masala oats",
"Choco moons and stars","Tomato oats","Almond honey corn flakes","Multigrain corn flakes","munch Crunchilicious cereal","Ragi bites",
"Choco millet muesli","Masala noodles","Macaroni","masala instant noodles","atta noodles","Vermacelli","Hakka noodles","Veggi manchow noodles"};

String chips[]={"Tomato potato chips","mint potato chips","Masala potato chips","salted potato chips","cream and onion potato chips",
"choco chip cookies","potato chips","bikano salted chips","tangy tomato chips","chatak masala chips","cream & onion chips","masala thadka chips",
"sour cream & onion chips","lentil & pea pop crisp","mexilla nacho cheese","mad angle achaari","sweet thai chilli nachos","red hot chilli potato chips",
"tedhe medehe masala"};

String pulses[]={"Toor Dal", "Moong Dal", "Masoor Dal", "Urad Dal","Chana Dal", "Rajma", "Black Gram", "Green Gram","Yellow Peas",
 "White Peas", "Lobia", "Horse Gram","Cowpea", "Moth Beans", "Field Beans", "Split Pigeon Pea","Whole Pigeon Pea", "Red Lentils", 
 "Brown Lentils", "Green Lentils", "Black Eyed Peas", "Kala Chana","Safed Chana", "Arhar Dal", "Mix Dal"};

String teaCoffee[]={"Tata Tea Premium", "Tata Tea Gold", "Brooke Bond Red Label", "Full Bloom Classic Tea","Lipton Honey Lemon Green Tea", 
"Lipton Green Tea", "Lipton Pure & Light Green Tea","Organic India Tulsi Green Tea", "Organic India Tulsi Original", "Bru Instant Coffee",
"Nescafe Classic Coffee", "Full Bloom Coffee", "Bru Gold Coffee", "Bru Filter Coffee","Nescafe Gold Blend", "Nescafe Choco Mocha",
 "Tetley Green Tea", "Twinings Green Tea Mint","Taj Mahal Tea", "Full Bloom Premium Tea", "Bru Green Label", "Lipton Yellow Label","Tata Tea Agni",
 "Brooke Bond Taj Mahal", "Nescafe Sunrise"};

String coldDrinks[]={"Pepsi Cold Drink", "Coca Cola", "Fanta Orange", "Mirinda", "Mountain Dew","Sprite Lemon", "Thums Up", "Limca", "Kinley Soda",
 "Monster Energy Drink","Real Mixed Fruit Juice", "Real Guava Juice", "Real Pomegranate Juice","Real Masala Mixed Fruit", "Real Pink Guava Juice", 
 "Full Bloom Litchi Drink","Full Bloom Mango Drink", "Tropicana Orange Juice", "Dabur Real Juice","Pepsi Sting Energy", "Horlicks Chocolate Drink", 
 "Maltova Health Drink","Electral Oral Rehydration", "Glucon D Powder", "Complan Nutrition Drink"};

String soaps[]={"Dove Cream Body Soap", "Lux Soft Glow Body Soap", "Pears Pure & Gentle Body Soap","Pears Soft & Gentle Body Soap",
 "Liril Lime Body Soap", "Lifebuoy Total 10 Soap","Santoor Sandal Soap", "Vivel Orchid Glow Soap", "Dettol Original Soap","Dettol Skincare Soap",
 "Fiama Di Wills Gel Bathing Bar", "Cinthol Original Soap","Boroplus Antiseptic Cream Soap", "Palmolive Milk & Honey Soap", "Nivea Milk Soap",
 "Rexona Soap", "Godrej No.1 Soap", "Himalaya Neem & Turmeric Soap","Jo Soap", "Outshine Soap", "Wild Stone Soap", "Lux Pink Soap",
 "Lifebuoy Lemon Fresh Soap", "Santoor Pure Glow Soap", "Fiama Lime & Nectar"};

String shampoos[]={"Dove Hair Fall Rescue", "Dove Daily Shine Therapy", "Dove Intense Repair Therapy","Pantene Hair Fall Control",
 "Pantene Smooth And Silky", "Sunsilk Black Shine","Sunsilk Thick And Long", "Head & Shoulders Anti Hair Fall", "Head & Shoulders Cool Menthol",
 "Himalaya Anti Hair Fall", "Clinic Plus Strong & Long", "Clinic Plus Healthy Strong","Loreal Paris Fall Repair", "Loreal Extraordinary Clay",
 "Mamaearth Onion Shampoo","Vatika Cactus Anti Dandruff", "Vatika Almond Hair Oil Shampoo", "Tresemme Keratin Smooth","Tresemme Botanique Nourish",
 "Indulekha Bringha Ayurvedic", "Kesh King Herbal","Park Avenue Beer Shampoo", "Joy Protein Shampoo", "VLCC Protein Shampoo","Garnier Fructis Sleek & Shine"};

String hairOils[]={"Bajaj Almond Drops Hair Oil", "Dabur Amla Hair Oil", "Parachute Advanced Hair Oil","Parachute Coconut Hair Oil", 
"Vatika Coconut Hair Oil", "Vatika Almond Hair Oil","Indulekha Bringha Hair Oil", "Kesh King Ayurvedic Hair Oil", "Navratna Hair Oil Cool",
"Nihar Naturals Coconut Oil", "Hair & Care Coconut Oil", "First Crop Amla Oil","First Crop Almond Oil", "Anmol Coconut Oil", "Emami 7 Oils in One",
"Himalaya Herbals Hair Oil", "Dabur Vatika Garlic Oil", "Parachute Advansed Jasmine","Bajaj Brahmi Amla Oil", "Kesh King No.1 Oil", 
"Indulekha Bringha Ayurveda","Vatika Cactus Hair Oil", "Navratna Extra Thanda Oil", "Nihar Gold Coconut Oil","Dabur Amla Cooling Oil"};

String oralCares[]={"Colgate Max Fresh Toothpaste", "Colgate Strong Teeth Toothpaste", "Colgate Visible White Toothpaste",
"Pepsodent Germi Check Toothpaste", "Pepsodent 2 in 1 Toothpaste", "Close Up Ever Fresh Red Toothpaste","Sensodyne Repair & Protect Toothpaste", 
"Sensodyne Fresh Gel Toothpaste", "Dabur Red Toothpaste","Babool Mint Fresh Toothpaste", "Oral-B Cavity Defense Toothbrush",
 "Oral-B Pro Health Toothbrush","Colgate Slim Soft Toothbrush", "Pepsodent Expert Toothbrush", "Sensodyne Complete Protection Mouthwash",
 "Plax Pepper Mint Mouthwash", "Listerine Cool Mint Mouthwash", "Colgate Plax Mouthwash","Himalaya Antiplaque Toothpaste",
 "Vicco Vajradanti Toothpaste", "Patanjali Dant Kanti Toothpaste","Meswak Complete Care Toothpaste", "Anchor White Toothpaste",
 "Promise Toothpaste","Emami Anchor Toothpaste"};

String healthWellness[]={"Vicks Vaporub Balm", "Dettol Antiseptic Liquid", "Zandu Balm Pain Relief","Moov Pain Relief Balm",
 "Iodex Fast Relief Balm", "Vicks Cough Drops","Strepsils Sore Throat Lozenges", "Koflet Cough Syrup", "Dettol Hand Sanitizer",
 "Betadine Antiseptic Solution", "Volini Pain Relief Gel", "Himalaya Cough Tablets","Tulsi Cough Relief Drops", "Power Grip Strengthener", 
 "Dumbbells 1kg Pair","Skipping Rope Fitness", "Yoga Mat Beginner", "Tulip Wooden Toothpicks","Ear Buds Cotton Swabs", "Band-Aid Strips Assorted", 
 "Combiflam Tablets","Eno Fruit Salt Sachet", "Hamdard Safi Syrup", "Chyawanprash Dabur","Glucon D Energy Powder"};

String householdCares[]={"Harpic Toilet Cleaner Power Plus", "Lizol Floor Cleaner Citrus", "Home Ninja Floor Cleaner Pine",
"Tide Detergent Powder Jasmine", "Surf Excel Detergent Powder", "Vim Dishwash Liquid","Vim Dishwash Bar Lemon", "Rin Detergent Bar", 
"Home Ninja Toilet Cleaner Lemon","Wonder Fresh Floor Cleaner Rose", "Hit Insect Repellent", "Good Knight Agarbatti","Scotch Brite Scrubber", 
"Safewash Fabric Softener", "Outshine Floor Cleaner","Domex Toilet Cleaner", "Colin Glass Cleaner", "Odonil Air Freshener","Airwick Freshmatic Refill",
 "Revive Disinfectant", "Soft Touch Steel Scrubber","Tulip Wet Dhoop Sandal", "Home Pure Dishwash Gel", "Harpic Bathroom Cleaner","Lizol Disinfectant Surface Cleaner"};

String homeAppliances[]={"Electric Kettle 1.5L","Mixer Grinder 750W", "Dry Iron 1000W","Induction Cooktop 1800W", "Sandwich Maker 700W", "Hand Blender 250W",
"Rice Cooker 1.2L", "Toaster 750W", "Room Heater 2000W", "Table Fan 400mm","Emergency LED Lantern", "Water Purifier Gravity", "Juicer 400W","Wet Grinder 1.25L",
 "Hair Dryer 1000W", "Electric Hot Plate","Tubelight LED 20W", "Ceiling Fan Blade", "Voltage Stabilizer 1440VA","Immersion Rod Heater", "Pop Up Toaster 2 Slice",
 "Hand Mixer Electric","Grill Sandwich Maker", "Table Lamp LED", "Mini Rice Cooker"};

String stationeries[]={"DOMS Stationery Kit 9 Pcs", "Apsara Stationery Kit 7 Pcs", "Classmate Notebook A4","Classmate Long Note Book", "Pilot V5 Pen Blue",
 "Cello Finegrip Pen Black","Apsara Extra Dark Pencil", "Nataraj Pencil Pack", "Eraser Plastic White","Sharpener Double Hole", "Scale 6 Inch Plastic", 
 "Geometry Box Kids","White Board Marker Blue", "Permanent Marker Black", "Highlighter Yellow","Sticky Notes 3x3 Inch", "File Folder A4 Blue", "Paper Clips Steel Pack","Stapler Mini Size",
 "Stapler Pins Box", "Glue Stick 15g", "Art Brush Set","Crayons 12 Colors", "Oil Pastels 12 Shades", "Drawing Book A4","Sketch Pen Set 12"};

String homeFurnishing[]={"Cotton Double Bedsheet", "Printed Single Bedsheet", "Designer Curtain Pair","Eyelet Window Curtains", "Doormat Welcome 24x16", "Anti-Slip Footmat",
"Cushion Cover 16 Inch Set", "Pillow Covers 2 Pcs", "Wall Hanging Decor","Carpet Floor Mat 5x7 Ft", "Bathroom Mat Rubber", "Kitchen Towel Set","Table Cover Printed", "Blanket Single Woolen", 
"Mattress Protector","Sofa Cover 3 Seater", "Bed Cover Double", "Pillow Cotton Filled","Door Curtain Panel", "Rug Circular Jute", "Throw Blanket Knit","Cushion Round Decorative", "Curtain Tie Back", 
"Table Runner Cotton","Floor Cushion Mat"};

String womenWear[]={"Kurtas & Kurtis", "Churidars","Leggings", "Palazzos","Salwars", "Lehenga Cholis","Anarkali Suits", "Sarees", "Dupattas","Stoles", "T-Shirts","Tops", "Dresses","Jumpsuits","Jeans",
"Jeggings", "Trousers & Capris", "Skirts & Shorts", "Sweaters & Cardigans","Sweatshirts","Hoodies", "Jackets","Shrugs", "Blazers & Coats", "Track Pants","Sports Bras & Active Tops", "Casual Shoes", "Formal Shoes", 
"Sandals","Flip Flops","Sports Shoes", "Handbags & Clutches", "Scarves & Shawls", "Belts & Wallets"};

String kitchenAccessories[]={"Steel Mixing Bowl Set", "Stainless Steel Kadhai", "Non-Stick Frying Pan","Pressure Cooker 3L", "Steel Plates 6 Piece Set", "Steel Glasses Tumbler","Chopping Board Plastic", 
"Steel Ladle Spoon Set", "Silicone Spatula Turner","Measuring Cups Set", "Knife Set 5 Piece", "Grater Multi Purpose","Colander Strainer Steel", "Whisk Egg Beater", "Peeler Vegetable Set","Tongs Stainless Steel",
 "Steel Rolling Pin", "Masala Dabba Organizer","Steel Spice Container", "Oil Dispenser Bottle", "Kitchen Towel Cotton","Wall Rack Spice Holder", "Steel Bowl 3 Sizes", "Dinner Set Melamine","Steel Water Bottle"};

String menWear[]={ "Casual T-Shirts", "Polo T-Shirts", "Printed T-Shirts", "Casual Shirts","Formal Shirts", "Sweatshirts", "Hoodies", "Jackets","Blazers", "Suits & Sets",
"Kurta Pajama Sets", "Nehru Jackets", "Jeans Slim Fit", "Casual Trousers","Formal Trousers","Track Pants","Joggers & Gym Wear", "Casual Shoes", "Formal Shoes", "Sports Shoes",
"Sandals & Slippers", "Loafers & Moccasins", "Wallets & Belts", "Sunglasses","Caps & Hats"};

String detergentsFresheners[]={"Surf Excel Detergent Powder", "Ariel Matic Detergent Powder", "Tide Detergent Powder","Rin Detergent Bar", "Safewash Liquid Detergent", 
"Ariel Top Load Liquid Detergent","Home Ninja Detergent Powder", "Surf Excel Matic Liquid", "Tide Natural Detergent","Rin Power Detergent Powder", "Odonil Room Freshener", 
"Airwick Fabric Freshener","Home Ninja Floor Freshener", "Wonder Fresh Room Spray", "Revive Fabric Softener","Safewash Ocean Breeze Softener", "Soft Touch Fabric Conditioner", 
"Ezee Fabric Whitener","Comfort Fabric Softener", "Genteel Liquid Detergent", "Godrej Laundry Bar","Lizol Fabric Freshener", "Home Fresh Car Perfume", "Cycle Mosquito Repellent"};


int size = kitchenAccessories.length;
System.out.println("The number of items available are: "+size);
System.out.println("The list of Kitchen accessories are: ");

for(String kitchen : kitchenAccessories){
 System.out.println(kitchen); 
}

System.out.println();

int length =  oralCares.length;
System.out.println("The number of Oral cares available are: "+length);
System.out.println("The list of OralCares are: ");

for(String oral : oralCares){
System.out.println(oral);
}

System.out.println();

int ln = hairOils.length;
System.out.println("The number of hairoils available are: "+ln);
System.out.println("The list of hair oils are: ");

for(String hairOil : hairOils){
 System.out.println(hairOil); 
}

System.out.println();

int span = pulses.length;
System.out.println("The number of pulses available are: "+span);
System.out.println("The list of pulses are: ");

for(String pulse : pulses){
 System.out.println(pulse);
}
}
}