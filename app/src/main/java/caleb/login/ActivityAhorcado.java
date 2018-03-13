package caleb.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityAhorcado extends AppCompatActivity {

    ImageView imagen;
    Button adivinar, nuevo;
    TextView palabra;
    EditText letra;
    String palabras[] = {"osiris", "java", "android", "telefono", "computadora", "programacion", "mouse"};
    String palabraRandom;
    char adivinado[];
    int ahorcado = 1;
    ArrayList letrasUsadas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahorcado);

        imagen = findViewById(R.id.imageView_ahorcado);
        adivinar = findViewById(R.id.adivinar);
        nuevo = findViewById(R.id.nuevaPalabra);
        palabra = findViewById(R.id.palabra);
        letra = findViewById(R.id.letra);

        palabraRandom = generarPalabraRandom();
        adivinado = new char[palabraRandom.length()];
        palabra.setText(generarEspacios(palabraRandom));
        nuevo.setEnabled(false);


    }

    public void evaluarIntento(View view) {
        String caracter = letra.getText().toString();
        if(!letrasUsadas.contains(caracter)){
            letrasUsadas.add(caracter);
            int coincidencias = 0;
            ArrayList posiciones = new ArrayList<>();
            if(caracter.length() == 1){
                char letrita = caracter.charAt(0);

                for(int i=0; i<palabraRandom.length(); i++){
                    if(letrita == palabraRandom.charAt(i)){
                        coincidencias++;
                        posiciones.add(i);
                    }
                }
                if(coincidencias > 0){
                    String textoNuevo = "";
                    for (int j=0; j<coincidencias; j++){
                        int pos = (int)posiciones.get(j);
                        adivinado[pos] = letrita;
                    }
                    for (int k=0; k<adivinado.length; k++){
                        textoNuevo += adivinado[k];
                    }
                    palabra.setText(textoNuevo);
                    if(textoNuevo.equals(palabraRandom)){
                        adivinar.setEnabled(false);
                        Toast.makeText(ActivityAhorcado.this, "Ganaste xd", Toast.LENGTH_LONG).show();
                        nuevo.setEnabled(true);
                    }

                }
                else {
                    ahorcar();
                }
            }
            else{
                Toast.makeText(ActivityAhorcado.this, "Escribe unicamente un caracter", Toast.LENGTH_LONG).show();
            }

        }
        else {
            Toast.makeText(ActivityAhorcado.this, "Ya has utilizado la letra "+ caracter, Toast.LENGTH_LONG).show();
        }



    }

    public void ahorcar(){
        switch (ahorcado){
            case 1:
                imagen.setImageResource(R.drawable.ahorcado_2);
                ahorcado++;
                break;
            case 2:
                imagen.setImageResource(R.drawable.ahorcado_3);
                ahorcado++;
                break;
            case 3:
                imagen.setImageResource(R.drawable.ahorcado_4);
                ahorcado++;
                break;
            case 4:
                imagen.setImageResource(R.drawable.ahorcado_5);
                ahorcado++;
                break;
            case 5:
                imagen.setImageResource(R.drawable.ahorcado_6);
                ahorcado++;
                break;
            case 6:
                imagen.setImageResource(R.drawable.ahorcado_7);
                ahorcado++;
                break;
            case 7:
                imagen.setImageResource(R.drawable.ahorcado_8);
                ahorcado++;
                break;
            case 8:
                imagen.setImageResource(R.drawable.ahorcado_9);
                ahorcado++;
                break;
            case 9:
                imagen.setImageResource(R.drawable.ahorcado_10);
                adivinar.setEnabled(false);
                Toast.makeText(ActivityAhorcado.this, "AHORCADO!!!!!!", Toast.LENGTH_LONG).show();
                nuevo.setEnabled(true);
                break;

        }
    }

    public String generarPalabraRandom(){
        int numRandom = (int)(Math.random()*palabras.length);
        return palabras[numRandom];
    }

    public String generarEspacios(String strGenerado){
        String espacios = "";
        for (int i=0; i<strGenerado.length(); i++){
            espacios += "_";
            adivinado[i] = '_';
        }
        return espacios;
    }


    public void nuevaPalabra(View view) {
        letrasUsadas.clear();
        ahorcado = 1;
        imagen.setImageResource(R.drawable.ahorcado_1);
        palabraRandom = generarPalabraRandom();
        adivinado = new char[palabraRandom.length()];
        palabra.setText(generarEspacios(palabraRandom));
        nuevo.setEnabled(false);
        adivinar.setEnabled(true);

    }
}
