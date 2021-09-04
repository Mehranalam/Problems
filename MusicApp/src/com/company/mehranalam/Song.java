package com.company.mehranalam;

import java.util.Scanner;

public class Song {

    private String title = "";
    private String duration = "";
    private Album myPlayList = new Album();
    private Scanner inputUser = new Scanner(System.in);
    public void runApp(){
        if (title.isEmpty() || duration.isEmpty()){
            System.out.print("Please Enter your playList name : ");
            this.title = inputUser.nextLine();
            System.out.print("Please Enter your duration of play list : ");
            this.duration = inputUser.nextLine();
            System.out.println("Setup is finish ...");
        }

        menu();
        System.out.print("please Enter your choose : ");
        int cruser = inputUser.nextInt();

        boolean isRun = true;
        while (isRun){
            switch (cruser){
                case -1:
                    myPlayList.playMusic();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 0:
                    myPlayList.addNewSong();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 1:
                    myPlayList.goToNextMusic();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 2:
                    myPlayList.backToPreviousSong();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 3:
                    myPlayList.replayCurrentMusic();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 4:
                    myPlayList.showPlayList();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 5:
                    menu();
                    System.out.print("please Enter your choose : ");
                    cruser = inputUser.nextInt();
                    break;
                case 6:
                    isRun = false;
                    break;
            }
        }
    }

    private void menu(){
        System.out.println("Menu");
        System.out.println("\t-1.play one music just random.");
        System.out.println("\t0.add new song.");
        System.out.println("\t1.Skip to next song.");
        System.out.println("\t2.back to previous song.");
        System.out.println("\t3.reply this current song.");
        System.out.println("\t4.show playList.");
        System.out.println("\t5.show menu.");
        System.out.println("\t6.Quit");
    }
}
