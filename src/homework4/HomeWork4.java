/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
public class HomeWork4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int right = 0;
        int z = 0;
        int wrong = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\u001B[30m<=================>");
        for (int i = 0; i < 5; i++) {
            int x = (random.nextInt(100)-50);
            int y = (random.nextInt(100)-50);
            System.out.printf("%d * %d = ", x, y);
            int Answer = input.nextInt();
            if (Answer == (x * y)){
                System.out.printf("\u001B[32mПравильно!\n");
                System.out.println("\u001B[30m<=================>");
                right++;
            }
            else if (Answer != (x * y)){
                System.out.printf("\u001B[31mНевеpнo!\n");
                System.out.println("\u001B[30m<=================>");
                wrong++;
            }
        }
        while (true){
            boolean b1 = true;
            int amount = (random.nextInt(10));
            int check;
            check = amount;
            while (b1){
                if (amount == check){
                    amount += 1;
//                    System.out.println("Check: " + check);
//                    System.out.println("Amount: " + amount);
                }
                else{
                    b1 = false;
                }
            }
            int sec = (random.nextInt(3000));
            if (z <= 100){
                System.out.println("Загрузка результатов: " + z + "%");
                try{
                    Thread.sleep(sec);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                z += amount;
            }
            else{
                z = 100;
                System.out.println("Загрузка результатов: " + z + "%");
                break;
            }
        } 
        switch (right) {
            case 5:
                System.out.println("Молодец!");
                break;
            case 4:
            case 3:
                System.out.println("Надо бы еще поучить!");
                break;
            default:
                System.out.println("Срочно нужно выучить таблицу умножения!");
                break;
        }
    }
    
}
