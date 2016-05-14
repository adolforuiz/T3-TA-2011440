package adolfo.org.myapplication;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Laboratorio1 extends AppCompatActivity {

    private EditText  txt_hint;
    private Button btnPedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorio1);
        txt_hint=(EditText) findViewById(R.id.txt_hint);
        btnPedir=(Button) findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Snackbar.make(v, "Click en botón pedir", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(Laboratorio1.this,Factura.class);
                intent.putExtra("Pedir",txt_hint.getText().toString());
                startActivity(intent);

            }

        });

    }
}
