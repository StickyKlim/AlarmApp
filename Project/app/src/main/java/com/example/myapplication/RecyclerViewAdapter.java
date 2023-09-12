package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Categorie> mData;
    public RecyclerViewAdapter(Context mContext, List<Categorie> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview,viewGroup,false);
        return new RecyclerViewAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyHolder myHolder,final int i) {
        myHolder.categoryTitle.setText(mData.get(i).getCategoryName());
        myHolder.img_category_thumbnail.setImageResource(mData.get(i).getThumbnail());

        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,CategorieActivity.class);
                intent.putExtra("Name",mData.get(myHolder.getAdapterPosition()).getCategoryName());
                intent.putExtra("Desc",mData.get(myHolder.getAdapterPosition()).getCategoryDesc());
                intent.putExtra("MethodTitle",mData.get(myHolder.getAdapterPosition()).getCategoryMethodTitle());
                intent.putExtra("Category",mData.get(myHolder.getAdapterPosition()).getCategory());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView categoryTitle;
        CardView cardView;
        ImageView img_category_thumbnail;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            categoryTitle =(TextView)itemView.findViewById(R.id.text_category);
            img_category_thumbnail=(ImageView)itemView.findViewById(R.id.category_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
