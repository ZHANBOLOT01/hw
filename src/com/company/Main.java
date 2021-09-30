package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String Zhanbo;
        final int NUM = 23;
        String word = "Здрасьте";
        Zhanbo = word + NUM;
        System.out.println(word + "" + NUM  +"" + Zhanbo);

        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0){
            System.out.println("Вы сохранили положительное число");
        } else{
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);


        System.out.println("введите ваше имя");
        System.out.println("привет " + scanner.nextLine());




    }
}
