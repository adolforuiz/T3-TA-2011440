package adolfo.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Factura extends AppCompatActivity {
    Private TextView txtPedido,txtTotal;
    Private Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txtPedido=(TextView) findViewById(R.id.txtPedido);
        txtTotal=(TextView) findViewById(R.id.txtTotal);
        btnRegresar=(Button) findViewById(R.id.btnRegresar);

        Bundle bundle=this.getIntent().getExtras();
        txtPedido.setText(bundle.getString("Pedido").toString());
        Double total = Double.parseDouble(bundle.getString("pedido"))*7.50;
        txtTotal.setText(total.toString());
        btnRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            startActivity(new Intent(Factura.this,Principal.class));
            }
        });
    }
}
