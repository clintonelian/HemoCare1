package clintonelian.hemocare.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import clintonelian.hemocare.R;
import clintonelian.hemocare.model.Account;
import clintonelian.hemocare.model.Hemoglobin;

public class SubPageRiwayat extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sub_page_riwayat, container, false);

//        private Integer idHb;
//        private float hb;
//        private Integer idAccount;

        //Input data ke tabel Hemoglobin
        List<Hemoglobin> hemoglobinList = new ArrayList<Hemoglobin>();
        Hemoglobin hemoglobin = new Hemoglobin();
        hemoglobin.setIdAccount("100001");
        hemoglobin.setHb(13.4f);//f convert ke float
        hemoglobin.setIdHb("100001");
        hemoglobinList.add(hemoglobin);

         hemoglobin = new Hemoglobin();
        hemoglobin.setIdAccount("100002");
        hemoglobin.setHb(13.8f);
        hemoglobin.setIdHb("100002");
        hemoglobinList.add(hemoglobin);

         hemoglobin = new Hemoglobin();
        hemoglobin.setIdAccount("100003");
        hemoglobin.setHb(13.4f);
        hemoglobin.setIdHb("100003");
        hemoglobinList.add(hemoglobin);


        return view;
    }



}
