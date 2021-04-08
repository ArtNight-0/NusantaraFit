package com.example.project_nusantarafit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PayAdapter extends ArrayAdapter<Pay> {
    public PayAdapter(Context context, ArrayList<com.example.project_nusantarafit.Pay> pay) { super(context, 0, pay);}
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Pay pay = getItem(position);

        if(convertView == null ) {
            convertView = LayoutInflater. from(getContext()).inflate(R.layout.nusantara_payment_row_list, parent, false);
        }

        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);
        TextView lblDetail  = (TextView) convertView.findViewById(R.id.lblDetail);
        TextView lblTanggal = (TextView) convertView.findViewById(R.id.lblTanggal);
        TextView lblHarga = (TextView) convertView.findViewById(R.id.lblHarga);
        TextView lblHasil = (TextView) convertView.findViewById(R.id.lblHasil);

        imgFoto.setImageResource(pay.fotoID);
        lblDetail.setText(pay.detail);
        lblTanggal.setText(pay.tanggal);
        lblHarga.setText(pay.harga);
        lblHasil.setText(pay.hasil);

        return convertView;
    }
}
