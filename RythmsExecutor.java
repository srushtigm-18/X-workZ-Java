class RythmsExecutor {
    public static void main(String[] args) {
        Rythms r1 = new Rythms();
        r1.academyId = 1; r1.academyName = "Rhythm House Bengaluru"; r1.location = "MG Road"; r1.genre = "Jazz";
        MusicInstrument i1 = new MusicInstrument(); i1.instrumentId = 101; i1.instrumentName = "Snare Drum"; i1.type = "Percussion"; i1.price = 25000; i1.material = "Maple";
        r1.instrument = i1; r1.getRythmsDetails();

        Rythms r2 = new Rythms();
        r2.academyId = 2; r2.academyName = "Beat Street"; r2.location = "Indiranagar"; r2.genre = "Rock";
        MusicInstrument i2 = new MusicInstrument(); i2.instrumentId = 102; i2.instrumentName = "Bass Guitar"; i2.type = "String"; i2.price = 45000; i2.material = "Alder";
        r2.instrument = i2; r2.getRythmsDetails();

        Rythms r3 = new Rythms();
        r3.academyId = 3; r3.academyName = "Tabla Talim"; r3.location = "Jayanagar"; r3.genre = "Indian Classical";
        MusicInstrument i3 = new MusicInstrument(); i3.instrumentId = 103; i3.instrumentName = "Tabla"; i3.type = "Percussion"; i3.price = 18000; i3.material = "Wood Clay";
        r3.instrument = i3; r3.getRythmsDetails();

        Rythms r4 = new Rythms();
        r4.academyId = 4; r4.academyName = "Drum Zone"; r4.location = "Koramangala"; r4.genre = "Fusion";
        MusicInstrument i4 = new MusicInstrument(); i4.instrumentId = 104; i4.instrumentName = "Conga"; i4.type = "Percussion"; i4.price = 32000; i4.material = "Fiberglass";
        r4.instrument = i4; r4.getRythmsDetails();

        Rythms r5 = new Rythms();
        r5.academyId = 5; r5.academyName = "Latin Rhythms"; r5.location = "Whitefield"; r5.genre = "Latin";
        MusicInstrument i5 = new MusicInstrument(); i5.instrumentId = 105; i5.instrumentName = "Djembe"; i5.type = "Percussion"; i5.price = 22000; i5.material = "Mango Wood";
        r5.instrument = i5; r5.getRythmsDetails();

        Rythms r6 = new Rythms();
        r6.academyId = 6; r6.academyName = "Rock School"; r6.location = "Malleshwaram"; r6.genre = "Hard Rock";
        MusicInstrument i6 = new MusicInstrument(); i6.instrumentId = 106; i6.instrumentName = "Kick Drum"; i6.type = "Percussion"; i6.price = 38000; i6.material = "Birch";
        r6.instrument = i6; r6.getRythmsDetails();

        Rythms r7 = new Rythms();
        r7.academyId = 7; r7.academyName = "Fusion Beats"; r7.location = "HSR Layout"; r7.genre = "Fusion";
        MusicInstrument i7 = new MusicInstrument(); i7.instrumentId = 107; i7.instrumentName = "Cajon"; i7.type = "Percussion"; i7.price = 15000; i7.material = "Balsam";
        r7.instrument = i7; r7.getRythmsDetails();

        Rythms r8 = new Rythms();
        r8.academyId = 8; r8.academyName = "Electric Avenue"; r8.location = "Electronic City"; r8.genre = "Electronic";
        MusicInstrument i8 = new MusicInstrument(); i8.instrumentId = 108; i8.instrumentName = "Electronic Drum Pad"; i8.type = "Electronic"; i8.price = 65000; i8.material = "Mesh Heads";
        r8.instrument = i8; r8.getRythmsDetails();

        Rythms r9 = new Rythms();
        r9.academyId = 9; r9.academyName = "Carnatic Rhythms"; r9.location = "Basavangudi"; r9.genre = "Carnatic";
        MusicInstrument i9 = new MusicInstrument(); i9.instrumentId = 109; i9.instrumentName = "Mridangam"; i9.type = "Percussion"; i9.price = 28000; i9.material = "Jackfruit Wood";
        r9.instrument = i9; r9.getRythmsDetails();

        Rythms r10 = new Rythms();
        r10.academyId = 10; r10.academyName = "Blues Corner"; r10.location = "Church Street"; r10.genre = "Blues";
        MusicInstrument i10 = new MusicInstrument(); i10.instrumentId = 110; i10.instrumentName = "Hi-Hat"; i10.type = "Percussion"; i10.price = 21000; i10.material = "Brass";
        r10.instrument = i10; r10.getRythmsDetails();

        Rythms r11 = new Rythms();
        r11.academyId = 11; r11.academyName = "Rhythm Hub"; r11.location = "Marathahalli"; r11.genre = "Pop";
        MusicInstrument i11 = new MusicInstrument(); i11.instrumentId = 111; i11.instrumentName = "Shaker"; i11.type = "Percussion"; i11.price = 3500; i11.material = "Fiberglass";
        r11.instrument = i11; r11.getRythmsDetails();

        Rythms r12 = new Rythms();
        r12.academyId = 12; r12.academyName = "Afro Beats"; r12.location = "BTM Layout"; r12.genre = "Afrobeat";
        MusicInstrument i12 = new MusicInstrument(); i12.instrumentId = 112; i12.instrumentName = "Talking Drum"; i12.type = "Percussion"; i12.price = 42000; i12.material = "Animal Skin";
        r12.instrument = i12; r12.getRythmsDetails();

        Rythms r13 = new Rythms();
        r13.academyId = 13; r13.academyName = "Metal Mania"; r13.location = "Kadubeesanahalli"; r13.genre = "Metal";
        MusicInstrument i13 = new MusicInstrument(); i13.instrumentId = 113; i13.instrumentName = "Double Bass Pedal"; i13.type = "Percussion"; i13.price = 28000; i13.material = "Steel";
        r13.instrument = i13; r13.getRythmsDetails();

        Rythms r14 = new Rythms();
        r14.academyId = 14; r14.academyName = "Hindustani Tal"; r14.location = "Malleswaram"; r14.genre = "Hindustani";
        MusicInstrument i14 = new MusicInstrument(); i14.instrumentId = 114; i14.instrumentName = "Pakhawaj"; i14.type = "Percussion"; i14.price = 35000; i14.material = "Tuned Clay";
        r14.instrument = i14; r14.getRythmsDetails();

        Rythms r15 = new Rythms();
        r15.academyId = 15; r15.academyName = "Reggae Roots"; r15.location = "Domlur"; r15.genre = "Reggae";
        MusicInstrument i15 = new MusicInstrument(); i15.instrumentId = 115; i15.instrumentName = "Rim Shot"; i15.type = "Percussion"; i15.price = 12000; i15.material = "Stainless Steel";
        r15.instrument = i15; r15.getRythmsDetails();

        Rythms r16 = new Rythms();
        r16.academyId = 16; r16.academyName = "Funk Factory"; r16.location = "Jayanagar"; r16.genre = "Funk";
        MusicInstrument i16 = new MusicInstrument(); i16.instrumentId = 116; i16.instrumentName = "Cowbell"; i16.type = "Percussion"; i16.price = 4500; i16.material = "Bronze";
        r16.instrument = i16; r16.getRythmsDetails();

        Rythms r17 = new Rythms();
        r17.academyId = 17; r17.academyName = "Salsa Station"; r17.location = "Brigade Road"; r17.genre = "Salsa";
        MusicInstrument i17 = new MusicInstrument(); i17.instrumentId = 117; i17.instrumentName = "Claves"; i17.type = "Percussion"; i17.price = 2500; i17.material = "Rosewood";
        r17.instrument = i17; r17.getRythmsDetails();

        Rythms r18 = new Rythms();
        r18.academyId = 18; r18.academyName = "Drum Circle"; r18.location = "Cubbon Park"; r18.genre = "World Music";
        MusicInstrument i18 = new MusicInstrument(); i18.instrumentId = 118; i18.instrumentName = "Bongo"; i18.type = "Percussion"; i18.price = 18000; i18.material = "Sapele Wood";
        r18.instrument = i18; r18.getRythmsDetails();

        Rythms r19 = new Rythms();
        r19.academyId = 19; r19.academyName = "Electronic Rythms"; r19.location = "Silicon Valley"; r19.genre = "EDM";
        MusicInstrument i19 = new MusicInstrument(); i19.instrumentId = 119; i19.instrumentName = "Electronic Shaker"; i19.type = "Electronic"; i19.price = 8500; i19.material = "Plastic";
        r19.instrument = i19; r19.getRythmsDetails();

        Rythms r20 = new Rythms();
        r20.academyId = 20; r20.academyName = "Ultimate Percussion"; r20.location = "Residency Road"; r20.genre = "All Genres";
        MusicInstrument i20 = new MusicInstrument(); i20.instrumentId = 120; i20.instrumentName = "Timpani"; i20.type = "Percussion"; i20.price = 125000; i20.material = "Fiberglass Copper";
        r20.instrument = i20; r20.getRythmsDetails();
    }
}
