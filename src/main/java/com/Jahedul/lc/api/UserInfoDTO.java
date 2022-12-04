package com.Jahedul.lc.api;

public class UserInfoDTO {

    private String userName = "Mr/Mrs. X";
    private String friendName = "Mr/Mrs. Y";

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
