package com.developer.johhns.cosechagea.datos;

import com.developer.johhns.cosechagea.datos.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            //LoggedInUser fakeUser ;
            LoggedInUser fakeUser ;

            if ( username == "juan" ) {
                fakeUser = new LoggedInUser( "12345678ABCDE" , username ) ;
            } else {

                fakeUser = new LoggedInUser( "0" , "invalido" ) ;
            }

            // TODO: handle loggedInUser authentication

            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}