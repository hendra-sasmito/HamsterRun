package com.obugames.hamsterrun.box2d;

import com.obugames.hamsterrun.enums.UserDataType;

public class GroundUserData extends UserData {

	public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }

}