package com.example.recyclerviewstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LegDay extends AppCompatActivity {

    private RecyclerView workoutRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routine);
        getSupportActionBar().setTitle("Leg Day");

        workoutRecView = findViewById(R.id.workoutRecView);

        // create own recycler view adapter. Also need layout file
        // Pass data to adapter class
        // Change the data below to reference exercises. Then add an image URL as String bbrowURL etc.

        String bbSquat = "https://fitnessvolt.com/wp-content/uploads/2021/12/Larry-Wheels-310kg-Squat.jpg";
        String rDeadlift = "https://cdn.mos.cms.futurecdn.net/djQ6Skb6BSE56Xq6KQidx4-1200-80.jpg";
        String lunges = "https://www.muscleandfitness.com/wp-content/uploads/2013/04/Coleman0.jpg";
        String lExtensions = "https://i.ytimg.com/vi/qmFuItOiC0M/maxresdefault.jpg";

        ArrayList<Exercise> workout = new ArrayList<>();
        workout.add(new Exercise("Barbell Squat", "5 sets of 5 reps", bbSquat));
        workout.add(new Exercise("Romanian Deadlift", "3 sets of 8-10 reps", rDeadlift));
        workout.add(new Exercise("Lunges", "3 sets of 12 reps", lunges));
        workout.add(new Exercise("Leg Extensions", "3 sets of 15 reps", lExtensions));

        // create recycler view adapter

        ExerciseRecViewAdapter adapter = new ExerciseRecViewAdapter(this);
        adapter.setWorkout(workout); // passing in our array list

        // set adapter to recycler view
        workoutRecView.setAdapter(adapter);

        // set layout manager for recycler view

        workoutRecView.setLayoutManager(new LinearLayoutManager(this)); // by default vertical


    }
}