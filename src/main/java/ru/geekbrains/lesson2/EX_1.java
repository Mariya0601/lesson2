package ru.geekbrains.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX_1 {

    public static void main(String[] args) {
        float num = 0;
        boolean flag = true;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число (дробное число вводится через запятую): ");
                num = in.nextFloat();
                flag = false;
            }catch(InputMismatchException e){
                System.out.println("Введённое значение не является числом, поробуйте снова.");
            }
        }while(flag);
        System.out.println(num);


    }

}
