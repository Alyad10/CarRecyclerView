package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>carList = new ArrayList<>();
    private CarAdapter adapter = new CarAdapter(carList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_cars);
        recyclerView.setAdapter(adapter);



        loadData();
    }

    private void loadData() {
        carList.add("BMW");
        carList.add("Toyota");
        carList.add("Audi");
        carList.add("Subaru");
        carList.add("Suzuki");
        carList.add("Isuzu");
        carList.add("Nissan");
        carList.add("Mazda");
        carList.add("Jeep");
        carList.add("Fiat");
        carList.add("Kia Motors");
        carList.add("Lexus");
        carList.add("Honda");
        carList.add("Daewoo");
        carList.add("Ford");
        carList.add("Volvo");
        carList.add("Mercedes Benz");
        carList.add("Lada");
        carList.add("Chevrolet");
        carList.add("Opel");
        carList.add("Land-Rover");
        carList.add("Hammer");
    }
}