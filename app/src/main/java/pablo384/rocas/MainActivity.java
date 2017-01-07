package pablo384.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(barra);



    }



    public void ejinfo (View vista){
        Intent in=new Intent(this, info.class);
        startActivity(in);
    }
    public void salir(View vista){
        finish();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu1, menu);

        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opmenu){

        int id=opmenu.getItemId();
        if (id==R.id.configuracion){

            return true;
        }

        if (id==R.id.infom){

            ejinfo(null);

            return true;
        }
        return super.onOptionsItemSelected(opmenu);

    }
}
