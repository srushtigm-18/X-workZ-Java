class Broadcast {

    private int id;
    private String name;
    private String time;
    private String channel;
    private String broadcastBy;
    private String date;
    private String duration;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return this.time;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getChannel() {
        return this.channel;
    }

    public void setBroadcastBy(String broadcastBy) {
        this.broadcastBy = broadcastBy;
    }
    public String getBroadcastBy() {
        return this.broadcastBy;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return this.date;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }
}