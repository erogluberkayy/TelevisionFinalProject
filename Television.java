package television_project;

import java.util.ArrayList;

public class Television {
    private String brand;
    private String size;
    private ArrayList<Channel> channels;
    private boolean open;
    private int volume;
    private int activechannel;

    public Television(String brand, String size){
        this.brand = brand;
        this.size = size;
        channels = new ArrayList<>();
        volume =10;
        activechannel =1;
        createChannels();
        this.open = false;
    }

    public void increaseTheSound(){
        if(volume < 20 && open == true){
            volume++;
            System.out.println("Sound level :" + volume);
        }else{
            System.out.println("You cannot increase the volume any more to the maximum value or the tv is turned off.");
        }
    }

    public void decreaseTheSound(){
        if(volume > 0 && open){
            volume--;
            System.out.println("Sound level : " + volume);
        }else{
            System.out.println("You can't reduce the volume any more at the minimum value or the TV is turned off.");
        }
    }

    public void openTheTv(){
        if(open == false){
            open =true;
            System.out.println("TV was turned on");
        }else{
            System.out.println("TV is already on");
        }
    }

    public void closeTheTv(){
        if(open == true){
            open =false;
            System.out.println("TV turned off");
        }else{
            System.out.println("TV is already off");
        }
    }

    private void createChannels(){
        NewsChannel cnn = new NewsChannel("CNN",1,"General New");
        channels.add(cnn);
        NewsChannel bein = new NewsChannel("BeinSport",2,"Sports New");
        channels.add(bein);
        MusicChannel dreamTurk = new MusicChannel("Dream Turk",3,"Domestic");
        channels.add(dreamTurk);
        MusicChannel numberOne = new MusicChannel("Number One",4,"Foreign");
        channels.add(numberOne);
    }

    public void showActiveChannelInformation(){
        if(open){
            System.out.println("Active Channel: " + channels.get(activechannel -1).showChannelInfo());
        }else{
            System.out.println("Turn on the Tv first");
        }
    }

    public void changeChannel(int desiredChannel){
        if(open){
            if(desiredChannel != activechannel){
                if(desiredChannel<= channels.size() && desiredChannel>=0){
                    activechannel = desiredChannel;
                    System.out.println("Channel: " + desiredChannel+" Information:" + channels.get(activechannel -1).showChannelInfo());
                }else {
                    System.out.println("Please enter a valid channel number.");
                }
            }else{
                System.out.println("Already " + activechannel + ".on the channel. Could not change");
            }
        }else{
            System.out.println("Turn on the Tv first");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Size : " + size + " was created.";
    }
}
