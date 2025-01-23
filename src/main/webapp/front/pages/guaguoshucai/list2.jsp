    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="utf-8">
    <title>瓜果蔬菜</title>
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
    .center-container {
        width: 1200px;
        margin: 0 auto;
        margin-top: 20px;
        display: flex;
        margin-bottom: 20px;
    }
    .index-sec1{ height: auto; width: 20%;background-color: #fff}
    .sec1-left{ width: 100%; height: auto; margin-top: 10px; padding-left: 17px;}
    .sec1-left ul{ margin-top: 20px;}
    .sec1-left li{ transition: all 0.6s; height: 45px; border-bottom: 1px solid #d8d8d8; margin:15px 0px; width: 70%; line-height: 45px;}
    .sec1-left li{  font-size: 15px; color: #333; height: 45px; line-height: 45px; transition: all 0.6s;background-color: var(--publicSubColor)}
    .sec1-left .p1{ font-size: 20px; color: #333333; font-weight: bold; font-family: arial; text-transform: uppercase;line-height: 1; margin-top: 20px;}
    .sec1-left .p2{ font-size: 22px; color: #333333; padding: 25px 0 0 0; line-height: 1;}
    .sec1-left .p2 b{ display: block; width: 31px; background: #666; height: 1px; margin-top: 30px;}
    .sec1-left li i{ display: inline-block;font-size: 25px; width: 10px; transition: all 0.6s;
        margin-right: 20px; vertical-align:-3px; margin-left: 5px;}
    .sec1-left li:hover i,.sec1-left li.on i{ background-position: -85px -42px;}
    .sec1-left li span{ display: inline-block; height: 1px; width: 5px; background: #666; vertical-align:middle; margin-right: 10px; transition: all 0.6s;}
    .sec1-left li:hover b,.sec1-left li:hover,
    .sec1-left li.on b,.sec1-left li.on{ color: #fff;}
    .sec1-left li:hover span,.sec1-left li.on  span{ background: #fff; width: 22px;}
    .sec1-left li:hover,.sec1-left li.on{ font-size: 17px;background: var(--publicMainColor);width: 90%; border-bottom-color: var(--publicMainColor);}
    ul, li {list-style: none;margin: 0;padding: 0;}
    a {text-decoration: none;}
    p{margin: 0;padding: 0;}
    i {font-style: normal;}</style>
<body class='bodyClass'>
<div id="app">
<!-- 标题 -->


    <!-- 标题 -->
    <div class="center-container">
        <!-- 个人中心菜单 config.js-->
<div class="index-sec1">
    <div class="sec1-left fl">
        <p class="p1">USER / CENTER</p>
        <p class="p2">瓜果蔬菜<b></b></p>
        <ul>
            <li v-for="(item,index) in centerMenu" v-bind:key="index" :class="item.url=='../guaguoshucai/list.jsp'?'on':''" @click="jump(item.url)">
                <i class="layui-icon">&#xe756;</i><span></span>{{item.name}}
            </li>
        </ul>
    </div>
</div>        <!-- 个人中心菜单 -->
        <div class="right-container sub_borderColor" style="overflow: auto" :style='{"padding":"20px","boxShadow":"0px rgba(255,0,0,.8)","margin":"0","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","borderStyle":"solid","width":"80%"}'>
            <div style="display: flex;height: 60px;align-items: center;margin-left: 15px;justify-content: space-between">
                <div style="display: flex;height: 60px;align-items: center;margin-left: 15px;">
                    <div class="thisTableType-search" style="margin-left: 15px;"
                         :style='searchForm.guaguoshucaiTypes=="" || searchForm.guaguoshucaiTypes==null?{"color":"red","borderBottom":"1px solid red"}:{"color":"#000"}'>
                        全部
                    </div>
                    <div style="margin-left: 15px;" v-for="item in guaguoshucaiTypesList" :index="item.codeIndex" class="thisTableType-search"
                         :style='searchForm.guaguoshucaiTypes==item.codeIndex?{"color":"red","borderBottom":"1px solid red"}:{"color":"#000"}'>
                        {{item.indexName}}
                    </div>
                </div>
                <button @click="jump('../guaguoshucai/add.jsp')" class="layui-btn layui-btn-lg btn-theme sub_backgroundColor" :style='{"padding":"0 15px","boxShadow":"0 0 8px rgba(0,0,0,0)","margin":"0 0 0 10px","borderColor":"#409EFF","color":"#333","borderRadius":"4px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"40px"}'>
                    <i v-if="true" class="layui-icon">&#xe654;</i> 添加瓜果蔬菜信息
                </button>
            </div>
            <table class="layui-table" lay-skin="nob">
                <thead>
                    <tr>
                        <!-- 当前表 -->
                        <th>瓜果蔬菜标题</th>
                        <th>瓜果蔬菜编号</th>
                        <th>瓜果蔬菜照片</th>
                        <th>瓜果蔬菜类型</th>
                        <th>瓜果蔬菜热度</th>
                        <th>瓜果蔬菜详细介绍</th>
                        <th>是否上架</th>
                        <th>录入时间</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="(item,index) in dataList" v-bind:key="index">
                        <td>{{item.guaguoshucaiName}}</td>
                        <td>{{item.guaguoshucaiUuidNumber}}</td>
                        <td><img :src="baseUrl+item.guaguoshucaiPhoto" style="width: 100px;height: 100px;object-fit: cover;"></td>
                        <td>{{item.guaguoshucaiValue}}</td>
                        <td>{{item.guaguoshucaiClicknum}}</td>
                        <td><button v-if="item.guaguoshucaiContent!=null&&item.guaguoshucaiContent!=''" @click="showContent(item.guaguoshucaiContent)" type="button" class="layui-btn layui-btn-success">点击查看</button></td>
                        <td>{{item.shangxiaValue}}</td>
                        <td>{{item.insertTime}}</td>
                        <td style="width: 100px;">
                        <!--
                            <button @click="jump('../guaguoshucai/add.jsp?guaguoshucaiId='+item.id)" type="button" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-warm">
                                <i class="layui-icon">&#xe642;</i> 修改
                            </button>
                            <button @click="guaguoshucaiModal = true" type="button" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-warm">
                                <i class="layui-icon">&#xe642;</i> 评论
                            </button>
                        -->
                            <button @click="deleteData(item)" type="button" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-warm">
                                <i class="layui-icon">&#xe640;</i> 删除
                            </button>
                        </td>
                    </tr>
                </tbody>
            </table>
            <div class="pager" id="pager" :style="{textAlign:'center'}"></div>
        </div>
    </div></div>

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
            userId: localStorage.getItem("userid"),//当前登录人的id
            sessionTable: localStorage.getItem("userTable"),//登录账户所在表名
            role: localStorage.getItem("role"),//权限
            //小菜单
            centerMenu: centerMenu,
            //项目路径
            baseUrl:"",
            guaguoshucaiTypesList: [],
            shangxiaTypesList: [],

            //查询条件
            searchForm: {
                page: 1
                ,limit: 8
                ,sort: 'guaguoshucai_clicknum'
                ,order: "desc"//asc desc
                ,guaguoshucaiDelete: 1
                ,shangxiaTypes: 1
                        ,guaguoshucaiName: ""
                ,guaguoshucaiUuidNumber: ""
                ,guaguoshucaiPhoto: ""
                ,guaguoshucaiTypes: ""
                ,guaguoshucaiContent: ""
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
                layui.http.requestJson(`guaguoshucai/delete`, 'post', [data.id], (res) => {
                    if(res.code==0){
                        layer.msg('删除成功', {
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
        vue.baseUrl = http.baseurl

        localStorage.setItem("goUtl","./pages/guaguoshucai/list2.jsp")

        // var id = http.getParam('id');

        //瓜果蔬菜类型的动态搜素
        $(document).on("click", ".thisTableType-search", function (e) {
            vue.searchForm.guaguoshucaiTypes = $(this).attr('index');
            pageList();
        });


            //当前表的 瓜果蔬菜类型 字段 字典表查询
            guaguoshucaiTypesSelect();
           //当前表的 瓜果蔬菜类型 字段 字典表查询方法
           function guaguoshucaiTypesSelect() {
               http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=guaguoshucai_types", 'get', {}, function (res) {
                   if(res.code == 0){
                       vue.guaguoshucaiTypesList = res.data.list;
                   }
               });
           }
           //当前表的 是否上架 字段 字典表查询方法
           function shangxiaTypesSelect() {
               http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shangxia_types", 'get', {}, function (res) {
                   if(res.code == 0){
                       vue.shangxiaTypesList = res.data.list;
                   }
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
                http.request('guaguoshucai/list', 'get', vue.searchForm, function (res) {
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
                                http.request('guaguoshucai/list', 'get', vue.searchForm, function (res1) {
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
