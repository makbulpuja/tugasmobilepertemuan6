package mplaksana27gmail.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {
    //TODO 1 : bagian ini adalah klas yang menghandle kostumasi dari list yang sebelumnya dipanggil dari MainActivity dengan paramter maintitle,subtitle, dan imgid
    //TODO 2 : deklarasi objek untuk menampung parameter
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    //TODO 3 : membuat konstruktor yang menerima data yang dikirim ke parameter
    public ListAdapter(Activity context, String[]maintitle, String[]subtitle, Integer[]imgid){
        //TODO 4 : super(context,R.layout.mylist,maintitle); berati class ini menggunakan layout mylist sebagai tampilanya
        super(context,R.layout.mylist,maintitle);

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }
    //TODO 5 : method getview  berfungsi untuk menampilkan data dari array kedalam list
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);
        //TODO 6 : menghubungkan object dengan komponen view
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        //TODO 6 : mengngatur komponen view melalui object terkait dengan isian nilai array
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        //TODO 7 : mengembalikan nilai view
        return rowView;
    }
}

