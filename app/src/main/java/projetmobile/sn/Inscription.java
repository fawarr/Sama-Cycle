package projetmobile.sn;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inscription extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }
    public void onInscriptionClick(View v){
        if(v.getId()==R.id.Enregistrer){

            EditText duree_cycle = (EditText)findViewById(R.id.dce);
            EditText duree_regle = (EditText)findViewById(R.id.dre);
            EditText pseudo = (EditText)findViewById(R.id.pse);





            String ps=pseudo.getText().toString();

        }

            }
        }

