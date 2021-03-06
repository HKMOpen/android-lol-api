package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class SpellVarsDto implements Serializable {

    private List<Double> coeff;
    private String dyn;
    private String key;
    private String link;
    private String ranksWith;

    public List<Double> getCoeff() {
        return coeff;
    }

    public String getDyn() {
        return dyn;
    }

    public String getKey() {
        return key;
    }

    public String getLink() {
        return link;
    }

    public String getRanksWith() {
        return ranksWith;
    }
}
