package com.example.psang_kt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CongAnAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CongAn> congAnList;

    public CongAnAdapter(Context context, int layout, List<CongAn> congAnList) {
        this.context = context;
        this.layout = layout;
        this.congAnList = congAnList;
    }

    @Override
    public int getCount() {
        return congAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgHinh;
        TextView txtHovaTen, txtCapBac, txtNoiCongTac, txtSoSao, txtQuocGia;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder =new ViewHolder();


            holder.txtHovaTen = view.findViewById(R.id.tv_hovaten);
            holder.txtCapBac = view.findViewById(R.id.tv_capbac);
            holder.imgHinh = view.findViewById(R.id.imageviewHinh);
            holder.txtNoiCongTac = view.findViewById(R.id.tv_noicongtac);
            holder.txtQuocGia = view.findViewById(R.id.tv_quocgia);
            holder.txtSoSao = view.findViewById(R.id.tv_sosao);
            view.setTag(holder);
        }else {
            holder = (ViewHolder)view.getTag();
        }

        CongAn congAn =congAnList.get(i);

        holder.txtHovaTen.setText(congAn.getTen());
        holder.txtCapBac.setText(congAn.getCapBac());
        holder.imgHinh.setImageResource(congAn.getHinh());

        holder.txtNoiCongTac.setText(congAn.getNoiCongTac());
        holder.txtQuocGia.setText(congAn.getQuocGia());
        holder.txtSoSao.setText(congAn.getSoSao());

        return view;
    }
}
