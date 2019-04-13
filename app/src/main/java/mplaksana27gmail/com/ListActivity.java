package mplaksana27gmail.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listme);
        //TODO 1 : Mendeklarasikan isi list
        ListView list;
        String[]maintitle={"Bisri Ha","Bagas Antuk P.","Irwan Pra","Ganesha S","Daus Nur"};
        String[]subtitle={"bisrihanafi@gmail.com","bagas.antuk@gmail.com","irwanpra@gmail.com","ganesha@gmail.com","firdaussnur@gmail.com"};

        //TODO 2 : Mengambil gambar dari sumber daya drawable
        Integer[]imgid={
                R.drawable.download_4,
                R.drawable.download_3,
                R.drawable.download_1,
                R.drawable.download_5,
                R.drawable.download_2
        };

        //TODO 3 : Mendeklarasikan objek adapter dari klas listAdapter
               ListAdapter adapter=new ListAdapter(this,maintitle,subtitle,imgid);

        //TODO 4 : mengaitkan object list dengan komponen list pada layout
        list=(ListView)findViewById(R.id.list);

        //TODO 5 : mengatur adapterlist dengan adapter
        list.setAdapter(adapter);

        //TODO 6 : membuat event agar item pada list agar bisa diclick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //TODO method ini merupana overide OnItemClickListener
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO 7 : script Toast sesuai dengan item yang dipilih
                if(position==0){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Pertama",Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Kedua",Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Ketiga",Toast.LENGTH_SHORT).show();
                }else if(position==3){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Keempat",Toast.LENGTH_SHORT).show();
                }else if(position==4){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Kelima",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

