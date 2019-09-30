package com.example.mengenalbuah;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> implements Filterable {

    private ArrayList<ModelMovie> listdata;
    private ArrayList<ModelMovie> filterdata;

    public MovieAdapter(ArrayList<ModelMovie> dataList) {
        listdata = dataList;
        filterdata = dataList;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_list, viewGroup,false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {

        movieHolder.binView(filterdata.get(i));
    }

    @Override
    public int getItemCount() {
        return filterdata.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                if (charString.isEmpty()){
                    filterdata = listdata;
                }else {
                    ArrayList<ModelMovie> filterList = new ArrayList<>();
                    for (ModelMovie modelMovie : listdata){
                        if (modelMovie.getJudul().toLowerCase().contains(charString) | modelMovie.getSubjudul().toLowerCase().contains(charString)){
                            filterdata.add(modelMovie);
                        }
                    }

                    filterdata = filterList;

                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filterdata;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                filterdata = (ArrayList<ModelMovie>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public class MovieHolder extends RecyclerView.ViewHolder{
        private TextView tvJudul, tvSubJudul;
        CircleImageView ivLogo;


        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvSubJudul = itemView.findViewById(R.id.tvSubJudul);
            ivLogo = itemView.findViewById(R.id.ivLogo);

        }

        private void binView(ModelMovie data){

            tvJudul.setText(data.getJudul());
            tvSubJudul.setText(data.getSubjudul());
            ivLogo.setImageResource(data.getLogo());
            final String idMov = data.getId();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(),DetailActivity.class)
                    .putExtra(DetailActivity.KEY_MOVIE, idMov));
                }
            });
        }
    }
}
