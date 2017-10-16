package cn.edu.zstu.sunshine.base;

import android.content.Context;

import cn.edu.zstu.sunshine.utils.OkHttpUtil;
import okhttp3.Callback;

/**
 * 接口数据类
 * Created by CooLoongWu on 2017-9-21 10:22.
 */

public class Api {

    private static final String URL_BASE = "https://easy-mock.com/mock/59acaa94e0dc6633419a3afe/sunshine/";
    private static final String URL_NETWORK = "network";
    private static final String URL_CAMPUSCARD = "campuscard";
    private static final String URL_EXAM = "exam";


    public static void cancel(Context context) {
        OkHttpUtil.getInstance().cancel(context);
    }

    /**
     * 获取网费信息
     *
     * @param context  上下文，作为TAG
     * @param callback 回调
     */
    public static void getNetworkInfo(Context context, Callback callback) {
        OkHttpUtil.getInstance()
                .tag(context)
                .post(URL_BASE + URL_NETWORK)
                .addParam("userId", AppConfig.getDefaultUserId())
                .build()
                .enqueue(callback);
    }

    /**
     * 获取饭卡消费信息
     *
     * @param context  上下文，作为TAG
     * @param callback 回调
     */
    public static void getCampusCardInfo(Context context, Callback callback) {
        OkHttpUtil.getInstance()
                .tag(context)
                .post(URL_BASE + URL_CAMPUSCARD)
                .addParam("userId", AppConfig.getDefaultUserId())
                .build()
                .enqueue(callback);
    }

    /**
     * 获取考试信息
     *
     * @param context  上下文，作为TAG
     * @param callback 回调
     */
    public static void getExamInfo(Context context, Callback callback) {
        OkHttpUtil.getInstance()
                .tag(context)
                .post(URL_BASE + URL_EXAM)
                .addParam("userId", AppConfig.getDefaultUserId())
                .build()
                .enqueue(callback);
    }
}
