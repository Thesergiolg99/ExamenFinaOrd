package ufv.dis.final2021.SLG;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerJson {
    private static final String dir_json = new File("LocalizaIP.json").getAbsolutePath();
    public static ArrayList<IP> leerFicheroJson(){
        ArrayList<IP> videotecas = new ArrayList<IP>();
        Gson gson = new Gson();
        try {
            videotecas = gson.fromJson(new FileReader(dir_json),new TypeToken<ArrayList<IP>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return videotecas;
    }

}
