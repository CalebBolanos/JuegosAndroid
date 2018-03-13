package caleb.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void abrirCalculadora(View view) {
        Intent calcu = new Intent(this, calculadora.class);
        startActivity(calcu);
    }


    public void abrirGato(View view) {
        Intent gato = new Intent(this, ActivityGato.class);
        startActivity(gato);
    }


    public void abrirAhorcado(View view) {
        Intent ahorcado = new Intent(this, ActivityAhorcado.class);
        startActivity(ahorcado);

    }

    public void abrirMemorama(View view) {
        Intent memorama = new Intent(this, ActivityMemorama.class);
        startActivity(memorama);
    }

    public void abrirConecta4(View view) {
        Intent conecta4 = new Intent(this, ActivityConecta4.class);
        startActivity(conecta4);
    }
}
