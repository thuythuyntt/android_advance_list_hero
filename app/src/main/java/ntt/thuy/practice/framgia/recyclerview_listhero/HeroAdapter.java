package ntt.thuy.practice.framgia.recyclerview_listhero;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thuy on 16/07/2018.
 */
public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.MyViewHolder> {
    private List<Hero> mArray;

    public HeroAdapter(List<Hero> imageArray) {
        this.mArray = imageArray;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bindData(mArray.get(position));
    }

    @Override
    public int getItemCount() {
        return mArray == null ? 0 : mArray.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageHero;
        TextView mTextName;

        private MyViewHolder(View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_item);
            mTextName = itemView.findViewById(R.id.text_name);

        }

        private void bindData(Hero hero) {
            mImageHero.setImageResource(hero.getImage());
            mTextName.setText(hero.getName());
        }
    }
}
