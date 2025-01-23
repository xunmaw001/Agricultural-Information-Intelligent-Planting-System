    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="utf-8">
    <title>瓜果蔬菜留言</title>
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


    .layui-laypage .layui-laypage-count {
        padding: 0 10px;
    }

    .layui-laypage .layui-laypage-skip {
        padding-left: 10px;
    }
</style>
<body class='bodyClass'>
<div id="app">
<div class="recommend index-pv1"
     :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px ","margin":"10px 0 0 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(255, 0, 0, 0)","borderRadius":"0","borderWidth":"0","borderStyle":"solid"}'>
    <div class="box" style='width:100%'>
        <div style="width: 1200px;margin: 0 auto;">
                    <div class="title sub_backgroundColor sub_borderColor"
                 :style='{"padding":"10px 0 10px 0","margin":"10px 0 10px 0","borderRadius":"4px","borderWidth":"1px","borderStyle":"solid","justifyContent":"space-between","height":"54px"}'>
                    <span :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(255,0,0,1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(11, 11, 11, 1)","borderRadius":"0 0 2px 0","borderWidth":"0","fontSize":"18px","borderStyle":"solid"}'>
                    瓜果蔬菜留言
                    </span>
                <span :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","fontSize":"16px","borderStyle":"solid"}'>
                    您现在的位置：瓜果蔬菜留言
                </span>
            </div>
            <form class="layui-form filter main_backgroundColor"
                  :style='{"padding":"0 10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"10px 0 10px 0","borderColor":"rgba(0,0,0,.3)","borderRadius":"4px","alignItems":"center","borderWidth":"0","borderStyle":"solid","justifyContent":"flex-end","height":"64px"}'>
                                        </form>
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
    Vue.prototype.myFilters = function (msg) {
        if(msg==null || msg==""){
            return "";
        }else if (msg.length>20){
            msg.replace(/\n/g, "<br>");
            return msg.substring(0,30)+"......";
        }else{
            return msg.replace(/\n/g, "<br>");
        }
    };
    var vue = new Vue({
        el: '#app',
        data: {
            //当前登录用户信息
            user:{},
            //小菜单
            centerMenu: centerMenu,
            //项目路径
            baseUrl:"",
            //查询条件
            searchForm: {
                page: 1
                ,limit: 8
                ,sort: "id"//字段
                ,order: "desc"//asc desc
                        ,guaguoshucaiLiuyanText: ""
                ,replyText: ""
            },

            dataList: [],
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
            showContent(content) {alert(content)},
            deleteData(data){
                var mymessage = confirm("确定要删除这条数据吗？");
                if(!mymessage){
                    alert("已取消操作");
                    return false;
                }
                // 获取商品详情信息
                layui.http.requestJson(`guaguoshucaiLiuyan/delete`, 'post', [data.id], (res) => {
                    if(res.code==0){
                        layer.msg('操作成功', {
                            time: 2000,
                            icon: 6
                        });
                        window.location.reload();
                    }else{
                        layer.msg(res.msg, {
                            time: 2000,
                            icon: 2
                        });
                    }
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

        localStorage.setItem("goUtl","./pages/guaguoshucaiLiuyan/list.jsp")

        vue.baseUrl = http.baseurl

        let table = localStorage.getItem("userTable");
        if(table){
            http.request(table+"/session", 'get', {}, function (data) {
                vue.user = data.data;
            });
        }




                                                                

            // 分页列表
            pageList();

            // 搜索按钮
            jquery('#btn-search').click(function (e) {
                pageList();
            });

            function pageList() {
                // 获取列表数据
                http.request('guaguoshucaiLiuyan/list', 'get', vue.searchForm, function (res) {
                    vue.dataList = res.data.list;
                    // 分页
                    laypage.render({
                        elem: 'pager',
                        count: res.data.total,
                        limit: vue.searchForm.limit,
                        groups: 3,
                        layout: ["prev", "page", "next"],
                        jump: function (obj, first) {
                            vue.searchForm.page = obj.curr;//翻页
                            //首次不执行
                            if (!first) {
                                http.request('guaguoshucaiLiuyan/list', 'get', vue.searchForm, function (res1) {
                                    vue.dataList = res1.data.list;
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
