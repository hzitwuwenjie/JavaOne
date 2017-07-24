package com.jc02.tong.message;

/**
 * 岁月是一场有去无回的旅行.
 */
public class Message {

        private String toUserName;
        private String fromUserName;
        private int createtime;
        private String msgType;



     //   public Message(String toUserName, String FromUserName, String MsgType, int Createtime) {

     //   }

        public String getMsgType() {
            return msgType;
        }

        public void setMsgType(String msgType) {
            msgType = msgType;
        }

        public int getcreatetime() {
            return createtime;
        }

        public void setcreatetime(int createtime) {
            createtime = createtime;
        }

        public String getfromUserName() {
           return fromUserName;
        }

        public void setfromUserName(String fromUserName) {
            fromUserName = fromUserName;
        }

        public String gettoUserName() {
            return toUserName;
        }

        public void setToUserName(String toUserName) {
            this.toUserName = toUserName;
        }

}
