package com.example.adli.mar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class darsname extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darsname);
        findViewById(R.id.riazi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "a1.pdf");
                try
                {
                    in = assetManager.open("a1.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/a1.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.phizic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "a2.pdf");
                try
                {
                    in = assetManager.open("a2.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/a2.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.hendese).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "a3.pdf");
                try
                {
                    in = assetManager.open("a3.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/a3.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.zist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "z1.pdf");
                try
                {
                    in = assetManager.open("z1.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/z1.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.arabi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "arabi.pdf");
                try
                {
                    in = assetManager.open("arabi.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/arab.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.farsi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "adab.pdf");
                try
                {
                    in = assetManager.open("adab.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/adab.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.shimi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "eng.pdf");
                try
                {
                    in = assetManager.open("eng.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/eng.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
        findViewById(R.id.english).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AssetManager assetManager = getAssets();


                InputStream in = null;
                OutputStream out = null;
                File file = new File(getFilesDir(), "eng.pdf");
                try
                {
                    in = assetManager.open("eng.pdf");
                    out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);


                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(
                            Uri.parse("file://" + getFilesDir() + "/eng.pdf"),
                            "application/pdf");


                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "??? ????? adode reader ??? ???? ", 2000).show();
                    finish();
                }
            }


            private void copyFile(InputStream in, OutputStream out) throws IOException
            {
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1)
                {
                    out.write(buffer, 0, read);
                }
            }




        });
    }}

