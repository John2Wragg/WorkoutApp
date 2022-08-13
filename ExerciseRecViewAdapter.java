package com.example.recyclerviewstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ExerciseRecViewAdapter extends RecyclerView.Adapter<ExerciseRecViewAdapter.ViewHolder> {

    private ArrayList<Exercise> workout = new ArrayList<>();

    private Context context;

    public ExerciseRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_list_item, parent, false);
        // Attaches view object to its parent. Follows the created contact_list_item xml file
        // Create ViewHolder object and return it
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(workout.get(position).getName());
        holder.txtrepsSets.setText(workout.get(position).getRepsSets());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, workout.get(position).getName() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(workout.get(position).getImageUrl())
                .into(holder.image);


    }

    @Override
    public int getItemCount() { // return count of different items in adapter
        return workout.size();
    }

    public void setWorkout(ArrayList<Exercise> workout) {
        this.workout = workout;
        notifyDataSetChanged(); // Lets adapter know the dataset has changed, and refresh Recycler View.
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private TextView txtName, txtrepsSets;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtname); // Not inside activity so need to use itemView
            txtrepsSets = itemView.findViewById(R.id.txtrepsSets);
            parent = itemView.findViewById(R.id.parent);
            image = itemView.findViewById(R.id.image);



        }
    }
}
