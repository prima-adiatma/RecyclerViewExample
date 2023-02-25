package com.development.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CountryViewHolder> {

    private ArrayList<String> countryNamelist;
    private ArrayList<String> detailsList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> countryNamelist, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNamelist = countryNamelist;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);

        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        holder.textViewCountry.setText(countryNamelist.get(position));
        holder.textViewDetails.setText(detailsList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(view -> {
            if (position == 0){
                Toast.makeText(context, "You selected the United Kingdom Flag", Toast.LENGTH_LONG).show();
            } else if (position == 1){
                Toast.makeText(context, "You selected the Germany Flag", Toast.LENGTH_LONG).show();
            } else if (position == 2){
                Toast.makeText(context, "You selected the USA Flag", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return countryNamelist.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCountry, textViewDetails;
        private ImageView imageView;
        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountry = itemView.findViewById(R.id.tvCountryName);
            textViewDetails = itemView.findViewById(R.id.tvDetails);
            imageView = itemView.findViewById(R.id.ivCountry);
            cardView = itemView.findViewById(R.id.cvCountry);
        }
    }
}
