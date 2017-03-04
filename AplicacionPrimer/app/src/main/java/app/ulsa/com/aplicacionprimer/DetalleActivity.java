package app.ulsa.com.aplicacionprimer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetalleActivity extends AppCompatActivity {

    TextView nombre;
    TextView que;
    TextView donde;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imagen = (ImageView) findViewById(R.id.url);
        nombre = (TextView) findViewById(R.id.nombre);
        que = (TextView) findViewById(R.id.id_que);
        donde = (TextView) findViewById(R.id.id_donde);

        // recibir el intent y los objetos
        Intent segV = getIntent();
        Bundle bun = segV.getExtras();
        Alimento alimento = (Alimento) bun.get("alimento");
        Toast.makeText(getApplicationContext(),"Alimento " + alimento.getNombre(),Toast.LENGTH_SHORT).show();
        Picasso.with(this).load(alimento.getImgUrl()).into(imagen);
        nombre.setText(alimento.getNombre());
        que.setText(alimento.getQue());
        donde.setText(alimento.getDonde());

    }

}
