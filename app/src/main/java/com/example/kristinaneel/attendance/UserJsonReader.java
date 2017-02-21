package com.example.kristinaneel.attendance;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by clayton on 2/21/17.
 */

public class UserJsonReader {
    private ArrayList<User> mUserList;
    private Context mContext;
    private Resources resources;
    private static final String TAG = UserJsonReader.class.getSimpleName();

    public UserJsonReader(Activity context) {
        this.mContext = context;
        resources = mContext.getResources();
    }

    public ArrayList<User> getUserList()  throws IOException {
        mUserList = new ArrayList<>();
        String userJson;

        try {
            //Get the asset file from assets folder
            InputStream inputStream = mContext.getAssets().open("User.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            inputStream.close();
            userJson = new String(buffer, "UTF-8");
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }

        try {
            JSONObject userJsonObject = new JSONObject(userJson);
            JSONArray userJsonArray = userJsonObject.getJSONArray("Users");

            for (int i = 0; i < userJsonArray.length(); i++){
                JSONObject userObject = userJsonArray.getJSONObject(i);
                int userId = userObject.getInt("UserId");
                String password = userObject.getString("Password");
                User user = new User(userId, password);
                mUserList.add(user);
            }
        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
        return mUserList;
    }

}
