package com.bignerdranch.android.criminalintent.app;

import java.util.UUID;

/**
 * Created by mmcfa_000 on 5/23/2014.
 */
public class Crime {
    private UUID id;
    private String title;

    public Crime() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
