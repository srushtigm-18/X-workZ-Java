class CaseEvidenceExecutor {
    public static void main(String[] args) {
        
        CaseEvidence evidence1 = new CaseEvidence();
        evidence1.setCaseId(1001); 
        evidence1.setCaseType("theft");
        evidence1.setEvidenceType("physical");
        evidence1.setDescription("gold chain");
        evidence1.setCollectedOn("2026-03-30"); 
        evidence1.setStatus("admissible");
        evidence1.setLocation("crime scene");

        System.out.println("Case id is " + evidence1.getCaseId());
        System.out.println("Case type is " + evidence1.getCaseType());
        System.out.println("Evidence type is " + evidence1.getEvidenceType());
        System.out.println("Description is " + evidence1.getDescription());
        System.out.println("Collected on " + evidence1.getCollectedOn());
        System.out.println("Status is " + evidence1.getStatus());
        System.out.println("Location is " + evidence1.getLocation());
        System.out.println();

        CaseEvidence evidence2 = new CaseEvidence();
        evidence2.setCaseId(1002); 
        evidence2.setCaseType("fraud"); 
        evidence2.setEvidenceType("documentary");
        evidence2.setDescription("fake cheques");
        evidence2.setCollectedOn("2026-03-31");
        evidence2.setStatus("admissible");
        evidence2.setLocation("bank");

        System.out.println("Case id is " + evidence2.getCaseId());
        System.out.println("Case type is " + evidence2.getCaseType());
        System.out.println("Evidence type is " + evidence2.getEvidenceType());
        System.out.println("Description is " + evidence2.getDescription());
        System.out.println("Collected on " + evidence2.getCollectedOn());
        System.out.println("Status is " + evidence2.getStatus());
        System.out.println("Location is " + evidence2.getLocation());
        System.out.println();

        
		CaseEvidence evidence3 = new CaseEvidence();
        evidence3.setCaseId(1003); 
        evidence3.setCaseType("murder"); 
        evidence3.setEvidenceType("physical");
        evidence3.setDescription("bloody knife");
        evidence3.setCollectedOn("2026-04-01");
        evidence3.setStatus("admissible");
        evidence3.setLocation("crime scene");

        System.out.println("Case id is " + evidence3.getCaseId());
        System.out.println("Case type is " + evidence3.getCaseType());
        System.out.println("Evidence type is " + evidence3.getEvidenceType());
        System.out.println("Description is " + evidence3.getDescription());
        System.out.println("Collected on " + evidence3.getCollectedOn());
        System.out.println("Status is " + evidence3.getStatus());
        System.out.println("Location is " + evidence3.getLocation());
        System.out.println();

        CaseEvidence evidence4 = new CaseEvidence();
        evidence4.setCaseId(1004); 
        evidence4.setCaseType("assault"); 
        evidence4.setEvidenceType("testimonial");
        evidence4.setDescription("eyewitness statement");
        evidence4.setCollectedOn("2026-04-02");
        evidence4.setStatus("under review");
        evidence4.setLocation("witness home");

        System.out.println("Case id is " + evidence4.getCaseId());
        System.out.println("Case type is " + evidence4.getCaseType());
        System.out.println("Evidence type is " + evidence4.getEvidenceType());
        System.out.println("Description is " + evidence4.getDescription());
        System.out.println("Collected on " + evidence4.getCollectedOn());
        System.out.println("Status is " + evidence4.getStatus());
        System.out.println("Location is " + evidence4.getLocation());
        System.out.println();

        CaseEvidence evidence5 = new CaseEvidence();
        evidence5.setCaseId(1005); 
        evidence5.setCaseType("cybercrime"); 
        evidence5.setEvidenceType("digital");
        evidence5.setDescription("IP logs");
        evidence5.setCollectedOn("2026-04-03");
        evidence5.setStatus("admissible");
        evidence5.setLocation("server room");

        System.out.println("Case id is " + evidence5.getCaseId());
        System.out.println("Case type is " + evidence5.getCaseType());
        System.out.println("Evidence type is " + evidence5.getEvidenceType());
        System.out.println("Description is " + evidence5.getDescription());
        System.out.println("Collected on " + evidence5.getCollectedOn());
        System.out.println("Status is " + evidence5.getStatus());
        System.out.println("Location is " + evidence5.getLocation());
        System.out.println();
		
		
		CaseEvidence evidence6 = new CaseEvidence();
        evidence6.setCaseId(1006); 
        evidence6.setCaseType("robbery"); 
        evidence6.setEvidenceType("video");
        evidence6.setDescription("CCTV footage");
        evidence6.setCollectedOn("2026-04-04");
        evidence6.setStatus("admissible");
        evidence6.setLocation("bank camera");

        System.out.println("Case id is " + evidence6.getCaseId());
        System.out.println("Case type is " + evidence6.getCaseType());
        System.out.println("Evidence type is " + evidence6.getEvidenceType());
        System.out.println("Description is " + evidence6.getDescription());
        System.out.println("Collected on " + evidence6.getCollectedOn());
        System.out.println("Status is " + evidence6.getStatus());
        System.out.println("Location is " + evidence6.getLocation());
        System.out.println();

        CaseEvidence evidence7 = new CaseEvidence();
        evidence7.setCaseId(1007); 
        evidence7.setCaseType("burglary"); 
        evidence7.setEvidenceType("physical");
        evidence7.setDescription("fingerprints");
        evidence7.setCollectedOn("2026-04-05");
        evidence7.setStatus("under review");
        evidence7.setLocation("break-in site");

        System.out.println("Case id is " + evidence7.getCaseId());
        System.out.println("Case type is " + evidence7.getCaseType());
        System.out.println("Evidence type is " + evidence7.getEvidenceType());
        System.out.println("Description is " + evidence7.getDescription());
        System.out.println("Collected on " + evidence7.getCollectedOn());
        System.out.println("Status is " + evidence7.getStatus());
        System.out.println("Location is " + evidence7.getLocation());
        System.out.println();

        CaseEvidence evidence8 = new CaseEvidence();
        evidence8.setCaseId(1008); 
        evidence8.setCaseType("arson"); 
        evidence8.setEvidenceType("chemical");
        evidence8.setDescription("accelerant residue");
        evidence8.setCollectedOn("2026-04-06");
        evidence8.setStatus("admissible");
        evidence8.setLocation("fire scene");

        System.out.println("Case id is " + evidence8.getCaseId());
        System.out.println("Case type is " + evidence8.getCaseType());
        System.out.println("Evidence type is " + evidence8.getEvidenceType());
        System.out.println("Description is " + evidence8.getDescription());
        System.out.println("Collected on " + evidence8.getCollectedOn());
        System.out.println("Status is " + evidence8.getStatus());
        System.out.println("Location is " + evidence8.getLocation());
        System.out.println();
		
		CaseEvidence evidence9 = new CaseEvidence();
        evidence9.setCaseId(1009); 
        evidence9.setCaseType("drug trafficking"); 
        evidence9.setEvidenceType("physical");
        evidence9.setDescription("narcotics packet");
        evidence9.setCollectedOn("2026-04-07");
        evidence9.setStatus("admissible");
        evidence9.setLocation("vehicle trunk");

        System.out.println("Case id is " + evidence9.getCaseId());
        System.out.println("Case type is " + evidence9.getCaseType());
        System.out.println("Evidence type is " + evidence9.getEvidenceType());
        System.out.println("Description is " + evidence9.getDescription());
        System.out.println("Collected on " + evidence9.getCollectedOn());
        System.out.println("Status is " + evidence9.getStatus());
        System.out.println("Location is " + evidence9.getLocation());
        System.out.println();

        CaseEvidence evidence10 = new CaseEvidence();
        evidence10.setCaseId(1010); 
        evidence10.setCaseType("embezzlement"); 
        evidence10.setEvidenceType("documentary");
        evidence10.setDescription("forged receipts");
        evidence10.setCollectedOn("2026-04-08");
        evidence10.setStatus("inadmissible");
        evidence10.setLocation("company office");

        System.out.println("Case id is " + evidence10.getCaseId());
        System.out.println("Case type is " + evidence10.getCaseType());
        System.out.println("Evidence type is " + evidence10.getEvidenceType());
        System.out.println("Description is " + evidence10.getDescription());
        System.out.println("Collected on " + evidence10.getCollectedOn());
        System.out.println("Status is " + evidence10.getStatus());
        System.out.println("Location is " + evidence10.getLocation());
        System.out.println();

        CaseEvidence evidence11 = new CaseEvidence();
        evidence11.setCaseId(1011); 
        evidence11.setCaseType("kidnapping"); 
        evidence11.setEvidenceType("digital");
        evidence11.setDescription("ransom call recording");
        evidence11.setCollectedOn("2026-04-09");
        evidence11.setStatus("under review");
        evidence11.setLocation("victim phone");

        System.out.println("Case id is " + evidence11.getCaseId());
        System.out.println("Case type is " + evidence11.getCaseType());
        System.out.println("Evidence type is " + evidence11.getEvidenceType());
        System.out.println("Description is " + evidence11.getDescription());
        System.out.println("Collected on " + evidence11.getCollectedOn());
        System.out.println("Status is " + evidence11.getStatus());
        System.out.println("Location is " + evidence11.getLocation());
        System.out.println();
		
		CaseEvidence evidence12 = new CaseEvidence();
        evidence12.setCaseId(1012); 
        evidence12.setCaseType("extortion"); 
        evidence12.setEvidenceType("digital");
        evidence12.setDescription("threatening emails");
        evidence12.setCollectedOn("2026-04-10");
        evidence12.setStatus("admissible");
        evidence12.setLocation("suspect laptop");

        System.out.println("Case id is " + evidence12.getCaseId());
        System.out.println("Case type is " + evidence12.getCaseType());
        System.out.println("Evidence type is " + evidence12.getEvidenceType());
        System.out.println("Description is " + evidence12.getDescription());
        System.out.println("Collected on " + evidence12.getCollectedOn());
        System.out.println("Status is " + evidence12.getStatus());
        System.out.println("Location is " + evidence12.getLocation());
        System.out.println();

        CaseEvidence evidence13 = new CaseEvidence();
        evidence13.setCaseId(1013); 
        evidence13.setCaseType("forgery"); 
        evidence13.setEvidenceType("documentary");
        evidence13.setDescription("fake signatures");
        evidence13.setCollectedOn("2026-04-11");
        evidence13.setStatus("under review");
        evidence13.setLocation("forged documents");

        System.out.println("Case id is " + evidence13.getCaseId());
        System.out.println("Case type is " + evidence13.getCaseType());
        System.out.println("Evidence type is " + evidence13.getEvidenceType());
        System.out.println("Description is " + evidence13.getDescription());
        System.out.println("Collected on " + evidence13.getCollectedOn());
        System.out.println("Status is " + evidence13.getStatus());
        System.out.println("Location is " + evidence13.getLocation());
        System.out.println();

        CaseEvidence evidence14 = new CaseEvidence();
        evidence14.setCaseId(1014); 
        evidence14.setCaseType("poaching"); 
        evidence14.setEvidenceType("physical");
        evidence14.setDescription("illegal animal traps");
        evidence14.setCollectedOn("2026-04-12");
        evidence14.setStatus("admissible");
        evidence14.setLocation("forest area");

        System.out.println("Case id is " + evidence14.getCaseId());
        System.out.println("Case type is " + evidence14.getCaseType());
        System.out.println("Evidence type is " + evidence14.getEvidenceType());
        System.out.println("Description is " + evidence14.getDescription());
        System.out.println("Collected on " + evidence14.getCollectedOn());
        System.out.println("Status is " + evidence14.getStatus());
        System.out.println("Location is " + evidence14.getLocation());
        System.out.println();
		
		CaseEvidence evidence15 = new CaseEvidence();
        evidence15.setCaseId(1015); 
        evidence15.setCaseType("human trafficking"); 
        evidence15.setEvidenceType("testimonial");
        evidence15.setDescription("victim statement");
        evidence15.setCollectedOn("2026-04-13");
        evidence15.setStatus("admissible");
        evidence15.setLocation("safe house");

        System.out.println("Case id is " + evidence15.getCaseId());
        System.out.println("Case type is " + evidence15.getCaseType());
        System.out.println("Evidence type is " + evidence15.getEvidenceType());
        System.out.println("Description is " + evidence15.getDescription());
        System.out.println("Collected on " + evidence15.getCollectedOn());
        System.out.println("Status is " + evidence15.getStatus());
        System.out.println("Location is " + evidence15.getLocation());
        System.out.println();

        CaseEvidence evidence16 = new CaseEvidence();
        evidence16.setCaseId(1016); 
        evidence16.setCaseType("money laundering"); 
        evidence16.setEvidenceType("financial");
        evidence16.setDescription("suspicious transactions");
        evidence16.setCollectedOn("2026-04-14");
        evidence16.setStatus("under review");
        evidence16.setLocation("bank records");

        System.out.println("Case id is " + evidence16.getCaseId());
        System.out.println("Case type is " + evidence16.getCaseType());
        System.out.println("Evidence type is " + evidence16.getEvidenceType());
        System.out.println("Description is " + evidence16.getDescription());
        System.out.println("Collected on " + evidence16.getCollectedOn());
        System.out.println("Status is " + evidence16.getStatus());
        System.out.println("Location is " + evidence16.getLocation());
        System.out.println();

        CaseEvidence evidence17 = new CaseEvidence();
        evidence17.setCaseId(1017); 
        evidence17.setCaseType("terrorism"); 
        evidence17.setEvidenceType("digital");
        evidence17.setDescription("encrypted communications");
        evidence17.setCollectedOn("2026-04-15");
        evidence17.setStatus("admissible");
        evidence17.setLocation("suspect device");

        System.out.println("Case id is " + evidence17.getCaseId());
        System.out.println("Case type is " + evidence17.getCaseType());
        System.out.println("Evidence type is " + evidence17.getEvidenceType());
        System.out.println("Description is " + evidence17.getDescription());
        System.out.println("Collected on " + evidence17.getCollectedOn());
        System.out.println("Status is " + evidence17.getStatus());
        System.out.println("Location is " + evidence17.getLocation());
        System.out.println();
		
		
		CaseEvidence evidence18 = new CaseEvidence();
        evidence18.setCaseId(1018); 
        evidence18.setCaseType("smuggling"); 
        evidence18.setEvidenceType("physical");
        evidence18.setDescription("contraband goods");
        evidence18.setCollectedOn("2026-04-16");
        evidence18.setStatus("admissible");
        evidence18.setLocation("warehouse");

        System.out.println("Case id is " + evidence18.getCaseId());
        System.out.println("Case type is " + evidence18.getCaseType());
        System.out.println("Evidence type is " + evidence18.getEvidenceType());
        System.out.println("Description is " + evidence18.getDescription());
        System.out.println("Collected on " + evidence18.getCollectedOn());
        System.out.println("Status is " + evidence18.getStatus());
        System.out.println("Location is " + evidence18.getLocation());
        System.out.println();

        CaseEvidence evidence19 = new CaseEvidence();
        evidence19.setCaseId(1019); 
        evidence19.setCaseType("blackmail"); 
        evidence19.setEvidenceType("digital");
        evidence19.setDescription("compromising photos");
        evidence19.setCollectedOn("2026-04-17");
        evidence19.setStatus("under review");
        evidence19.setLocation("cloud storage");

        System.out.println("Case id is " + evidence19.getCaseId());
        System.out.println("Case type is " + evidence19.getCaseType());
        System.out.println("Evidence type is " + evidence19.getEvidenceType());
        System.out.println("Description is " + evidence19.getDescription());
        System.out.println("Collected on " + evidence19.getCollectedOn());
        System.out.println("Status is " + evidence19.getStatus());
        System.out.println("Location is " + evidence19.getLocation());
        System.out.println();

        CaseEvidence evidence20 = new CaseEvidence();
        evidence20.setCaseId(1020); 
        evidence20.setCaseType("corruption"); 
        evidence20.setEvidenceType("financial");
        evidence20.setDescription("bribe money");
        evidence20.setCollectedOn("2026-04-18");
        evidence20.setStatus("inadmissible");
        evidence20.setLocation("suspect residence");

        System.out.println("Case id is " + evidence20.getCaseId());
        System.out.println("Case type is " + evidence20.getCaseType());
        System.out.println("Evidence type is " + evidence20.getEvidenceType());
        System.out.println("Description is " + evidence20.getDescription());
        System.out.println("Collected on " + evidence20.getCollectedOn());
        System.out.println("Status is " + evidence20.getStatus());
        System.out.println("Location is " + evidence20.getLocation());
        System.out.println();
		
		
		CaseEvidence evidence21 = new CaseEvidence();
        evidence21.setCaseId(1021); 
        evidence21.setCaseType("espionage"); 
        evidence21.setEvidenceType("digital");
        evidence21.setDescription("classified documents");
        evidence21.setCollectedOn("2026-04-19");
        evidence21.setStatus("admissible");
        evidence21.setLocation("USB drive");

        System.out.println("Case id is " + evidence21.getCaseId());
        System.out.println("Case type is " + evidence21.getCaseType());
        System.out.println("Evidence type is " + evidence21.getEvidenceType());
        System.out.println("Description is " + evidence21.getDescription());
        System.out.println("Collected on " + evidence21.getCollectedOn());
        System.out.println("Status is " + evidence21.getStatus());
        System.out.println("Location is " + evidence21.getLocation());
        System.out.println();

        CaseEvidence evidence22 = new CaseEvidence();
        evidence22.setCaseId(1022); 
        evidence22.setCaseType("stalking"); 
        evidence22.setEvidenceType("physical");
        evidence22.setDescription("surveillance photos");
        evidence22.setCollectedOn("2026-04-20");
        evidence22.setStatus("under review");
        evidence22.setLocation("suspect home");

        System.out.println("Case id is " + evidence22.getCaseId());
        System.out.println("Case type is " + evidence22.getCaseType());
        System.out.println("Evidence type is " + evidence22.getEvidenceType());
        System.out.println("Description is " + evidence22.getDescription());
        System.out.println("Collected on " + evidence22.getCollectedOn());
        System.out.println("Status is " + evidence22.getStatus());
        System.out.println("Location is " + evidence22.getLocation());
        System.out.println();

        CaseEvidence evidence23 = new CaseEvidence();
        evidence23.setCaseId(1023); 
        evidence23.setCaseType("treason"); 
        evidence23.setEvidenceType("testimonial");
        evidence23.setDescription("co-conspirator testimony");
        evidence23.setCollectedOn("2026-04-21");
        evidence23.setStatus("admissible");
        evidence23.setLocation("witness protection");

        System.out.println("Case id is " + evidence23.getCaseId());
        System.out.println("Case type is " + evidence23.getCaseType());
        System.out.println("Evidence type is " + evidence23.getEvidenceType());
        System.out.println("Description is " + evidence23.getDescription());
        System.out.println("Collected on " + evidence23.getCollectedOn());
        System.out.println("Status is " + evidence23.getStatus());
        System.out.println("Location is " + evidence23.getLocation());
        System.out.println();
		
		CaseEvidence evidence24 = new CaseEvidence();
        evidence24.setCaseId(1024); 
        evidence24.setCaseType("counterfeiting"); 
        evidence24.setEvidenceType("physical");
        evidence24.setDescription("fake currency notes");
        evidence24.setCollectedOn("2026-04-22");
        evidence24.setStatus("admissible");
        evidence24.setLocation("printing press");

        System.out.println("Case id is " + evidence24.getCaseId());
        System.out.println("Case type is " + evidence24.getCaseType());
        System.out.println("Evidence type is " + evidence24.getEvidenceType());
        System.out.println("Description is " + evidence24.getDescription());
        System.out.println("Collected on " + evidence24.getCollectedOn());
        System.out.println("Status is " + evidence24.getStatus());
        System.out.println("Location is " + evidence24.getLocation());
        System.out.println();

        CaseEvidence evidence25 = new CaseEvidence();
        evidence25.setCaseId(1025); 
        evidence25.setCaseType("racketeering"); 
        evidence25.setEvidenceType("financial");
        evidence25.setDescription("shell company records");
        evidence25.setCollectedOn("2026-04-23");
        evidence25.setStatus("under review");
        evidence25.setLocation("corporate office");

        System.out.println("Case id is " + evidence25.getCaseId());
        System.out.println("Case type is " + evidence25.getCaseType());
        System.out.println("Evidence type is " + evidence25.getEvidenceType());
        System.out.println("Description is " + evidence25.getDescription());
        System.out.println("Collected on " + evidence25.getCollectedOn());
        System.out.println("Status is " + evidence25.getStatus());
        System.out.println("Location is " + evidence25.getLocation());
        System.out.println();

        CaseEvidence evidence26 = new CaseEvidence();
        evidence26.setCaseId(1026); 
        evidence26.setCaseType("pyramid scheme"); 
        evidence26.setEvidenceType("documentary");
        evidence26.setDescription("investment contracts");
        evidence26.setCollectedOn("2026-04-24");
        evidence26.setStatus("admissible");
        evidence26.setLocation("suspect files");

        System.out.println("Case id is " + evidence26.getCaseId());
        System.out.println("Case type is " + evidence26.getCaseType());
        System.out.println("Evidence type is " + evidence26.getEvidenceType());
        System.out.println("Description is " + evidence26.getDescription());
        System.out.println("Collected on " + evidence26.getCollectedOn());
        System.out.println("Status is " + evidence26.getStatus());
        System.out.println("Location is " + evidence26.getLocation());
        System.out.println();
		
		CaseEvidence evidence27 = new CaseEvidence();
        evidence27.setCaseId(1027); 
        evidence27.setCaseType("insider trading"); 
        evidence27.setEvidenceType("financial");
        evidence27.setDescription("unusual stock trades");
        evidence27.setCollectedOn("2026-04-25");
        evidence27.setStatus("admissible");
        evidence27.setLocation("brokerage firm");

        System.out.println("Case id is " + evidence27.getCaseId());
        System.out.println("Case type is " + evidence27.getCaseType());
        System.out.println("Evidence type is " + evidence27.getEvidenceType());
        System.out.println("Description is " + evidence27.getDescription());
        System.out.println("Collected on " + evidence27.getCollectedOn());
        System.out.println("Status is " + evidence27.getStatus());
        System.out.println("Location is " + evidence27.getLocation());
        System.out.println();

        CaseEvidence evidence28 = new CaseEvidence();
        evidence28.setCaseId(1028); 
        evidence28.setCaseType("identity theft"); 
        evidence28.setEvidenceType("digital");
        evidence28.setDescription("stolen identity documents");
        evidence28.setCollectedOn("2026-04-26");
        evidence28.setStatus("under review");
        evidence28.setLocation("dark web server");

        System.out.println("Case id is " + evidence28.getCaseId());
        System.out.println("Case type is " + evidence28.getCaseType());
        System.out.println("Evidence type is " + evidence28.getEvidenceType());
        System.out.println("Description is " + evidence28.getDescription());
        System.out.println("Collected on " + evidence28.getCollectedOn());
        System.out.println("Status is " + evidence28.getStatus());
        System.out.println("Location is " + evidence28.getLocation());
        System.out.println();

        CaseEvidence evidence29 = new CaseEvidence();
        evidence29.setCaseId(1029); 
        evidence29.setCaseType("environmental crime"); 
        evidence29.setEvidenceType("physical");
        evidence29.setDescription("illegal waste dumping");
        evidence29.setCollectedOn("2026-04-27");
        evidence29.setStatus("admissible");
        evidence29.setLocation("industrial site");

        System.out.println("Case id is " + evidence29.getCaseId());
        System.out.println("Case type is " + evidence29.getCaseType());
        System.out.println("Evidence type is " + evidence29.getEvidenceType());
        System.out.println("Description is " + evidence29.getDescription());
        System.out.println("Collected on " + evidence29.getCollectedOn());
        System.out.println("Status is " + evidence29.getStatus());
        System.out.println("Location is " + evidence29.getLocation());
        System.out.println();
    }
}