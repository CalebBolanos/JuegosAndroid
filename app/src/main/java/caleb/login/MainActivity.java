package caleb.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contrasena;
    TextView mensaje;
    Button iniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText)findViewById(R.id.usuario);
        contrasena = (EditText)findViewById(R.id.contrasena);
        mensaje = (TextView)findViewById(R.id.mensaje);
        iniciarSesion = (Button)findViewById(R.id.iniciarSesion);
        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario = (EditText)findViewById(R.id.usuario);
                contrasena = (EditText)findViewById(R.id.contrasena);
                String us = usuario.getText().toString();
                String ps = contrasena.getText().toString();
                iniciarSesion(us, ps);
            }
        });
    }

    public void iniciarSesion(String usr, String psw){
        mensaje = (TextView)findViewById(R.id.mensaje);
        if(usr.equals("bolanos.c@hotmail.com") && psw.equals("1234")){
            mensaje.setText("Bienvenido Calob");
            Intent act2 = new Intent(this, Main2Activity.class);
            act2.putExtra("usr", usr);
            startActivity(act2);
        }else{
            mensaje.setText("Usuario y contraseña incorrectas");
        }
    }
}
