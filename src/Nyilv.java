import java.util.ArrayList;
/*
* File: Nyilv.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft II N
* Date: 2022-10-25
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

import java.util.Arrays;

public class Nyilv implements Nev{

    @Override
    public ArrayList<String> getNames(){
        String[] nevek = {"Am Erika", "B. Elek" ,"Bekő Tóni" ,"Cicz Imre", "Disz Nóra",
                        "Egriv Áron", "Elektrom Ágnes", "Fejet Lenke", "Git Áron", "Happy Endre",
                         "Ka Kálmán", "Lekv Áron"};
        ArrayList<String> nevList = new ArrayList<>(Arrays.asList(nevek));

        return nevList;
    }


}
