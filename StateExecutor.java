class StateExecutor {
    public static void main(String[] args) {
        State state = new State();

        state.addHighway("NH 44 : Srinagar to Kanyakumari");
        state.addHighway("NH 48 : Delhi to Chennai");
        state.addHighway("NH 66 : Mumbai to Kochi");
        state.addHighway("NH 27 : Guwahati to Porbandar");
        state.addHighway("NH 16 : Kolkata to Chennai");
        state.addHighway("NH 4 : Mumbai to Ernakulam");
        state.addHighway("NH 7 : Varanasi to Kanyakumari");
        state.addHighway("NH 8 : Delhi to Mumbai");
        state.addHighway("NH 10 : Delhi to Fazilka");

        state.getHighways();
    }
}
