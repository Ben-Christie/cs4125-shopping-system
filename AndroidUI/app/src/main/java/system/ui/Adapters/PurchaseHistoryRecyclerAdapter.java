package system.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import system.ui.R;

public class PurchaseHistoryRecyclerAdapter extends RecyclerView.Adapter<PurchaseHistoryRecyclerAdapter.MyViewHolder> {
    /*
        TODO: connect database to recycler adapter to be used in populating stock
    */

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView purchaseDate, purchasePrice, purchasePoints;

        public MyViewHolder(final View view) {
            super(view);
            purchaseDate = view.findViewById(R.id.purchaseDate);
            purchasePrice = view.findViewById(R.id.purchasePrice);
            purchasePoints = view.findViewById(R.id.purchasePoints);

        }
    }

    @NonNull
    @Override
    public PurchaseHistoryRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stockView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_data_row, parent, false);
        return new MyViewHolder(stockView);
    }

    @Override
    public void onBindViewHolder(@NonNull PurchaseHistoryRecyclerAdapter.MyViewHolder holder, int position) {
        /*
            Implement data for date, points and price here
            Referenced: https://www.youtube.com/watch?v=__OMnFR-wZU
        */

        // String date = dateFromDatabase;
        // String points = "Points: " + pointsFromDatabase;
        // String price = "Price: €" + priceFromDatabase;

        // holder.purchaseDate.setText(date);
        // holder.purchasePoints.setText(points);
        // holder.purchasePrice.setText(price);

    }

    @Override
    public int getItemCount() {
        // return amount of data e.g. if we have 20 items of stock this should return 20
        return 0;
    }
}
