/*
 *  Copyright 2024 Scouter Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *  
 *  @author Chung-Il Bang
 */
package scouter.plugin.server.alert.sms;

import com.google.gson.annotations.SerializedName;

/**
 * Alert message class to send alert via SMS
 * 
 * @author Chung-Il Bang(jjang750@gmail.com) on 2024. 5. 29.
 */
public class Message {

    @SerializedName("groupID")
    private String groupID;
    private String msg;

    public Message(String groupID, String msg) {
        this.groupID = groupID;
        this.msg = msg;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}