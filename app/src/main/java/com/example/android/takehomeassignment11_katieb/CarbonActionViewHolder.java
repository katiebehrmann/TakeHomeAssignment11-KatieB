package com.example.android.takehomeassignment11_katieb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by katie on 4/14/17.
 */

public class CarbonActionViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView carbonName;
    private TextView carbonInfo;
    private ImageView carbonPhoto;
    private Context context;

    public CarbonActionViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        carbonName = (TextView) itemView.findViewById(R.id.action_name);
        carbonInfo = (TextView) itemView.findViewById(R.id.action_info);
        carbonPhoto = (ImageView) itemView.findViewById(R.id.action_image);
        this.context = context;
    }

    public void bind(final CarbonAction carbonAction) {
        carbonName.setText(carbonAction.name);
        carbonInfo.setText(carbonAction.info);
        carbonPhoto.setImageResource(carbonAction.photoID);

//        cardView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick (View v){
//                Toast.makeText(context, carbonName.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarbonAction c = new CarbonAction(carbonAction.name, carbonAction.info,
                        carbonAction.photoID);
                Intent intent = new Intent(context, FindOutMore.class);
                intent.putExtra(Keys.CARBON, c);
                context.startActivity(intent);

                Toast.makeText(context, carbonName.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
