    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="utf-8">
    <title>留言</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <link rel="stylesheet" href="../../xznstatic/css/common.css"/>
    <link rel="stylesheet" href="../../xznstatic/css/style.css"/>
    <script type="text/javascript" src="../../xznstatic/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="../../xznstatic/js/jquery.SuperSlide.2.1.1.js"></script>
    <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />

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

    /*轮播图相关 start*/
    #swiper {
        overflow: hidden;
    }

    #swiper .layui-carousel-ind li {
        width: 50px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0, 0, 0, .3);
        border-radius: 6px;
        background-color: #f7f7f7;
        box-shadow: 0 0 6px rgba(255, 0, 0, .8);
    }

    #swiper .layui-carousel-ind li.layui-this {
        width: 30px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0, 0, 0, .3);
        border-radius: 6px;
    }
    /*轮播图相关 end*/

    /*列表*/
    .recommend {
        padding: 10px 0;
        display: flex;
        justify-content: center;
        background-repeat: no-repeat;
        background-position: center center;
        background-size: cover;
    }

    .recommend .box {
        width: 1002px;
        margin: 0 auto;
    }

    .recommend .box .title {
        padding: 10px 5px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        box-sizing: border-box;
    }

    .recommend .box .title span {
        padding: 0 10px;
        font-size: 16px;
        line-height: 1.4;
    }

    .recommend .box .filter {
        padding: 0 10px;
        display: flex;
        align-items: center;
        box-sizing: border-box;
        width: 100%;
        flex-wrap: wrap;
    }

    .recommend .box .filter .item-list {
        display: flex;
        align-items: center;
    }

    .recommend .box .filter .item-list .lable {
        font-size: 14px;
        color: #333;
        box-sizing: border-box;
    }

    .recommend .box .filter .item-list input {
        padding: 0 10px;
        box-sizing: border-box;
        outline: none;
    }

    .recommend .box .filter button {
        display: flex;
        padding: 0 10px;
        box-sizing: border-box;
        align-items: center;
        justify-content: center;
        outline: none;
    }

    .recommend .box .filter button i {
        margin-right: 4px;
    }

    .recommend .box .list {
        display: flex;
        flex-wrap: wrap;
    }

    .recommend .box .list .list-item {
        flex: 0 0 25%;
        padding: 0 5px;
        box-sizing: border-box;
    }

    .recommend .box .list .list-item .list-item-body {
        cursor: pointer;
        border: 1px solid rgba(0, 0, 0, 3);
        padding: 5px;
        box-sizing: border-box;
    }

    .recommend .box .list .list-item-body img {
        width: 100%;
        height: 100px;
        display: block;
        margin: 0 auto;
    }

    .recommend .box .list .list-item-body .info {
        display: flex;
        flex-wrap: wrap;
    }

    .recommend .box .list .list-item-body .info .price {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        text-align: center;
        box-sizing: border-box;
    }

    .recommend .box .list .list-item-body .info .name {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        text-align: center;
        box-sizing: border-box;
    }

    .recommend .box .list .list-item1 {
        flex: 0 0 100%;
    }

    .recommend .box .list .list-item2 {
        flex: 0 0 50%;
    }

    .recommend .box .list .list-item3 {
        flex: 0 0 33.3%;
    }
    .recommend .box .list .list-item4 {
        flex: 0 0 25%;
    }

    .recommend .box .list .list-item5 {
        flex: 0 0 20%;
    }

    .recommend .box .news {
        display: flex;
        flex-wrap: wrap;
        padding: 0;
        width: 100%;
    }

    .recommend .box .news .list-item {
        flex: 0 0 50%;
        padding: 0 10px;
        box-sizing: border-box;
    }

    .recommend .box .news .list-item .list-item-body {
        cursor: pointer;
        border: 1px solid rgba(0, 0, 0, 3);
        padding: 10px;
        box-sizing: border-box;
        display: flex;
    }

    .recommend .box .news .list-item .list-item-body img {
        width: 120px;
        height: 100%;
        display: block;
        margin: 0 auto;
    }

    .recommend .box .news .list-item .list-item-body .item-info {
        flex: 1;
        display: flex;
        justify-content: space-between;
        flex-direction: column;
        padding-left: 10px;
        box-sizing: border-box;
    }

    .recommend .box .news .list-item .list-item-body .item-info .name {
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

    .recommend .box .news .list-item .list-item-body .item-info .time {
        padding-top: 5px;
        color: red;
        font-size: 14px;
        overflow: hidden;
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 1;
        -webkit-box-orient: vertical;
        box-sizing: border-box;
    }

    .recommend .box .news .list-item1 {
        flex: 0 0 100%;
    }

    .recommend .box .news .list-item3 {
        flex: 0 0 33.33%;
    }

/*   */
    .index-pv1 .animation-box:hover {
        transform: perspective(10px) translate3d(-10px, -10px, 0px) scale(1) rotate(0deg) skew(0deg, 0deg);
        transition: all 0.3s;
    }


    .layui-laypage .layui-laypage-count {
        padding: 0 10px;
    }

    .layui-laypage .layui-laypage-skip {
        padding-left: 10px;
    }
</style>
<body>
<div id="app">
        <div class="recommend index-pv1"
             :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px ","margin":"10px 0 0 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(255, 0, 0, 0)","borderRadius":"0","borderWidth":"0","borderStyle":"solid"}'>
            <div class="box" style='width:80%'>
                <div class="index-title"style="box-shadow:0 0 8px var(--publicMainColor);padding: 10px 0px;margin-bottom:40px;text-align: center">
                    <h3>LIUYAN / ADVICE</h3><h4>在线留言</h4>
                </div>
                <el-form ref="form" :model="ruleForm" style="box-shadow:0 0 8px var(--publicMainColor);padding-top:20px;">
                    <el-form-item label="留言标题：">
                        <el-input v-model="ruleForm.liuyanName" style="box-shadow:0 0 8px var(--publicMainColor);width: 94%;" placeholder="请输入留言标题" ></el-input>
                    </el-form-item>
                    <el-form-item label="留言内容：">
                        <el-input :rows="5" type="textarea" v-model="ruleForm.liuyanText" style="box-shadow:0 0 8px var(--publicMainColor);width: 94%;" placeholder="请输入留言内容" />
                    </el-form-item>
                    <el-form-item style="text-align: center;">
                        <el-button style="background-color: var(--publicMainColor)" @click="saveLiuyan">立即留言</el-button>
                    </el-form-item>
                </el-form>

                <div class="forum-list" style="box-shadow:0 0 8px var(--publicMainColor);padding-top:20px;">
                    <div v-for="(item,index) in dataList" v-bind:key="index" href="javascript:void(0);" class="forum-item">
                        <h3  style="padding:0px 50px;">留言标题：{{item.liuyanName}}</h3>

                        <h6  style="padding:0px 50px;color: var(--publicSubColor)">
                            <img :style='{"boxShadow":"0 0 0px rgba(255,0,0,.3)","margin":"0 10px 0 0","borderColor":"rgba(0,0,0,.3)","borderRadius":"50%","borderWidth":"0","width":"40px","borderStyle":"solid","height":"40px"}' class="avator" :src="baseUrl+item.yonghuPhoto">
                            昵称：{{item.yonghuName}}
                        </h6>
                        <div class="content" style="padding:0px 50px;">
                            留言内容：
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span v-html="myFilters(item.liuyanText)"></span>
                            </div>
                            <div style="float: right;">
                                {{item.insertTime}}
                            </div>
                        </div>
                        <div v-if="item.replyText != null" style="padding:20px 50px;color: #9a6e3a;" class="content">
                            回复内容：
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span v-html="myFilters(item.replyText)"></span>
                            </div>
                            <div style="float: right;">
                                {{item.updateTime}}
                            </div>
                        </div>
                        <div v-if="item.replyText == null" style="padding:0px 50px;color: #9a6e3a;" class="content">
                            暂无回复
                        </div>
                        <div style="padding:0px 50px;">
                            <label style="width: 100%;height: 1px;background-color: var(--publicMainColor);"></label>
                        </div>
                    </div>
                </div>
                <div class="pager" id="pager" :style="{textAlign:'center'}"></div>
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
<script src="../../js/config.js"></script>
<script src="../../modules/config.js"></script>
<script src="../../js/utils.js"></script>

<script type="text/javascript">
    Vue.prototype.myFilters= function (msg) {
        if(msg != null){
            return msg.replace(/\n/g, "<br>&nbsp;&nbsp;&nbsp;&nbsp;");
        }else{
            return "";
        }
    };
    var vue = new Vue({
        el: '#app',
        data: {
            //项目路径
            baseUrl:"",
            ruleForm: {
                liuyanName: '',
                liuyanText: '',
            },

            dataList: [],
            thisTableType: -1,
        },
        filters: {
            subString: function(val) {
                if (val) {
                    val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
                    if (val.length > 60) {
                        val = val.substring(0, 60);
                        val+='...';
                    }
                    return val;
                }
                return '';
            }
        },
        computed: {
        },
        methods: {
            isAuth(tablename, button) {
                return isFrontAuth(tablename, button);
            },
            jump(url) {
                jump(url);
            },
            jumpCheck(url,check1,check2) {
                if(check1 == "2" || check1 == 2){//级联表的逻辑删除字段[1:未删除 2:已删除]
                    layui.layer.msg("已经被删除", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                if(check2 == "2"  || check2 == 2){//是否下架[1:上架 2:下架]
                    layui.layer.msg("已经下架", {
                        time: 2000,
                        icon: 2
                    });
                    return false;
                }
                this.jump(url);
            },
            saveLiuyan() {
                if(this.ruleForm.liuyanName == null || this.ruleForm.liuyanName == ""){
                    layui.layer.msg('留言标题不能为空', {
                        time: 1000,
                        icon: 5
                    }, function () {
                    });
                    return false;
                }
                if(this.ruleForm.liuyanText == null || this.ruleForm.liuyanText == ""){
                    layui.layer.msg('留言内容不能为空', {
                        time: 1000,
                        icon: 5
                    }, function () {
                    });
                    return false;
                }
                let data = this.ruleForm;
                // 提交数据
                layui.http.requestJson('liuyan/save', 'post', data, function (res) {
                    layer.msg('留言成功', {
                        time: 2000,
                        icon: 6
                    }, function () {
                        window.location.reload(true);
                    });
                });
            },
        }
    });

        layui.use(['layer', 'element', 'carousel', 'laypage', 'http', 'jquery', 'laydate', 'tinymce'], function() {
            var layer = layui.layer;
            var element = layui.element;
            var carousel = layui.carousel;
            var laypage = layui.laypage;
            var http = layui.http;
            var laydate = layui.laydate;
            var tinymce = layui.tinymce;
            window.jQuery = window.$ = jquery = layui.jquery;
            vue.baseUrl = http.baseurl

            localStorage.setItem("goUtl","./pages/liuyan/list.jsp")

            var limit = 8;

                 //类型搜索
                    $(document).on("click", ".category-search", function (e) {
                        vue.thisTableType = $(this).attr('index');
                        pageList(vue.thisTableType);
                    });



            // 分页列表
            pageList();

            // 搜索按钮
            jquery('#btn-search').click(function (e) {
                pageList();
            });

            function pageList() {
                var param = {
                    page: 1
                    ,limit: limit
                };





            // 当前表
                                     
            if (jquery('#liuyanName').val() != null && jquery('#liuyanName').val() != "" && jquery('#liuyanName').val() != "null" ) {
                param['liuyanName'] = jquery('#liuyanName').val();
            }

                                                            
                // 获取列表数据
                http.request('liuyan/list', 'get', param, function (res) {
                    vue.dataList = res.data.list;
                    // 分页
                    laypage.render({
                        elem: 'pager',
                        count: res.data.total,
                        limit: limit,
                        groups: 3,
                        layout: ["prev", "page", "next"],
                        jump: function (obj, first) {
                            param.page = obj.curr;
                            //首次不执行
                            if (!first) {
                            http.request('liuyan/list', 'get', param, function (res) {
                                    vue.dataList = res.data.list;
                                })
                            }
                        }
                    });
                });
            }



        });

        window.xznSlide = function () {
            jQuery(".banner").slide({mainCell: ".bd ul", autoPlay: true, interTime: 5000});
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
</body>
</html>
