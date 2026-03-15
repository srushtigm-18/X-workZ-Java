class OfficeExecutor{
    public static void main(String[] args){
        Office office1 = new Office(1, "Cardiology Admin", "Departmental", true, "Block A", 
                                   "Cardiology", 12, 10, true, "5 Computers Projector", 
                                   "Dr. Sharma", "Main Hospital", true, 3, 1500.0, 
                                   "Narayana Health", true, 5, 50000.0, true, 
                                   "Occupied", "High");
        office1.getOfficeDetails();

        Office office2 = new Office(2, "Neurology Office", "Specialty", true, "Block B", 
                                   "Neurology", 8, 7, false, "4 PCs Printer", 
                                   "Dr. Rao", "NIMHANS Wing", true, 4, 1200.0, 
                                   "NIMHANS Bengaluru", true, 4, 45000.0, true, 
                                   "Occupied", "High");
        office2.getOfficeDetails();

        Office office3 = new Office(3, "Admin Director", "Executive", true, "Penthouse", 
                                   "Hospital Admin", 6, 4, true, "Conference Table", 
                                   "Srushti G M", "Admin Tower", true, 7, 2000.0, 
                                   "Narayana Health", true, 3, 80000.0, true, 
                                   "Occupied", "Critical");
        office3.getOfficeDetails();

        Office office4 = new Office(4, "Pharmacy Office", "Support", true, "Ground Floor", 
                                   "Pharmacy", 10, 8, false, "2 PCs Inventory System", 
                                   "Mr. Patel", "Pharmacy Block", false, 1, 900.0, 
                                   "Apollo Hospital", true, 2, 25000.0, true, 
                                   "Occupied", "Medium");
        office4.getOfficeDetails();

        Office office5 = new Office(5, "HR Department", "Administrative", true, "West Wing", 
                                   "Human Resources", 15, 12, true, "HR Software Scanner", 
                                   "Ms. Lakshmi", "Admin Building", true, 2, 1800.0, 
                                   "Manipal Hospital", true, 6, 60000.0, true, 
                                   "Occupied", "High");
        office5.getOfficeDetails();

        Office office6 = new Office(6, "Finance Office", "Financial", true, "East Wing", 
                                   "Accounts", 10, 9, true, "Accounting Software Printers", 
                                   "Mr. Gupta", "Finance Tower", true, 5, 1400.0, 
                                   "Fortis Hospital", true, 5, 45000.0, true, 
                                   "Occupied", "High");
        office6.getOfficeDetails();

        Office office7 = new Office(7, "IT Support", "Technical", true, "Basement", 
                                   "Information Technology", 20, 15, false, "Servers Workstations", 
                                   "Mr. Kumar", "Data Center", false, 0, 2500.0, 
                                   "Sakra World Hospital", true, 20, 120000.0, true, 
                                   "Occupied", "Critical");
        office7.getOfficeDetails();

        Office office8 = new Office(8, "Billing Center", "Revenue", true, "Main Lobby", 
                                   "Patient Billing", 25, 22, true, "Billing Terminals POS", 
                                   "Ms. Priya", "Revenue Block", true, 1, 2200.0, 
                                   "Columbia Asia", true, 15, 75000.0, true, 
                                   "Occupied", "High");
        office8.getOfficeDetails();

        Office office9 = new Office(9, "Quality Control", "Regulatory", true, "North Wing", 
                                   "Quality Assurance", 8, 6, true, "Audit Software Projector", 
                                   "Dr. Nair", "Compliance Building", true, 6, 1100.0, 
                                   "Aster CMI", true, 4, 40000.0, true, 
                                   "Occupied", "Medium");
        office9.getOfficeDetails();

        Office office10 = new Office(10, "CEO Suite", "Executive", true, "Top Floor", 
                                    "Chief Executive", 8, 5, true, "Executive Desk Conference", 
                                    "Srushti G M", "Corporate Tower", true, 10, 3000.0, 
                                    "Narayana Health", true, 4, 150000.0, true, 
                                    "Occupied", "Critical");
        office10.getOfficeDetails();
    }
}
