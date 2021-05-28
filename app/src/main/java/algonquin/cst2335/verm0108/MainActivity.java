package algonquin.cst2335.verm0108;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x = 0;
        setContentView(R.layout.activity_main);
        TextView mytext = findViewById(R.id.textview);
        EditText myedit = findViewById(R.id.theedittext);
        Button mybutton = findViewById(R.id.thebutton);
        mybutton.setOnClickListener( (vw) -> {
            // Code here executes on main thread after user presses button
            String editString = myedit.getText().toString();
            mytext.setText( "You write this: " + editString);

        });
        CheckBox mycheck = findViewById(R.id.thecheckbox);
        mycheck.setOnCheckedChangeListener((button,ischecked) -> {
            Context context = getApplicationContext();
            CharSequence text = "You selected the box";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } );
        RadioButton myradio = findViewById(R.id.theradio);
        myradio.setOnCheckedChangeListener((button,ischecked) -> { Context context = getApplicationContext();
            CharSequence text = "You on  the radio button";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();} );
        Switch myswitch = findViewById(R.id.theswtich);
        myswitch.setOnCheckedChangeListener((button,ischecked) -> { Context context = getApplicationContext();
            CharSequence text = "You swtiched  the swtich ";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();} );


        ImageButton imgbtn = findViewById( R.id.theimageButton );
    }
}