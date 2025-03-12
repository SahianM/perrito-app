package cl.desafiolatam.perritoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.perritoapp.model.Raza;

public class RazasAdapter extends RecyclerView.Adapter<RazasAdapter.MyViewHolder> {

    private List<Raza> razas;
    private LayoutInflater mLayoutInflater;
    private AdapterView.OnItemClickListener listener;

    public RazasAdapter(List<Raza> razas, LayoutInflater mLayoutInflater, AdapterView.OnItemClickListener listener) {
        this.razas = razas;
        this.mLayoutInflater = mLayoutInflater;
        this.listener = listener;
    }


    @NonNull
    @Override
    public RazasAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mRecipeView;
        mRecipeView = mLayoutInflater.inflate(R.layout.razas_layout, parent, false);
        return new MyViewHolder(mRecipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull RazasAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

