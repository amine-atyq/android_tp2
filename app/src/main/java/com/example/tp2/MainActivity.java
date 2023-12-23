package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtAddNom, edtAddDescription;
    private ListView lstFruit;
    private ArrayList<Fruit> arrayFruits;
    private Cls_Fruit_Adapter C_Fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Initialisez vos Views ici
        edtAddNom = findViewById(R.id.edtAddNom);
        edtAddDescription = findViewById(R.id.edtAddDescription);
        lstFruit = findViewById(R.id.lstFruit);

        // Initialisez votre ArrayList ici
        arrayFruits = new ArrayList<>();
        arrayFruits.add(
                new Fruit("banane",
                        "Best Fruit",
                        "banane"));

        // Initialisez votre adapter avec la liste
        C_Fruit = new Cls_Fruit_Adapter(this, arrayFruits);
        lstFruit.setAdapter(C_Fruit);

        Button btnAjouter = findViewById(R.id.btnAjouter);
        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtAddDescription.getText().toString().isEmpty() ||
                        edtAddNom.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "Veuillez saisir tous les infos",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Fruit fr = new Fruit(
                            edtAddNom.getText().toString(),
                            edtAddDescription.getText().toString(),
                            edtAddNom.getText().toString().toLowerCase()
                    );
                    arrayFruits.add(fr);
                    C_Fruit.notifyDataSetChanged();
                }
            }
        });
    }
}
