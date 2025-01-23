<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="utf-8">
    <title>首页</title>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <meta name="author" content="order by mobanxiu.cn"/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <link rel="stylesheet" href="../../xznstatic/css/common.css"/>
    <link rel="stylesheet" href="../../xznstatic/css/style.css"/>
    <link rel="stylesheet" href="../../xznstatic/css/animate.css"/><!-- 动画效果 -->
    <link rel="stylesheet" href="../../xznstatic/css/swiper.min.css"/>
    <script src="../../xznstatic/js/jquery-1.11.3.min.js"></script>
    <script src="../../xznstatic/js/jquery.SuperSlide.2.1.1.js"></script>
    <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css"/>

    <link rel="stylesheet" href="../../css/theme.css"/>
</head>
<style>
    html::after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        display: block;
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    #test1 {
        overflow: hidden;
    }

    /*轮播图css*/
    #test1 .layui-carousel-ind li {
        width: 20px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0, 0, 0, .3);
        border-radius: 6px;
        background-color: #f7f7f7;
        box-shadow: 0 0 6px rgba(255, 0, 0, .8);
    }

    #test1 .layui-carousel-ind li.layui-this {
        width: 30px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0, 0, 0, .3);
        border-radius: 6px;
    }

    .layui-carousel-ind{
        top: 0;

    }
    .layui-carousel-ind ul{
        position: absolute;

        bottom: 8px !important;
        z-index: 10;
    }

    .title {
        padding: 10px 5px;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
    }

   .title span {
        padding: 0 10px;
        line-height: 1.4;
    }

   .box .list {
        display: flex;
        flex-wrap: wrap;
    }




    .box .list img {
        width: 100%;
        height: 100px;
        display: block;
        margin: 0 auto;
        object-fit: cover;
        max-width: 100%;
    }

    .box .list .name {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        text-align: center;
        box-sizing: border-box;
    }


    .box .list .list-item {
        flex: 0 0 25%;
        padding: 0 10px;
        box-sizing: border-box;
    }

    /*
   .box .list .list-item-body {
        border: 1px solid rgba(0, 0, 0, 3);
        padding: 5px;
        box-sizing: border-box;
        cursor: pointer;
   }
    .box .list .list-item .list-item-body {
        border: 1px solid rgba(0, 0, 0, 3);
        padding: 10px;
        box-sizing: border-box;
        display: flex;
        cursor: pointer;
    }

    .box .list .list-item .list-item-body img {
        width: 120px;
        height: 100%;
        display: block;
        margin: 0 auto;
        object-fit: cover;
        max-width: 100%;
    }

    .box .list .list-item .list-item-body .item-info {
        flex: 1;
        display: flex;
        justify-content: space-between;
        flex-direction: column;
        padding-left: 10px;
        box-sizing: border-box;
    }

    .box .list .list-item .list-item-body .item-info .name {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        box-sizing: border-box;
        overflow: hidden;
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 1;
        -webkit-box-orient: vertical;
    }
    .box .list .list-item .list-item-body .item-info .time {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        overflow: hidden;
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 1;
        -webkit-box-orient: vertical;
    }
    #new-list-6 .swiper-wrapper {
        -webkit-transition-timing-function: linear;
        -moz-transition-timing-function: linear;
        -ms-transition-timing-function: linear;
        -o-transition-timing-function: linear;
        transition-timing-function: linear;
    }*/

    .list-item1 {
        flex: 0 0 100%;
    }
    .list-item2 {
        flex: 0 0 50%;
    }
    .list-item3 {
        flex: 0 0 33.3%;
    }
    .list-item4 {
        flex: 0 0 25%;
    }
    .list-item5 {
        flex: 0 0 20%;
    }
    /*限制内容长度*/
    .line1 {
        display: -webkit-box;
        -webkit-box-orient: vertical;
        -webkit-line-clamp: 1;
        overflow: hidden;
    }
    .line2 {
        display: -webkit-box;
        -webkit-box-orient: vertical;
        -webkit-line-clamp: 2;
        overflow: hidden;
    }
    .line3 {
        display: -webkit-box;
        -webkit-box-orient: vertical;
        -webkit-line-clamp: 3;
        overflow: hidden;
    }
    /*轮播图css*/
    /*套装样式*/
    /*腰线*/
    /*home页面主要样式*/
    /*home页面普通数据样式*/
