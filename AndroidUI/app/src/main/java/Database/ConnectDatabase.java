package Database;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import system.ui.R;


/*
Connects to the csv file and pulls all information from in
 */
public class ConnectDatabase  {
    public String dbInformation = "";
    int file;
    Context context;

    public ConnectDatabase(Context ctx, int file){
        this.file = file;
        this.context = ctx;
        //Read raw csvfile
        InputStream is = context.getResources().openRawResource(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = "";
        try{
            while ((line = br.readLine()) != null){
                dbInformation += line;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
