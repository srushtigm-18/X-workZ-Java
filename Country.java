class Country {
    public static String[] findStatesByCountry(String countryName) {
        System.out.println("invoked findStatesByCountry");

        if (countryName=="India") {
            String[] states = {
                "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
                "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand",
                "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur",
                "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
                "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
                "Uttar Pradesh", "Uttarakhand", "West Bengal"
            };
            System.out.println("India states found");
            return states;
        } 
        else if (countryName=="United States") {
            String[] states = {
                "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
                "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
                "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana",
                "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
                "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
                "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
                "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
                "Rhode Island", "South Carolina", "South Dakota", "Tennessee",
                "Texas", "Utah", "Vermont", "Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming"
            };
            System.out.println("United States states found");
            return states;
        }
        else if (countryName=="Canada") {
            String[] states = {
                "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador",
                "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island",
                "Quebec", "Saskatchewan", "Yukon"
            };
            System.out.println("Canada states found");
            return states;
        }
        else if (countryName=="Australia") {
            String[] states = {
                "Australian Capital Territory", "New South Wales", "Northern Territory",
                "Queensland", "South Australia", "Tasmania", "Victoria", "Western Australia"
            };
            System.out.println("Australia states found");
            return states;
        }
        else if (countryName=="Brazil") {
            String[] states = {
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
                "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão",
                "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
                "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"
            };
            System.out.println("Brazil states found");
            return states;
        }
        else if (countryName=="Germany") {
            String[] states = {
                "Baden-Württemberg", "Bavaria", "Berlin", "Brandenburg",
                "Bremen", "Hamburg", "Hesse", "Lower Saxony",
                "Mecklenburg-Vorpommern", "North Rhine-Westphalia",
                "Rhineland-Palatinate", "Saarland", "Saxony",
                "Saxony-Anhalt", "Schleswig-Holstein", "Thuringia"
            };
            System.out.println("Germany states found");
            return states;
        }
        else if (countryName=="United Kingdom") {
            String[] states = {
                "England", "Northern Ireland", "Scotland", "Wales"
            };
            System.out.println("United Kingdom states found");
            return states;
        }
        else if (countryName=="France") {
            String[] states = {
                "Auvergne-Rhône-Alpes", "Bourgogne-Franche-Comté", "Bretagne", 
                "Centre-Val de Loire", "Corse", "Grand Est", "Hauts-de-France",
                "Île-de-France", "Normandie", "Nouvelle-Aquitaine", "Occitanie",
                "Pays de la Loire", "Provence-Alpes-Côte d'Azur"
            };
            System.out.println("France states found");
            return states;
        }
        else if (countryName=="Italy") {
            String[] states = {
                "Abruzzo", "Basilicata", "Calabria", "Campania", "Emilia-Romagna",
                "Friuli-Venezia Giulia", "Lazio", "Liguria", "Lombardia",
                "Marche", "Molise", "Piemonte", "Puglia", "Sardegna",
                "Sicilia", "Toscana", "Trentino-Alto Adige", "Umbria",
                "Valle d'Aosta", "Veneto"
            };
            System.out.println("Italy states found");
            return states;
        }
        else if (countryName=="Spain") {
            String[] states = {
                "Andalusia", "Aragon", "Asturias", "Balearic Islands", 
                "Basque Country", "Canary Islands", "Cantabria", 
                "Castile and León", "Castile-La Mancha", "Catalonia",
                "Extremadura", "Galicia", "La Rioja", "Madrid",
                "Murcia", "Navarre", "Valencian Community"
            };
            System.out.println("Spain states found");
            return states;
        }
        else if (countryName=="Mexico") {
            String[] states = {
                "Aguascalientes", "Baja California", "Baja California Sur", 
                "Campeche", "Chiapas", "Chihuahua", "Ciudad de México",
                "Coahuila", "Colima", "Durango", "Estado de México",
                "Guanajuato", "Guerrero", "Hidalgo", "Jalisco",
                "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca",
                "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí",
                "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala",
                "Veracruz", "Yucatán", "Zacatecas"
            };
            System.out.println("Mexico states found");
            return states;
        }
        else if (countryName=="China") {
            String[] states = {
                "Anhui", "Beijing", "Chongqing", "Fujian", "Gansu", "Guangdong",
                "Guangxi", "Guizhou", "Hainan", "Hebei", "Heilongjiang", "Henan",
                "Hong Kong", "Hubei", "Hunan", "Inner Mongolia", "Jiangsu",
                "Jiangxi", "Jilin", "Liaoning", "Macau", "Ningxia", "Qinghai",
                "Shaanxi", "Shandong", "Shanghai", "Shanxi", "Sichuan",
                "Tianjin", "Tibet", "Xinjiang", "Yunnan", "Zhejiang"
            };
            System.out.println("China states found");
            return states;
        }
        else if (countryName=="Russia") {
            String[] states = {
                "Republic of Adygea", "Altai Krai", "Altai Republic", "Amur Oblast",
                "Arkhangelsk Oblast", "Astrakhan Oblast", "Belgorod Oblast",
                "Bryansk Oblast", "Republic of Buryatia", "Chechen Republic",
                "Chelyabinsk Oblast", "Chukotka Autonomous Okrug", "Chuvash Republic",
                "Republic of Dagestan", "Republic of Ingushtia", "Irkutsk Oblast",
                "Ivanovo Oblast", "Jewish Autonomous Oblast", "Kabardino-Balkar Republic",
                "Kaliningrad Oblast", "Kalmykia", "Kaluga Oblast", "Kamchatka Krai",
                "Karachay-Cherkess Republic", "Karelia", "Kemerovo Oblast",
                "Khabarovsk Krai", "Khakassia", "Khanty-Mansi Autonomous Okrug",
                "Kirov Oblast", "Komi Republic", "Kostroma Oblast", "Krasnodar Krai",
               
            };
            System.out.println("Russia states found");
            return states;
        }
        else if (countryName=="Japan") {
            String[] states = {
                "Aichi", "Akita", "Aomori", "Chiba", "Ehime", "Fukui", "Fukuoka",
                "Fukushima", "Gifu", "Gunma", "Hiroshima", "Hokkaido",
                "Ibaraki", "Ishikawa", "Iwate", "Kagawa", "Kagoshima", "Kanagawa",
                "Kochi", "Kumamoto","Mie", "Miyagi", "Miyazaki",
                "Nagano", "Nagasaki", "Nara", "Niigata", "Ōita", "Okayama",
                "Okinawa", "Ōsaka", "Saga", "Saitama", "Shiga", "Shimane",
                "Shizuoka", "Tochigi", "Tokushima", "Tokyo", "Tottori", "Toyama",
                "Wakayama", "Yamagata", "Yamaguchi", "Yamanashi"
            };
            System.out.println("Japan states found");
            return states;
        }
        else if (countryName=="South Africa") {
            String[] states = {
                "Eastern Cape", "Free State", "Gauteng", "KwaZulu-Natal",
                "Limpopo", "Mpumalanga", "Northern Cape", "North West",
                "Western Cape"
            };
            System.out.println("South Africa states found");
            return states;
        }
        else if (countryName=="Nigeria") {
            String[] states = {
                "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa",
                "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo",
                "Ekiti", "Enugu", "FCT - Abuja", "Gombe", "Imo", "Jigawa",
                "Kaduna", "Kano", "Katsina", "Kebbi", "Kogi", "Kwara",
                "Lagos", "Nasarawa", "Niger", "Ogun", "Ondo", "Osun",
                "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara"
            };
            System.out.println("Nigeria states found");
            return states;
        }else if (countryName=="Argentina States") {
            String[] states = {
               "Buenos Aires, Córdoba, Santa Fe, Mendoza, Tucumán,
			   Entre Ríos, Salta, Misiones, Corrientes, Chaco, San Luis,
			   La Rioja, San Juan, Catamarca, La Pampa, Neuquén, Río Negro,
			   Chubut, Santa Cruz, Tierra del Fuego, Formosa, Jujuy,
			   Santiago del Estero"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Indonesia Provinces") {
            String[] states = {
           "DKI Jakarta, West Java, Central Java, East Java, Banten, Yogyakarta, North Sumatra, West Sumatra, Riau, Jambi, South Sumatra, Bengkulu, Lampung, Aceh, North Sulawesi, Central Sulawesi, South Sulawesi, Southeast Sulawesi, Gorontalo, West Sulawesi, Bali, Papua, North Maluku, West Papua, East Nusa Tenggara"    
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="South Korea Divisions") {
            String[] states = {
               "Seoul, Busan, Daegu, Incheon, Gwangju, Daejeon, Ulsan, Sejong, Gyeonggi, Gangwon, North Chungcheong, South Chungcheong, North Jeolla, South Jeolla, North Gyeongsang, South Gyeongsang, Jeju, Gwangju Metropolitan City"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Turkey Provinces") {
            String[] states = {
               "Istanbul, Ankara, Izmir, Bursa, Adana, Gaziantep, Konya, Antalya, Diyarbakır, Şanlıurfa, Adıyaman, Afyonkarahisar, Ağrı, Aksaray, Amasya, Artvin, Aydın, Balıkesir, Bartın, Batman"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Poland Voivodeships") {
            String[] states = {
               "Masovian, Silesian, Greater Poland, Lower Silesian, Lesser Poland, Pomeranian, West Pomeranian, Kuyavian-Pomeranian, Warmian-Masurian, Lublin, Subcarpathian, Opole, Holy Cross, Podkarpackie"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Sweden Counties") {
            String[] states = {
              "Stockholm, Uppsala, Södermanland, Östergötland, Jönköping, Kronoberg, Kalmar, Gotland, Blekinge, Skåne, Halland, Västra Götaland, Värmland, Örebro, Västmanland, Dalarna, Gävleborg, Västernorrland, Jämtland, Västerbotten, Norrbotten" 
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Egypt Governorates") {
            String[] states = {
               "Cairo, Alexandria, Giza, Asyut, Sohag, Qena, Luxor, Aswan, 6th of October, Suez, Dakahlia, Damietta, Port Said, Beheira, Kafr El-Sheikh, Monufia, Sharqia, Gharbia, Minya, Beni Suef, Fayoum, Ismailia, North Sinai, South Sinai"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Algeria Wilayas") {
            String[] states = {
               "Algiers, Oran, Constantine, Annaba, Batna, Sétif, Tizi Ouzou, Béjaïa, Blida, Jijel, Bouira, Boumerdès, Chlef, El Bayadh, El Oued, Ghardaïa, Guelma, Illizi, Laghouat, Mascara, M'Sila, Mila"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Ukraine Oblasts") {
            String[] states = {
               "Kyiv, Dnipropetrovsk, Donetsk, Kharkiv, Lviv, Odesa, Kyiv Oblast, Vinnytsia, Zakarpattia, Ivano-Frankivsk, Ternopil, Rivne, Zhytomyr, Sumy, Chernihiv, Cherkasy, Kirovohrad, Poltava, Kherson, Mykolaiv, Zaporizhzhia, Khmelnytskyi, Chernivtsi, Luhansk"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Netherlands Provinces") {
            String[] states = {
               "North Holland, South Holland, Zeeland, North Brabant, Limburg, Gelderland, Overijssel, Friesland, Groningen, Drenthe, Flevoland, Utrecht"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Pakistan") {
            String[] states = {
               "Punjab, Sindh, Khyber Pakhtunkhwa, Balochistan, Islamabad Capital Territory, Azad Kashmir, Gilgit-Baltistan"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Saudi Arabia") {
            String[] states = {
               "Riyadh, Makkah, Madinah, Eastern Province, Asir, Tabuk, Ha'il, Northern Borders, Jazan, Najran, Al-Qassim, Al-Jawf, Al-Bahah"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Iran") {
            String[] states = {
            "Tehran, Isfahan, Razavi Khorasan, East Azerbaijan, West Azerbaijan, Fars, Kerman, Kermanshah, Gilan, North Khorasan, Khuzestan, Mazandaran, Hamadan, Yazd, Ardabil, Qazvin"   
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Thailand") {
            String[] states = {
               "Bangkok, Nonthaburi, Pathum Thani, Samut Prakan, Nakhon Ratchasima, Chiang Mai, Khon Kaen, Udon Thani, Nakhon Si Thammarat, Hat Yai, Surat Thani" };
            System.out.println(" states found");
		return states;
		}else if(countryName=="Vietnam") {
            String[] states = {
               "Ho Chi Minh City, Hanoi, Da Nang, Hai Phong, Can Tho, Binh Duong, Dong Nai, Khanh Hoa, Dong Thap, Binh Dinh"
            };
            System.out.println(" states found");
		return states;}
	else if (countryName=="Philippines Provinces") {
            String[] states = {
               "Metro Manila, Ilocos Region, Cagayan Valley, Central Luzon, Calabarzon, Bicol Region, Western Visayas, Central Visayas, Eastern Visayas, Zamboanga Peninsula, Northern Mindanao, Davao Region, Soccsksargen, Caraga, MIMAROPA, Cordillera, Bangsamoro (17 regions total)"
            };
            System.out.println("states found");
		return states;}
	else if (countryName=="Portugal Districts/Autonomous Regions") {
            String[] states = {
               "Lisboa, Porto, Setúbal, Aveiro, Faro, Braga, Leiria, Coimbra, Santarém, Viana do Castelo, Vila Real, Viseu, Évora, Castelo Branco, Guarda, Beja, Bragança, Portalegre, Azores, Madeira (18 mainland + 2 autonomous)"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Greece Regions") {
            String[] states = {
               "Attica, Central Macedonia, Thessaly, Epirus, Western Greece, Peloponnese, Ionian Islands, Western Macedonia, Central Greece, Eastern Macedonia-Thrace, Crete, South Aegean, North Aegean (13 peripheries)"
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Hungary Counties") {
            String[] states = {
               "Budapest, Pest, Fejér, Komárom-Esztergom, Veszprém, Győr-Moson-Sopron, Vas, Zala, Somogy, Baranya, Tolna, Bács-Kiskun, Békés, Csongrád, Jász-Nagykun-Szolnok, Hajdú-Bihar, Szabolcs-Szatmár-Bereg, Heves, Nógrád, Borsod-Abaúj-Zemplén, Szabolcs-Szatmár-Bereg"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Romania Counties") {
            String[] states = {
               "Alba, Arad, Argeș, Bacău, Bihor, Bistrița-Năsăud, Botoșani, Brașov, Brăila, Buzău, Caraș-Severin, Călărași, Cluj, Constanța, Covasna, Dâmbovița, Dolj, Galați, Giurgiu, Gorj, Harghita, Hunedoara, Ialomița, Iași, Ilfov, Maramureș, Mehedinți, Mureș, Neamț, Olt, Prahova, Satu Mare, Sălaj, Sibiu, Suceava, Teleorman, Timiș, Tulcea, Vaslui, Vâlcea, Vrancea"
            };
            System.out.println("states found");
		return states;}
		voidelse if (countryName=="Peru Regions") {
            String[] states = {
               "Amazonas, Antioquia, Arauca, Atlántico, Bogotá, Bolívar, Boyacá, Caldas, Caquetá, Casanare, Cauca, Cesar, Chocó, Córdoba, Cundinamarca, Guainía, Guaviare, Huila, La Guajira, Magdalena, Meta, Nariño, Norte de Santander, Putumayo, Quindío, Risaralda, San Andrés y Providencia, Santander, Sucre, Tolima, Valle del Cauca, Vaupés, Vichada "
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Colombia Departments") {
            String[] states = {
               "Amazonas, Áncash, Arequipa, Ayacucho, Cajamarca, Callao, Cusco, Huancavelica, Ica, La Libertad, Lambayeque, Lima, Loreto, Madre de Dios, Moquegua, Pasco, Piura, Puno, San , Tacna, Tumbes, Ucayali "
            };
            System.out.println("states found");
		return states;}
		else if (countryName=="Chile Regions") {
            String[] states = {
               "Arica y Parinacota, Tarapacá, Antofagasta, Atacama, Coquimbo, Valparaíso, Metropolitana de Santiago, O'Higgins, Maule, Ñuble, Biobío, Araucanía, Los Ríos, Los Lagos, Aysén, Magallanes"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Morocco") {
            String[] states = {
               "Tanger-Tétouan-Al Hoceïma, Oriental, Fès-Meknès, Rabat-Salé-Kénitra, Béni Mellal-Khénifra, Casablanca-Settat, Marrakech-Safi, Drâa-Tafilalet, Souss-Massa, Guelmim-Oued Noun, Laâyoune-Sakia El Hamra, Dakhla-Oued Ed-Dahab"
            };
            System.out.println("Morocco states found");
		return states;}
		else if (countryName=="Iraq") {
            String[] states = {
               "Baghdad, Al Anbar, Babil, Basra, Dahuk, Dhi Qar, Diyala, Erbil, Halabja, Karbala, Kirkuk, Maysan, Muthanna, Najaf, Nineveh, Al-Qadisiyyah, Salah ad Din, Samarra, Sulaymaniyah, Wasit"
            };
            System.out.println("Iraq states found");
		return states;}
		else if (countryName=="Malaysia") {
            String[] states = {
             "Johor, Kedah, Kelantan, Melaka, Negeri Sembilan, Pahang, Perak, Perlis, Pulau Pinang, Sabah, Sarawak, Selangor, Terengganu, Kuala Lumpur, Labuan, Putrajaya"  
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Philippines") {
            String[] states = {
               "Abra, Agusan del Norte, Agusan del Sur, Aklan, Albay, Antique, Apayao "
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Bangladesh") {
            String[] states = {
               "Barisal, Chittagong, Dhaka, Khulna, Mymensingh, Rajshahi, Rangpur, Sylhet"
            };
            System.out.println("Bangladesh states found");
		return states;}
		else if (countryName=="Ethiopia") {
            String[] states = {
               "Addis Ababa, Afar, Amhara, Dire Dawa, Harari, Oromia, Sidama, Somali, South Ethiopia, Central Ethiopia, South West Ethiopia, Tigray"
            };
            System.out.println("Ethiopia states found");
		return states;}
		else if (countryName=="Kenya") {
            String[] states = {
               "Baringo, Bomet, Bungoma, Busia, Elgeyo-Marakwet, Embu, Garissa, Homa Bay, Isiolo, Kajiado, Kakamega, Kericho, Kiambu, Kilifi, Kirinyaga, Kisii, Kisumu, Kitui, Kwale, Laikipia, Lamu, Machakos, Makueni, Mandera, Marsabit, Meru, Migori, Mombasa, Murang'a, Nairobi City, Nakuru, Nandi, Narok, Nyamira, Nyandarua, Nyeri, Samburu, Siaya, Taita-Taveta, Tana River, Tharaka-Nithi, Trans Nzoia, Turkana, Uasin Gishu, Vihiga, Wajir, West Pokot"
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Kenya") {
            String[] states = {
             "Baringo, Bomet, Bungoma, Busia, Elgeyo-Marakwet, Embu, Garissa, Homa Bay, Isiolo, Kajiado, Kakamega, Kericho, Kiambu, Kilifi, Kirinyaga, Kisii, Kisumu, Kitui, Kwale, Laikipia, Lamu, Machakos, Makueni, Mandera, Marsabit, Meru, Migori, Mombasa, Murang'a, Nairobi City, Nakuru, Nandi, Narok, Nyamira, Nyandarua, Nyeri, Samburu, Siaya, Taita-Taveta, Tana River, Tharaka-Nithi, Trans Nzoia, Turkana, Uasin Gishu, Vihiga, Wajir, West Pokot"  
            };
            System.out.println(" states found");
		return states;}
		else if (countryName=="Angola") {
            String[] states = {
              "Cabinda, Cuando Cubango, Cuanza Norte, Cuanza Sul, Cunene, Huambo, Huíla, Luanda, Lunda Norte, Lunda Sul, Malanje, Moxico, Namibe, Uíge, Zaire" 
            };
            System.out.println("Angola states found");
		return states;}
      else if (countryName=="Tanzania") {
    String[] states = {
        "Arusha", "Dar es Salaam", "Dodoma", "Geita", "Iringa", "Kagera", 
        "Kaskazini Pemba", "Kaskazini Unguja", "Katavi", "Kigoma", 
        "Kilimanjaro", "Kusini Pemba", "Kusini Unguja", "Lindi", "Manyara",
        "Mara", "Mbeya", "Mjini Magharibi", "Morogoro", "Mtwara", 
        "Mwanza", "Njombe", "Pwani", "Rukwa", "Ruvuma", "Shinyanga",
        "Simiyu", "Singida", "Tabora"
    };
    System.out.println("Tanzania states found");
    return states;
}
else if (countryName=="Angola") {
    String[] states = {
        "Cabinda", "Cuando Cubango", "Cuanza Norte", "Cuanza Sul", 
        "Cunene", "Huambo", "Huíla", "Luanda", "Lunda Norte", 
        "Lunda Sul", "Malanje", "Moxico", "Namibe", "Uíge", "Zaire",
        "Bengo", "Benguela", "Bié"
    };
    System.out.println("Angola states found");
    return states;
}
else if (countryName=="Ghana") {
    String[] states = {
        "Greater Accra", "Ashanti", "Eastern", "Central", "Western",
        "Volta", "Northern", "Upper East", "Upper West", "Brong-Ahafo",
        "Western North", "Ahafo", "Bono", "Bono East", "Oti", "North East",
        "Savannah"
    };
    System.out.println("Ghana states found");
    return states;
}
else if (countryName=="Venezuela") {
    String[] states = {
        "Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar",
        "Carabobo", "Cojedes", "Delta Amacuro", "Falcón", "Guárico",
        "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa",
        "Sucre", "Táchira", "Trujillo", "Yaracuy", "Zulia"
    };
    System.out.println("Venezuela states found");
    return states;
}
else if (countryName=="Peru") {
    String[] states = {
        "Amazonas", "Apurímac", "Arequipa", "Ayacucho",
        "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco",
        "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto",
        "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno",
        "San Martín", "Tacna", "Tumbes", "Ucayali"
    };
    System.out.println("Peru states found");
    return states;
}
else if (countryName=="Chile") {
    String[] states = {
        "Arica y Parinacota", "Tarapacá", "Antofagasta", "Atacama",
        "Coquimbo", "Valparaíso", "Metropolitana de Santiago", "O'Higgins",
        "Maule", "Ñuble", "Biobío", "Araucanía", "Los Ríos", "Los Lagos",
        "Aysén", "Magallanes"
    };
    System.out.println("Chile states found");
    return states;
}
else if (countryName=="Ecuador") {
    String[] states = {
        "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi",
        "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura",
        "Loja", "Los Ríos", "Manabí", "Morona-Santiago", "Napo",
        "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo",
        "Sucumbíos", "Tungurahua", "Zamora-Chinchipe"
    };
    System.out.println("Ecuador states found");
    return states;
}
else if (countryName=="Bolivia") {
    String[] states = {
        "Beni", "Chuquisaca", "Cochabamba", "La Paz", "Oruro", "Pando",
        "Potosí", "Santa Cruz", "Tarija"
    };
    System.out.println("Bolivia states found");
    return states;
}
else if (countryName=="Uruguay") {
    String[] states = {
        "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno",
        "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo",
        "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José",
        "Soriano", "Tacuarembó", "Treinta y Tres"
    };
    System.out.println("Uruguay states found");
    return states;
}
else if (countryName=="Paraguay") {
    String[] states = {
        "Alto Paraguay", "Alto Paraná", "Amambay", "Asunción", "Boquerón",
        "Caaguazú", "Caazapá", "Canindeyú", "Central", "Concepción",
        "Cordillera", "Guairá", "Itapúa", "Misiones", "Ñeembucú",
        "Paraguarí", "Presidente Hayes", "San Pedro"
    };
    System.out.println("Paraguay states found");
    return states;
}
else if (countryName=="Colombia") {
    String[] states = {
        "Amazonas", "Antioquia", "Arauca", "Atlántico", "Bogotá D.C.",
        "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca",
        "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare",
        "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander",
        "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia",
        "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada"
    };
    System.out.println("Colombia states found");
    return states;
}
else if (countryName=="Argentina") {
    String[] states = {
        "Buenos Aires", "Córdoba", "Santa Fe", "Mendoza", "Tucumán",
        "Entre Ríos", "Salta", "Misiones", "Corrientes", "Chaco", 
        "San Luis", "La Rioja", "San Juan", "Catamarca", "La Pampa",
        "Neuquén", "Río Negro", "Chubut", "Santa Cruz", "Tierra del Fuego",
        "Formosa", "Jujuy", "Santiago del Estero"
    };
    System.out.println("Argentina states found");
    return states;
}
else if (countryName=="Indonesia") {
    String[] states = {
        "DKI Jakarta", "West Java", "Central Java", "East Java", "Banten",
        "Yogyakarta", "North Sumatra", "West Sumatra", "Riau", "Jambi",
        "South Sumatra", "Bengkulu", "Lampung", "Aceh", "North Sulawesi",
        "Central Sulawesi", "South Sulawesi", "Southeast Sulawesi", "Gorontalo",
        "West Sulawesi", "Bali", "Papua", "North Maluku", "West Papua"
    };
    System.out.println("Indonesia states found");
    return states;
}
else if (countryName=="South Korea") {
    String[] states = {
        "Seoul", "Busan", "Daegu", "Incheon", "Gwangju", "Daejeon",
        "Ulsan", "Sejong", "Gyeonggi", "Gangwon", "North Chungcheong",
        "South Chungcheong", "North Jeolla", "South Jeolla", 
        "North Gyeongsang", "South Gyeongsang", "Jeju"
    };
    System.out.println("South Korea states found");
    return states;
}
else if (countryName=="Turkey") {
    String[] states = {
        "Istanbul", "Ankara", "Izmir", "Bursa", "Adana", "Gaziantep",
        "Konya", "Antalya", "Diyarbakır", "Şanlıurfa", "Adıyaman",
        "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Artvin",
        "Aydın", "Balıkesir", "Bartın", "Batman"
    };
    System.out.println("Turkey states found");
    return states;
}
else if (countryName=="Poland") {
    String[] states = {
        "Masovian", "Silesian", "Greater Poland", "Lower Silesian",
        "Lesser Poland", "Pomeranian", "West Pomeranian",
        "Kuyavian-Pomeranian", "Warmian-Masurian", "Lublin",
        "Subcarpathian", "Opole", "Holy Cross"
    };
    System.out.println("Poland states found");
    return states;
}
else if (countryName=="Sweden") {
    String[] states = {
        "Stockholm", "Uppsala", "Södermanland", "Östergötland",
        "Jönköping", "Kronoberg", "Kalmar", "Gotland", "Blekinge",
        "Skåne", "Halland", "Västra Götaland", "Värmland",
        "Örebro", "Västmanland", "Dalarna", "Gävleborg",
        "Västernorrland", "Jämtland", "Västerbotten", "Norrbotten"
    };
    System.out.println("Sweden states found");
    return states;
}
else if (countryName=="Egypt") {
    String[] states = {
        "Cairo", "Alexandria", "Giza", "Asyut", "Sohag", "Qena",
        "Luxor", "Aswan", "6th of October", "Suez", "Dakahlia",
        "Damietta", "Port Said", "Beheira", "Kafr El-Sheikh",
        "Monufia", "Sharqia", "Gharbia", "Minya", "Beni Suef"
    };
    System.out.println("Egypt states found");
    return states;
}
else if (countryName=="Algeria") {
    String[] states = {
        "Algiers", "Oran", "Constantine", "Annaba", "Batna",
        "Sétif", "Tizi Ouzou", "Béjaïa", "Blida", "Jijel",
        "Bouira", "Boumerdès", "Chlef", "El Bayadh", "El Oued",
        "Ghardaïa", "Guelma", "Illizi", "Laghouat", "Mascara"
    };
    System.out.println("Algeria states found");
    return states;
}
else if (countryName=="Ukraine") {
    String[] states = {
        "Kyiv", "Dnipropetrovsk", "Donetsk", "Kharkiv", "Lviv",
        "Odesa", "Kyiv Oblast", "Vinnytsia", "Zakarpattia",
        "Ivano-Frankivsk", "Ternopil", "Rivne", "Zhytomyr",
        "Sumy", "Chernihiv", "Cherkasy", "Kirovohrad",
        "Poltava", "Kherson", "Mykolaiv"
    };
    System.out.println("Ukraine states found");
    return states;
}
else if (countryName=="Netherlands") {
    String[] states = {
        "North Holland", "South Holland", "Zeeland", "North Brabant",
        "Limburg", "Gelderland", "Overijssel", "Friesland",
        "Groningen", "Drenthe", "Flevoland", "Utrecht"
    };
    System.out.println("Netherlands states found");
    return states;
}
else if (countryName=="Austria") {
    String[] states = {
        "Vienna", "Lower Austria", "Upper Austria", "Styria", "Carinthia",
        "Salzburg", "Tyrol", "Burgenland", "Vorarlberg"
    };
    System.out.println("Austria states found");
    return states;
}
else if (countryName=="Switzerland") {
    String[] states = {
        "Zurich", "Bern", "Lucerne", "Uri", "Schwyz", "Obwalden",
        "Nidwalden", "Glarus", "Zug", "Fribourg", "Solothurn",
        "Basel-Stadt", "Basel-Landschaft", "Schaffhausen", "Appenzell Ausserrhoden",
        "Appenzell Innerrhoden", "St. Gallen", "Graubünden", "Aargau",
        "Thurgau", "Ticino", "Vaud", "Valais", "Neuchâtel", "Geneva", "Jura"
    };
    System.out.println("Switzerland states found");
    return states;
}
else if (countryName=="Belgium") {
    String[] states = {
        "Antwerp", "Limburg", "East Flanders", "Flemish Brabant",
        "West Flanders", "Hainaut", "Liège", "Luxembourg", "Namur",
        "Walloon Brabant", "Brussels-Capital"
    };
    System.out.println("Belgium states found");
    return states;
}
else if (countryName=="Denmark") {
    String[] states = {
        "Capital Region", "Central Denmark", "North Denmark",
        "Region Zealand", "Southern Denmark"
    };
    System.out.println("Denmark states found");
    return states;
}
else if (countryName=="Finland") {
    String[] states = {
        "Åland", "Lapland", "Oulu", "Northern Ostrobothnia", "Central Ostrobothnia",
        "Kainuu", "North Karelia", "Northern Savonia", "Southern Savonia",
        "South Karelia", "Päijät-Häme", "Tavastia Proper", "Uusimaa",
        "Kymenlaakso", "Southwest Finland", "Pirkanmaa", "Central Finland",
        "Ostrobothnia", "Satakunta"
    };
    System.out.println("Finland states found");
    return states;
}
else if (countryName=="Norway") {
    String[] states = {
        "Oslo", "Akershus", "Østfold", "Vestfold", "Telemark",
        "Aust-Agder", "Vest-Agder", "Rogaland", "Hordaland", "Sogn og Fjordane",
        "Møre og Romsdal", "Trøndelag", "Nordland", "Troms", "Finnmark"
    };
    System.out.println("Norway states found");
    return states;
}
else if (countryName=="Portugal") {
    String[] states = {
        "Lisboa", "Porto", "Setúbal", "Aveiro", "Faro", "Braga",
        "Leiria", "Coimbra", "Santarém", "Viana do Castelo", "Vila Real",
        "Viseu", "Évora", "Castelo Branco", "Guarda", "Beja",
        "Bragança", "Portalegre", "Azores", "Madeira"
    };
    System.out.println("Portugal states found");
    return states;
}
else if (countryName=="Czech Republic") {
    String[] states = {
        "Prague", "Central Bohemian", "South Bohemian", "West Bohemian",
        "", "Karlovy Vary", "Ústí nad Labem", "Liberec", "Pardubice", "South Moravian",
        "Olomouc", "Zlín", "Moravian-Silesian"
    };
    System.out.println("Czech Republic states found");
    return states;
}
else if (countryName=="Hungary") {
    String[] states = {
        "Budapest", "Pest", "", "Komárom-Esztergom", "Veszprém",
        "Győr-Moson-Sopron", "Vas", "Zala", "Somogy", "Baranya",
        "Tolna", "Kiskun", "", "Csongrád-Csanád", "Jász-Nagykun-Szolnok",
        "Hajdú-Bihar", "Szabolcs-Bereg", "Heves", "", "Borsod-Abaúj-Zemplén"
    };
    System.out.println("Hungary states found");
    return states;
}
else if (countryName=="Bulgaria") {
    String[] states = {
        "Blagoevgrad", "Burgas", "Dobrich", "Gabrovo", "Haskovo",
        "Kardzhali", "Kyustendil", "Lovech", "Montana", "Pazardzhik",
        "Pernik", "Pleven", "Plovdiv", "Razgrad", "Ruse",
        "Shumen", "Silistra", "Sliven", "Smolyan", "Sofia City",
        "Sofia Province", "Stara Zagora", "Targovishte", "Varna", "Veliko Tarnovo", "Vidin", "Vraca"
    };
    System.out.println("Bulgaria states found");
    return states;
}
else if (countryName=="Croatia") {
    String[] states = {
        "Zagreb", "Krapina-Zagorje", "Sisak-Moslavina", "Karlovac",
        "Varaždin", "Koprivnica-Križevci", "Bjelovar-Bilogora", "Virovitica-Podravina",
        "Požega-Slavonia", "Brod-Posavina", "Vukovar-Srijem", "Osijek-Baranja",
        "Zadar", "Istria", "Primorje-Gorski Kotar", "Lika-Senj",
        "Virovitičko-Podravska", "Šibenik-Knin", "Dubrovnik-Neretva", "Split-Dalmatia"
    };
    System.out.println("Croatia states found");
    return states;
}
else if (countryName=="Serbia") {
    String[] states = {
        "Belgrade", "Vojvodina", "Šumadija and Western Serbia", "Southern and Eastern Serbia"
    };
    System.out.println("Serbia states found");
    return states;
}
else if (countryName=="Slovakia") {
    String[] states = {
        "Bratislava", "Trnava", "Trenčín", "Nitra", "Žilina",
        "Banská Bystrica", "Prešov", "Košice"
    };
    System.out.println("Slovakia states found");
    return states;
}
else if (countryName=="Ireland") {
    String[] states = {
        "Leinster", "Munster", "Connacht", "Ulster"
    };
    System.out.println("Ireland states found");
    return states;
}
else if (countryName=="New Zealand") {
    String[] states = {
        "Northland", "Auckland", "Waikato", "Bay of Plenty",
        "Gisborne", "Hawke's Bay", "Taranaki", "Manawatu-Wanganui",
        "Wellington", "Tasman", "Nelson", "Marlborough",
        "West Coast", "Canterbury", "Otago", "Southland"
    };
    System.out.println("New Zealand states found");
    return states;
}
else if (countryName=="Israel") {
    String[] states = {
        "Northern District", "Haifa District", "Central District",
        "Tel Aviv District", "Jerusalem District", "Southern District"
    };
    System.out.println("Israel states found");
    return states;
}
else if (countryName=="Kazakhstan") {
    String[] states = {
        "Almaty", "Aktobe", "Akmola", "Aktobe", "Atyrau", "West Kazakhstan",
        "Zhambyl", "Karagandy", "Kostanay", "Kyzylorda", "Mangystau",
        "Pavlodar", "North Kazakhstan", "East Kazakhstan", "Almaty City", "Astana City"
    };
    System.out.println("Kazakhstan states found");
    return states;
}
else if (countryName=="Uzbekistan") {
    String[] states = {
        "Andijan", "Bukhara", "Fergana", "Jizzakh", "Kashkadarya",
        "Navoiy", "Namangan", "Samarkand", "Samarqand", "Sirdaryo",
        "Surkhandarya", "Syrdarya", "Tashkent", "Tashkent City",
        "Xorazm (Khorezm)"
    };
    System.out.println("Uzbekistan states found");
    return states;
}
else if (countryName=="Sri Lanka") {
    String[] states = {
        "Central", "North Central", "Northern", "North Western",
        "Sabaragamuwa", "Southern", "Uva", "Western", "Eastern"
    };
    System.out.println("Sri Lanka states found");
    return states;
}
else if (countryName=="Myanmar") {
    String[] states = {
        "Ayeyarwady", "Bago", "Chin", "Kachin", "Kayah", "Kayin",
        "Magway", "Mandalay", "Mon", "Naypyidaw", "Rakhine",
        "Sagaing", "Shan", "Tanintharyi", "Yangon"
    };
    System.out.println("Myanmar states found");
    return states;
}
else if (countryName=="Mongolia") {
    String[] states = {
        "Arkhangai", "Bayan-Ölgii", "Bayankhongor", "Bulgan",
        "Darkhan-Uul", "Dornod", "Dornogovi", "Dundgovi",
        "Dzavkhan", "Govi-Altai", "Govısümber", "Khentii",
        "Khovd", "Khovsgol", "Ömnögovi", "Orkhon",
        "Övörkhangai", "Selenge", "Sükhbaatar", "Töv",
        "Uvs", "Zavkhan"
    };
    System.out.println("Mongolia states found");
    return states;
}
else if (countryName=="Nepal") {
    String[] states = {
        "Province No. 1", "Madhesh Province", "Bagmati Province",
        "Gandaki Province", "Lumbini Province", "Karnali Province",
        "Sudurpashchim Province"
    };
    System.out.println("Nepal states found");
    return states;
}
else if (countryName=="Singapore") {
    String[] states = {
        "Central", "North East", "North West", "South East", "South West"
    };
    System.out.println("Singapore states found");
    return states;
}
else if (countryName=="United Arab Emirates") {
    String[] states = {
        "Abu Dhabi", "Ajman", "Dubai", "Fujairah", "Ras Al Khaimah",
        "Sharjah", "Umm Al Quwain"
    };
    System.out.println("UAE states found");
    return states;
}
else if (countryName=="Qatar") {
    String[] states = {
        "Ad Dawhah", "Al Khor", "Al Rayyan", "Al Shamal", "Al Wakrah", "Doha", "Umm Salal"
    };
    System.out.println("Qatar states found");
    return states;
}
else if (countryName=="Kuwait") {
    String[] states = {
        "Al Ahmadi", "Al Asimah", "Al Farwaniyah", "Al Jahra",
        "Hawalli", "Mubarak Al Kabir"
    };
    System.out.println("Kuwait states found");
    return states;
}
else if (countryName=="Oman") {
    String[] states = {
        "Ad Dakhiliyah", "Adh Dhahirah", "Al Batinah North", "Al Batinah South",
        "Al Buraimi", "Al Wusta", "Ash Sharqiyah North", "Ash Sharqiyah South",
        "Az Zahirah", "Dhofar", "Musandam", "Muscat"
    };
    System.out.println("Oman states found");
    return states;
}
else if (countryName=="Greece") {
    String[] states = {
        "Attica", "Central Macedonia", "Thessaly", "Epirus", 
        "Western Greece", "Peloponnese", "Ionian Islands",
        "Western Macedonia", "Central Greece", "Eastern Macedonia-Thrace",
        "Crete", "South Aegean", "North Aegean"
    };
    System.out.println("Greece states found");
    return states;
}
else if (countryName=="Armenia") {
    String[] states = {
        "Aragatsotn", "Ararat", "Armavir", "Gegharkunik", "Kotayk",
        "Lori", "Shirak", "Syunik", "Tavush", "Yerevan"
    };
    System.out.println("Armenia states found");
    return states;
}
else if (countryName=="Georgia") {
    String[] states = {
        "Abkhazia", "Ajaria", "Guria", "Imereti", "Kakheti",
        "Imereti", "Kutaisi", "Samegrelo-Zemo Svaneti", "Samtskhe-Javakheti",
        "Kvemo Kartli", "Shida Kartli", "Mtskheta-Mtianeti"
    };
    System.out.println("Georgia states found");
    return states;
}
else if (countryName=="Azerbaijan") {
    String[] states = {
        "Absheron", "Aran", "Ganja-Qazakh", "Shaki-Zaqatala",
        "Shirvan", "Upper Garabagh", "Khachmaz", "Lankaran",
        "Guba-Khachmaz", "Yukhari Shirvan", "Baku", "Nakhchivan"
    };
    System.out.println("Azerbaijan states found");
    return states;
}
else if (countryName=="Belarus") {
    String[] states = {
        "Brest", "Gomel", "Grodno", "Mogilev", "Minsk", "Vitebsk"
    };
    System.out.println("Belarus states found");
    return states;
}
else if (countryName=="Bosnia and Herzegovina") {
    String[] states = {
        "Federation of Bosnia and Herzegovina", "Republika Srpska", "Brčko District"
    };
    System.out.println("Bosnia states found");
    return states;
}
else if (countryName=="North Macedonia") {
    String[] states = {
        "Eastern", "Northeastern", "Pelagonia", "Polog", "Skopje",
        "Southeastern", "Southwestern", "Vardar"
    };
    System.out.println("North Macedonia states found");
    return states;
}
else if (countryName=="Albania") {
    String[] states = {
        "Berat", "Dibër", "Durrës", "Elbasan", "Fier", "Gjirokastër",
        "Korçë", "Kukës", "Lezhë", "Shkodër", "Tirana", "Vlorë"
    };
    System.out.println("Albania states found");
    return states;
}
else if (countryName=="Montenegro") {
    String[] states = {
        "Andrijevica", "Bar", "Berane", "Bijelo Polje", "Budva",
        "Cetinje", "Danilovgrad", "Gusinje", "Herceg Novi", "Kolašin",
        "Kotor", "Mojkovac", "Nikšić", "Petnica", "Plav", "Pljevlja",
        "Plužine", "Podgorica", "Rožaje", "Šavnik", "Tivat", "Ulcinj",
        "Žabljak"
    };
    System.out.println("Montenegro states found");
    return states;
}
else if (countryName=="Slovenia") {
    String[] states = {
        "Ajdovščina", "Beltinci", "Bled", "Bohinj", "Borovnica",
        "Bovec", "Braslovče", "Brda", "Brezovica", "Brezica",
        "Čatež ob Savi", "Cankova", "Celje", "Cerklje na Gorenjskem",
        "Cerknica", "Cerkno", "Črnomelj", "Črna na Koroškem",
        "Črnomelj", "Destrnik", "Divaca", "Dobje", "Dobrepolje"
    };
    System.out.println("Slovenia states found");
    return states;
}
else if (countryName=="Lithuania") {
    String[] states = {
        "Alytus County", "Kaunas County", "Klaipėda County", "Marijampolė County",
        "Panevėžys County", "Šiauliai County", "Tauragė County", "Telšiai County",
        "Utena County", "Vilnius County"
    };
    System.out.println("Lithuania states found");
    return states;
}
else if (countryName=="Latvia") {
    String[] states = {
        "Aizkraukle", "Alūksne", "Balvi", "Bauska", "Cēsis",
        "Daugavpils", "Dobele", "Gulbene", "Jelgava", "Jēkabpils",
        "Kocēni", "Kraslava", "Kuldigas", "Liepāja", "Limbaži",
        "Ludza", "Madona", "Ogre", "Preiļi", "Rēzekne",
        "Riga", "Ropažu", "Rēzekne", "Saldus", "Saulkrasti",
        "Sigulda", "Smiltene", "Strenči", "Talsi", "Tukums",
        "Valka", "Varakļāni", "Ventspils"
    };
    System.out.println("Latvia states found");
    return states;
}
else if (countryName=="Estonia") {
    String[] states = {
        "Harju County", "Hiiu County", "Ida-Viru County", "Järva County",
        "Jõgeva County", "Lääne County", "Lääne-Viru County", "Pärnu County",
        "Põlva County", "Raplamaa", "Saare County", "Tartu County",
        "Valga County", "Viljandi County", "Võru County"
    };
    System.out.println("Estonia states found");
    return states;
}
else if (countryName=="Cameroon") {
    String[] states = {
        "Adamawa", "Centre", "East", "Far North", "Littoral",
        "North", "West", "South", "Southwest", "Northwest"
    };
    System.out.println("Cameroon states found");
    return states;
}
else if (countryName=="Libya") {
    String[] states = {
        "Tripoli", "Benghazi", "Misrata", "Murzuq", "Sabha",
        "Sirte", "Tobruk", "Wadi al-Haya", "Nalut", "Gharyan",
        "Ghudamis", "Jafra", "Jabal al Akhdar", "Zawiya"
    };
    System.out.println("Libya states found");
    return states;
}
else if (countryName=="Sudan") {
    String[] states = {
        "Khartoum", "Al Jazirah", "Sennar", "Blue Nile", "White Nile",
        "Gedaref", "Kassala", "Red Sea", "Al Qadarif", "Northern",
        "River Nile", "North Darfur", "West Darfur", "South Darfur",
        "East Darfur", "Central Darfur", "North Kordofan", "South Kordofan",
        "West Kordofan"
    };
    System.out.println("Sudan states found");
    return states;
}
else if (countryName=="Tunisia") {
    String[] states = {
        "Tunis", "Ariana", "Ben Arous", "La Marsa", "Manouba",
        "Tataouine", "Gabès", "Kasserine", "Kairouan", "Kebili",
        "Kef", "Jendouba", "Kasserine", "Mahdia", "Manouba",
        "Medenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid",
        "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"
    };
    System.out.println("Tunisia states found");
    return states;
}
else if (countryName=="Botswana") {
    String[] states = {
        "Central", "Ghanzi", "Kgalagadi", "Kgatleng", "Kweneng",
        "North-East", "North-West", "South-East", "Southern", "Chobe"
    };
    System.out.println("Botswana states found");
    return states;
}
else if (countryName=="Namibia") {
    String[] states = {
        "Erongo", "Hardap", "Karas", "Khomas", "Kunene",
        "Ohangwena", "Omaheke", "Omusati", " Oshana", "Oshikoto",
        "Otjozondjupa", "Zambezi"
    };
    System.out.println("Namibia states found");
    return states;
}
else if (countryName=="Zimbabwe") {
    String[] states = {
        "Bulawayo", "Harare", "Manicaland", "Mashonaland Central",
        "Mashonaland East", "Mashonaland West", "Masvingo", "Matabeleland North",
        "Matabeleland South", "Midlands"
    };
    System.out.println("Zimbabwe states found");
    return states;
}
else if (countryName=="Uganda") {
    String[] states = {
        "Central", "Eastern", "Northern", "Western"
    };
    System.out.println("Uganda states found");
    return states;
}
else if (countryName=="Rwanda") {
    String[] states = {
        "Eastern Province", "Northern Province", "Southern Province",
        "Western Province", "Kigali Province"
    };
    System.out.println("Rwanda states found");
    return states;
}
else if (countryName=="Burundi") {
    String[] states = {
        "Bubanza", "Bujumbura Mairie", "Bujumbura Rural", "Bururi",
        "Cankuzo", "Cibitoke", "Gitega", "Karuzi", "Kayanza",
        "Kirundo", "Makamba", "Muramvya", "Muyinga", "Mwaro", "Ngozi",
        "Rutana", "Ruyigi"
    };
    System.out.println("Burundi states found");
    return states;
}
else if (countryName=="Mozambique") {
    String[] states = {
        "Cabo Delgado", "Gaza", "Inhambane", "Manica", "Maputo",
        "Maputo City", "Nampula", "Niassa", "Sofala", "Tete",
        "Zambézia"
    };
    System.out.println("Mozambique states found");
    return states;
}
else if (countryName=="Madagascar") {
    String[] states = {
        "Antananarivo", "Antsiranana", "Fianarantsoa", "Mahajanga",
        "Toamasina", "Toliara"
    };
    System.out.println("Madagascar states found");
    return states;
}
else if (countryName=="Benin") {
    String[] states = {
        "Alibori", "Atakora", "Atlantique", "Borgou", "Collines",
        "Couffo", "Donga", "Littoral", "Mono", "Ouémé", "Plateau",
        "Zou"
    };
    System.out.println("Benin states found");
    return states;
}
else if (countryName=="Burkina Faso") {
    String[] states = {
        "Boucle du Mouhoun", "Cascades", "Centre", "Centre-Nord",
        "Centre-Sud", "Est", "Hauts-Bassins", "Nord", "Plateau-Central",
        "Sahel", "Sud-Ouest"
    };
    System.out.println("Burkina Faso states found");
    return states;
}
else if (countryName=="Mali") {
    String[] states = {
        "Gao", "Kayes", "Kidal", "Koulikoro", "Ménaka", "Mopti",
        "Ségou", "Sikasso", "Taoudénit", "Tombouctou"
    };
    System.out.println("Mali states found");
    return states;
}
else if (countryName=="Guyana") {
    String[] states = {
        "Barima-Waini", "Cuyuni-Mazaruni", "Demerara-Mahaica", 
        "East Berbice-Corentyne", "Essequibo Islands-West Demerara",
        "Mahaica-Berbice", "Pomeroon-Supenaam", "Potaro-Siparuni",
        "Upper Demerara-Berbice", "Upper Takutu-Upper Essequibo"
    };
    System.out.println("Guyana states found");
    return states;
}
else if (countryName=="Suriname") {
    String[] states = {
        "Brokopondo", "Commewijne", "Coronie", "Marowijne", 
        "Nickerie", "Para", "Paramaribo", "Saramacca", "Sipaliwini", "Wanica"
    };
    System.out.println("Suriname states found");
    return states;
}
else if (countryName=="Costa Rica") {
    String[] states = {
        "Alajuela", "Cartago", "Guanacaste", "Heredia", "Limón",
        "Puntarenas", "San José"
    };
    System.out.println("Costa Rica states found");
    return states;
}
else if (countryName=="Panama") {
    String[] states = {
        "Bocas del Toro", "Chiriquí", "Coclé", "Colón", "Darién",
        "Herrera", "Los Santos", "Panamá", "Panamá Oeste", "Veraguas"
    };
    System.out.println("Panama states found");
    return states;
}
else if (countryName=="Dominican Republic") {
    String[] states = {
        "Azua", "Baoruco", "Barahona", "Dajabón", "Duarte",
        "Elías Piña", "El Seibo", "Espaillat", "Hato Mayor", "Hermanas Mirabal",
        "Independencia", "La Altagracia", "La Romana", "La Vega", "María Trinidad Sánchez",
        "Monseñor Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia",
        "Puerto Plata", "Samaná", "San Cristóbal", "San José de Ocoa", "San Juan",
        "San Pedro de Macorís", "Sánchez Ramírez", "Santiago", "Santiago Rodríguez",
        "Santo Domingo", "Valverde"
    };
    System.out.println("Dominican Republic states found");
    return states;
}
else if (countryName=="Haiti") {
    String[] states = {
        "Artibonite", "Centre", "Grand'Anse", "Nippes", "Nord",
        "Nord-Est", "Nord-Ouest", "Ouest", "Sud", "Sud-Est"
    };
    System.out.println("Haiti states found");
    return states;
}
else if (countryName=="Cuba") {
    String[] states = {
        "Artemisa", "Camagüey", "Ciego de Ávila", "Cienfuegos",
        "Granma", "Guantánamo", "Holguín", "La Habana", "Las Tunas",
        "Matanzas", "Mayabeque", "Pinar del Río", "Sancti Spíritus",
        "Santiago de Cuba", "Villa Clara"
    };
    System.out.println("Cuba states found");
    return states;
}
else if (countryName=="Jamaica") {
    String[] states = {
        "Clarendon", "Hanover", "Kingston", "Manchester", "Portland",
        "Saint Andrew", "Saint Ann", "Saint Catherine", "Saint Elizabeth",
        "Saint James", "Saint Mary", "Saint Thomas", "Trelawny", "Westmoreland"
    };
    System.out.println("Jamaica states found");
    return states;
}
else if (countryName=="Trinidad and Tobago") {
    String[] states = {
        "Arima", "Chaguanas", "Couva-Tabaquite-Talparo", "Diego Martin",
        "Mayaro-Rio Claro", "Penal-Debe", "Princes Town", "Point Fortin",
        "San Fernando", "San Juan-Laventille", "Sangre Grande", "Siparia",
        "Tunapuna-Piarco"
    };
    System.out.println("Trinidad and Tobago states found");
    return states;
}
else if (countryName=="Bahamas") {
    String[] states = {
        "Bimini", "Cat Island", "Exuma", "Grand Bahama", "Great Exuma",
        "Harbour Island", "Inagua", "Long Island", "New Providence",
        "Ragged Island", "Ragged Island/Inagua", "San Salvador"
    };
    System.out.println("Bahamas states found");
    return states;
}
else if (countryName=="North Korea") {
    String[] states = {
        "Chagang", "North Hamgyong", "South Hamgyong", "North Hwanghae",
        "South Hwanghae", "Kangwon", "North Pyongan", "South Pyongan", "Rason", "Jagang"
    };
    System.out.println("North Korea states found");
    return states;
}
else if (countryName=="Brunei") {
    String[] states = {
        "Belait", "Brunei-Muara", "Temburong", "Tutong"
    };
    System.out.println("Brunei states found");
    return states;
}
else if (countryName=="Timor-Leste") {
    String[] states = {
        "Aileu", "Ainaro", "Baucau", "Bobonaro", "Cova Lima",
        "Dili", "Ermera", "Liquica", "Manatuto", "Manufahi",
        "Oecussi", "Viqueque"
    };
    System.out.println("Timor-Leste states found");
    return states;
}
else if (countryName=="Laos") {
    String[] states = {
        "Attapeu", "Bokeo", "Bolikhamxay", "Champasak", "Houaphanh",
        "Khammouane", "Louang Namtha", "Louangphabang", "Oudomxay",
        "Phongsaly", "Salavan", "Savannakhet", "Vientiane", "Vientiane"
    };
    System.out.println("Laos states found");
    return states;
}
else if (countryName=="Cambodia") {
    String[] states = {
        "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang",
        "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep",
        "Koh Kong", "Kratie", "Mondulkiri", "Oddar Meanchey", "Pailin",
        "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanakiri",
        "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo"
    };
    System.out.println("Cambodia states found");
    return states;
}
else if (countryName=="Bhutan") {
    String[] states = {
        "Bumthang", "Chhukha", "Chirang", "Dagana", "Gasa",
        "Ha", "Lhuntse", "Mongar", "Paro", "Pemagatshel",
        "Punakha", "Samdrup Jongkhar", "Samtee", "Sarpang",
        "Thimphu", "Trashigang", "Trashiyangtse", "Trongsa", "Tsirang", "Wangdue"
    };
    System.out.println("Bhutan states found");
    return states;
}
else if (countryName=="Maldives") {
    String[] states = {
        "Alif Alif", "Alif Dhaal", "Baa", "Dhaalu", "Faafu",
        "Gaafu Alif", "Gaafu Dhaal", "Gnaviyani", "Haa Alif",
        "Haa Dhaal", "Kaafu", "Laamu", "Lhaviyani", "Maale",
        "Meemu", "Noonu", "Raa", "Seenu", "Shaviyani", "Thaa", "Vaavu"
    };
    System.out.println("Maldives states found");
    return states;
}
else if (countryName=="Jordan") {
    String[] states = {
        "Ajloun", "Amman", "Balqa", "Irbid", "Jerash",
        "Karak", "Ma'an", "Madaba", "Aqaba", "Tafilah", "Zarqa"
    };
    System.out.println("Jordan states found");
    return states;
}
else if (countryName=="Lebanon") {
    String[] states = {
        "Akkar", "Baalbek-Hermel", "Beqaa", "Beyrut", "Liban-Nord",
        "Liban-Sud", "Mont-Liban", "Nabatiyeh"
    };
    System.out.println("Lebanon states found");
    return states;
}
else if (countryName=="Syria") {
    String[] states = {
        "Al-Hasakah", "Al-Qamishli", "Aleppo", "Ar-Raqqah", "As-Suwayda",
        "Damascus", "Dar'a", "Deir ez-Zor", "Hama", "Homs", "Idlib", "Latakia", "Rif Dimashq", "Tartus"
    };
    System.out.println("Syria states found");
    return states;
}
else if (countryName=="Papua New Guinea") {
    String[] states = {
        "Central", "Chimbu", "East New Britain", "Eastern Highlands",
        "East Sepik", "Enga", "Gulf", "Madang", "Manus", "Milne Bay",
        "Morobe", "New Ireland", "Northern", "Southern Highlands",
        "West New Britain", "Western", "West Highlands", "West Sepik", "National Capital District"
    };
    System.out.println("Papua New Guinea states found");
    return states;
}
else if (countryName=="Fiji") {
    String[] states = {
        "Ba", "Bua", "Cakaudrove", "Kadavu", "Lau", "Lomaiviti",
        "Macuata", "Nadroga-Navosa", "Naitasiri", "Namosi", "Ra", "Rewa",
        "Serua", "Tailevu"
    };
    System.out.println("Fiji states found");
    return states;
}
else if (countryName=="Solomon Islands") {
    String[] states = {
        "Central", "Choiseul", "Guadalcanal", "Honiara City", "Isabel",
        "Makira-Ulawa", "Malaita", "Rennell and Bellona", "Temotu", "Western"
    };
    System.out.println("Solomon Islands states found");
    return states;
}
else if (countryName=="Vanuatu") {
    String[] states = {
        "Malampa", "Penama", "Sanma", "Shefa", "Tafea", "Torba"
    };
    System.out.println("Vanuatu states found");
    return states;
}
else if (countryName=="Samoa") {
    String[] states = {
        "A'ana", "Aiga-i-le-Tai", "Atua", "Fa'asaleleaga", "Gaga'emauga",
        "Gagaifomauga", "Palauli", "Satupa'itea", "Tuamasaga", "Va'a-o-Fonoti", "Vaisigano"
    };
    System.out.println("Samoa states found");
    return states;
}
else if (countryName=="Tonga") {
    String[] states = {
        "'Eua", "Ha'apai", "Niuas", "Tongatapu", "Vava'u"
    };
    System.out.println("Tonga states found");
    return states;
}
else if (countryName=="Palau") {
    String[] states = {
        "Aimeliik", "Airai", "Angaur", "Hatohobei", "Kayangel",
        "Koror", "Melekeok", "Ngaraard", "Ngarchelong", "Ngardmau",
        "Ngatpang", "Ngchesar", "Ngeremlengui", "Ngiwal", "Peleliu", "Sonsorol"
    };
    System.out.println("Palau states found");
    return states;
}
else if (countryName=="Federated States of Micronesia") {
    String[] states = {
        "Chuuk", "Kosrae", "Pohnpei", "Yap"
    };
    System.out.println("Micronesia states found");
    return states;
}
else if (countryName=="Marshall Islands") {
    String[] states = {
        "Ailinglaplap", "Ailuk", "Arno", "Aur", "Bikini",
        "Bikar", "Bikini", "Ebon", "Enewetak", "Erikub",
        "Jabat", "Jaluit", "Kili", "Kwajalein", "Lae",
        "Lib", "Likiep", "Majuro", "Maloelap", "Mejit",
        "Namorik", "Namu", "Rongelap", "Rongrik", "Toke",
        "Ujae", "Ujelang", "Utirik", "Wotho", "Wotje"
    };
    System.out.println("Marshall Islands states found");
    return states;
}
else if (countryName=="Senegal") {
    String[] states = {
        "Dakar", "Diourbel", "Fatick", "Kaffrine", "Kaolack",
        "Kédougou", "Kolda", "Louga", "Matam", "Saint-Louis",
        "Sédhiou", "Tambacounda", "Thies", "Ziguinchor"
    };
    System.out.println("Senegal states found");
    return states;
}
else if (countryName=="Ivory Coast") {
    String[] states = {
        "Autonomous District of Abidjan", "Bafing", "Bagoué", "Bélier", "Béré",
        "Bounkari", "Cavally", "Comoe", "Denguele", "Folon",
        "Gbéké", "Gboko", "Gôh", "Gôh-Djiboua", "Grimbery",
        "Hambol", "Haut-Sassandra", "Iffou", "Indénié-Djuablin", "Kabadougou",
        "Kasso-Kérouané", "Kossou-Kassé", "Lacs", "La Mé", "Lôh-Djiboua",
        "Marahoué", "Moronou", "Nawa", "N'zi", "N'zi-Comoé",
        "Poro", "San-Pedro", "Sassandra", "Sikensi", "Sud-Bandama",
        "Tchologo", "Tonkpi", "Worodougo"
    };
    System.out.println("Ivory Coast states found");
    return states;
}
else if (countryName=="DRC") {
    String[] states = {
        "Kinshasa", "Kongo Central", "Kwango", "Kwilu", "Mai-Ndombe",
        "Kasaï", "Kasaï Central", "Kasaï Oriental", "Lomami", "Lualaba",
        "Haut-Lomami", "Haut-Katanga", "Tanganyika", "Haut-Uele", "Ituri",
        "Tshopo", "Bas-Uele", "Nord-Ubangi", "Mongala", "Sud-Ubangi",
        "Tshuapa", "Équateur", "Nord-Kivu", "Sud-Kivu", "Maniema"
    };
    System.out.println("DRC states found");
    return states;
}
else if (countryName=="Chad") {
    String[] states = {
        "Bahr el Ghazal", "Borkou", "Chari-Baguirmi", "Ennedi-Est",
        "Ennedi-Ouest", "Guéra", "Hadjer-Lamis", "Kanem", "Lac",
        "Logone Occidental", "Logone Oriental", "Mandoul", "Mayo-Kebbi Est",
        "Mayo-Kebbi Ouest", "Moyen-Chari", "N'Djamena", "Nana", "Nana-Grébizi",
        "Ouaddaï", "Salamat", "Sila", "Tandjilé", "Tibesti", "Wadi Fira"
    };
    System.out.println("Chad states found");
    return states;
}
else if (countryName=="Zambia") {
    String[] states = {
        "Central", "Copperbelt", "Eastern", "Luapula", "Lusaka",
        "Muchinga", "Northern", "North-Western", "Southern", "Western"
    };
    System.out.println("Zambia states found");
    return states;
}
else if (countryName=="Lesotho") {
    String[] states = {
        "Berea", "Butha-Buthe", "Leribe", "Mafeteng", "Maseru",
        "Mohale's Hoek", "Mokhotlong", "Qacha's Nek", "Quthing", "Thaba-Tseka"
    };
    System.out.println("Lesotho states found");
    return states;
}
else if (countryName=="Eswatini") {
    String[] states = {
        "Hhohho", "Lubombo", "Manzini", "Shiselweni"
    };
    System.out.println("Eswatini states found");
    return states;
}
else if (countryName=="Gabon") {
    String[] states = {
        "Estuaire", "Haut-Ogooué", "Moyen-Ogooué", "Ngounié", "Nyanga",
        "Ogooué-Ivindo", "Ogooué-Lolo", "Ogooué-Maritime", "Woleu-Ntem"
    };
    System.out.println("Gabon states found");
    return states;
}
else if (countryName=="Republic of the Congo") {
    String[] states = {
        "Bouenza", "Brazzaville", "Cuvette", "Cuvette-Ouest", "Kouilou",
        "Lékoumou", "Likouala", "Niari", "Plateaux", "Pointe-Noire", "Sangha"
    };
    System.out.println("Republic of the Congo states found");
    return states;
}
else if (countryName=="South Sudan") {
    String[] states = {
        "Central Equatoria", "Eastern Equatoria", "Jonglei", "Lakes",
        "Northern Bahr el Ghazal", "Unity", "Upper Nile", "Warrap", "Western Bahr el Ghazal", "Western Equatoria"
    };
    System.out.println("South Sudan states found");
    return states;
}
else if (countryName=="Grenada") {
    String[] states = {
        "Saint Andrew", "Saint David", "Saint George", "Saint John", 
        "Saint Mark", "Saint Patrick", "Carriacou and Petite Martinique"
    };
    System.out.println("Grenada states found");
    return states;
}
else if (countryName=="Saint Lucia") {
    String[] states = {
        "Anse la Raye", "Canaries", "Castries", "Choiseul", "Dennery",
        "Gros Islet", "Laborie", "Micoud", "Soufriere", "Vieux Fort"
    };
    System.out.println("Saint Lucia states found");
    return states;
}
else if (countryName=="Saint Vincent and the Grenadines") {
    String[] states = {
        "Charlotte", "Grenadines", "Saint Andrew", "Saint David",
        "Saint George", "Saint Patrick"
    };
    System.out.println("Saint Vincent states found");
    return states;
}
else if (countryName=="Antigua and Barbuda") {
    String[] states = {
        "Saint Paul", "Saint Peter", "Saint Philip", "Saint George",
        "Saint John", "Saint Mary", "Barbuda"
    };
    System.out.println("Antigua and Barbuda states found");
    return states;
}
else if (countryName=="Barbados") {
    String[] states = {
        "Christ Church", "Saint Andrew", "Saint George", "Saint James",
        "Saint John", "Saint Joseph", "Saint Lucy", "Saint Michael",
        "Saint Peter", "Saint Philip", "Saint Thomas"
    };
    System.out.println("Barbados states found");
    return states;
}
else if (countryName=="Belize") {
    String[] states = {
        "Belize", "Cayo", "Corozal", "Orange Walk", "Stann Creek", "Toledo"
    };
    System.out.println("Belize states found");
    return states;
}
else if (countryName=="Guatemala") {
    String[] states = {
        "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula",
        "El Progreso", "Escuintla", "Guatemala", "Huehuetenango",
        "Izabal", "Jalapa", "Jutiapa", "Petén", "Quetzaltenango",
        "Quiché", "Retalhuleu", "Sacatepéquez", "San Marcos",
        "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa"
    };
    System.out.println("Guatemala states found");
    return states;
}
else if (countryName=="El Salvador") {
    String[] states = {
        "Ahuachapán", "Cabañas", "Chalatenango", "Cuscatlán", "La Libertad",
        "La Paz", "La Unión", "Morazán", "San Miguel", "San Salvador",
        "Santa Ana", "San Vicente", "Sonsonate", "Usulután"
    };
    System.out.println("El Salvador states found");
    return states;
}
else if (countryName=="Honduras") {
    String[] states = {
        "Atlántida", "Choluteca", "Colón", "Comayagua", "Copán",
        "Cortés", "El Paraíso", "Francisco Morazán", "Gracias a Dios",
        "Intibucá", "Islas de la Bahía", "La Paz", "Lempira",
        "Ocotepeque", "Olancho", "Santa Bárbara", "Valle", "Yoro"
    };
    System.out.println("Honduras states found");
    return states;
}

else {
    System.out.println("No states found for: " + countryName);
    return new String[0];  
}

    }
}
  public static void getStates(String[] states) {
        System.out.println("States for the country:");
        if (states.length == 0) {
            System.out.println("No states found");
        } else {
            for (String state : states) {
                System.out.println("- " + state);
            }
        }
        System.out.println();
    }
}