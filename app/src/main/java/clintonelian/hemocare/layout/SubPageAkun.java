package clintonelian.hemocare.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import clintonelian.hemocare.R;
import clintonelian.hemocare.model.Account;
import clintonelian.hemocare.utils.RealmBaseHelper;
import io.realm.Realm;
import android.view.View.OnClickListener;

public class SubPageAkun extends Fragment {
    View view;
    public Realm realm = Realm.getDefaultInstance();
    Button editAkun;//untuk sementara dibuat jadi newAkun
    Button gantiAkun;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sub_page_akun, container, false);

//        private Integer idAccount;
//        private String name;
//        private String gender;
//        private String age;
//        private String username;
        RealmBaseHelper realmBaseHelper = new RealmBaseHelper();

        //fungsi untuk menambah akun
        EditText name = (EditText) view.findViewById(R.id.etNama);
        EditText gender = (EditText) view.findViewById(R.id.etGender);
        EditText age = (EditText) view.findViewById(R.id.etUmur);
        String nameValue = name.getText().toString();
        String genderValue = name.getText().toString();
        String ageValue = name.getText().toString();
        String idValue = ""+ 100000 + realmBaseHelper.countAll(realm,Account.class)+1;

        //Input data ke tabel Akun
        List<Account> accountList = new ArrayList<Account>();
        Account account = new Account();
        account.setIdAccount("100001");
        account.setName("Clinton EG");
        account.setGender("Laki-Laki");
        account.setAge("21");
        account.setUsername("clinton");
        accountList.add(account);

         account = new Account();
        account.setIdAccount("100002");
        account.setName("Putut Dewantoro");
        account.setGender("Laki-Laki");
        account.setAge("21");
        account.setUsername("putut");
        accountList.add(account);

         account = new Account();
        account.setIdAccount("100003");
        account.setName("Resti Oktia");
        account.setGender("Perempuan");
        account.setAge("21");
        account.setUsername("resti");
        accountList.add(account);


        return view;
    }


    public void onViewClicked() {
    }
}