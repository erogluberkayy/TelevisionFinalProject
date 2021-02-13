First, a television object must be created.
In doing so, we need to produce several objects to use certain features of the television.
```
private String brand;
    private String size;
    private ArrayList<Channel> channels;
    private boolean open;
    private int volume;
    private int activechannel;
```
We need to include the tv-connected remote in our project.
In this way, we can create a connection between them and run the two classes through methods.
Other than that, we need to create a channel.
```
NewsChannel.java
MusicChannel.java
Channel.java
```
Finally, in to run our project, we need to run the main method on the command.java page.
```

    public static void main(String[] args) {

        showMenu();
        boolean exit = false;

        while (exit == false){
            System.out.println("Your Choice : (Press 8 to see the menu.)");
            int secım = scan.nextInt();

            switch (secım){

                case 1:
                    setupTvAndCreateChannels();
                    break;
                case 2:
                    turnOnTheTv();
                    break;

                case 3:
                    increaseVolume();
                    break;

                case 4:
                    decreaseVolume();
                    break;

                case 5:
                    changeChannel();
                    break;

                case 6:
                    showChannelInformation();
                    break;

                case 7:
                    turnOffTheTv();
                    break;

                case 8:
                    showMenu();
                    break;

                case 0:
                    System.out.println("Exiting the system");
                    exit = true;
                    break;
                default:
                    System.out.println("Write a value between 0 and 8");
                    break;
            }
        }
    }
```

