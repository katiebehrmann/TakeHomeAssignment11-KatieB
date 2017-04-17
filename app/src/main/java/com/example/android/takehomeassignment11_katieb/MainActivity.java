package com.example.android.takehomeassignment11_katieb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CarbonAction> actions;
    private CarbonActionAdapter actionAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        actionAdapter = new CarbonActionAdapter(actions, this);

        recyclerView.setAdapter(actionAdapter);
    }

    public void addRandom(View view) {
        actions.add(getRandomAction());
        actionAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        actions = new ArrayList<>();
        actions.add(new CarbonAction("Ride a bike or take public transportation",
                "Find out more!", R.drawable.bicycle));
    }

    private CarbonAction getRandomAction() {
        int num = (int) (Math.random() * 5);
        if (num == 0)
            return new CarbonAction("Ride a bike or take public transportation",
                    "Find out more!", R.drawable.bicycle);
        else if (num == 1)
            return new CarbonAction("Switch to clean energy", "Find out more!", R.drawable.solar);
        else if (num == 2)
            return new CarbonAction("Pass up fast fashion with secondhand goodness",
                    "Find out more!", R.drawable.thrift);
        else if (num == 3)
            return new CarbonAction("Bring your own tote or mug", "Find out more!",
                    R.drawable.tote);
        else
            return new CarbonAction("Spring for the greens instead of meat and dairy",
                    "Find out more!", R.drawable.vegan);
    }
}

