package caleb.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.ArrayList;

public class ActivityMemorama extends AppCompatActivity {

    ImageButton botones[] = new ImageButton[6];
    int estado = 1, carta1 = 0, carta2 = 0;
    int fotos[] = new int[3];
    ArrayList tarjetasAdivinadas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorama);

        botones[0] = findViewById(R.id.boton1);
        botones[1] = findViewById(R.id.boton2);
        botones[2] = findViewById(R.id.boton3);
        botones[3] = findViewById(R.id.boton4);
        botones[4] = findViewById(R.id.boton5);
        botones[5] = findViewById(R.id.boton6);

        repartirCartas();
    }

    public void adivinar(View view) {
        int id = view.getId();
        switch (estado){
            case 1:
                if(mostrarCarta(id)){
                    carta1 = id;
                    estado = 2;
                }
                else{
                    Toast.makeText(ActivityMemorama.this, "Elige otra carta", Toast.LENGTH_SHORT).show();
                    carta1 = 0;
                    estado = 1;
                }
                break;
            case 2:
                if(mostrarCarta(id)){
                    carta2 = id;
                    estado = 1;
                    if(evaluarCartas(carta1, carta2)){

                    }
                }
                else{
                    Toast.makeText(ActivityMemorama.this, "Elige otra carta", Toast.LENGTH_SHORT).show();
                    estado = 2;
                }
                break;
        }
    }

    public void repartirCartas(){
        ArrayList arregloNumeros = numerosRandom();
        fotos[0] = R.drawable.android_logo;
        fotos[1] = R.drawable.arduino_logo;
        fotos[2] = R.drawable.java_logo;
        for (int i = 0; i < botones.length; i++) {
            botones[i].setTag(arregloNumeros.get(i));
            botones[i].setBaseline(0);
        }


    }

    public boolean mostrarCarta(int id){
        boolean dibujar = true;
        int foto = 0;
        switch (id){
            case R.id.boton1:
                if(botones[0].getBaseline() == 0){
                    foto = (int)(botones[0].getTag());
                    botones[0].setImageResource(obtenerFoto(foto));
                    botones[0].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
            case R.id.boton2:
                if(botones[1].getBaseline() == 0){
                    foto = (int)(botones[1].getTag());
                    botones[1].setImageResource(obtenerFoto(foto));
                    botones[1].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
            case R.id.boton3:
                if(botones[2].getBaseline() == 0){
                    foto = (int)(botones[2].getTag());
                    botones[2].setImageResource(obtenerFoto(foto));
                    botones[2].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
            case R.id.boton4:
                if(botones[3].getBaseline() == 0){
                    foto = (int)(botones[3].getTag());
                    botones[3].setImageResource(obtenerFoto(foto));
                    botones[3].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
            case R.id.boton5:
                if(botones[4].getBaseline() == 0){
                    foto = (int)(botones[4].getTag());
                    botones[4].setImageResource(obtenerFoto(foto));
                    botones[4].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
            case R.id.boton6:
                if(botones[5].getBaseline() == 0){
                    foto = (int)(botones[5].getTag());
                    botones[5].setImageResource(obtenerFoto(foto));
                    botones[5].setBaseline(1);
                }
                else{
                    dibujar = false;
                }
                break;
        }
        return dibujar;
    }

    public boolean evaluarCartas(int cartaAnterior, int cartaActual){
        boolean gano = false;
        if(!tarjetasAdivinadas.contains(cartaAnterior) || !tarjetasAdivinadas.contains(cartaActual)){
            int idAnterior = 0, idActual = 0;
            for (int i = 0; i <botones.length ; i++) {
                if(botones[i].getId() == cartaAnterior){
                    idAnterior = i;
                }
                if(botones[i].getId() == cartaActual){
                    idActual = i;
                }
            }

            int tagAnterior = (int)(botones[idAnterior].getTag());
            int tagActual = (int)(botones[idActual].getTag());
            switch (tagAnterior){
                case 0:
                    if(tagActual == 5){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;
                case 1:
                    if(tagActual == 4){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;
                case 2:
                    if(tagActual == 3){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;
                case 3:
                    if(tagActual == 2){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;
                case 4:
                    if(tagActual == 1){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;
                case 5:
                    if(tagActual == 0){
                        tarjetasAdivinadas.add(cartaAnterior);
                        tarjetasAdivinadas.add(cartaActual);
                        Toast.makeText(ActivityMemorama.this, "Bien", Toast.LENGTH_SHORT).show();
                        gano = true;
                    }
                    break;

            }

            if(!gano){
                botones[idAnterior].setImageResource(R.drawable.ic_launcher_foreground);
                botones[idAnterior].setBaseline(0);
                botones[idActual].setImageResource(R.drawable.ic_launcher_foreground);
                botones[idActual].setBaseline(0);
                Toast.makeText(ActivityMemorama.this, "Mal", Toast.LENGTH_SHORT).show();
                gano = false;
            }

        }
        else {
            gano = false;
        }
        return gano;
    }


    public ArrayList numerosRandom(){
        ArrayList numeros = new ArrayList<>();
        numeros.add(generarNumeroRandom());
        while (!(numeros.size() == 6)){
            int num = generarNumeroRandom();
            while (!numeros.contains(num)){
                numeros.add(num);
            }
        }
        return numeros;

    }

    public int generarNumeroRandom(){
        int numRandom = (int)(Math.random()*6);
        return numRandom;
    }

    /*
    * valores:
    * 0 -> 5 android
    * 1 -> 4 arduino
    * 2 -> 3 java
    *
     */
    public int obtenerFoto(int foto){
        if(foto == 0 || foto == 5){
            return fotos[0];
        }else
        if(foto == 1 || foto == 4){
            return fotos[1];
        }else
        if(foto == 2 || foto == 3){
            return fotos[2];
        }else
            return 0;
    }


}
