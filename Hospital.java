class Hospital {

    public static String[] findDoctorsBySpecilization(String specialization) {
        System.out.println("invoked findDoctorsBySpecilization");

        if (specialization == "Cardiac Sciences") {
            String[] doctors = {"Dr. Ramachandran Nair", "Dr. Kavita Menon", "Dr. Suresh Iyer", "Dr. Anuradha Pillai", "Dr. Gopalakrishnan", 
                               "Dr. Sindhu Varghese", "Dr. Mahesh Balan", "Dr. Lakshmi Suresh", "Dr. Vinod Krishnan", "Dr. Padma Rangan", 
                               "Dr. Anil Thampi", "Dr. Geetha Mohan", "Dr. Ravi Chandran", "Dr. Meenakshi Nair", "Dr. Hari Prasad"};
            System.out.println("Cardiac Sciences doctors are found");
            return doctors;
        } else if (specialization == "Dental Science") {
            String[] doctors = {"Dr. Vikram Shetty", "Dr. Pooja Kamath", "Dr. Arjun Prabhu", "Dr. Divya Hegde", "Dr. Rohan Pai",
                               "Dr. Shruti Shenoy", "Dr. Kiran Dsouza", "Dr. Nisha Pinto", "Dr. Sameer Naik", "Dr. Tanvi Salian",
                               "Dr. Aditya Kotian", "Dr. Rhea Lobo", "Dr. Pradeep Shet", "Dr. Swathi Baliga", "Dr. Manish Rao"};
            System.out.println("Dental Science doctors are found");
            return doctors;
        } else if (specialization == "Dermatology") {
            String[] doctors = {"Dr. Nandan Reddy", "Dr. Priyanka Rao", "Dr. Yashwant Gowda", "Dr. Savita Hegde", "Dr. Karthik Shetty",
                               "Dr. Malini Bhat", "Dr. Siddhartha Kamath", "Dr. Vandana Pai", "Dr. Raghavendra Nayak", "Dr. Supriya Dsilva",
                               "Dr. Harish Baliga", "Dr. Anushree Kotian", "Dr. Pranav Shenoy", "Dr. Lakshitha Naik", "Dr. Rohit Lobo"};
            System.out.println("Dermatology doctors are found");
            return doctors;
        } else if (specialization == "Diabetology/Endocrinology") {
            String[] doctors = {"Dr. Sumanth Gowda", "Dr. Rashmi Shetty", "Dr. Balachandran", "Dr. Nivedita Pai", "Dr. Venkatesh Rao",
                               "Dr. Shylaja Kamath", "Dr. Madhusudan Hegde", "Dr. Rekha Prabhu", "Dr. Girish Naik", "Dr. Anjali Dsouza",
                               "Dr. Prashanth Shet", "Dr. Deepa Baliga", "Dr. Sandeep Kotian", "Dr. Veena Lobo", "Dr. Mahesh Salian"};
            System.out.println("Diabetology/Endocrinology doctors are found");
            return doctors;
        } else if (specialization == "ENT") {
            String[] doctors = {"Dr. Pradeep Shenoy", "Dr. Kavya Bhat", "Dr. Sunil Kamath", "Dr. Meera Pinto", "Dr. Ashok Naik",
                               "Dr. Ranjini Shetty", "Dr. Vikrant Pai", "Dr. Shalini Dsouza", "Dr. Rohan Kotian", "Dr. Nithya Baliga",
                               "Dr. Arnav Lobo", "Dr. Divyashree Salian", "Dr. Ganesh Hegde", "Dr. Padmavathi Prabhu", "Dr. Kiran Shet"};
            System.out.println("ENT doctors are found");
            return doctors;
        } else if (specialization == "Emergency and Trauma") {
            String[] doctors = {"Dr. Sanjay Shetty", "Dr. Lakshmi Kamath", "Dr. Vinayak Pai", "Dr. Geetha Naik", "Dr. Harish Dsouza",
                               "Dr. Swathi Kotian", "Dr. Mahesh Baliga", "Dr. Rhea Lobo", "Dr. Aditya Salian", "Dr. Nisha Hegde",
                               "Dr. Pranav Prabhu", "Dr. Shruthi Shet", "Dr. Rohit Bhat", "Dr. Anushka Shenoy", "Dr. Karthik Pinto"};
            System.out.println("Emergency and Trauma doctors are found");
            return doctors;
        } else if (specialization == "Foetal Medicine") {
            String[] doctors = {"Dr. Vandana Gowda", "Dr. Suresh Pai", "Dr. Anuradha Kamath", "Dr. Ravi Naik", "Dr. Sindhu Dsouza",
                               "Dr. Mahesh Kotian", "Dr. Lakshitha Baliga", "Dr. Vinod Lobo", "Dr. Padma Salian", "Dr. Anil Hegde",
                               "Dr. Geetha Prabhu", "Dr. Ravi Shet", "Dr. Meenakshi Bhat", "Dr. Hari Shenoy", "Dr. Priya Pinto"};
            System.out.println("Foetal Medicine doctors are found");
            return doctors;
        } else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {
            String[] doctors = {"Dr. Ramakrishnan", "Dr. Divya Shetty", "Dr. Balaji Kamath", "Dr. Kavitha Pai", "Dr. Sarath Naik",
                               "Dr. Vivek Dsouza", "Dr. Latha Kotian", "Dr. Arjun Baliga", "Dr. Shweta Lobo", "Dr. Naveen Salian",
                               "Dr. Priya Hegde", "Dr. Manish Prabhu", "Dr. Suman Shet", "Dr. Rakesh Bhat", "Dr. Divya Shenoy"};
            System.out.println("Gastroenterology and Hepatobiliary Sciences doctors are found");
            return doctors;
        } else if (specialization == "General Surgery") {
            String[] doctors = {"Dr. Madhavan Nair", "Dr. Nivedita Pinto", "Dr. Venkatesh Kamath", "Dr. Shylaja Pai", "Dr. Girish Naik",
                               "Dr. Anjali Dsouza", "Dr. Prashanth Kotian", "Dr. Deepa Baliga", "Dr. Sandeep Lobo", "Dr. Veena Salian",
                               "Dr. Pradeep Hegde", "Dr. Kavya Prabhu", "Dr. Sunil Shet", "Dr. Meera Bhat", "Dr. Ashok Shenoy"};
            System.out.println("General Surgery doctors are found");
            return doctors;
        } else if (specialization == "Haematology") {
            String[] doctors = {"Dr. Nandan Shetty", "Dr. Priyanka Kamath", "Dr. Yashwant Pai", "Dr. Savita Naik", "Dr. Karthik Dsouza",
                               "Dr. Malini Kotian", "Dr. Siddhartha Baliga", "Dr. Vandana Lobo", "Dr. Raghav Salian", "Dr. Supriya Hegde",
                               "Dr. Harish Prabhu", "Dr. Anushree Shet", "Dr. Pranav Bhat", "Dr. Lakshitha Shenoy", "Dr. Rohit Pinto"};
            System.out.println("Haematology doctors are found");
            return doctors;
        } else if (specialization == "Infectious Diseases") {
            String[] doctors = {"Dr. Sumanth Rao", "Dr. Rashmi Shetty", "Dr. Balachandran Kamath", "Dr. Nivedita Pai", "Dr. Venkatesh Naik",
                               "Dr. Shylaja Dsouza", "Dr. Madhusudan Kotian", "Dr. Rekha Baliga", "Dr. Girish Lobo", "Dr. Anjali Salian",
                               "Dr. Prashanth Hegde", "Dr. Deepa Prabhu", "Dr. Sandeep Shet", "Dr. Veena Bhat", "Dr. Mahesh Shenoy"};
            System.out.println("Infectious Diseases doctors are found");
            return doctors;
        } else if (specialization == "Infertility medicine") {
            String[] doctors = {"Dr. Pradeep Pinto", "Dr. Kavya Kamath", "Dr. Sunil Pai", "Dr. Meera Naik", "Dr. Ashok Dsouza",
                               "Dr. Ranjini Kotian", "Dr. Vikrant Baliga", "Dr. Shalini Lobo", "Dr. Rohan Salian", "Dr. Nithya Hegde",
                               "Dr. Arnav Prabhu", "Dr. Divyashree Shet", "Dr. Ganesh Bhat", "Dr. Padmavathi Shenoy", "Dr. Kiran Pinto"};
            System.out.println("Infertility medicine doctors are found");
            return doctors;
        } else if (specialization == "Internal Medicine") {
            String[] doctors = {"Dr. Sanjay Shetty", "Dr. Lakshmi Kamath", "Dr. Vinayak Pai", "Dr. Geetha Naik", "Dr. Harish Dsouza",
                               "Dr. Swathi Kotian", "Dr. Mahesh Baliga", "Dr. Rhea Lobo", "Dr. Aditya Salian", "Dr. Nisha Hegde",
                               "Dr. Pranav Prabhu", "Dr. Shruthi Shet", "Dr. Rohit Bhat", "Dr. Anushka Shenoy", "Dr. Karthik Pinto"};
            System.out.println("Internal Medicine doctors are found");
            return doctors;
        } else if (specialization == "Mental Health and Behavioural Sciences") {
            String[] doctors = {"Dr. Vandana Gowda", "Dr. Suresh Pai", "Dr. Anuradha Kamath", "Dr. Ravi Naik", "Dr. Sindhu Dsouza",
                               "Dr. Mahesh Kotian", "Dr. Lakshitha Baliga", "Dr. Vinod Lobo", "Dr. Padma Salian", "Dr. Anil Hegde",
                               "Dr. Geetha Prabhu", "Dr. Ravi Shet", "Dr. Meenakshi Bhat", "Dr. Hari Shenoy", "Dr. Priya Pinto"};
            System.out.println("Mental Health and Behavioural Sciences doctors are found");
            return doctors;
        } else if (specialization == "Nephrology") {
            String[] doctors = {"Dr. Ramakrishnan Shetty", "Dr. Divya Kamath", "Dr. Balaji Pai", "Dr. Kavitha Naik", "Dr. Sarath Dsouza",
                               "Dr. Vivek Kotian", "Dr. Latha Baliga", "Dr. Arjun Lobo", "Dr. Shweta Salian", "Dr. Naveen Hegde",
                               "Dr. Priya Prabhu", "Dr. Manish Shet", "Dr. Suman Bhat", "Dr. Rakesh Shenoy", "Dr. Divya Pinto"};
            System.out.println("Nephrology doctors are found");
            return doctors;
        } else if (specialization == "Neurointerventional Radiology") {
            String[] doctors = {"Dr. Madhavan Nair", "Dr. Nivedita Shetty", "Dr. Venkatesh Kamath", "Dr. Shylaja Pai", "Dr. Girish Naik",
                               "Dr. Anjali Dsouza", "Dr. Prashanth Kotian", "Dr. Deepa Baliga", "Dr. Sandeep Lobo", "Dr. Veena Salian",
                               "Dr. Pradeep Hegde", "Dr. Kavya Prabhu", "Dr. Sunil Shet", "Dr. Meera Bhat", "Dr. Ashok Shenoy"};
            System.out.println("Neurointerventional Radiology doctors are found");
            return doctors;
        } else if (specialization == "Neurology") {
            String[] doctors = {"Dr. Nandan Reddy", "Dr. Priyanka Rao", "Dr. Yashwant Gowda", "Dr. Savita Hegde", "Dr. Karthik Shetty",
                               "Dr. Malini Bhat", "Dr. Siddhartha Kamath", "Dr. Vandana Pai", "Dr. Raghavendra Nayak", "Dr. Supriya Dsilva",
                               "Dr. Harish Baliga", "Dr. Anushree Kotian", "Dr. Pranav Shenoy", "Dr. Lakshitha Naik", "Dr. Rohit Lobo"};
            System.out.println("Neurology doctors are found");
            return doctors;
        } else if (specialization == "Neurosurgery") {
            String[] doctors = {"Dr. Sumanth Gowda", "Dr. Rashmi Shetty", "Dr. Balachandran Kamath", "Dr. Nivedita Pai", "Dr. Venkatesh Naik",
                               "Dr. Shylaja Dsouza", "Dr. Madhusudan Kotian", "Dr. Rekha Baliga", "Dr. Girish Lobo", "Dr. Anjali Salian",
                               "Dr. Prashanth Hegde", "Dr. Deepa Prabhu", "Dr. Sandeep Shet", "Dr. Veena Bhat", "Dr. Mahesh Shenoy"};
            System.out.println("Neurosurgery doctors are found");
            return doctors;
        } else if (specialization == "Obstetrics and Gynaecology") {
            String[] doctors = {"Dr. Pradeep Pinto", "Dr. Kavya Kamath", "Dr. Sunil Pai", "Dr. Meera Naik", "Dr. Ashok Dsouza",
                               "Dr. Ranjini Kotian", "Dr. Vikrant Baliga", "Dr. Shalini Lobo", "Dr. Rohan Salian", "Dr. Nithya Hegde",
                               "Dr. Arnav Prabhu", "Dr. Divyashree Shet", "Dr. Ganesh Bhat", "Dr. Padmavathi Shenoy", "Dr. Kiran Pinto"};
            System.out.println("Obstetrics and Gynaecology doctors are found");
            return doctors;
        } else if (specialization == "Oncology") {
            String[] doctors = {"Dr. Sanjay Shetty", "Dr. Lakshmi Kamath", "Dr. Vinayak Pai", "Dr. Geetha Naik", "Dr. Harish Dsouza",
                               "Dr. Swathi Kotian", "Dr. Mahesh Baliga", "Dr. Rhea Lobo", "Dr. Aditya Salian", "Dr. Nisha Hegde",
                               "Dr. Pranav Prabhu", "Dr. Shruthi Shet", "Dr. Rohit Bhat", "Dr. Anushka Shenoy", "Dr. Karthik Pinto"};
            System.out.println("Oncology doctors are found");
            return doctors;
        } else if (specialization == "Ophthalmology") {
            String[] doctors = {"Dr. Vandana Gowda", "Dr. Suresh Pai", "Dr. Anuradha Kamath", "Dr. Ravi Naik", "Dr. Sindhu Dsouza",
                               "Dr. Mahesh Kotian", "Dr. Lakshitha Baliga", "Dr. Vinod Lobo", "Dr. Padma Salian", "Dr. Anil Hegde",
                               "Dr. Geetha Prabhu", "Dr. Ravi Shet", "Dr. Meenakshi Bhat", "Dr. Hari Shenoy", "Dr. Priya Pinto"};
            System.out.println("Ophthalmology doctors are found");
            return doctors;
        } else if (specialization == "Organ Transplant") {
            String[] doctors = {"Dr. Ramakrishnan Shetty", "Dr. Divya Kamath", "Dr. Balaji Pai", "Dr. Kavitha Naik", "Dr. Sarath Dsouza",
                               "Dr. Vivek Kotian", "Dr. Latha Baliga", "Dr. Arjun Lobo", "Dr. Shweta Salian", "Dr. Naveen Hegde",
                               "Dr. Priya Prabhu", "Dr. Manish Shet", "Dr. Suman Bhat", "Dr. Rakesh Shenoy", "Dr. Divya Pinto"};
            System.out.println("Organ Transplant doctors are found");
            return doctors;
        } else if (specialization == "Orthopaedics") {
            String[] doctors = {"Dr. Madhavan Nair", "Dr. Nivedita Shetty", "Dr. Venkatesh Kamath", "Dr. Shylaja Pai", "Dr. Girish Naik",
                               "Dr. Anjali Dsouza", "Dr. Prashanth Kotian", "Dr. Deepa Baliga", "Dr. Sandeep Lobo", "Dr. Veena Salian",
                               "Dr. Pradeep Hegde", "Dr. Kavya Prabhu", "Dr. Sunil Shet", "Dr. Meera Bhat", "Dr. Ashok Shenoy"};
            System.out.println("Orthopaedics doctors are found");
            return doctors;
        } else if (specialization == "Paediatrics") {
            String[] doctors = {"Dr. Nandan Reddy", "Dr. Priyanka Rao", "Dr. Yashwant Gowda", "Dr. Savita Hegde", "Dr. Karthik Shetty",
                               "Dr. Malini Bhat", "Dr. Siddhartha Kamath", "Dr. Vandana Pai", "Dr. Raghavendra Nayak", "Dr. Supriya Dsilva",
                               "Dr. Harish Baliga", "Dr. Anushree Kotian", "Dr. Pranav Shenoy", "Dr. Lakshitha Naik", "Dr. Rohit Lobo"};
            System.out.println("Paediatrics doctors are found");
            return doctors;
        } else if (specialization == "Physiotherapy and Rehabilitation") {
            String[] doctors = {"Dr. Sumanth Gowda", "Dr. Rashmi Shetty", "Dr. Balachandran Kamath", "Dr. Nivedita Pai", "Dr. Venkatesh Naik",
                               "Dr. Shylaja Dsouza", "Dr. Madhusudan Kotian", "Dr. Rekha Baliga", "Dr. Girish Lobo", "Dr. Anjali Salian",
                               "Dr. Prashanth Hegde", "Dr. Deepa Prabhu", "Dr. Sandeep Shet", "Dr. Veena Bhat", "Dr. Mahesh Shenoy"};
            System.out.println("Physiotherapy and Rehabilitation doctors are found");
            return doctors;
        } else if (specialization == "Plastic and Reconstructive Surgery") {
            String[] doctors = {"Dr. Pradeep Pinto", "Dr. Kavya Kamath", "Dr. Sunil Pai", "Dr. Meera Naik", "Dr. Ashok Dsouza",
                               "Dr. Ranjini Kotian", "Dr. Vikrant Baliga", "Dr. Shalini Lobo", "Dr. Rohan Salian", "Dr. Nithya Hegde",
                               "Dr. Arnav Prabhu", "Dr. Divyashree Shet", "Dr. Ganesh Bhat", "Dr. Padmavathi Shenoy", "Dr. Kiran Pinto"};
            System.out.println("Plastic and Reconstructive Surgery doctors are found");
            return doctors;
        } else if (specialization == "Pulmonology") {
            String[] doctors = {"Dr. Sanjay Shetty", "Dr. Lakshmi Kamath", "Dr. Vinayak Pai", "Dr. Geetha Naik", "Dr. Harish Dsouza",
                               "Dr. Swathi Kotian", "Dr. Mahesh Baliga", "Dr. Rhea Lobo", "Dr. Aditya Salian", "Dr. Nisha Hegde",
                               "Dr. Pranav Prabhu", "Dr. Shruthi Shet", "Dr. Rohit Bhat", "Dr. Anushka Shenoy", "Dr. Karthik Pinto"};
            System.out.println("Pulmonology doctors are found");
            return doctors;
        } else if (specialization == "Radiology") {
            String[] doctors = {"Dr. Vandana Gowda", "Dr. Suresh Pai", "Dr. Anuradha Kamath", "Dr. Ravi Naik", "Dr. Sindhu Dsouza",
                               "Dr. Mahesh Kotian", "Dr. Lakshitha Baliga", "Dr. Vinod Lobo", "Dr. Padma Salian", "Dr. Anil Hegde",
                               "Dr. Geetha Prabhu", "Dr. Ravi Shet", "Dr. Meenakshi Bhat", "Dr. Hari Shenoy", "Dr. Priya Pinto"};
            System.out.println("Radiology doctors are found");
            return doctors;
        } else if (specialization == "Rheumatology") {
            String[] doctors = {"Dr. Mukund Shetty", "Dr. Lavanya Kamath", "Dr. Bharath Pai", "Dr. Sangeeta Naik", "Dr. Devendra Dsouza", 
                               "Dr. Pushpa Kotian", "Dr. Yogesh Baliga", "Dr. Tarun Lobo", "Dr. Ranjana Salian", "Dr. Vikrant Hegde", 
                               "Dr. Shravan Prabhu", "Dr. Nirmala Shet", "Dr. Chandrashekar Bhat", "Dr. Usha Shenoy", "Dr. Praveen Pinto",
                               "Dr. Manjula Kamat", "Dr. Satish Naik", "Dr. Revathi Dsouza"};
            System.out.println("Rheumatology doctors found");
            return doctors;
        } else if (specialization == "Support Specialties") {
            String[] doctors = {"Dr. Chandrika Shetty", "Dr. Narayan Kamath", "Dr. Veena Pai", "Dr. Suresh Naik", "Dr. Latha Dsouza", 
                               "Dr. Ganapathi Kotian", "Dr. Ratna Baliga", "Dr. Uday Lobo", "Dr. Savitha Salian", "Dr. Mahesh Hegde", 
                               "Dr. Kusum Prabhu", "Dr. Shankar Shet", "Dr. Padma Bhat", "Dr. Raghu Shenoy", "Dr. Leela Pinto",
                               "Dr. Bhaskar Kamat", "Dr. Sunanda Naik", "Dr. Prithvi Dsouza"};
            System.out.println("Support Specialties doctors found");
            return doctors;
        } else if (specialization == "Thoracic Surgery") {
            String[] doctors = {"Dr. Vasudev Shetty", "Dr. Indira Kamath", "Dr. Parameshwara Pai", "Dr. Girija Naik", "Dr. Subhash Dsouza", 
                               "Dr. Yamuna Kotian", "Dr. Raghuveer Baliga", "Dr. Thara Lobo", "Dr. Vasanth Salian", "Dr. Niranjan Hegde", 
                               "Dr. Sulochana Prabhu", "Dr. Mahadev Shet", "Dr. Kamalamma Bhat", "Dr. Narayana Shenoy", "Dr. Jayalakshmi Pinto",
                               "Dr. Keshav Kamat", "Dr. Rajalakshmi Naik", "Dr. Gopalkrishna Dsouza"};
            System.out.println("Thoracic Surgery doctors found");
            return doctors;
        } else if (specialization == "Transfusion Medicine") {
            String[] doctors = {"Dr. Shantala Shetty", "Dr. Madan Kamath", "Dr. Rajendra Pai", "Dr. Pushpavathi Naik", "Dr. Krishnamurthy Dsouza", 
                               "Dr. Nagaveni Kotian", "Dr. Siddalinga Baliga", "Dr. Rajeshwari Lobo", "Dr. Manjunath Salian", "Dr. Geervani Hegde", 
                               "Dr. Basavaraj Prabhu", "Dr. Shobha Shet", "Dr. Rangaswamy Bhat", "Dr. Nagaratna Shenoy", "Dr. Shankarappa Pinto",
                               "Dr. Jayaprakash Kamat", "Dr. Thimmakka Naik", "Dr. Rudrappa Dsouza"};
            System.out.println("Transfusion Medicine doctors found");
            return doctors;
        } else if (specialization == "Urology") {
            String[] doctors = {"Dr. Parvathi Shetty", "Dr. Ravindra Kamath", "Dr. Shivanand Pai", "Dr. Kamaladevi Naik", "Dr. Mallikarjun Dsouza", 
                               "Dr. Rajeshwari Kotian", "Dr. Nanjappa Baliga", "Dr. Savitri Lobo", "Dr. Prakash Salian", "Dr. Jayanthi Hegde", 
                               "Dr. Ramachandra Prabhu", "Dr. Nagamma Shet", "Dr. Govind Bhat", "Dr. Parameshwari Shenoy", "Dr. Siddappa Pinto",
                               "Dr. Bhuvaneshwari Kamat", "Dr. Lokesh Naik", "Dr. Gangamma Dsouza"};
            System.out.println("Urology doctors found");
            return doctors;
        } else if (specialization == "Endocrine Surgery") {
            String[] doctors = {"Dr. Lalitha Shetty", "Dr. Shankar Kamath", "Dr. Mahalinga Pai", "Dr. Nagaveni Naik", "Dr. Basavaraju Dsouza", 
                               "Dr. Thangam Kotian", "Dr. Rangappa Baliga", "Dr. Jayalakshmi Lobo", "Dr. Somashekar Salian", "Dr. Ratnavali Hegde", 
                               "Dr. Krishnappa Prabhu", "Dr. Sulochana Shet", "Dr. Venkataramana Bhat", "Dr. Kusuma Shenoy", "Dr. Narasimha Pinto",
                               "Dr. Rajamma Kamat", "Dr. Gopala Naik", "Dr. Shantakumari Dsouza"};
            System.out.println("Endocrine Surgery doctors found");
            return doctors;
        } else if (specialization == "Vascular Surgery") {
            String[] doctors = {"Dr. Rajalakshmi Shetty", "Dr. Gopalan Kamath", "Dr. Thimme Gowda Pai", "Dr. Shyamala Naik", "Dr. Rudrappa Dsouza", 
                               "Dr. Jayashree Kotian", "Dr. Keshav Baliga", "Dr. Parvati Lobo", "Dr. Manohar Salian", "Dr. Lakshmidevi Hegde", 
                               "Dr. Bhima Prabhu", "Dr. Nagaratna Shet", "Dr. Chandrasekhar Bhat", "Dr. Umapathi Shenoy", "Dr. Leelavathi Pinto",
                               "Dr. Satyanarayana Kamat", "Dr. Revathi Naik", "Dr. Prabhakar Dsouza"};
            System.out.println("Vascular Surgery doctors found");
            return doctors;
        } else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {
            String[] doctors = {"Dr. Kamalamma Shetty", "Dr. Narayana Kamath", "Dr. Siddalingappa Pai", "Dr. Pushpavalli Naik", "Dr. Govindaraju Dsouza", 
                               "Dr. Rajeshwari Kotian", "Dr. Mahadevan Baliga", "Dr. Thangamma Lobo", "Dr. Shankarappa Salian", "Dr. Jayaprada Hegde", 
                               "Dr. Ramaprasad Prabhu", "Dr. Nagaveni Shet", "Dr. Basavraj Bhat", "Dr. Shantamma Shenoy", "Dr. Krishnamurthy Pinto",
                               "Dr. Gangamma Kamat", "Dr. Rajagopala Naik", "Dr. Mallika Dsouza"};
            System.out.println("Liver Transplant doctors found");
            return doctors;
        } else if (specialization == "Palliative Medicine") {
            String[] doctors = {"Dr. Shobhana Shetty", "Dr. Venkatesh Kamath", "Dr. Parameshwara Pai", "Dr. Girijamba Naik", "Dr. Subramanya Dsouza", 
                               "Dr. Yamuna Kotian", "Dr. Raghavendra Baliga", "Dr. Thara Lobo", "Dr. Vasanth Salian", "Dr. Niranjan Hegde", 
                               "Dr. Sulochana Prabhu", "Dr. Mahadev Shet", "Dr. Kamalamma Bhat", "Dr. Narayana Shenoy", "Dr. Jayalakshmi Pinto",
                               "Dr. Keshav Kamat", "Dr. Rajalakshmi Naik", "Dr. Gopalkrishna Dsouza"};
            System.out.println("Palliative Medicine doctors found");
            return doctors;
        } else if (specialization == "Medical Genetics") {
            String[] doctors = {"Dr. Chandrika Shetty", "Dr. Narayan Kamath", "Dr. Veena Pai", "Dr. Suresh Naik", "Dr. Latha Dsouza", 
                               "Dr. Ganapathi Kotian", "Dr. Ratna Baliga", "Dr. Uday Lobo", "Dr. Savitha Salian", "Dr. Mahesh Hegde", 
                               "Dr. Kusum Prabhu", "Dr. Shankar Shet", "Dr. Padma Bhat", "Dr. Raghu Shenoy", "Dr. Leela Pinto",
                               "Dr. Bhaskar Kamat", "Dr. Sunanda Naik", "Dr. Prithvi Dsouza"};
            System.out.println("Medical Genetics doctors found");
            return doctors;
        } else if (specialization == "Pain and Palliative Medicine") {
            String[] doctors = {"Dr. Vasudev Shetty", "Dr. Indira Kamath", "Dr. Parameshwara Pai", "Dr. Girija Naik", "Dr. Subhash Dsouza", 
                               "Dr. Yamuna Kotian", "Dr. Raghuveer Baliga", "Dr. Thara Lobo", "Dr. Vasanth Salian", "Dr. Niranjan Hegde", 
                               "Dr. Sulochana Prabhu", "Dr. Mahadev Shet", "Dr. Kamalamma Bhat", "Dr. Narayana Shenoy", "Dr. Jayalakshmi Pinto",
                               "Dr. Keshav Kamat", "Dr. Rajalakshmi Naik", "Dr. Gopalkrishna Dsouza"};
            System.out.println("Pain and Palliative Medicine doctors found");
            return doctors;
        } else if (specialization == "Geriatric Medicine") {
            String[] doctors = {"Dr. Shantala Shetty", "Dr. Madan Kamath", "Dr. Rajendra Pai", "Dr. Pushpavathi Naik", "Dr. Krishnamurthy Dsouza", 
                               "Dr. Nagaveni Kotian", "Dr. Siddalinga Baliga", "Dr. Rajeshwari Lobo", "Dr. Manjunath Salian", "Dr. Geervani Hegde", 
                               "Dr. Basavaraj Prabhu", "Dr. Shobha Shet", "Dr. Rangaswamy Bhat", "Dr. Nagaratna Shenoy", "Dr. Shankarappa Pinto",
                               "Dr. Jayaprakash Kamat", "Dr. Thimmakka Naik", "Dr. Rudrappa Dsouza"};
            System.out.println("Geriatric Medicine doctors found");
            return doctors;
        } else if (specialization == "Critical Care") {
            String[] doctors = {"Dr. Parvathi Shetty", "Dr. Ravindra Kamath", "Dr. Shivanand Pai", "Dr. Kamaladevi Naik", "Dr. Mallikarjun Dsouza", 
                               "Dr. Rajeshwari Kotian", "Dr. Nanjappa Baliga", "Dr. Savitri Lobo", "Dr. Prakash Salian", "Dr. Jayanthi Hegde", 
                               "Dr. Ramachandra Prabhu", "Dr. Nagamma Shet", "Dr. Govind Bhat", "Dr. Parameshwari Shenoy", "Dr. Siddappa Pinto",
                               "Dr. Bhuvaneshwari Kamat", "Dr. Lokesh Naik", "Dr. Gangamma Dsouza"};
            System.out.println("Critical Care doctors found");
            return doctors;
        } else if (specialization == "Nuclear Medicine") {
            String[] doctors = {"Dr. Lalitha Shetty", "Dr. Shankar Kamath", "Dr. Mahalinga Pai", "Dr. Nagaveni Naik", "Dr. Basavaraju Dsouza", 
                               "Dr. Thangam Kotian", "Dr. Rangappa Baliga", "Dr. Jayalakshmi Lobo", "Dr. Somashekar Salian", "Dr. Ratnavali Hegde", 
                               "Dr. Krishnappa Prabhu", "Dr. Sulochana Shet", "Dr. Venkataramana Bhat", "Dr. Kusuma Shenoy", "Dr. Narasimha Pinto",
                               "Dr. Rajamma Kamat", "Dr. Gopala Naik", "Dr. Shantakumari Dsouza"};
            System.out.println("Nuclear Medicine doctors found");
            return doctors;
        }
        else {
            System.out.println(specialization + " not found here");
        }
        return null;
    }

    public static void getDoctors(String[] doctors) {
        System.out.println("fetching doctors....");
        System.out.println("--------------------------------");
        for (String doctor : doctors) {
            System.out.println(doctor);
        }
        System.out.println("Above are the doctors List");
        System.out.println("--------------------------------");
    }
}
