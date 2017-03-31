package activitytest.example.com.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ListView_item> listview = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView_item();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter = new Adapter(listview);
        recyclerView.setAdapter(adapter);
    }

    private void initListView_item(){
        for (int i = 0; i < 3; i++)
        {
            ListView_item cjc = new ListView_item("陈锦宸", R.drawable.cjc);
            listview.add(cjc);
            ListView_item cyz = new ListView_item("陈彦佐", R.drawable.cyz);
            listview.add(cyz);
            ListView_item ljm = new ListView_item("刘嘉铭", R.drawable.ljm);
            listview.add(ljm);
            ListView_item myzb = new ListView_item("马虞之博", R.drawable.myzb);
            listview.add(myzb);
            ListView_item ssc = new ListView_item("沈圣超", R.drawable.ssc);
            listview.add(ssc);
            ListView_item wy = new ListView_item("王勇", R.drawable.wy);
            listview.add(wy);
        }
    }
}
