package com.developer.johhns.cosechagea.datos;

import android.app.Activity;
import android.content.Context;

import com.developer.johhns.cosechagea.datos.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {


    public Result<LoggedInUser> login(String username, String password, DBHelper db) {
        try {
            LoggedInUser fakeUser ;
            if ( db.esUsuarioValido( username , password ) ) {
                fakeUser = new LoggedInUser( "12345678ABCDE" , username ) ;
                return new Result.Success<>(fakeUser) ;
            } else {
                //fakeUser = new LoggedInUser( "0" , username ) ;
                //new Result.Success<>(fakeUser) ;

                Exception e = new Exception();
                return new Result.Error(new IOException("Usuario no existe", e) ) ;

            }
            //LoggedInUser fakeUser ;
            // TODO: handle loggedInUser authentication

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}