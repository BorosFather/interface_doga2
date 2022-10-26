/*
* File: App.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft II N
* Date: 2022-10-25
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Nyilv nyilvantartas = new Nyilv();
        ArrayList<String> nevList = nyilvantartas.getNames();
        

        for(String nev : nevList){
            System.out.println(nev);
        }


        System.out.println("by Boros Zoltán, Szoft II N, 2022-10-25 ");
    }
}
