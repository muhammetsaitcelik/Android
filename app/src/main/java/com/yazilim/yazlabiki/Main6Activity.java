package com.yazilim.yazlabiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.nio.charset.MalformedInputException;
import java.util.Random;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    String a;
    String[] ücharfliler = {"KÜL","ÜTÜ","KÜR","RAM","MAT","KAT"};
    String[] ücharfliler1 = {"TOZ","OTO","TOK","KAY","YAR","KAR"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf;
    String kelime="";
    int Sayac=0;
    int number;
    TextView textView,textView1;
    Long Süre;
    int Yanlıs=0;

    Random random= new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        as = findViewById(R.id.button11);
        as1 = findViewById(R.id.button12);
        as2 = findViewById(R.id.button13);
        as3 = findViewById(R.id.button14);
        as4 = findViewById(R.id.button15);
        as5 = findViewById(R.id.button16);
        as6 = findViewById(R.id.button17);
        as7 = findViewById(R.id.button18);
        as8 = findViewById(R.id.button19);
        as9 =findViewById(R.id.button32);
        as10 =findViewById(R.id.button29);
        as11= findViewById(R.id.button30);
        as12= findViewById(R.id.button31);
        harf =findViewById(R.id.button20);
        harf1 = findViewById(R.id.button21);
        harf2=findViewById(R.id.button22);
        harf3 = findViewById(R.id.button23);
        harf4 = findViewById(R.id.button24);
        harf5 = findViewById(R.id.button25);
        harf6 = findViewById(R.id.button26);
        harf7 = findViewById(R.id.button27);
        textView1 = findViewById(R.id.textView7);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("T");
            harf1.setText("K");
            harf2.setText("O");
            harf3.setText("R");
            harf4.setText("A");
            harf5.setText("Z");
            harf6.setText("Y");
        }
        textView = findViewById(R.id.textView2);
        harf.setOnClickListener(this);
        harf1.setOnClickListener(this);
        harf2.setOnClickListener(this);
        harf3.setOnClickListener(this);
        harf4.setOnClickListener(this);
        harf6.setOnClickListener(this);
        harf5.setOnClickListener(this);
        harf7.setOnClickListener(this);
        new CountDownTimer(120000,1000){
            long millisUntilFinished1;
            public void onTick(long millisUntilFinished) {
                if (Sayac<3) {
                    textView1.setText("" + millisUntilFinished / 1000);
                }
                millisUntilFinished1=millisUntilFinished/1000;
            }

            public void onFinish() {
                if (Sayac==3){
                    Süre=millisUntilFinished1;
                }
                textView1.setText(""+millisUntilFinished1);
            }
        }.start();

    }
    @Override
    public void onClick(View v){
        Button gelenBtn=(Button)v;
        if (number==1){
            if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime +"K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"L";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "Ü";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "T";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button27) {
                    if (a.contains(ücharfliler[0]) && (a.contains("KÜL"))) {
                        as.setText("K");
                        as1.setText("Ü");
                        as2.setText("L");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(ücharfliler[1]) && (a.contains("ÜTÜ"))) {
                        as1.setText("Ü");
                        as3.setText("T");
                        as5.setText("Ü");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(ücharfliler[2]) && (a.contains("KÜR"))) {
                        as4.setText("K");
                        as5.setText("Ü");
                        as6.setText("R");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler[3]) && (a.contains("RAM"))) {
                        as6.setText("R");
                        as7.setText("A");
                        as8.setText("M");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler[4]) && (a.contains("MAT"))) {
                        as8.setText("M");
                        as9.setText("A");
                        as10.setText("T");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler[5]) && (a.contains("KAT"))) {
                        as10.setText("T");
                        as11.setText("A");
                        as12.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else {    Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main6Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 6) {
                Toast.makeText(Main6Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main6Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main6Activity.this,anasayfa.class);
                startActivity(intent1);
            }
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime +"T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "O";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "Z";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "Y";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button27) {
                    if (a.contains(ücharfliler1[0]) && (a.contains("TOZ"))) {
                        as.setText("T");
                        as1.setText("O");
                        as2.setText("Z");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(ücharfliler1[1]) && (a.contains("OTO"))) {
                        as1.setText("O");
                        as3.setText("T");
                        as5.setText("O");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(ücharfliler1[2]) && (a.contains("TOK"))) {
                        as4.setText("T");
                        as5.setText("O");
                        as6.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler1[3]) && (a.contains("KAY"))) {
                        as6.setText("K");
                        as7.setText("A");
                        as8.setText("Y");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler1[4]) && (a.contains("YAR"))) {
                        as8.setText("Y");
                        as9.setText("A");
                        as10.setText("R");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(ücharfliler1[5]) && (a.contains("KAR"))) {
                      as10.setText("R");
                      as11.setText("A");
                      as12.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else {    Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main6Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 6) {
                Toast.makeText(Main6Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main6Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main6Activity.this,anasayfa.class);
                startActivity(intent1);
            }
        }
    }
}




