package system.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import system.ui.Adapters.CartRecyclerAdapter;
import system.ui.Adapters.DiscountRecyclerAdapter;
import system.ui.R;

public class DiscountUI extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_ui);

        createObjects();

        setAdapter();
    }

    private void setAdapter() {
        //pass list of data into parentheses
        DiscountRecyclerAdapter discountRecyclerAdapter = new DiscountRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(discountRecyclerAdapter);
    }

    private void createObjects() {
        recyclerView = findViewById(R.id.discountRecyclerView);
    }
}