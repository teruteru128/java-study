package com.twitter.teruteru128.ncv.usersetting;

import java.io.File;
import java.util.concurrent.Callable;

import jakarta.xml.bind.JAXB;

/**
 * NiconamaCommnetViewerのUserSetting.xml読み込みテスト
 * 
 * @author Teruteru
 * @see {@link https://qiita.com/opengl-8080/items/f7112240c72d61d4cdf4
 *      JAXB使い方メモ}
 */
public class UserSettingLoadSample implements Callable<UserSetting> {

    private File inputFile;

    public UserSettingLoadSample(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public UserSetting call() throws Exception {
        return JAXB.unmarshal(inputFile, UserSetting.class);
    }

}
