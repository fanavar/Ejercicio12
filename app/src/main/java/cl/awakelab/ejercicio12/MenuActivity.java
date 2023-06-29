package cl.awakelab.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.ejercicio12.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMenuBinding binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String> listaDeMenus = new ArrayList<>();

        listaDeMenus.add("Puré de calabacín");
        listaDeMenus.add("Tortilla de patatas");
        listaDeMenus.add("Albóndigas de pollo");
        listaDeMenus.add("Ensalada de tomate");
        listaDeMenus.add("Leche, pan con aceite y fruta");
        listaDeMenus.add("Lentejas vegetales");
        listaDeMenus.add("Croquetas de atún");
        listaDeMenus.add("Menestra de verduras");
        listaDeMenus.add("Sardinas al horno");
        listaDeMenus.add("Leche, pan con aceite y fruta");
        listaDeMenus.add("Macarrones con verduras");
        listaDeMenus.add("Pollo a la cerveza");
        listaDeMenus.add("Sopa juliana");
        listaDeMenus.add("Corvina al ajillo");
        listaDeMenus.add("Leche, pan con aceite y fruta");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaDeMenus);
        binding.ListViewMenu.setAdapter(adapter);
    }
}