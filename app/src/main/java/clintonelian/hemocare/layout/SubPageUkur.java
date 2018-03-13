package clintonelian.hemocare.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import clintonelian.hemocare.R;
import clintonelian.hemocare.model.Account;
import clintonelian.hemocare.utils.RealmBaseHelper;

// TODO: Bikin Fungsi untuk ngubah text view dan hasil pengukuran begitu data diterima, dan loading

public class SubPageUkur extends Fragment {

    Button btUkur;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sub_page_ukur, container, false);
        //Find the button untuk memulai pengukuran
        btUkur = (Button) view.findViewById(R.id.btStart);
        //Find the +1 button
        //mPlusOneButton = (PlusOneButton) view.findViewById(R.id.plus_one_button);
        RealmBaseHelper realmBaseHelper = new RealmBaseHelper();

//        private String idHb;
//        private float hb;
//        private String idAccount;

        //fungsi untuk menambah akun
//      EditText hb = (EditText) view.findViewById(R.id.etNama);
//        EditText gender = (EditText) view.findViewById(R.id.etGender);
//        EditText age = (EditText) view.findViewById(R.id.etUmur);

//     float hbValue = Float.valueOf(hb.getText().toString());
//        String idHbValue = ""+ 100000 + realmBaseHelper.countAll(realm,Hemoglobin.class)+1;
//        String idValue = ""+ 100000 + realmBaseHelper.countAll(realm,Hemoglobin.class)+1;

        return view;
    }

}
