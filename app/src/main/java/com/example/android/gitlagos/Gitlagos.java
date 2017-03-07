/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.gitlagos;

/**
 * An {@link Gitlagos} object contains information related to a single earthquake.
 */
public class Gitlagos {

    /**
     * Github users' username
     */
    //private double mUsername;
    private String mUsername;

    /**
     * Github users' username
     */
    //private String mPhoto;
    private String mPhoto;

    /**
     * Time of the earthquake
     */
    //private long mTimeInMilliseconds;



    /**
     * Github users' profile url
     */
    private String mUrl;

    /**
     * Constructs a new {@link Gitlagos} object.
     *
     * @param username          is the username of github users residing in lagos state, nigeria
     * @param photo            is the profile photo of github users residing in lagos state, nigeria
     *
     * @param url                is the user profile url of github users residing in lagos state, nigeria
     */
    public Gitlagos(String username, String photo, String url) {
        mUsername = username;
        mPhoto = photo;
        //mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getUsername() {
        return mUsername;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getPhoto() {
        return mPhoto;
    }

    /**
     * Returns the time of the earthquake.

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
     */

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
