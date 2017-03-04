package app.ulsa.com.aplicacionprimer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Comida extends Fragment {

    ListView listComidas;

    public Comida() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_comida, container, false);
        this.getActivity().setTitle("Comida");
        listComidas = (ListView) view.findViewById(R.id.list);
        Sincronizar sincronizar = new Sincronizar(this);
        sincronizar.execute();
        return view;
    }


    public ListView getListComidas() {
        return listComidas;
    }

    public void setListComidas(ListView listComidas) {
        this.listComidas = listComidas;
    }
}
