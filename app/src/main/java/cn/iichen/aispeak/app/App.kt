package cn.iichen.aispeak.app

import android.app.Application
import com.tencent.bugly.Bugly
import com.tencent.bugly.beta.Beta

/**
 *
 * @ProjectName:    AiSpeak
 * @Package:        cn.iichen.aispeak.app
 * @ClassName:      App
 * @Description:     java类作用描述
 * @Author:         作者名 qsdiao
 * @CreateDate:     2022/3/16 21:57
 * @UpdateUser:     更新者：qsdiao
 * @UpdateDate:     2022/3/16 21:57
 * @UpdateRemark:   更新说明：Fuck code, go to hell, serious people who maintain it：
 * @Version:        更新说明: 1.0
┏┓　　　┏┓
┏┛┻━━━┛┻┓
┃　　　　　　　┃
┃　　　━　　　┃
┃　┳┛　┗┳　┃
┃　　　　　　　┃
┃　　　┻　　　┃
┃　　　　　　　┃
┗━┓　　　┏━┛
┃　　　┃   神兽保佑
┃　　　┃   代码无BUG！
┃　　　┗━━━┓
┃　　　　　　　┣┓
┃　　　　　　　┏┛
┗┓┓┏━┳┓┏┛
┃┫┫　┃┫┫
┗┻┛　┗┻┛
 */


class App : Application(){
    override fun onCreate() {
        super.onCreate()
        Bugly.init(applicationContext, "e8f033fa2d", true);
        Beta.autoCheckUpgrade = false
        Beta.showInterruptedStrategy = true
    }
}