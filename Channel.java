package television_project;

public class Channel {

    private String name;
    private int channelNo;

    public Channel(String name, int channelNo) {
        this.name = name;
        this.channelNo = channelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public String showChannelInfo(){
        return "Name: " + name +" No: " + channelNo;
    }
}
