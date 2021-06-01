package sg.edu.rp.c346.id20022735.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    TextView tvTranslatedText3;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tvm;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    String ch = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewD);
        tvTranslatedText2 = findViewById(R.id.textViewO);
        tvTranslatedText3 = findViewById(R.id.textViewU);
        tv = findViewById(R.id.textViewD);
        tv1 = findViewById(R.id.textViewO);
        tv2 = findViewById(R.id.textViewU);
        registerForContextMenu(tv);
        registerForContextMenu(tv1);
        registerForContextMenu(tv2);

        tvm = findViewById(R.id.textView);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.btn1);
        b5 = findViewById(R.id.btn2);
        b6 = findViewById(R.id.btn3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+18001111111"));
                startActivity(intentCall);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+18003633333"));
                startActivity(intentCall);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+18002222121"));
                startActivity(intentCall);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.ocbc.com"));
                startActivity(intent);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.uob.com.sg"));
                startActivity(intent);

            }
        });

    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Chinese");
        menu.add(0, 2, 1, "Favourite");

        if (v == tv){
            ch = "dbs";
        }
        else if (v == tv1){
            ch ="ocbc";
        }
        else if (v == tv2){
            ch ="uob";
        }
    }
    public boolean onContextItemSelected(MenuItem item) {
        if (ch.equalsIgnoreCase("dbs")){
            if(item.getItemId()==2) {
                //code for action
                Toast.makeText(MainActivity.this, "You have chosen this as your favourite bank.", Toast.LENGTH_SHORT).show();
                tv.setTextColor(Color.RED);
                tv1.setTextColor(Color.BLACK);
                tv2.setTextColor(Color.BLACK);
                return true; //menu item successfully handled
            }}
        else if (ch.equalsIgnoreCase("ocbc")) {
            if (item.getItemId() == 2) {
                //code for action
                Toast.makeText(MainActivity.this, "You have chosen this as your favourite bank.", Toast.LENGTH_SHORT).show();
                tv.setTextColor(Color.BLACK);
                tv1.setTextColor(Color.RED);
                tv2.setTextColor(Color.BLACK);
                return true;  //menu item successfully handled
            } }
        else if (ch.equalsIgnoreCase("uob")) {
            if (item.getItemId() == 2) {
                    //code for action
                Toast.makeText(MainActivity.this, "You have chosen this as your favourite bank.", Toast.LENGTH_SHORT).show();
                tv.setTextColor(Color.BLACK);
                tv1.setTextColor(Color.BLACK);
                tv2.setTextColor(Color.RED);
                return true;  //menu item successfully handled
            }
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
            public boolean onCreateOptionsMenu (Menu menu){
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.main_menu, menu);
                return true;
            }
            @Override
            public boolean onOptionsItemSelected (MenuItem item){
                // Handle action bar item clicks here.
                int id = item.getItemId();
                if (id == R.id.EnglishSelection) {
                    tvTranslatedText.setText("DBS ");
                    tvTranslatedText2.setText("OCBC");
                    tvTranslatedText2.setText("UOB");
                    return true;
                } else if (id == R.id.italianSelection) {
                    tvm.setText("银行");
                    tvTranslatedText.setText("星展银行");
                    tvTranslatedText2.setText("华侨银行");
                    tvTranslatedText3.setText("大华银行");
                    b1.setText("拨打银行");
                    b4.setText("网络");
                    b2.setText("拨打银行");
                    b5.setText("网络");
                    b3.setText("拨打银行");
                    b6.setText("网络");
                    return true;
                } else {
                    tvTranslatedText.setText("Error translation");
                    tvTranslatedText2.setText("Error translation");
                    tvTranslatedText3.setText("Error translation");
                    b1.setText("Error translation");
                    b2.setText("Error translation");
                    b3.setText("Error translation");
                    b4.setText("Error translation");
                    b5.setText("Error translation");
                    b6.setText("Error translation");
                }
                return super.onOptionsItemSelected(item);

            }
        }

