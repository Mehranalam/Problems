package com.company.mehranalam;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Album {

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

}
