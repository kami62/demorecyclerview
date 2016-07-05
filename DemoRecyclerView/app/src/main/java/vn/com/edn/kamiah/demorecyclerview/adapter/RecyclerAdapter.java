package vn.com.edn.kamiah.demorecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import vn.com.edn.kamiah.demorecyclerview.R;
import vn.com.edn.kamiah.demorecyclerview.pojo.Country;

/**
 * Created by PC14-02 on 7/5/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>  {

    private int resId;
    private ArrayList<Country> countries;
    private Context context;

    public RecyclerAdapter(int resId, ArrayList<Country> countries) {
        this.resId = resId;
        this.countries = countries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View itemView = LayoutInflater.from(context).inflate(resId, parent, false);

        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Country country = countries.get(position);
        if(country != null){

            String imageUrl = country.getImageUrl();
            Glide.with(context)
                    .load(imageUrl)
                    .asBitmap()
                    .override(256, 256)
                    .centerCrop()
                    .into(holder.imgFlag);

//            holder.imgFlag.
            holder.tvEnName.setText(country.getEnName());
            holder.tvViName.setText(country.getViName());
        }

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imgFlag;
        public TextView tvEnName, tvViName;

        public ViewHolder(View itemView) {
            super(itemView);
            imgFlag = (ImageView) itemView.findViewById(R.id.flag);
            tvEnName = (TextView) itemView.findViewById(R.id.enName);
            tvViName = (TextView) itemView.findViewById(R.id.viName);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "POS : " + getAdapterPosition() + " - ID : " + getItemId(), Toast.LENGTH_SHORT).show();
        }
    }

}
