package clintonelian.hemocare.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import clintonelian.hemocare.R;

public class SubPageTips extends Fragment {
    // TODO: Harus di atur lagi kriteria tentang Tipsnya apa harus diukur dulu apa gmn, kalau belom ukur bisa liat tipsnya ga

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__sub_page_tips, container, false);

        return view;
    }

}
