package com.developer.johhns.cosechagea.datos;

import com.developer.johhns.cosechagea.datos.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    DBHelper db ;

    public Result<LoggedInUser> login(String username, String password) {

        try {
            LoggedInUser fakeUser ;
            if ( db.esUsuarioValido( username , password ) ) {
                fakeUser = new LoggedInUser( "12345678ABCDE" , username ) ;
                new Result.Success<>(fakeUser) ;
            } else {
                Exception e = new Exception();
                new Result.Error(new IOException("Usuario no existe", e) ) ;
            }
            //LoggedInUser fakeUser ;
            return null ;
            // TODO: handle loggedInUser authentication

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}