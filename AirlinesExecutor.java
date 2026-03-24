class AirlinesExecutor {
    public static void main(String[] args) {
        Airlines airlines = new Airlines();

        airlines.addFlight("AI 191 : Bengaluru to Delhi");
        airlines.addFlight("AI 404 : Mumbai to Bengaluru");
        airlines.addFlight("AI 632 : Hyderabad to Chennai");
        airlines.addFlight("AI 203 : Kolkata to Mumbai");
        airlines.addFlight("AI 505 : Delhi to Bengaluru");
        airlines.addFlight("6E 512 : Bengaluru to Goa");
        airlines.addFlight("6E 634 : Mumbai to Patna");
        airlines.addFlight("6E 127 : Delhi to Guwahati");
        airlines.addFlight("6E 177 : Bengaluru to Lucknow");
        airlines.addFlight("6E 128 : Pune to Delhi");
        airlines.addFlight("UK 811 : Delhi to Bengaluru");
        airlines.addFlight("UK 811 : Bengaluru to Delhi");
        airlines.addFlight("UK 983 : Bengaluru to Hyderabad");
        airlines.addFlight("UK 984 : Hyderabad to Bengaluru");
        airlines.addFlight("G8 9811 : IndiGo");
        airlines.addFlight("G8 9822 : IndiGo");
        airlines.addFlight("SG 8910 : SpiceJet");
        airlines.addFlight("SG 8922 : SpiceJet");
        airlines.addFlight("SG 8933 : SpiceJet");
        airlines.addFlight("SG 8944 : SpiceJet");
        airlines.addFlight("UK 991 : Bengaluru to Mumbai");
        airlines.addFlight("UK 992 : Mumbai to Bengaluru");
        airlines.addFlight("UK 993 : Bengaluru to Kolkata");
        airlines.addFlight("UK 994 : Kolkata to Bengaluru");
        airlines.addFlight("UK 995 : Bengaluru to Chennai");
        airlines.addFlight("UK 996 : Chennai to Bengaluru");
        airlines.addFlight("AI 405 : Bengaluru to Mumbai");
        airlines.addFlight("AI 192 : Delhi to Bengaluru");
        airlines.addFlight("AI 193 : Bengaluru to Cochin");
        airlines.addFlight("AI 194 : Cochin to Bengaluru");

        airlines.getFlights();
    }
}