.team-agile-img {
	width:100%;
	background-color: #FFF;
	display: block;
	overflow: hidden;
	position: relative;
	-webkit-transition: all 0.5s;
	-moz-transition: all 0.5s;
	-ms-transition: all 0.5s;
	-o-transition: all 0.5s;
	transition: all 0.5s;
	opacity: 1;
	filter: alpha(opacity=100);
}
.team-agile-img img {
	width: 100%;
	-webkit-transition: all 0.5s;
	-moz-transition: all 0.5s;
	-ms-transition: all 0.5s;
	-o-transition: all 0.5s;
	transition: all 0.5s;
}
.team-agile-img:before {
	content: '';
	background-color: rgba(0, 0, 0, 0);
	left: 0;
	top: 0;
	right: 0;
	bottom: 0;
	position: absolute;
	-webkit-transition: all 0.5s;
	-moz-transition: all 0.5s;
	-ms-transition: all 0.5s;
	-o-transition: all 0.5s;
	transition: all 0.5s;
}
.team-grids{padding:0;}
.team-agile-img:hover .view-caption {
	-moz-transform: translateY(0%) scale(1);
	-o-transform: translateY(0%) scale(1);
	-ms-transform: translateY(0%) scale(1);
	-webkit-transform: translateY(0%) scale(1);
	transform: translateY(0%) scale(1);
}
.view-caption {
	background-color: var(--publicMainColor,orange);
	bottom: 0;
	height: 16%;
	left: 0;
	padding: 15px 20px;
	position: absolute;
	right: 0;
	text-align: left;
	z-index: 99;
	-webkit-transition: all 0.5s;
	-moz-transition: all 0.5s;
	-ms-transition: all 0.5s;
	-o-transition: all 0.5s;
	transition: all 0.5s;
	-moz-transform: translateY(150%) scale(1.5);
	-o-transform: translateY(150%) scale(1.5);
	-ms-transform: translateY(150%) scale(1.5);
	-webkit-transform: translateY(150%) scale(1.5);
	transform: translateY(150%) scale(1.5);
}
.view-caption .w3ls-info {
	float: left;
}
.view-caption .w3ls-info h4 {
	color: #fff;
	font-size: 1.5em;
	font-weight: normal;
}
.view-caption .w3ls-info p {
	color: #000;
	font-size: 1em;
}
    /*home页面新闻数据样式*/
