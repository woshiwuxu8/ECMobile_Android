package com.insthub.ecmobile;

//_ooOoo_  
//o8888888o  
//88" . "88  
//(| -_- |)  
//O\ = /O  
//____/`---'\____  
//.   ' \\| |// `.  
/// \\||| : |||// \  
/// _||||| -:- |||||- \  
//| | \\\ - /// | |  
//| \_| ''\---/'' | |  
//\ .-\__ `-` ___/-. /  
//___`. .' /--.--\ `. . __  
//."" '< `.___\_<|>_/___.' >'"".  
//| | : `- \`.;`\ _ /`;.`/ - ` : | |  
//\ \ `-. \_ __\ /__ _/ .-` / /  
//======`-.____`-.___\_____/___.-`____.-'======  
//`=---='  
//
//.............................................  
//佛祖保佑             永无BUG 
//佛曰:  
//写字楼里写字间，写字间里程序员；  
//程序人员写程序，又拿程序换酒钱。  
//酒醒只在网上坐，酒醉还来网下眠；  
//酒醉酒醒日复日，网上网下年复年。  
//但愿老死电脑间，不愿鞠躬老板前；  
//奔驰宝马贵者趣，公交自行程序员。  
//别人笑我忒疯癫，我笑自己命太贱；  
//不见满街漂亮妹，哪个归得程序员？ 

import com.insthub.BeeFramework.BeeFrameworkApp;
import com.nostra13.universalimageloader.core.DisplayImageOptions;

import android.graphics.Bitmap;

public class EcmobileApp extends BeeFrameworkApp
{
    public static DisplayImageOptions options;		// DisplayImageOptions是用于设置图片显示的类
    public static DisplayImageOptions options_head;		// DisplayImageOptions是用于设置图片显示的类
    @Override
    public void onCreate() {
        super.onCreate();


        options = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.default_image)			// 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.default_image)	// 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.default_image)		// 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true)						// 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)							// 设置下载的图片是否缓存在SD卡中
                        //.displayer(new RoundedBitmapDisplayer(20))	// 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();

        options_head = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.profile_no_avarta_icon)			// 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.profile_no_avarta_icon)	// 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.profile_no_avarta_icon)		// 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true)						// 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)							// 设置下载的图片是否缓存在SD卡中
                        //.displayer(new RoundedBitmapDisplayer(30))	// 设置成圆角图片
                .build();
    }
}