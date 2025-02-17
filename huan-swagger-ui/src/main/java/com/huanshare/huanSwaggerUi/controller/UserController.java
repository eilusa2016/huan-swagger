package com.huanshare.huanSwaggerUi.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api(tags = "查询个人信息", description = "查询个人汇总")
public class UserController {

    @ApiOperation(notes = "根据姓名模糊匹配用户", value = "根据姓名模糊匹配用户")
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    public ResponseEntity<GetUserInfoResponseDto> openAccount(@RequestBody GetUserInfoRequestDto requestDto) {
        GetUserInfoResponseDto responseDto=new GetUserInfoResponseDto();
        List<UserInfoDto> userInfoList=new ArrayList<>();
        UserInfoDto userInfoDto=null;
        for (int i=0;i<102;i++){
            userInfoDto=new UserInfoDto();
            userInfoDto.setId(String.valueOf(i));
            userInfoDto.setUserName("huan"+i);
            userInfoDto.setUserAge(String.valueOf(10+i+1));
            userInfoDto.setUserHeight(String.valueOf(160+i));
            userInfoDto.setUserWeight(String.valueOf(60+i));
            userInfoDto.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            userInfoList.add(userInfoDto);
        }
        responseDto.setUserInfoList(userInfoList);
        return ResponseEntity.ok(responseDto);
    }
}