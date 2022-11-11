package system.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import system.ui.Adapters.CartRecyclerAdapter;

public class PurchaseHistoryUI extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history_ui);

        createObjects();

        setAdapter();
    }

    private void setAdapter() {
        //pass list of data into parentheses
        CartRecyclerAdapter purchaseHistoryRecyclerAdapter = new CartRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(purchaseHistoryRecyclerAdapter);
    }

    private void createObjects() {
        recyclerView = findViewById(R.id.purchaseHistoryRecyclerView);
    }
}