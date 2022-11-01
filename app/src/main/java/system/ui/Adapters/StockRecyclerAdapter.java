package system.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import system.ui.R;

public class StockRecyclerAdapter extends RecyclerView.Adapter<StockRecyclerAdapter.MyViewHolder> {
    /*
        TODO: connect database to recycler adapter to be used in populating stock
    */

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView itemName, itemQuantity, itemPrice;

        public MyViewHolder(final View view) {
            super(view);
            itemName = view.findViewById(R.id.stockItemName);
            itemQuantity = view.findViewById(R.id.stockItemQuantity);
            itemPrice = view.findViewById(R.id.stockItemPrice);

        }
    }

    @NonNull
    @Override
    public StockRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stockView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_data_row, parent, false);
        return new MyViewHolder(stockView);
    }

    @Override
    public void onBindViewHolder(@NonNull StockRecyclerAdapter.MyViewHolder holder, int position) {
        /*
            Implement data for name, quantity and price here
            Referenced: https://www.youtube.com/watch?v=__OMnFR-wZU
        */

        // String name = nameFromDatabase + ":";
        // String quantity = quantityFromDatabase + " Available";
        // String price = "Price: €" + priceFromDatabase;

        // holder.itemName.setText(name);
        // holder.itemQuantity.setText(quantity);
        // holder.itemPrice.setText(price);

    }

    @Override
    public int getItemCount() {
        // return amount of data e.g. if we have 20 items of stock this should return 20
        return 0;
    }
}
