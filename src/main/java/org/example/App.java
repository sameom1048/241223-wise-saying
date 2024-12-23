package org.example;

import java.util.Scanner;

public class App {
    public void run() {

        String command;
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(true) {
            System.out.print("명령) ");
            command = sc.nextLine();

            if (command.equals("종료")) break;
//            else controller.start(command);

        }

    }
}
