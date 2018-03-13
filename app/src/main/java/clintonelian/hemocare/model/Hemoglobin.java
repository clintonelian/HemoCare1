package clintonelian.hemocare.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Hemoglobin extends RealmObject{

    @PrimaryKey
    private String idHb;
    private float hb;
    private String idAccount;

    public String getIdHb() {
        return idHb;
    }

    public void setIdHb(String idHb) {
        this.idHb = idHb;
    }

    public float getHb() {
        return hb;
    }

    public void setHb(float hb) {
        this.hb = hb;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }
}