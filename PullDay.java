package com.example.recyclerviewstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class PullDay extends AppCompatActivity {

    private RecyclerView workoutRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routine);
        getSupportActionBar().setTitle("Pull Day"); // Changing the App name for each view e.g. Pull Day.

        workoutRecView = findViewById(R.id.workoutRecView);

        // create own recycler view adapter. Also need layout file
        // Pass data to adapter class
        // Change the data below to reference exercises. Then add an image URL as String bbrowURL etc.

        String barbellRow = "https://image.shutterstock.com/image-vector/man-doing-bentover-barbell-rows-260nw-1840374166.jpg";
        String wPullups = "https://s3.amazonaws.com/prod.skimble/assets/1226467/image_iphone.jpg";
        String wGripPullups = "https://www.muscleandperformance.com/wp-content/uploads/2018/03/pull-ups-for-bigger-back.jpg";
        String barbellCurl = "https://static.strengthlevel.com/images/illustrations/barbell-curl-1000x1000.jpg";

        ArrayList<Exercise> workout = new ArrayList<>();
        workout.add(new Exercise("Weighted Pull-ups", "5 sets of 5 reps", wPullups));
        workout.add(new Exercise("Barbell Row", "3 sets of 8 reps", barbellRow));
        workout.add(new Exercise("Wide Grip Pull-ups", "3 sets of 6 reps", wGripPullups));
        workout.add(new Exercise("Barbell Curls", "3 sets of 10 reps", barbellCurl));

        // create recycler view adapter

        ExerciseRecViewAdapter adapter = new ExerciseRecViewAdapter(this);
        adapter.setWorkout(workout); // passing in our array list

        // set adapter to recycler view
        workoutRecView.setAdapter(adapter);

        // set layout manager for recycler view

        workoutRecView.setLayoutManager(new LinearLayoutManager(this)); // by default vertical


    }
}