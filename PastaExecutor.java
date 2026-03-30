class PastaExecutor {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

       
        pasta.addPasta("Spaghetti");
        pasta.addPasta("Penne");
        pasta.addPasta("Fusilli");
        pasta.addPasta("Macaroni");
        pasta.addPasta("Farfalle");
        pasta.addPasta("Linguine");
        pasta.addPasta("Rigatoni");
        pasta.addPasta("Fettuccine");
        pasta.addPasta("Ravioli");
        pasta.addPasta("Lasagna Sheets");
        pasta.addPasta("Tortellini");
        pasta.addPasta("Pappardelle");

        pasta.getPastas();
        System.out.println();

        int index = 3;
        String p = pasta.getPastaNameByIndex(index);
        System.out.println("Pasta at index " + index + " is: " + p);
        System.out.println();

        String searchName = "Fettuccine";
        int i = pasta.getIndexByPastaName(searchName);
        System.out.println("Pasta '" + searchName + "' is at index: " + i);
        System.out.println();

        String updated = "Fettuccine (Whole Wheat)";
        boolean ref = pasta.updatePasta("Fettuccine", updated);
        pasta.getPastas();
        System.out.println();

       
        String deleting = "Lasagna Sheets";
        boolean reff = pasta.deletePasta(deleting);
        pasta.getPastas();
    }
}
