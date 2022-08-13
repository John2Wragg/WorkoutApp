package com.example.recyclerviewstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class PushDay extends AppCompatActivity {

    private RecyclerView workoutRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routine);
        getSupportActionBar().setTitle("Push Day");

        workoutRecView = findViewById(R.id.workoutRecView);

        // create own recycler view adapter. Also need layout file
        // Pass data to adapter class
        // Change the data below to reference exercises. Then add an image URL as String bbrowURL etc.

        String barbellRow = "https://image.shutterstock.com/image-vector/man-doing-bentover-barbell-rows-260nw-1840374166.jpg";
        String benchPress = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Bench_Press.jpg/1024px-Bench_Press.jpg";
        String inclineBench = "https://static.strengthlevel.com/images/illustrations/incline-bench-press-1000x1000.jpg";
        String tricepPressdown = "https://s3.amazonaws.com/prod.skimble/assets/824383/image_iphone.jpg";

        ArrayList<Exercise> workout = new ArrayList<>();
        workout.add(new Exercise("Flat Bench Press", "5 sets of 5 reps", benchPress));
        workout.add(new Exercise("Incline Bench Press", "3 sets of 8 reps", inclineBench));
        workout.add(new Exercise("Barbell Row", "3 sets of 6 reps", barbellRow));
        workout.add(new Exercise("Tricep Pressdowns", "3 sets of 10 reps", tricepPressdown));

        // create recycler view adapter

        ExerciseRecViewAdapter adapter = new ExerciseRecViewAdapter(this);
        adapter.setWorkout(workout); // passing in our array list

        // set adapter to recycler view
        workoutRecView.setAdapter(adapter);

        // set layout manager for recycler view

        workoutRecView.setLayoutManager(new LinearLayoutManager(this)); // by default vertical


    }
}