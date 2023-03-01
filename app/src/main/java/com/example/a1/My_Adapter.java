package com.example.a1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class My_Adapter extends RecyclerView.Adapter<My_Adapter.ViewHolder> {

    private List<ListData> listData;
    private Context context;

    public My_Adapter(List<ListData> listData) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ListData listData1=listData.get(position);

        holder.textView1.setText(listData1.getS1());
        holder.textView2.setText(listData1.getS2());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView1;
        public TextView textView2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1=(TextView) itemView.findViewById(R.id.textview1);
            textView2=(TextView) itemView.findViewById(R.id.textview2);
        }
    }
}
