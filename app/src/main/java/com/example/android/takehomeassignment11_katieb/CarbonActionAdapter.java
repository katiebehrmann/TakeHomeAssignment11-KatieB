package com.example.android.takehomeassignment11_katieb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by katie on 4/14/17.
 */

public class CarbonActionAdapter extends RecyclerView.Adapter<CarbonActionViewHolder> {

    private List<CarbonAction> actions;
    private Context context;

    public CarbonActionAdapter(List<CarbonAction> actions, Context context) {
        this.context = context;
        this.actions = actions;
    }


    @Override
    public CarbonActionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new CarbonActionViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(CarbonActionViewHolder holder, int position) {
        CarbonAction action = actions.get(position);
        holder.bind(action);
    }

    @Override
    public int getItemCount() {
        return actions.size();
    }
}
