package television_project;

public class NewsChannel extends Channel {

    private String newsType;

    public NewsChannel(String name, int channelNo, String type) {
        super(name, channelNo);
        this.newsType = type;
    }
}
