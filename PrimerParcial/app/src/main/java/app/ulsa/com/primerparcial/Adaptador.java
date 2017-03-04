package app.ulsa.com.primerparcial;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Alondra on 22/02/2017.
 */
public class Adaptador extends ArrayAdapter<General> {
    private Activity context;
    private List<General> listaContactos;

    public Adaptador(Activity context, int resource, List<General> objects) {
        super(context, resource, objects);
        this.context = context;
        this.listaContactos=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View fila = convertView;
        if (fila == null){
            LayoutInflater inflater = context.getLayoutInflater();
            fila = inflater.inflate(R.layout.general, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.nombre = (TextView) fila.findViewById(R.id.id_nombre);

            viewHolder.imagen = (ImageView) fila.findViewById(R.id.imgUrl);

            fila.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder) fila.getTag();
        General general = this.listaContactos.get(position);
        holder.nombre.setText(general.getNombre());
        // holder.telefono.setText(contacto.getTelefono());
        //holder.email.setText(contacto.getEmail());
        //holder.equipo.setText(contacto.getEquipo());
        Picasso.with(context).load(general.getImgUrl()).resize(100,100).centerCrop().into(holder.imagen);
        return fila;
    }


    static class ViewHolder {
        public TextView nombre;
        public ImageView imagen;

    }
}