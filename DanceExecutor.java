class DanceExecutor {
    public static void main(String[] args) {
        Dance d1 = new Dance();
        d1.academyId = 1; d1.academyName = "Kalakshetra"; d1.location = "Bengaluru"; d1.founder = "Rukmini Devi";
        Form f1 = new Form(); f1.formId = 1; f1.danceName = "Bharatanatyam"; f1.originState = "Tamil Nadu"; f1.durationMinutes = 60; f1.fee = 8.5;
        d1.form = f1; d1.getDanceDetails();

        Dance d2 = new Dance();
        d2.academyId = 2; d2.academyName = "Kathak Kendra"; d2.location = "Delhi"; d2.founder = "Birju Maharaj";
        Form f2 = new Form(); f2.formId = 2; f2.danceName = "Kathak"; f2.originState = "Uttar Pradesh"; f2.durationMinutes = 75; f2.fee = 7.2;
        d2.form = f2; d2.getDanceDetails();

        Dance d3 = new Dance();
        d3.academyId = 3; d3.academyName = "Kalavihar"; d3.location = "Thrissur"; d3.founder = "Kalamandalam";
        Form f3 = new Form(); f3.formId = 3; f3.danceName = "Kathakali"; f3.originState = "Kerala"; f3.durationMinutes = 90; f3.fee = 9.8;
        d3.form = f3; d3.getDanceDetails();

        Dance d4 = new Dance();
        d4.academyId = 4; d4.academyName = "Kuchipudi Kalakshetra"; d4.location = "Vijayawada"; d4.founder = "Vempati Chinna Satyam";
        Form f4 = new Form(); f4.formId = 4; f4.danceName = "Kuchipudi"; f4.originState = "Andhra Pradesh"; f4.durationMinutes = 65; f4.fee = 6.9;
        d4.form = f4; d4.getDanceDetails();

        Dance d5 = new Dance();
        d5.academyId = 5; d5.academyName = "Manipuri Nartanalaya"; d5.location = "Imphal"; d5.founder = "Guru Amubi Singh";
        Form f5 = new Form(); f5.formId = 5; f5.danceName = "Manipuri"; f5.originState = "Manipur"; f5.durationMinutes = 70; f5.fee = 7.5;
        d5.form = f5; d5.getDanceDetails();

        Dance d6 = new Dance();
        d6.academyId = 6; d6.academyName = "Mohiniyattam Kalari"; d6.location = "Kochi"; d6.founder = "KPAC Lalitha";
        Form f6 = new Form(); f6.formId = 6; f6.danceName = "Mohiniyattam"; f6.originState = "Kerala"; f6.durationMinutes = 55; f6.fee = 8.0;
        d6.form = f6; d6.getDanceDetails();

        Dance d7 = new Dance();
        d7.academyId = 7; d7.academyName = "Odissi Nrutya Mandir"; d7.location = "Bhubaneswar"; d7.founder = "Kelucharan Mohapatra";
        Form f7 = new Form(); f7.formId = 7; f7.danceName = "Odissi"; f7.originState = "Odisha"; f7.durationMinutes = 80; f7.fee = 7.8;
        d7.form = f7; d7.getDanceDetails();

        Dance d8 = new Dance();
        d8.academyId = 8; d8.academyName = "Sattriya Academy"; d8.location = "Guwahati"; d8.founder = "Raseswar Saikia";
        Form f8 = new Form(); f8.formId = 8; f8.danceName = "Sattriya"; f8.originState = "Assam"; f8.durationMinutes = 85; f8.fee = 6.5;
        d8.form = f8; d8.getDanceDetails();

        Dance d9 = new Dance();
        d9.academyId = 9; d9.academyName = "Nritya Sharma"; d9.location = "Bengaluru"; d9.founder = "Alarmel Valli";
        Form f9 = new Form(); f9.formId = 9; f9.danceName = "Bharatanatyam"; f9.originState = "Tamil Nadu"; f9.durationMinutes = 60; f9.fee = 9.2;
        d9.form = f9; d9.getDanceDetails();

        Dance d10 = new Dance();
        d10.academyId = 10; d10.academyName = "Kathak Kala"; d10.location = "Lucknow"; d10.founder = "Saswati Sen";
        Form f10 = new Form(); f10.formId = 10; f10.danceName = "Kathak"; f10.originState = "Uttar Pradesh"; f10.durationMinutes = 70; f10.fee = 8.1;
        d10.form = f10; d10.getDanceDetails();

        Dance d11 = new Dance();
        d11.academyId = 11; d11.academyName = "Kalakshetra East"; d11.location = "Chennai"; d11.founder = "Dhananjayan";
        Form f11 = new Form(); f11.formId = 11; f11.danceName = "Bharatanatyam"; f11.originState = "Tamil Nadu"; f11.durationMinutes = 65; f11.fee = 7.9;
        d11.form = f11; d11.getDanceDetails();

        Dance d12 = new Dance();
        d12.academyId = 12; d12.academyName = "Kathakali Kendra"; d12.location = "New Delhi"; d12.founder = "Kalamandalam Gopi";
        Form f12 = new Form(); f12.formId = 12; f12.danceName = "Kathakali"; f12.originState = "Kerala"; f12.durationMinutes = 95; f12.fee = 10.5;
        d12.form = f12; d12.getDanceDetails();

        Dance d13 = new Dance();
        d13.academyId = 13; d13.academyName = "Kuchipudi Centre"; d13.location = "Hyderabad"; d13.founder = "Yakshagana Rao";
        Form f13 = new Form(); f13.formId = 13; f13.danceName = "Kuchipudi"; f13.originState = "Andhra Pradesh"; f13.durationMinutes = 68; f13.fee = 7.3;
        d13.form = f13; d13.getDanceDetails();

        Dance d14 = new Dance();
        d14.academyId = 14; d14.academyName = "Manipuri Sangha"; d14.location = "Bengaluru"; d14.founder = "Nana Senapati";
        Form f14 = new Form(); f14.formId = 14; f14.danceName = "Manipuri"; f14.originState = "Manipur"; f14.durationMinutes = 72; f14.fee = 6.8;
        d14.form = f14; d14.getDanceDetails();

        Dance d15 = new Dance();
        d15.academyId = 15; d15.academyName = "Mohiniyattam House"; d15.location = "Thrissur"; d15.founder = "Smitha Rajan";
        Form f15 = new Form(); f15.formId = 15; f15.danceName = "Mohiniyattam"; f15.originState = "Kerala"; f15.durationMinutes = 58; f15.fee = 8.7;
        d15.form = f15; d15.getDanceDetails();

        Dance d16 = new Dance();
        d16.academyId = 16; d16.academyName = "Odissi Path"; d16.location = "Puri"; d16.founder = "Sanjukta Panigrahi";
        Form f16 = new Form(); f16.formId = 16; f16.danceName = "Odissi"; f16.originState = "Odisha"; f16.durationMinutes = 82; f16.fee = 8.4;
        d16.form = f16; d16.getDanceDetails();

        Dance d17 = new Dance();
        d17.academyId = 17; d17.academyName = "Sattriya Niketan"; d17.location = "Majuli"; d17.founder = "Raseswar Barbaruah";
        Form f17 = new Form(); f17.formId = 17; f17.danceName = "Sattriya"; f17.originState = "Assam"; f17.durationMinutes = 88; f17.fee = 7.1;
        d17.form = f17; d17.getDanceDetails();

        Dance d18 = new Dance();
        d18.academyId = 18; d18.academyName = "Nrityalaya"; d18.location = "Mumbai"; d18.founder = " alarmel Valli";
        Form f18 = new Form(); f18.formId = 18; f18.danceName = "Bharatanatyam"; f18.originState = "Tamil Nadu"; f18.durationMinutes = 62; f18.fee = 9.0;
        d18.form = f18; d18.getDanceDetails();

        Dance d19 = new Dance();
        d19.academyId = 19; d19.academyName = "Kathak Manjari"; d19.location = "Jaipur"; d19.founder = "Jaya Menon";
        Form f19 = new Form(); f19.formId = 19; f19.danceName = "Kathak"; f19.originState = "Rajasthan"; f19.durationMinutes = 78; f19.fee = 8.3;
        d19.form = f19; d19.getDanceDetails();

        Dance d20 = new Dance();
        d20.academyId = 20; d20.academyName = "Classical Arts"; d20.location = "Bengaluru"; d20.founder = "Leela Samson";
        Form f20 = new Form(); f20.formId = 20; f20.danceName = "Kathakali"; f20.originState = "Kerala"; f20.durationMinutes = 92; f20.fee = 9.5;
        d20.form = f20; d20.getDanceDetails();
    }
}