</style>
<body>
<div id="app" >
    <div class="banner">

        <div class="layui-carousel" id="test1" style="height: 800px !important;position: relative;" :style='{"boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 auto","borderColor":"rgba(0,0,0,.3)","borderRadius":"0px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
            <div carousel-item class="slideInLeft" style="visibility: visible; animation-duration: 3s; animation-name: slideInLeft;height: 800px">
                <div v-for="(item,index) in swiperList" :key="index">
                    <img style="width: 100%;height: 100%;object-fit:cover;" :src="baseUrl+item.img"/>
                </div>
            </div>
        </div>
    </div>

    <div id="content">
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image:linear-gradient(320deg,var(--publicMainColor),var(--publicSubColor))'>
                        <div style="width: 1200px;height:auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>畜禽养殖展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
                    <div class="team agileits" id="team">
                        <div class="team-info">
                            <div class="row">
                                <div v-for="(item,index) in chuqinyangzhiList" v-bind:key="index" class="col-md-3 col-sm-6 col-xs-6 team-grids">
                                    <div class="team-agile-img" @click="jumpCheck('../chuqinyangzhi/detail.jsp?id='+item.id , item.aaaaaaaaaa == null?'':item.aaaaaaaaaa , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                        <img :src="item.chuqinyangzhiPhoto?baseUrl+item.chuqinyangzhiPhoto.split(',')[0]:''" style="height: 350px;width:100%;" />
                                        <div class="view-caption">
                                            <div class="w3ls-info">
                                                <h4>{{item.chuqinyangzhiName}}</h4>
                                            </div>
                                            <b v-if="item.chuqinyangzhiNewMoney" style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.chuqinyangzhiNewMoney}} RMB
                                            </b>
                                            <b v-else style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.chuqinyangzhiValue}}
                                            </b>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                                <div style="text-align: center;margin-top: 40px;">
                                    <button @click="jump('../chuqinyangzhi/list.jsp')" style="display: block;cursor: pointer;" type="button"
                                            :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image:linear-gradient(50deg,var(--publicSubColor),var(--publicMainColor))'>
                        <div style="width: 1200px;height:auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>农业科技展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
                    <div class="team agileits" id="team">
                        <div class="team-info">
                            <div class="row">
                                <div v-for="(item,index) in nongyekejiList" v-bind:key="index" class="col-md-3 col-sm-6 col-xs-6 team-grids">
                                    <div class="team-agile-img" @click="jumpCheck('../nongyekeji/detail.jsp?id='+item.id , item.aaaaaaaaaa == null?'':item.aaaaaaaaaa , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                        <img :src="item.nongyekejiPhoto?baseUrl+item.nongyekejiPhoto.split(',')[0]:''" style="height: 350px;width:100%;" />
                                        <div class="view-caption">
                                            <div class="w3ls-info">
                                                <h4>{{item.nongyekejiName}}</h4>
                                            </div>
                                            <b v-if="item.nongyekejiNewMoney" style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.nongyekejiNewMoney}} RMB
                                            </b>
                                            <b v-else style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.nongyekejiValue}}
                                            </b>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                                <div style="text-align: center;margin-top: 40px;">
                                    <button @click="jump('../nongyekeji/list.jsp')" style="display: block;cursor: pointer;" type="button"
                                            :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image:linear-gradient(320deg,var(--publicMainColor),var(--publicSubColor))'>
                        <div style="width: 1200px;height:auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>土壤肥料展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
                    <div class="team agileits" id="team">
                        <div class="team-info">
                            <div class="row">
                                <div v-for="(item,index) in turangfeiliaoList" v-bind:key="index" class="col-md-3 col-sm-6 col-xs-6 team-grids">
                                    <div class="team-agile-img" @click="jumpCheck('../turangfeiliao/detail.jsp?id='+item.id , item.aaaaaaaaaa == null?'':item.aaaaaaaaaa , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                        <img :src="item.turangfeiliaoPhoto?baseUrl+item.turangfeiliaoPhoto.split(',')[0]:''" style="height: 350px;width:100%;" />
                                        <div class="view-caption">
                                            <div class="w3ls-info">
                                                <h4>{{item.turangfeiliaoName}}</h4>
                                            </div>
                                            <b v-if="item.turangfeiliaoNewMoney" style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.turangfeiliaoNewMoney}} RMB
                                            </b>
                                            <b v-else style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.turangfeiliaoValue}}
                                            </b>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                                <div style="text-align: center;margin-top: 40px;">
                                    <button @click="jump('../turangfeiliao/list.jsp')" style="display: block;cursor: pointer;" type="button"
                                            :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image:linear-gradient(50deg,var(--publicSubColor),var(--publicMainColor))'>
                        <div style="width: 1200px;height:auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>水产养殖展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
                    <div class="team agileits" id="team">
                        <div class="team-info">
                            <div class="row">
                                <div v-for="(item,index) in shuichanyangzhiList" v-bind:key="index" class="col-md-3 col-sm-6 col-xs-6 team-grids">
                                    <div class="team-agile-img" @click="jumpCheck('../shuichanyangzhi/detail.jsp?id='+item.id , item.aaaaaaaaaa == null?'':item.aaaaaaaaaa , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                        <img :src="item.shuichanyangzhiPhoto?baseUrl+item.shuichanyangzhiPhoto.split(',')[0]:''" style="height: 350px;width:100%;" />
                                        <div class="view-caption">
                                            <div class="w3ls-info">
                                                <h4>{{item.shuichanyangzhiName}}</h4>
                                            </div>
                                            <b v-if="item.shuichanyangzhiNewMoney" style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.shuichanyangzhiNewMoney}} RMB
                                            </b>
                                            <b v-else style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.shuichanyangzhiValue}}
                                            </b>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                                <div style="text-align: center;margin-top: 40px;">
                                    <button @click="jump('../shuichanyangzhi/list.jsp')" style="display: block;cursor: pointer;" type="button"
                                            :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image: linear-gradient(320deg,var(--publicMainColor),var(--publicSubColor))'>
                        <div style="width: 1200px;height: auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>公告展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
