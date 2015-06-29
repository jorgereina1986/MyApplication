package jorgereina1986.c4q.nyc.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import jorgereina1986.c4q.nyc.myapplication.adapters.FeedCardAdapter;
import jorgereina1986.c4q.nyc.myapplication.models.CardData;
import jorgereina1986.c4q.nyc.myapplication.models.TestData;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvFeedCards = (RecyclerView)findViewById(R.id.rv_feed_cards);
        rvFeedCards.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvFeedCards.setLayoutManager(llm);

        FeedCardAdapter feedCardsAdapter = new FeedCardAdapter();
        rvFeedCards.setAdapter(feedCardsAdapter);

        List<CardData> cardDataList = TestData.getTestData();
        feedCardsAdapter.setCardDataList(cardDataList);
        feedCardsAdapter.notifyDataSetChanged();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
