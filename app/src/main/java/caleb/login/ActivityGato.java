package caleb.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityGato extends AppCompatActivity {
    Button casilla1, casilla2, casilla3, casilla4, casilla5, casilla6, casilla7, casilla8, casilla9, reiniciar;
    String turno = "X";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);
        casilla1 = findViewById(R.id.casilla1);
        casilla2 = findViewById(R.id.casilla2);
        casilla3 = findViewById(R.id.casilla3);
        casilla4 = findViewById(R.id.casilla4);
        casilla5 = findViewById(R.id.casilla5);
        casilla6 = findViewById(R.id.casilla6);
        casilla7 = findViewById(R.id.casilla7);
        casilla8 = findViewById(R.id.casilla8);
        casilla9 = findViewById(R.id.casilla9);
        reiniciar = findViewById(R.id.reiniciar);
        reiniciar.setEnabled(false);

    }

    public void dibujar(View view) {
        int id;
        switch (turno){
            case "X":
                id = view.getId();
                if(dibujarElemento(id, turno)){
                    validarPartido();
                    turno = "O";
                }

                break;
            case "O":
                id = view.getId();
                if(dibujarElemento(id, turno)){
                    validarPartido();
                    turno = "X";
                }
                break;
        }
    }

    public boolean dibujarElemento(int id, String turno){
        boolean dibujo = true;
        switch (id){
            case R.id.casilla1:
                if(casilla1.getText().toString().equals("")){
                    casilla1.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla2:
                if(casilla2.getText().toString().equals("")){
                    casilla2.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla3:
                if(casilla3.getText().toString().equals("")){
                    casilla3.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla4:
                if(casilla4.getText().toString().equals("")){
                    casilla4.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla5:
                if(casilla5.getText().toString().equals("")){
                    casilla5.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla6:
                if(casilla6.getText().toString().equals("")){
                    casilla6.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla7:
                if(casilla7.getText().toString().equals("")){
                    casilla7.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla8:
                if(casilla8.getText().toString().equals("")){
                    casilla8.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
            case R.id.casilla9:
                if(casilla9.getText().toString().equals("")){
                    casilla9.setText(turno);
                }
                else {
                    Toast.makeText(ActivityGato.this, "Elige otra casilla",Toast.LENGTH_LONG).show();
                    dibujo = false;
                }
                break;
        }
        return dibujo;


    }
    public void validarPartido(){
        boolean casillaVerticalx = casilla1.getText().toString().equals("X") && casilla2.getText().toString().equals("X") && casilla3.getText().toString().equals("X");
        boolean casillaVerticalx2 = casilla4.getText().toString().equals("X") && casilla5.getText().toString().equals("X") && casilla6.getText().toString().equals("X");
        boolean casillaVerticalx3 = casilla7.getText().toString().equals("X") && casilla8.getText().toString().equals("X") && casilla9.getText().toString().equals("X");

        boolean casillaHorizontalx1 = casilla1.getText().toString().equals("X") && casilla4.getText().toString().equals("X") && casilla7.getText().toString().equals("X");
        boolean casillaHorizontalx2 = casilla2.getText().toString().equals("X") && casilla5.getText().toString().equals("X") && casilla8.getText().toString().equals("X");
        boolean casillaHorizontalx3 = casilla3.getText().toString().equals("X") && casilla6.getText().toString().equals("X") && casilla9.getText().toString().equals("X");

        boolean casillaDiagonalx1 = casilla1.getText().toString().equals("X") && casilla5.getText().toString().equals("X") && casilla9.getText().toString().equals("X");
        boolean casillaDiagonalx2 = casilla3.getText().toString().equals("X") && casilla5.getText().toString().equals("X") && casilla7.getText().toString().equals("X");

        boolean casillaVerticalo = casilla1.getText().toString().equals("O") && casilla2.getText().toString().equals("O") && casilla3.getText().toString().equals("O");
        boolean casillaVerticalo2 = casilla4.getText().toString().equals("O") && casilla5.getText().toString().equals("O") && casilla6.getText().toString().equals("O");
        boolean casillaVerticalo3 = casilla7.getText().toString().equals("O") && casilla8.getText().toString().equals("O") && casilla9.getText().toString().equals("O");

        boolean casillaHorizontalo1 = casilla1.getText().toString().equals("O") && casilla4.getText().toString().equals("O") && casilla7.getText().toString().equals("O");
        boolean casillaHorizontalo2 = casilla2.getText().toString().equals("O") && casilla5.getText().toString().equals("O") && casilla8.getText().toString().equals("O");
        boolean casillaHorizontalo3 = casilla3.getText().toString().equals("O") && casilla6.getText().toString().equals("O") && casilla9.getText().toString().equals("O");

        boolean casillaDiagonalo1 = casilla1.getText().toString().equals("O") && casilla5.getText().toString().equals("O") && casilla9.getText().toString().equals("O");
        boolean casillaDiagonalo2 = casilla3.getText().toString().equals("O") && casilla5.getText().toString().equals("O") && casilla7.getText().toString().equals("O");

        boolean nadieGano = !casilla1.getText().toString().equals("") && !casilla2.getText().toString().equals("") && !casilla3.getText().toString().equals("") && !casilla4.getText().toString().equals("") && !casilla5.getText().toString().equals("") && !casilla6.getText().toString().equals("") && !casilla7.getText().toString().equals("") && !casilla8.getText().toString().equals("") && !casilla9.getText().toString().equals("");


        if(casillaVerticalx || casillaVerticalx2 || casillaVerticalx3 || casillaHorizontalx1 || casillaHorizontalx2 || casillaHorizontalx3 || casillaDiagonalx1 || casillaDiagonalx2  ){
            Toast.makeText(ActivityGato.this, "Gano X", Toast.LENGTH_LONG).show();
            casilla1.setEnabled(false);
            casilla2.setEnabled(false);
            casilla3.setEnabled(false);
            casilla4.setEnabled(false);
            casilla5.setEnabled(false);
            casilla6.setEnabled(false);
            casilla7.setEnabled(false);
            casilla8.setEnabled(false);
            casilla9.setEnabled(false);
            reiniciar.setEnabled(true);

        }

        if(casillaVerticalo || casillaVerticalo2 || casillaVerticalo3 || casillaHorizontalo1 || casillaHorizontalo2 || casillaHorizontalo3 || casillaDiagonalo1 || casillaDiagonalo2  ){
            Toast.makeText(ActivityGato.this, "Gano O", Toast.LENGTH_LONG).show();
            casilla1.setEnabled(false);
            casilla2.setEnabled(false);
            casilla3.setEnabled(false);
            casilla4.setEnabled(false);
            casilla5.setEnabled(false);
            casilla6.setEnabled(false);
            casilla7.setEnabled(false);
            casilla8.setEnabled(false);
            casilla9.setEnabled(false);
            reiniciar.setEnabled(true);

        }

        if(nadieGano){
            Toast.makeText(ActivityGato.this, "Nadie gano xd", Toast.LENGTH_LONG).show();
            casilla1.setEnabled(false);
            casilla2.setEnabled(false);
            casilla3.setEnabled(false);
            casilla4.setEnabled(false);
            casilla5.setEnabled(false);
            casilla6.setEnabled(false);
            casilla7.setEnabled(false);
            casilla8.setEnabled(false);
            casilla9.setEnabled(false);
            reiniciar.setEnabled(true);
        }


    }

    public void reiniciar(View view) {
        casilla1.setText("");
        casilla2.setText("");
        casilla3.setText("");
        casilla4.setText("");
        casilla5.setText("");
        casilla6.setText("");
        casilla7.setText("");
        casilla8.setText("");
        casilla9.setText("");

        casilla1.setEnabled(true);
        casilla2.setEnabled(true);
        casilla3.setEnabled(true);
        casilla4.setEnabled(true);
        casilla5.setEnabled(true);
        casilla6.setEnabled(true);
        casilla7.setEnabled(true);
        casilla8.setEnabled(true);
        casilla9.setEnabled(true);

        turno = "X";

        reiniciar.setEnabled(false);
    }
}
