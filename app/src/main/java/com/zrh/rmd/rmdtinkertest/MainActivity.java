package com.zrh.rmd.rmdtinkertest;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import org.w3c.dom.Text;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //加载补丁
    public void loadPath(View view) {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/patch_signed_7zip.apk";
        File file = new File(path);
        if (file.exists()){
            Toast.makeText(this, "补丁已经存在", Toast.LENGTH_SHORT).show();
            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), path);
            Log.d("swy", path);
        }else {
            Toast.makeText(this, "补丁已经不存在", Toast.LENGTH_SHORT).show();
            Log.d("swy", path);
        }
    }
}