<div v-if="gonggaoList.length" class="new-list-5" style="display: flex;flex-direction: column;align-items: center;">
    <div @click="jump('../gonggao/detail.jsp?id='+gonggaoList[0].id)" v-if="gonggaoList.length>0" class="new5-one animation-box" style="display: flex;flex-wrap: wrap;width: 100%;" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 46px 0","borderColor":"var(--publicSubColor)","backgroundColor":"var(--publicSubColor)","borderRadius":"0 900px 0 0","borderWidth":"4px","width":"100%","borderStyle":"solid","height":"260px"}'>
        <img :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"15px","borderColor":"rgba(0, 0, 0, 0.5)","backgroundColor":"rgba(0,0,0,0)","borderRadius":"0","borderWidth":"0","width":"350px","borderStyle":"solid","height":"220px"}' style="width: 40%;height: 100%;object-fit: cover;" :src="baseUrl+gonggaoList[0].gonggaoPhoto" alt="">
        <div :style='{"padding":"0 80px 0 20px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0 0 0 16px","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0 900px 0 0","borderWidth":"0","width":"50%","borderStyle":"solid","height":"100%"}' class="new5-one-info" style="width: 60%;">
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"16px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-one-info-title line1">{{gonggaoList[0].gonggaoName}}</div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#666","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-one-info-descript line3" v-html="myFilters(gonggaoList[0].gonggaoContent)"></div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#999","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"12px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-one-info-time">{{gonggaoList[0].insertTime}}</div>
        </div>
    </div>
    <div class="new5-body" style="display: flex;width: 100%;">
        <div @click="jump('../gonggao/detail.jsp?id='+gonggaoList[1].id)" v-if="gonggaoList.length>1" class="new5-item animation-box" :style='{"padding":"0 10px","boxShadow":"0 0 6px var(--publicSubColor)","margin":"0 1% 20px","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":" 100px 100px 0 0","borderWidth":"0","width":"31.33%","borderStyle":"solid","height":"200px"}'>
            <div :style='{"padding":"5px 10px","boxShadow":"0 0 0px var(--publicSubColor)","margin":"-26px auto 20px ","borderColor":"#ccc","backgroundColor":"var(--publicSubColor)","borderRadius":"50px","borderWidth":"0","width":"40%","borderStyle":"solid","height":"52px"}' class="new5-item-time" style="display: flex;flex-direction: column;align-items: center;justify-content: center;">
                <span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"18px","borderStyle":"solid"}'>{{gonggaoList[1].gonggaoValue}}</span><span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"14px","borderStyle":"solid"}'>{{gonggaoList[1].insertTime.split(' ')[0] }}</span>
            </div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#333","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"16px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-title line1">{{gonggaoList[1].gonggaoName}}</div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#666","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-descript line3" v-html="myFilters(gonggaoList[1].gonggaoContent)"></div>
        </div>
        <div @click="jump('../gonggao/detail.jsp?id='+gonggaoList[2].id)" v-if="gonggaoList.length>2" class="new5-item animation-box" :style='{"padding":"0 10px","boxShadow":"0 0 6px var(--publicSubColor)","margin":"0 1% 20px","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":" 100px 100px 0 0","borderWidth":"0","width":"31.33%","borderStyle":"solid","height":"200px"}'>
            <div :style='{"padding":"5px 10px","boxShadow":"0 0 0px var(--publicSubColor)","margin":"-26px auto 20px ","borderColor":"#ccc","backgroundColor":"var(--publicSubColor)","borderRadius":"50px","borderWidth":"0","width":"40%","borderStyle":"solid","height":"52px"}' class="new5-item-time" style="display: flex;flex-direction: column;align-items: center;justify-content: center;">
                <span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"18px","borderStyle":"solid"}'>{{gonggaoList[2].gonggaoValue}}</span><span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"14px","borderStyle":"solid"}'>{{gonggaoList[2].insertTime.split(' ')[0] }}</span>
            </div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#333","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"16px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-titl line1e">{{gonggaoList[2].gonggaoName}}</div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#666","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-descript line3" v-html="myFilters(gonggaoList[2].gonggaoContent)"></div>
        </div>
        <div @click="jump('../gonggao/detail.jsp?id='+gonggaoList[3].id)" v-if="gonggaoList.length>3" class="new5-item animation-box" :style='{"padding":"0 10px","boxShadow":"0 0 6px var(--publicSubColor)","margin":"0 1% 20px","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":" 100px 100px 0 0","borderWidth":"0","width":"31.33%","borderStyle":"solid","height":"200px"}'>
            <div :style='{"padding":"5px 10px","boxShadow":"0 0 0px var(--publicSubColor)","margin":"-26px auto 20px ","borderColor":"#ccc","backgroundColor":"var(--publicSubColor)","borderRadius":"50px","borderWidth":"0","width":"40%","borderStyle":"solid","height":"52px"}' class="new5-item-time" style="display: flex;flex-direction: column;align-items: center;justify-content: center;">
                <span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"18px","borderStyle":"solid"}'>{{gonggaoList[3].gonggaoValue}}</span><span :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"21px","fontSize":"14px","borderStyle":"solid"}'>{{gonggaoList[3].insertTime.split(' ')[0] }}</span>
            </div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#333","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"16px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-title line1">{{gonggaoList[3].gonggaoName}}</div>
            <div :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"10px 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#666","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}'  style="box-sizing: border-box;" class="new5-item-descript line3" v-html="myFilters(gonggaoList[3].gonggaoContent)"></div>
        </div>
    </div>
