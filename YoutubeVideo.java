class YoutubeVideo {

    private String videoId;
    private String videoName;
    private String channelName;
    private String owner;
    private String duration;
    private String postedOn;
    private long views;
    private long likes;

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return this.owner;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }
    public String getPostedOn() {
        return this.postedOn;
    }

    public void setViews(long views) {
        this.views = views;
    }
    public long getViews() {
        return this.views;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }
    public long getLikes() {
        return this.likes;
    }
}