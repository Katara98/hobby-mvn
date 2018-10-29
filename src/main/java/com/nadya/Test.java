package com.nadya;

import org.apache.log4j.Logger;

public class Test {
    private static final Logger log = Logger.getLogger(Hobby.class);

    public static void main(String[] args) {
        log.debug("This is debug");
        Hobby[] hobbies = {new Painting(32),
                           new Painting(120, "Impressionism"),
                           new PlayingMusicalInstrument(104, "Guitar"),
                           new PlayingMusicalInstrument("Drums")};
        for (Hobby hobby: hobbies) {
            System.out.println(hobby.tellAboutHobby());
        }
    }
}
