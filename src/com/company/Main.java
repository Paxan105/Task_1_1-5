package com.company;

import java.util.Random;

public class Main {

    /*  
         Некоторые задания реализованы в виде функций
    

        Задания 3 и 5 не работает если в аргументах командной строки есть строка.
    */


    public static void main(String[] args) {
        ///1
        System.out.println("Задание 1:");
        System.out.println("Добро пожаловать " + args[0]);

        ///2
        System.out.println();
        System.out.println("Задание 2:");
        for(int i=args.length-1; i>=0; i--){
            System.out.println(args[i]);
        }

        /////3
        System.out.println();
        System.out.println("Задание 3:");
        fun_3(args);

        ///4

        System.out.println();
        System.out.println("Задание 4:");
        fun_4(args);


        /// 5

        System.out.println();
        System.out.println("Задание 5:");
        fun_5(args);





    }

    static void fun_3(String[] args){

        int n=Integer.parseInt(args[0]);

        Random rand = new Random();
        for(int i=0;i<n; i++){
            int k=rand.nextInt(100);
            System.out.println(k);
        }

        for(int i=0;i<n; i++){
            int k=rand.nextInt(100);
            System.out.print(k + " ");
        }
        System.out.println();
    }

    static void fun_4(String[] args){
        String str="Пароль";
        if(str.equals(args[0])){
            System.out.println("Пароли совпадают.");
        } else{
            System.out.println("Пароли не совпадают.");
        }
    }

    static void fun_5(String[] args) {
        int summ = 0;
        int number = 0;
        for (String num : args) {
            number = Integer.parseInt(num);
            summ += number;
        }

        System.out.println("Сумма: " + summ);
    }

}
