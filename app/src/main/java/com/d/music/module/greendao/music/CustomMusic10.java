package com.d.music.module.greendao.music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.d.music.module.greendao.music.base.MusicModel;

/**
 * Entity mapped to table "CUSTOM_MUSIC0".
 */
public class CustomMusic10 extends MusicModel {

    public CustomMusic10() {
    }

    public CustomMusic10(String url) {
        this.url = url;
    }

    public CustomMusic10(String url, String songName, String singer, String album, Long duration, Long size, String filePostfix, String folder, String lrcName, String lrcUrl, Boolean isCollected, Integer seq, Long timeStamp) {
        super(url, songName, singer, album, duration, size, filePostfix, folder, lrcName, lrcUrl, isCollected, seq, timeStamp);
    }
}