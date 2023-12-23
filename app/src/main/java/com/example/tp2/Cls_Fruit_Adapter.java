package com.example.tp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cls_Fruit_Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Fruit> TabFruit = new ArrayList<Fruit>();

    public Cls_Fruit_Adapter(Context context, ArrayList<Fruit> Tab){
        this.TabFruit = Tab;
        this.context=context;
    }

    @Override
    public int getCount() {
        return TabFruit.size();
    }

    @Override
    public Object getItem(int position) {
        return TabFruit.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.customrow,null);
        TextView txtNom = (TextView) v.findViewById(R.id.txtNom);
        TextView txtDesc = (TextView) v.findViewById(R.id.txtDesc);
        ImageView imgIcone = (ImageView) v.findViewById(R.id.imgIcone);
        txtNom.setText(TabFruit.get(position).getNom());
        txtDesc.setText(TabFruit.get(position).getDescription());

        int resId = context.getResources().getIdentifier
                (TabFruit.get(position).getNomIcone(),"drawable",context.getPackageName());
        imgIcone.setImageResource(resId);
        return v;
    }
}
