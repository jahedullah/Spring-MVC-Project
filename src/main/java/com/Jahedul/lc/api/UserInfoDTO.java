package com.Jahedul.lc.api;

import javax.validation.constraints.NotBlank;

public class UserInfoDTO {
    @NotBlank(message = " * Your name Please! :)")
    private String userName;
    private String friendName;

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }



    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public String toString(){
        return "userName : ["+userName+"] friendName : ["+friendName+"]";

    }





}
