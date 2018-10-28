package com.nadya;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Test {
    private static final Logger log = Logger.getLogger(Hobby.class);

    public static void main(String[] args) {
        log.debug("This is debug");
        Hobby hobby1 = new Hobby();
        Hobby hobby2 = new Hobby("Painting");
        Hobby hobby3 = new Hobby("Playing guitar", 104);
        Hobby hobby4 = new Hobby();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hobby name:");
        hobby4.setName(sc.next());
        log.info("hobby4.setName: " + hobby4.getName());
        System.out.println("Enter number of spent hours:");
        try {
            hobby4.setHours(sc.nextInt());
            log.info("hobby4.setHours: " + hobby4.getHours());
            System.out.println("Enter hobby priority:");
            hobby4.setPriority(sc.next().charAt(0));
            log.info("hobby4.setPriority: " + hobby4.getPriority());
            System.out.println("Enter number of finished works:");
            hobby4.setFinishedWorks(sc.nextLong());
            log.info("hobby4.setFinishedWorks: " + hobby4.getFinishedWorks());
            System.out.println("Enter number of current works:");
            hobby4.setCurrentWorks(sc.nextByte());
            log.info("hobby4.setCurrentWorks: " + hobby4.getCurrentWorks());
            System.out.println("Enter number of planned works:");
            hobby4.setPlannedWorks(sc.nextShort());
            log.info("hobby4.setPlannedWorks: " + hobby4.getPlannedWorks());
            System.out.println("Enter the amount of money earned:");
            hobby4.setEarnedMoney(sc.nextFloat());
            log.info("hobby4.setEarnedMoney: " + hobby4.getEarnedMoney());
            System.out.println("Enter the amount of money spent:");
            hobby4.setSpentMoney(sc.nextDouble());
            log.info("hobby4.setSpentMoney: " + hobby4.getSpentMoney());
            System.out.println("Enter whether hobby is active:");
            hobby4.setActive(sc.nextBoolean());
            log.info("hobby4.setActive: " + hobby4.isActive());
        } catch (Exception e) {
            log.error("hobby4 error!" , e);
        }
        System.out.println(hobby1.tellAboutHobby());
        System.out.println(hobby2.tellAboutHobby());
        System.out.println(hobby3.tellAboutHobby());
        System.out.println(hobby4.tellAboutHobby());
    }
}
