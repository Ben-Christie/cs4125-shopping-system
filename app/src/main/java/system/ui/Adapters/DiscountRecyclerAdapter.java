package system.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import system.ui.R;

public class DiscountRecyclerAdapter extends RecyclerView.Adapter<DiscountRecyclerAdapter.MyViewHolder> {
    /*
        TODO: connect database to recycler adapter to be used in populating stock
    */

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView discountedItem, discountAvailable;

        public MyViewHolder(final View view) {
            super(view);
            discountedItem = view.findViewById(R.id.discountedItem);
            discountAvailable = view.findViewById(R.id.discountAvailable);

        }
    }


    @NonNull
    @Override
    public DiscountRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stockView = LayoutInflater.from(parent.getContext()).inflate(R.layout.discount_data_row, parent, false);
        return new MyViewHolder(stockView);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountRecyclerAdapter.MyViewHolder holder, int position) {
        /*
            Implement data for name, quantity and price here
            Referenced: https://www.youtube.com/watch?v=__OMnFR-wZU
        */

        // String name = nameFromDatabase + ":";
        // String discount =  discountFromDatabase + "% Off";

        // holder.discountedItem.setText(name);
        // holder.discountAvailable.setText(discount);
    }

    @Override
    public int getItemCount() {
        // return amount of data e.g. if we have 20 items of stock this should return 20
        return 0;
    }
}