</div>                                <div style="margin-top:40px;text-align: center;">
                                    <button @click="jump('../gonggao/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: flex;justify-content: center;background-repeat: no-repeat;background-position: center center;background-size: cover;">
                    <div class="box" style='width:100%;background-image:linear-gradient(50deg,var(--publicSubColor),var(--publicMainColor))'>
                        <div style="width: 1200px;height:auto;margin:  0 auto;padding: 10px 0">
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
 <div class="title main_color"
      :style='{"padding":"10px 0 10px 0","boxShadow": "#fff 0px 0px 6px","margin":"10px 0 10px 0","backgroundColor":"#f7f7f7","borderRadius":"32px","alignItems":"center","borderWidth":"0 10px","fontSize":"20px","borderStyle":"solid"}'>
         <span>DATA SHOW</span>
     <span>瓜果蔬菜展示</span>
 </div>                            </div>
                            <div class="wow " data-wow-duration="2s" data-wow-delay="1s">
                    <div class="team agileits" id="team">
                        <div class="team-info">
                            <div class="row">
                                <div v-for="(item,index) in guaguoshucaiList" v-bind:key="index" class="col-md-3 col-sm-6 col-xs-6 team-grids">
                                    <div class="team-agile-img" @click="jumpCheck('../guaguoshucai/detail.jsp?id='+item.id , item.aaaaaaaaaa == null?'':item.aaaaaaaaaa , item.shangxiaTypes == null?'':item.shangxiaTypes)">
                                        <img :src="item.guaguoshucaiPhoto?baseUrl+item.guaguoshucaiPhoto.split(',')[0]:''" style="height: 350px;width:100%;" />
                                        <div class="view-caption">
                                            <div class="w3ls-info">
                                                <h4>{{item.guaguoshucaiName}}</h4>
                                            </div>
                                            <b v-if="item.guaguoshucaiNewMoney" style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.guaguoshucaiNewMoney}} RMB
                                            </b>
                                            <b v-else style="float: right;display: inline-block;color: #FFFFFF;font-size: 17px;">
                                                {{item.guaguoshucaiValue}}
                                            </b>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                                <div style="text-align: center;margin-top: 40px;">
                                    <button @click="jump('../guaguoshucai/list.jsp')" style="display: block;cursor: pointer;" type="button"
                                            :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"4px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(160, 67, 26, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"34px"}'>
                                        查看更多
                                        <i :style='{"isshow":true,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(160, 67, 26, 1)"}' class="layui-icon layui-icon-next"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
    </div>
</div>

