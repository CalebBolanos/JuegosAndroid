package caleb.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    Button bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCero;
    Button bMas, bMenos, bPor, bEntre, bIgual, bPunto, bLimpiar, bRetroceso;
    TextView texto;
    Double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;
    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        texto = (TextView)findViewById(R.id.texto);
        bUno = (Button)findViewById(R.id.uno);
        bDos = (Button)findViewById(R.id.dos);
        bTres = (Button)findViewById(R.id.tres);
        bCuatro = (Button)findViewById(R.id.cuatro);
        bCinco = (Button)findViewById(R.id.cinco);
        bSeis = (Button)findViewById(R.id.seis);
        bSiete = (Button)findViewById(R.id.siete);
        bOcho = (Button)findViewById(R.id.ocho);
        bNueve = (Button)findViewById(R.id.nueve);
        bCero = (Button)findViewById(R.id.cero);
        bMas = (Button)findViewById(R.id.mas);
        bMenos = (Button)findViewById(R.id.menos);
        bPor = (Button)findViewById(R.id.por);
        bEntre = (Button)findViewById(R.id.entre);
        bIgual = (Button)findViewById(R.id.igual);
        bPunto = (Button)findViewById(R.id.punto);
        bLimpiar = (Button)findViewById(R.id.limpiar);
        bRetroceso = (Button)findViewById(R.id.restroceso);

        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("1");
            }
        });

        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("2");
            }
        });

        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("3");
            }
        });

        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("4");
            }
        });

        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("5");
            }
        });

        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("6");
            }
        });

        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("7");
            }
        });

        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("8");
            }
        });

        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("9");
            }
        });

        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros("0");
            }
        });

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();
            }
        });

        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });

        bPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacion();
            }
        });

        bEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenarNumeros(".");
            }
        });

        bLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
            }
        });

        bRetroceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
            }
        });

    }

    public void concatenarNumeros(String numero){
        texto = (TextView) findViewById(R.id.texto);
        texto.setText(texto.getText() + numero);
    }

    public void suma(){
        operador = "+";
        capturarNumero1();
    }

    public void resta(){
        operador = "-";
        capturarNumero1();
    }

    public void multiplicacion(){
        operador = "*";
        capturarNumero1();
    }

    public void division(){
        operador = "/";
        capturarNumero1();
    }

    public void calcular(){
        texto = (TextView) findViewById(R.id.texto);
        numero2 = Double.parseDouble(texto.getText().toString());
        switch(operador){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
        }
        texto.setText(resultado.toString());
    }

    public void capturarNumero1(){
        texto = (TextView) findViewById(R.id.texto);
        numero1 = Double.parseDouble(texto.getText().toString());
        texto.setText("");
    }

    public void limpiar(){
        numero1 = 0.0;
        numero2 = 0.0;
        operador = "";
        texto = (TextView) findViewById(R.id.texto);
        texto.setText("");
    }

    public void borrar(){
        texto = (TextView) findViewById(R.id.texto);
        String txt = texto.getText().toString();
        if(!txt.equals("")){
            txt = txt.substring(0, txt.length() -1);
            texto.setText(txt);
        }
    }
}
