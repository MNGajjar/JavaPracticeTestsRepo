package june14.interFaceEx;

import java.util.Scanner;

public class MediaPlayerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Media Player.!");
        int j=1;
        do{
            System.out.println("1.Netfilx");
            System.out.println("2.VLCMedia");
            System.out.println("3.MXPlayer");
            System.out.println("4.Spotify");
            System.out.println("5.Udemy");
            System.out.println("6.YouTube");
            System.out.println("0.Exit");
            int selection;
            do{
                System.out.println("Select your operation from above list.!");
                selection = scanner.nextInt();
            }while (selection < 0 || selection > 6);

            if(selection == 0){
                System.out.println("Are you sure you want to exit.? 1. Yes, 2.No");
                int confirm = scanner.nextInt();
                if (confirm ==1 ){
                    System.exit(0);
                }else {
                    continue;
                }
            }

            MediaPlayer mediaPlayer;

            switch (selection){
                case 1:
                    mediaPlayer = new Netflix();
                    mediaPlayer.play();
                    mediaPlayer.pause();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                case 2:
                    mediaPlayer = new VLCMedia();
                    mediaPlayer.play();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                case 3:
                    mediaPlayer = new MXPlayer();
                    mediaPlayer.play();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                case 4:
                    mediaPlayer = new Spotify();
                    mediaPlayer.play();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                case 5:
                    mediaPlayer = new Udemy();
                    mediaPlayer.play();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                case 6:
                    mediaPlayer = new YouTubeMusic();
                    mediaPlayer.play();
                    mediaPlayer.forward();
                    mediaPlayer.rewind();
                    mediaPlayer.speed();
                    mediaPlayer.stop();
                    break;
                default:
                    System.out.println("Select your option from above list.!");
                    break;
            }
            System.out.println("Your selection has been performed.! You Still wants to continue.? 1.Yes, 2.No");
            j = scanner.nextInt();
        }while (j==1);

//        MediaPlayer mp = new Netflix();
//        mp.play();
//        mp.forward();
//        mp.speed();
//        mp.stop();
//        mp.stop();
//        mp.rewind();
//        System.out.println("------------------");
//        MediaPlayer mp1 = new VLCMedia();
//        mp1.play();
//        mp1.forward();
//        mp1.speed();
//        mp1.stop();
//        mp1.rewind();
//        mp1.stop();
//        System.out.println("------------------");
//        MediaPlayer mp2 = new YouTubeMusic();
//        mp2.play();
//        mp2.forward();
//        mp2.speed();
//        mp2.stop();
//        mp2.rewind();
//        mp2.stop();
    }
}
