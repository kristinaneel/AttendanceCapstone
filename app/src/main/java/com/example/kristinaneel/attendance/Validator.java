package com.example.kristinaneel.attendance;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by kristinaneel on 2/27/2017.
 */
public class Validator
{


    public static boolean isIDValid( Context currentContext, CharSequence ID )
    {
        if( ID.toString().isEmpty() )
        {
            Toast.makeText( currentContext, currentContext.getString( R.string.warning_ID_empty ), Toast.LENGTH_LONG ).show();
            return false;
        }


        return true;
    }


    public static boolean isPasswordValid( Context currentContext, CharSequence password )
    {
        if( password.toString().isEmpty() )
        {
            Toast.makeText( currentContext, currentContext.getString( R.string.warning_password_empty ), Toast.LENGTH_LONG ).show();
            return false;
        }

        return true;
    }
}
