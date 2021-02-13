package television_project;

import java.util.Scanner;

public class Command {

   static Scanner scan = new Scanner(System.in);
   static Television tv;

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

    private static void showChannelInformation() {
        if(tv != null){
            tv.showActiveChannelInformation();
        }else{
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void changeChannel() {
        if(tv != null){
            System.out.println("Which channel do you want to see?\n");
            int desiredchanneltoopen = scan.nextInt();
            tv.changeChannel(desiredchanneltoopen);
        }else{
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void increaseVolume() {
        if(tv != null){
            tv.increaseTheSound();
        }else {
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void decreaseVolume() {
        if(tv != null){
            tv.decreaseTheSound();
        }else {
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void turnOffTheTv() {
        if(tv != null){
            tv.closeTheTv();
        }else {
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void turnOnTheTv() {
        if(tv != null){
            tv.openTheTv();
        }else{
            System.out.println("First install the TV and create the channels");
        }
    }

    private static void setupTvAndCreateChannels() {
        if(tv==null){
            scan.nextLine();
            System.out.println("Enter the brand of the TV");
            String brand = scan.nextLine();
            System.out.println("Enter the size of the TV");
            String size = scan.nextLine();
            tv=new Television(brand,size);
            System.out.println(tv);
        }else{
            System.out.println(tv);
        }

    }

    private static void showMenu() {
        System.out.println("************ MENU ************");
        System.out.println("0-- Exit\n" +
                "1-- Install TV\n" +
                "2-- Turn on the television\n" +
                "3-- Increase the volume of the TV\n" +
                "4-- Decrease the volume of the TV\n" +
                "5-- Change Channel\n" +
                "6-- Show Channel Information\n" +
                "7-- Close the TV\n" +
                "8-- Show Menu\n");
    }
}
