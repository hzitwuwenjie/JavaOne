package com.jc02.xieshuyuan.lianxi.service;
import com.jc02.xieshuyuan.lianxi.entity.*;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 14:03
 * |    @description   二维码的业务逻辑
 * +---------------------------------Oooo---------------------------------------+
 */
public class QrCodeService {
    /*
       负责执行新建二维码的业务
     */
    public boolean insertQrcode(QrCode qrode){
        System.out.println("编码实现执行新增");
        return false;
    }
    /*
       修改二维码的业务
     */
    public byte[] download(String url){
        System.out.println("编码实现二维码的下载业务功能");
        return null;
    }
    /*
       负责执行修改二维码的业务
     */
    public boolean updateQrcode(QrCode qrode){
        System.out.println("编码实现执行修改");
        return false;
    }
}
