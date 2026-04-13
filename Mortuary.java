class Mortuary {
   
    int mortuaryId;
    DeadBody deadBody;
    
    Mortuary(int mortuaryId, DeadBody deadBody) {
        this.mortuaryId = mortuaryId;
        this.deadBody = deadBody;
    }
    
    public void getDetails() {
        System.out.println("Mortuary id is: " + this.mortuaryId);
        System.out.println("DeadBody id is: " + this.deadBody.bodyId);
        System.out.println("DeadBody name is: " + this.deadBody.name);
        System.out.println("DeadBody gender is: " + this.deadBody.gender);
        System.out.println("DeadBody causeOfDeath is: " + this.deadBody.causeOfDeath);
        System.out.println("DeadBody tagNumber is: " + this.deadBody.tagNumber);
    }
}