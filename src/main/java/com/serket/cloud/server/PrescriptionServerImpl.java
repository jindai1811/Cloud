package com.serket.cloud.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RestController
public class PrescriptionServerImpl implements  PrescriptionServer {

    public Map<String, String> businessLogin(@PathVariable("appid") String appid, @PathVariable("content") String content, @RequestHeader("accessToken") String accessToken) {
        Map<String,String>  map=new HashMap<String, String>();
        // ×´Ì¬
        map.put("state","ok");
        // ¶þÎ¬ÂëÄÚÈÝ
        map.put("QRCode","sFopJ9lMmLl4u-ad61ojKpS0TolhN2s3SnHoI2Mh5GgdiYb35i-7DG2T2CDyQKMe");
        return map;
    }
}
