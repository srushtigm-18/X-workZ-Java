class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla wonderla = new Wonderla();

        wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Rain Disco");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Fun Racers");
        wonderla.addWaterGame("Uphill Racers");
        wonderla.addWaterGame("Wavy and Vertical Fall");
        wonderla.addWaterGame("Harakiri");
        wonderla.addWaterGame("Mammoth");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Sea Lagoon");
        wonderla.addWaterGame("Drop and Tornado");
        wonderla.addWaterGame("Twisters");
        wonderla.addWaterGame("Water Pendulum");
        wonderla.addWaterGame("Kiddie Pool");
        wonderla.addWaterGame("Spray Pool");
        wonderla.addWaterGame("Fountain Play");
        wonderla.addWaterGame("Mini Slide Pool");
        wonderla.addWaterGame("Family Splash Pool");
        wonderla.addWaterGame("Tornado Slide");
        wonderla.addWaterGame("Blaster Slide");
        wonderla.addWaterGame("Adventure River");

        wonderla.getWaterGames();
        System.out.println();

        int index = 7;
        String game = wonderla.getWaterGameByIndex(index);
        System.out.println("The game at index " + index + " is: " + game);
        System.out.println();

        String gameName = "Lazy River";
        int i = wonderla.getIndexByWaterGameName(gameName);
        System.out.println("The game '" + gameName + "' is at index: " + i);
        System.out.println();


        String updatedGame = "Lazy River (Wave Mode)";
        boolean ref = wonderla.updateWaterGame("Lazy River", updatedGame);
		wonderla.getWaterGames();

        System.out.println();


        String deletingGame = "Rain Disco";
        boolean reff = wonderla.deleteWaterGame(deletingGame);
        wonderla.getWaterGames();

    }
}