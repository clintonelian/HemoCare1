package clintonelian.hemocare.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import clintonelian.hemocare.R;
import clintonelian.hemocare.model.Account;
import clintonelian.hemocare.utils.RealmBaseHelper;
import io.realm.Realm;

public class EditAkun extends Fragment {
    View view;
    public Realm realm = Realm.getDefaultInstance();
    Button btSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.activity_editaccount, container, false);

        RealmBaseHelper realmBaseHelper = new RealmBaseHelper();

//        private Integer idAccount;
//        private String name;
//        private String gender;
//        private String age;
//        private String username;


        return view;
    }
}