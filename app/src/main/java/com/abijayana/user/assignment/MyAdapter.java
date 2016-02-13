package com.abijayana.user.assignment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 13-02-2016.
 */
public class MyAdapter extends ArrayAdapter<Family> {

    ArrayList<Family> arryfm;
    int Resource;
    Context context;
    LayoutInflater lf;
    public MyAdapter(Context context, int resource, ArrayList<Family> objects) {
        super(context, resource, objects);
        arryfm=objects;
        Resource=resource;
        this.context=context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView==null){
            lf=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=lf.inflate(Resource,null);
            holder=new ViewHolder();
            holder.iv=(ImageView)convertView.findViewById(R.id.imagenew);
            holder.tv1=(TextView)convertView.findViewById(R.id.tv1);
            holder.tv2=(TextView)convertView.findViewById(R.id.tv2);
            convertView.setTag(holder);
        }
        else{
            holder=(ViewHolder)convertView.getTag();
        }

       holder.iv.setImageResource(arryfm.get(position).getImagersc());
        holder.tv1.setText(arryfm.get(position).getName());
        holder.tv2.setText(arryfm.get(position).getDescription());




        return  convertView;
    }
    static class ViewHolder {
        public ImageView iv;
        public TextView tv1;
        public TextView tv2;

    }
}
