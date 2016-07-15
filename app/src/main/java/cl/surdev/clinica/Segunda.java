package cl.surdev.clinica;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Segunda extends Activity {

    TextView tv_nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv_nombre = (TextView)findViewById(R.id.tv_nombre);
        Aplicacion app = (Aplicacion) getApplicationContext();

        tv_nombre.setText(app.getUsuario());
    }

}
