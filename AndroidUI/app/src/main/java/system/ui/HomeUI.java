package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import UIControls.PurchaseController;

public class HomeUI extends AppCompatActivity {
    Button logoutButton, browseProductButton, purchaseHistoryButton, scanButton, cartButton;
    TextView currentPoints, customerDiscountStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);


        createObjects();

        logoutButton.setOnClickListener(view -> {

        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeUI.this, CartUI.class);
                startActivity(intent);

            }
        });

        browseProductButton.setOnClickListener(view -> {
            Intent intent = new Intent(HomeUI.this, BrowseProductUI.class);
            startActivity(intent);

        });

        scanButton.setOnClickListener(view -> {
            PurchaseController pc = new PurchaseController();
            pc.scan();
            pc.receivePurchaseFromTill();
        });

//        cartButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        purchaseHistoryButton.setOnClickListener(view -> {

        });
    }

    private void createObjects() {
        logoutButton = findViewById(R.id.logoutButton);
        browseProductButton = findViewById(R.id.browseProductButton);
        scanButton = findViewById(R.id.scanButton);
        cartButton = findViewById(R.id.cartButton);
        purchaseHistoryButton = findViewById(R.id.purchaseHistoryButton);
        currentPoints = findViewById(R.id.currentPointsText);
        customerDiscountStatus = findViewById(R.id.customerStatusText);
    }

}