<script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../layui/layui.js"></script>
<script src="../../js/vue.js"></script>
<!-- 引入element组件库 -->
<script src="../../xznstatic/js/element.min.js"></script>
<!-- 引入element样式 -->
<link rel="stylesheet" href="../../xznstatic/css/element.min.css">
<script src="../../xznstatic/js/swiper.min.js"></script>
<script src="../../js/config.js"></script>
<script src="../../modules/config.js"></script>
<script src="../../js/utils.js"></script>
<script src="../../xznstatic/js/wow.min.js"></script>
<script type="text/javascript">
    // 动画效果
    new WOW().init();

    Vue.prototype.myFilters = function (msg) {
        if(msg==null || msg==""){
            return "";
        }else if (msg.length>20){
            msg.replace(/\n/g, "<br>");
            return msg.substring(0,20)+"......";
        }else{
            return msg.replace(/\n/g, "<br>");
        }
    };
    var vue = new Vue({
        el: '#app',
        data: {
            swiperList: [],
            baseUrl:"",
            // dianyingRecommend: [],
            chuqinyangzhiList: [],
            chuqinyangzhiTypesList: [],
            nongyekejiList: [],
            nongyekejiTypesList: [],
            turangfeiliaoList: [],
            turangfeiliaoTypesList: [],
            shuichanyangzhiList: [],
            shuichanyangzhiTypesList: [],
            gonggaoList: [],
            gonggaoTypesList: [],
            guaguoshucaiList: [],
            guaguoshucaiTypesList: [],
            //类型查询条件
            chuqinyangzhiTypes: "",
            nongyekejiTypes: "",
            turangfeiliaoTypes: "",
            shuichanyangzhiTypes: "",
            gonggaoTypes: "",
            guaguoshucaiTypes: "",
        },
        filters: {
            newsDesc: function (val) {
                if (val) {
                    val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
                    if (val.length > 60) {
                        val = val.substring(0, 60);
                    }

                    return val;
                }
                return '';
            }
        },
        methods: {
            jump(url) {
                jump(url)
            }
            , jumpCheck(url, check1, check2) {
                if (check1 == "2" || check1 == 2) {//级联表的逻辑删除字段[1:未删除 2:已删除]
                    layui.layer.msg("已经被删除", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                if (check2 == "2" || check2 == 2) {//是否下架[1:上架 2:下架]
                    layui.layer.msg("已经下架", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                this.jump(url);
            }
        }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function () {
        var layer = layui.layer;
        var element = layui.element;
        var form = layui.form;
        var carousel = layui.carousel;
        var http = layui.http;
        var jquery = layui.jquery;
        vue.baseUrl = http.baseurl

        // 获取轮播图 数据
        http.request('config/list', 'get', {
            page: 1,
            limit: 5
        }, function (res) {
            if (res.data.list.length > 0) {
                let swiperList = [];
                res.data.list.forEach(element => {
                    if (element.value != null
                    ) {
                        swiperList.push({
                            img: element.value
                        });
                    }
                })
                ;

                vue.swiperList = swiperList;

                vue.$nextTick(() => {
                    carousel.render({
                        elem: '#test1',
                        width: '100%',
                        height: '100%',
                        arrow: 'hover',
                        anim: 'default',
                        autoplay: 'true',
                        interval: '3000',
                        indicator: 'inside'
                    });

                })

                // vue.$nextTick(()=>{
                //   window.xznSlide();
                // });
            }
        });

        chuqinyangzhiSelect();
        //类型动态搜索
        $(document).on("click", ".chuqinyangzhiTypes-search", function(e) {
            vue.chuqinyangzhiTypes = $(this).attr('index');
            chuqinyangzhiSelect();
        });
        chuqinyangzhiTypesSelect();//类型查询
        nongyekejiSelect();
        //类型动态搜索
        $(document).on("click", ".nongyekejiTypes-search", function(e) {
            vue.nongyekejiTypes = $(this).attr('index');
            nongyekejiSelect();
        });
        nongyekejiTypesSelect();//类型查询
        turangfeiliaoSelect();
        //类型动态搜索
        $(document).on("click", ".turangfeiliaoTypes-search", function(e) {
            vue.turangfeiliaoTypes = $(this).attr('index');
            turangfeiliaoSelect();
        });
        turangfeiliaoTypesSelect();//类型查询
        shuichanyangzhiSelect();
        //类型动态搜索
        $(document).on("click", ".shuichanyangzhiTypes-search", function(e) {
            vue.shuichanyangzhiTypes = $(this).attr('index');
            shuichanyangzhiSelect();
        });
        shuichanyangzhiTypesSelect();//类型查询
        gonggaoSelect();
        //类型动态搜索
        $(document).on("click", ".gonggaoTypes-search", function(e) {
            vue.gonggaoTypes = $(this).attr('index');
            gonggaoSelect();
        });
        gonggaoTypesSelect();//类型查询
        guaguoshucaiSelect();
        //类型动态搜索
        $(document).on("click", ".guaguoshucaiTypes-search", function(e) {
            vue.guaguoshucaiTypes = $(this).attr('index');
            guaguoshucaiSelect();
        });
        guaguoshucaiTypesSelect();//类型查询

        function chuqinyangzhiTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=chuqinyangzhi_types",'get',{},function(res) {
                if (res.code == 0) {vue.chuqinyangzhiTypesList = res.data.list;}
            });
        }
        function chuqinyangzhiSelect(){//数据查询
            http.request('chuqinyangzhi/gexingtuijian', 'get', {
                page: 1,
                limit: 8,
                sort: "chuqinyangzhi_clicknum",//字段
                shangxiaTypes: 1,
                chuqinyangzhiDelete: 1,
                chuqinyangzhiTypes: vue.chuqinyangzhiTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.chuqinyangzhiList = res.data.list;
            })
        };
        function nongyekejiTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=nongyekeji_types",'get',{},function(res) {
                if (res.code == 0) {vue.nongyekejiTypesList = res.data.list;}
            });
        }
        function nongyekejiSelect(){//数据查询
            http.request('nongyekeji/gexingtuijian', 'get', {
                page: 1,
                limit: 8,
                sort: "nongyekeji_clicknum",//字段
                shangxiaTypes: 1,
                nongyekejiDelete: 1,
                nongyekejiTypes: vue.nongyekejiTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.nongyekejiList = res.data.list;
            })
        };
        function turangfeiliaoTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=turangfeiliao_types",'get',{},function(res) {
                if (res.code == 0) {vue.turangfeiliaoTypesList = res.data.list;}
            });
        }
        function turangfeiliaoSelect(){//数据查询
            http.request('turangfeiliao/gexingtuijian', 'get', {
                page: 1,
                limit: 8,
                sort: "turangfeiliao_clicknum",//字段
                shangxiaTypes: 1,
                turangfeiliaoDelete: 1,
                turangfeiliaoTypes: vue.turangfeiliaoTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.turangfeiliaoList = res.data.list;
            })
        };
        function shuichanyangzhiTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shuichanyangzhi_types",'get',{},function(res) {
                if (res.code == 0) {vue.shuichanyangzhiTypesList = res.data.list;}
            });
        }
        function shuichanyangzhiSelect(){//数据查询
            http.request('shuichanyangzhi/gexingtuijian', 'get', {
                page: 1,
                limit: 8,
                sort: "shuichanyangzhi_clicknum",//字段
                shangxiaTypes: 1,
                shuichanyangzhiDelete: 1,
                shuichanyangzhiTypes: vue.shuichanyangzhiTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.shuichanyangzhiList = res.data.list;
            })
        };
        function gonggaoTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=gonggao_types",'get',{},function(res) {
                if (res.code == 0) {vue.gonggaoTypesList = res.data.list;}
            });
        }
        function gonggaoSelect(){//数据查询
            http.request('gonggao/list', 'get', {
                page: 1,
                limit: 8,
                gonggaoTypes: vue.gonggaoTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.gonggaoList = res.data.list;
            })
        };
        function guaguoshucaiTypesSelect() {//类型查询
            http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=guaguoshucai_types",'get',{},function(res) {
                if (res.code == 0) {vue.guaguoshucaiTypesList = res.data.list;}
            });
        }
        function guaguoshucaiSelect(){//数据查询
            http.request('guaguoshucai/gexingtuijian', 'get', {
                page: 1,
                limit: 8,
                sort: "guaguoshucai_clicknum",//字段
                shangxiaTypes: 1,
                guaguoshucaiDelete: 1,
                guaguoshucaiTypes: vue.guaguoshucaiTypes,//类型
                order: "desc",//asc desc
            },function (res) {
                vue.guaguoshucaiList = res.data.list;
            })
        };

    });

    window.xznSlide = function () {
        // jQuery(".banner").slide({mainCell:".bd ul",autoPlay:true,interTime:5000});
        jQuery("#ifocus").slide({
            titCell: "#ifocus_btn li",
            mainCell: "#ifocus_piclist ul",
            effect: "leftLoop",
            delayTime: 200,
            autoPlay: true,
            triggerTime: 0
        });
        jQuery("#ifocus").slide({titCell: "#ifocus_btn li", mainCell: "#ifocus_tx ul", delayTime: 0, autoPlay: true});
        jQuery(".product_list").slide({
            mainCell: ".bd ul",
            autoPage: true,
            effect: "leftLoop",
            autoPlay: true,
            vis: 5,
            trigger: "click",
            interTime: 4000
        });
    };
</script>
<script src="../../xznstatic/js/index.js"></script>
</body>
</html>
