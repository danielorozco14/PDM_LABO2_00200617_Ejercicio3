package com.example.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

import static com.example.ejercicio3.R.color.color_blue;
import static com.example.ejercicio3.R.color.color_blue2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private View cajaRoja,cajaVerde,cajaAzul;
    private Random rand = new Random();
    private ArrayList<Integer>coloresRojos=new ArrayList<>();
    private ArrayList<Integer>coloresVerdes=new ArrayList<>();
    private ArrayList<Integer>coloresAzules=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OBTENIENDO ID
        cajaRoja=findViewById(R.id.box_red);
        cajaVerde=findViewById(R.id.box_green);
        cajaAzul=findViewById(R.id.box_blue);

        //AGREGANDO COLORES A LAS LISTAS PARA OBTENER SUS ID LUEGO

        coloresRojos.add(R.color.color_red);
        coloresRojos.add(R.color.color_red2);
        coloresRojos.add(R.color.color_red3);
        coloresRojos.add(R.color.color_red4);
        coloresRojos.add(R.color.color_red5);
        coloresRojos.add(R.color.color_red6);

        coloresVerdes.add(R.color.color_green);
        coloresVerdes.add(R.color.color_green2);
        coloresVerdes.add(R.color.color_green3);
        coloresVerdes.add(R.color.color_green4);
        coloresVerdes.add(R.color.color_green5);
        coloresVerdes.add(R.color.color_green6);

        coloresAzules.add(R.color.color_blue);
        coloresAzules.add(color_blue2);
        coloresAzules.add(R.color.color_blue3);
        coloresAzules.add(R.color.color_blue4);
        coloresAzules.add(R.color.color_blue5);
        coloresAzules.add(R.color.color_blue6);


        //COLOCANDO LISTENERS
        cajaRoja.setOnClickListener(this);
        cajaVerde.setOnClickListener(this);
        cajaAzul.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        View box = findViewById(v.getId());
        int indiceLista= rand.nextInt(6);
        switch (v.getId()){
            case R.id.box_red :
                box.setBackgroundColor(getResources().getColor(coloresRojos.get(indiceLista)));
                break;
            case R.id.box_green :
                box.setBackgroundColor(getResources().getColor(coloresVerdes.get(indiceLista)));
                break;
            case R.id.box_blue :
                box.setBackgroundColor(getResources().getColor(coloresAzules.get(indiceLista)));
                break;
        }


    }
}
