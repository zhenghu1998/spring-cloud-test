package com.zsl.test2.entytis;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value="business", description="营业户对象")
public class Business {
    @ApiModelProperty(value="主键标识",name="id",required = true)
    private String id;
    @ApiModelProperty(value="营业户地址",name="address",required = false)
    private String address;
    @ApiModelProperty(value="银行账号",name="banknumber",required = false)
    private String banknumber;
    @ApiModelProperty(value="开票地址",name="billaddress",required = false)
    private String billaddress;
    @ApiModelProperty(value="立户日期",name="builddata",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date builddata;
    @ApiModelProperty(value="营业户编码",name="code",required = false)
    private String code;
    @ApiModelProperty(value="水司主键",name="comp_id",required = false)
    private String comp_id;
    @ApiModelProperty(value="创建时间",name="create_date",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_date;
    @ApiModelProperty(value="创建人id",name="creater_id",required = false)
    private String creater_id;
    /*@ApiModelProperty(value="客户主键",name="customerid",required = false)
    private String customerid;
    @ApiModelProperty(value="营业网点编码",name="dotcode",required = false)
    private String dotcode;
    @ApiModelProperty(value="营业网点名称",name="dotname",required = false)
    private String dotname;*/
    @ApiModelProperty(value="是否删除",name="gc_flag",required = false)
    private String gc_flag;
    @ApiModelProperty(value="阶梯人口数",name="laddernumber",required = false)
    private String laddernumber;
    @ApiModelProperty(value="修改时间",name="modifier_date",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date modifier_date;
    @ApiModelProperty(value="修改人id",name="modifier_id",required = false)
    private String modifier_id;
    @ApiModelProperty(value="营业户名称",name="name",required = false)
    private String name;
    @ApiModelProperty(value="开户行",name="openbank",required = false)
    private String openbank;
    @ApiModelProperty(value="开户户名",name="openname",required = false)
    private String openname;
    @ApiModelProperty(value="纳税人识别号",name="taxpayernumber",required = false)
    private String taxpayernumber;
    @ApiModelProperty(value="营业户状态主键",name="businessstateid",required = false)
    private String businessstateid;
    @ApiModelProperty(value="营业户状态名称",name="businessstatename",required = false)
    private String businessstatename;
    @ApiModelProperty(value="营业户状态值",name="businessstatevalue",required = false)
    private String businessstatevalue;
    @ApiModelProperty(value="结算方式主键",name="paywayid",required = false)
    private String paywayid;
    @ApiModelProperty(value="结算方式名称",name="paywayname",required = false)
    private String paywayname;
    @ApiModelProperty(value="结算方式值",name="paywayvalue",required = false)
    private String paywayvalue;
    @ApiModelProperty(value="老营业户编码",name="oldcode",required = false)
    private String oldcode;
    @ApiModelProperty(value="是否增值税专用发票",name="isspeinvoice",required = false)
    private String isspeinvoice;
    @ApiModelProperty(value="户数",name="businessnum",required = false)
    private int businessnum;
    @ApiModelProperty(value="短信发送时间",name="smssendtime",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date smssendtime;
    @ApiModelProperty(value="第三方缴费标识",name="notAllowedPayment",required = false)
    private String notAllowedPayment;
    @ApiModelProperty(value="手机号",name="phone",required = false)
    private String phone;
    @ApiModelProperty(value="其它联系方式",name="othercontact",required = false)
    private String othercontact;
    @ApiModelProperty(value="公司名称",name="companyname",required = false)
    private String companyname;
    @ApiModelProperty(value="公司联系人",name="contactid",required = false)
    private String contactid;
    @ApiModelProperty(value="公司联系电话",name="contactphone",required = false)
    private String contactphone;
    @ApiModelProperty(value="营业户分类主键",name="typeid",required = false)
    private String typeid;
    @ApiModelProperty(value="营业户分类名称",name="typename",required = false)
    private String typename;
    @ApiModelProperty(value="营业户分类值",name="typevalue",required = false)
    private String typevalue;
    @ApiModelProperty(value="营业户身份证号",name="idcard",required = false)
    private String idcard;
    @ApiModelProperty(value="册本主键",name="bookid",required = false)
    private String bookid;






}
