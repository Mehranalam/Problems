package com.company.mehranalam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song newPlayList = new Song();
        newPlayList.runApp();
    }

    public static class Song {

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
                        myPlayList.findSong();
                        System.out.print("please Enter your choose : ");
                        cruser = inputUser.nextInt();
                        break;
                    case 7:
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
            System.out.println("\t6.find music.");
            System.out.println("\t7.Quit");
        }
    }


    public static class Album {

        private Scanner inputUser = new Scanner(System.in);
        private LinkedList<String> songs = new LinkedList<>();
        private ListIterator<String> iterator = songs.listIterator();
        private int min = 0;
        private int max = songs.size();
        private int currentPlay;

        public void addNewSong() {
            System.out.print("please Enter name for new song : ");
            String newSong = inputUser.nextLine();
            songs.add(newSong);
        }

        public void playMusic() {
            if (songs.size() > 0) {
                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                currentPlay = random_int;
                System.out.println("*this music play " + songs.get(random_int));
            } else {
                System.out.println("your play list is empty .. add song ...");
            }
        }

        public void goToNextMusic() {
            if (!songs.isEmpty()){
                if (currentPlay == songs.size() - 1) {
                    int nextMusic = 0;
                    currentPlay = nextMusic;
                    System.out.println("next music is : " + songs.get(nextMusic));
                } else {
                    int nextMusic = currentPlay + 1;
                    currentPlay = nextMusic;
                    System.out.println("next music is : " + songs.get(nextMusic));
                }
            } else {
                System.out.println("your play list is empty ... ");
            }
        }

        public void backToPreviousSong() {
            if (!songs.isEmpty()){
                if (currentPlay == 0) {
                    int previous = songs.size()-1;
                    currentPlay = previous;
                    System.out.println("previous music is : " + songs.get(previous));
                } else {
                    int previous = currentPlay - 1;
                    currentPlay = previous;
                    System.out.println("previous music is : " + songs.get(previous));
                }
            } else {
                System.out.println("your play list is empty ... ");
            }
        }

        public void replayCurrentMusic(){
            if (!songs.isEmpty()){
                System.out.println("this music now replay "+songs.get(currentPlay));
            } else {
                System.out.println("your play list is empty ... ");
            }
        }

        public void showPlayList(){
            if (!songs.isEmpty()){
                System.out.println("now this music is playing : "+songs.get(currentPlay));
                System.out.println("songs:");
                for (int i = 0; i<songs.size();i++){
                    System.out.println("\t"+i+": "+songs.get(i));
                }
            }else {
                System.out.println("your play list is empty ... ");
            }
        }

        public void findSong(){
            // input from name of song and search for this music if can find this method return true but can not
            // find this method return false.
            System.out.print("please Enter your name of song for searching : ");
            String nameOfSong = inputUser.nextLine();
            //inputUser.nextLine();
            int indexForMusicSelected = songs.indexOf(nameOfSong);
            if (indexForMusicSelected == -1){
                System.out.println("Sorry this music can not finding beacase this not add to play list ....");
            } else {
                System.out.println("sussece can find ... your music in "+indexForMusicSelected+" place from play list..");
            }
        }

    }

}
