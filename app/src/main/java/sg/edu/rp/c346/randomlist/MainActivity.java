package sg.edu.rp.c346.randomlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvRandom;
    ArrayList<String> alRandom;
    ArrayAdapter<String> aaRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvRandom=findViewById(R.id.listViewRandom);
        alRandom=new ArrayList<>();
        alRandom.add("MSA 1/7/2018");
        alRandom.add("Go for haircut 22/9/2018");

        aaRandom=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alRandom);
        lvRandom.setAdapter(aaRandom);
    }
}
