package com.mrl.coordinatorinstance.util.statusbar_util;

import android.os.Build;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/6/16.
 */

public class FlymeUtils {
    /**
     * 针对最新flame系统（5.1）不起作用。
     * @return
     */
    public static boolean isFlyme() {
        try {
            // Invoke Build.hasSmartBar()
            final Method method = Build.class.getMethod("hasSmartBar");
            return method != null;
        } catch (final Exception e) {
            return false;
        }
    }
}
