package br.com.treinamento;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    private FragmentA fragA;
    private FragmentB fragB;

    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        fm = getFragmentManager();

        fragA = new FragmentA();
        fragB = new FragmentB();

    }

    public void onClick(View view){

        if( view.getId() == R.id.btn_a ){

            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace( R.id.fragcontainer, fragA );
            transaction.commit();

        }else if( view.getId() == R.id.btn_b ){

            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace( R.id.fragcontainer, fragB );
            transaction.commit();

        }

    }
    
}
