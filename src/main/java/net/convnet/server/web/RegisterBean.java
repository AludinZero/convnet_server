package net.convnet.server.web;

import lombok.Data;

@Data
public class RegisterBean {
        /** 用户名 */
        private String name;
        /** 密码 */
        private String password;
        /** 邮箱  */
        private String email;

}
