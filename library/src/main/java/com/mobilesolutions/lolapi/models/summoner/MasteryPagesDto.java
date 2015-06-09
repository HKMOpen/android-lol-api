package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Set;

public class MasteryPagesDto implements Serializable {

    @Expose
    private Set<MasteryPageDto> pages;
    @Expose
    private long summonerId;

    public Set<MasteryPageDto> getPages() {
        return pages;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
