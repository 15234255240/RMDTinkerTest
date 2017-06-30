package com.zrh.rmd.rmdtinkertest;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 微信推荐写法
 */

@DefaultLifeCycle(application = ".SimpleTinkerInApplication",flags = ShareConstants.TINKER_ENABLE_ALL,loadVerifyFlag = false)
public class SimpleTinkerInApplicationLike extends ApplicationLike {
    public SimpleTinkerInApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
        MultiDex.install(base);//防止dex方法过多报错
        TinkerInstaller.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

//        MultiDex.install(base);
//        //绑定热修复
//        TinkerInstaller.install(this);

    }
}
