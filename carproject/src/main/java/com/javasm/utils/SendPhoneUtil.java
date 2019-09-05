package com.javasm.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import java.rmi.ServerException;

public class SendPhoneUtil {
    public static String sendPhone(String phone,String message) {

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIQ7d8Jbe4QNUs", "V8cGsg6JghrcqGTmFV9sUjFL5Itall");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "王绍成");
        request.putQueryParameter("TemplateCode", "SMS_109030028");
        request.putQueryParameter("TemplateParam", "{\"code\":"+message+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
