<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>土壤肥料添加</title>
    <!-- bootstrap样式，地图插件使用 -->
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <!-- 样式 -->
    <link rel="stylesheet" href="../../css/style.css" />
    <!-- 主题（主要颜色设置） -->
    <link rel="stylesheet" href="../../css/theme.css" />
    <!-- 通用的css -->
    <link rel="stylesheet" href="../../css/common.css" />
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
        z-index: -1;
    }
    #swiper {
        overflow: hidden;
        margin: 0 auto;
    }
    #swiper .layui-carousel-ind li {
        width: 20px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,.3);
        border-radius: 6px;
        background-color: #f7f7f7;
        box-shadow: 0 0 6px rgba(255,0,0,.8);
    }
    #swiper .layui-carousel-ind li.layui-this {
        width: 30px;
        height: 10px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,.3);
        border-radius: 6px;
    }

    button, button:focus {
        outline: none;
    }

    .data-add-container .add .layui-select-title .layui-unselect {
        padding: 0 12px;
        height: 40px;
        font-size: 15px;
        border-radius: 4px;
        border-width: 1px;
        border-style: solid;
        text-align: center;
    }
    .data-add-container .add .layui-form-item {
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
        margin: 0;
        position: inherit;
        background: transparent;
        border: 0;
    }
    .data-add-container .add .layui-input-block {
        margin: 0;
        flex: 1;
    }
    .data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
        margin: 0;
        flex: 1;
        display: flex;
    }
</style>
<body style="background: #fff; ">
    <div id="app">
        <div class="data-add-container  sub_borderColor" :style='{"padding":"20px","margin":"30px auto","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"10px","borderWidth":"1px","borderStyle":"solid"}'>

            <form class="layui-form layui-form-pane add" lay-filter="myForm">
    <!-- 当前表的 -->
                <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                        土壤肥料标题：
                    </label>
                    <div class="layui-input-block">
                        <input class="layui-input main_borderColor" :style='{"padding":"0 12px","boxShadow":"0 0 0px rgba(160, 67, 26, 1)","backgroundColor":"#fff","color":"rgba(135, 206, 250, 1)","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"15px","borderStyle":"solid","height":"40px"}'
                           v-model="detail.turangfeiliaoName" lay-verify="required" type="text" :readonly="ro.turangfeiliaoName" name="turangfeiliaoName" id="turangfeiliaoName" autocomplete="off">
                    </div>
                </div>
<!-- 唯一uuid -->
                <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                        土壤肥料编号：
                    </label>
                    <div class="layui-input-block">
                        <input class="layui-input main_borderColor" :style='{"padding":"0 12px","boxShadow":"0 0 0px rgba(160, 67, 26, 1)","backgroundColor":"#fff","color":"rgba(135, 206, 250, 1)","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"15px","borderStyle":"solid","height":"40px"}'
                               v-model="detail.turangfeiliaoUuidNumber" lay-verify="required" type="text" :readonly="ro.turangfeiliaoUuidNumber" name="turangfeiliaoUuidNumber" id="turangfeiliaoUuidNumber" autocomplete="off">
                    </div>
                </div>
                <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                        土壤肥料照片：
                    </label>
                    <div class="layui-input-block">
                        <div v-if="detail.turangfeiliaoPhoto" style="display:inline-block;margin-right:10px;">
                            <img  v-if="detail.turangfeiliaoPhoto != null" id="turangfeiliaoPhotoImg" style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;" :src="baseUrl+detail.turangfeiliaoPhoto">
                            <span v-if="detail.turangfeiliaoPhoto == null">暂无图片</span>
                            <input type="hidden" :value="detail.turangfeiliaoPhoto" id="turangfeiliaoPhoto" name="turangfeiliaoPhoto" />
                        </div>
                        <button v-if="!ro.turangfeiliaoPhoto" :style='{"padding":"0 10px","boxShadow":"0 0 0px rgba(255,0,0,.5)","margin":"0 10px 0 0","borderColor":"#ccc","color":"#fff","borderRadius":"8px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="button" class="layui-btn btn-theme main_backgroundColor" id="turangfeiliaoPhotoUpload">
                            <i v-if="true" :style='{"color":"#fff","show":true,"fontSize":"14px"}' class="layui-icon">&#xe67c;</i>上传土壤肥料照片
                        </button>
                    </div>
                </div>
                    <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                        土壤肥料类型：
                    </label>
                    <div class="layui-input-block">
                        <select name="turangfeiliaoTypes" id="turangfeiliaoTypes" lay-filter="turangfeiliaoTypes">
                            <option value="">请选择</option>
                            <option v-for="(item,index) in turangfeiliaoTypesList" v-bind:key="index" :value="item.codeIndex" :selected="detail.turangfeiliaoTypes == item.codeIndex?true:false" :key="item.codeIndex">{{ item.indexName }}</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                        土壤肥料热度：
                    </label>
                    <div class="layui-input-block">
                        <input class="layui-input main_borderColor" :style='{"padding":"0 12px","boxShadow":"0 0 0px rgba(160, 67, 26, 1)","backgroundColor":"#fff","color":"rgba(135, 206, 250, 1)","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"15px","borderStyle":"solid","height":"40px"}'
                           v-model="detail.turangfeiliaoClicknum" lay-verify="integer|required" type="text" :readonly="ro.turangfeiliaoClicknum" name="turangfeiliaoClicknum" id="turangfeiliaoClicknum" autocomplete="off">
                    </div>
                </div>
<!-- text后缀 -->
            <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                <label  :style='{"width":"auto","borderColor": "rgba(255, 255, 255, 0)","padding":"0 12px 0 0","backgroundColor":"rgba(255, 255, 255, 0)","fontSize":"15px","color":"#333","textAlign":"left"}' class="layui-form-label">
                    土壤肥料详细介绍：
                </label>
                <div class="layui-input-block">
                    <textarea class="main_borderColor layui-input" style="width: 100%;height: 100px;border-radius: 5px;padding: 10px" v-model="detail.turangfeiliaoContent" lay-verify="required" :readonly="ro.turangfeiliaoContent" name="turangfeiliaoContent" id="turangfeiliaoContent" autocomplete="off"></textarea>
                </div>
            </div>
                    <div class="layui-form-item main_borderColor" :style='{"padding":"10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"0 0 10px 0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"1px","borderWidth":"0 0 1px 0","borderStyle":"solid"}'>
                    <div class="layui-input-block" style="text-align: right;">
                        <button :style='{"padding":"0 10px","boxShadow":"0 0 0px rgba(255,0,0,.5)","margin":"0 10px","borderColor":"#ccc","backgroundColor":"rgba(75, 92, 196, 1)","color":"#fff","borderRadius":"8px","borderWidth":"0","width":"25%","fontSize":"14px","borderStyle":"solid","height":"44px"}' class="layui-btn btn-submit" lay-submit lay-filter="thisSubmit">提交</button>
                    </div>
                </div>

            </form>
        </div>
    </div>

    <script src="../../layui/layui.js"></script>
    <script src="../../js/vue.js"></script>
    <!-- 引入element组件库 -->
    <script src="../../xznstatic/js/element.min.js"></script>
    <!-- 引入element样式 -->
    <link rel="stylesheet" href="../../xznstatic/css/element.min.css">
    <!-- 组件配置信息 -->
    <script src="../../js/config.js"></script>
    <!-- 扩展插件配置信息 -->
    <script src="../../modules/config.js"></script>
    <!-- 工具方法 -->
    <script src="../../js/utils.js"></script>
    <!-- 校验格式工具类 -->
    <script src="../../js/validate.js"></script>
    <!-- 地图 -->
    <script type="text/javascript" src="../../js/jquery.js"></script>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

    <script>
        var jquery = $;

        var vue = new Vue({
            el: '#app',
            data: {
                //项目路径
                baseUrl:"",
                dataList: [],
                ro:{
                    turangfeiliaoName: false,
                    turangfeiliaoUuidNumber: true,
                    turangfeiliaoPhoto: false,
                    turangfeiliaoTypes: false,
                    turangfeiliaoClicknum: false,
                    turangfeiliaoContent: false,
                    shangxiaTypes: false,
                    turangfeiliaoDelete: false,
                    insertTime: false,
                    createTime: false,
                },
                detail: {
                    turangfeiliaoName: '',
                    turangfeiliaoUuidNumber: new Date().getTime(),//数字
                    turangfeiliaoPhoto: '',
                    turangfeiliaoTypes: '',//数字
                    turangfeiliaoValue: '',//数字对应的值
                    turangfeiliaoClicknum: '',
                    turangfeiliaoContent: '',
                    shangxiaTypes: '',//数字
                    shangxiaValue: '',//数字对应的值
                    turangfeiliaoDelete: '',
                    insertTime: '',
                    createTime: '',
                },

                // 下拉框
                turangfeiliaoTypesList: [],
                shangxiaTypesList: [],

                centerMenu: centerMenu
            },
            updated: function() {
                layui.form.render('select', 'myForm');
            },
            computed: {
            },
            methods: {
                jump(url) {
                    jump(url)
                }
            }
        })


        layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
            var layer = layui.layer;
            var element = layui.element;
            var carousel = layui.carousel;
            var http = layui.http;
            var jquery = layui.jquery;
            var form = layui.form;
            var upload = layui.upload;
            var laydate = layui.laydate;
            var tinymce = layui.tinymce;
            vue.baseUrl = http.baseurl

            localStorage.setItem("goUtl","./pages/turangfeiliao/list.jsp")

            // 下拉框
            // 土壤肥料类型的查询和初始化
            turangfeiliaoTypesSelect();
            // 是否上架的查询和初始化
            shangxiaTypesSelect();

           // 上传文件
            // 土壤肥料照片的文件上传
            upload.render({
                //绑定元素
                elem: '#turangfeiliaoPhotoUpload',
                //上传接口
                url: http.baseurl + 'file/upload',
                // 请求头
                headers: {
                    Token: localStorage.getItem('Token')
                },
                // 允许上传时校验的文件类型
                accept: 'images',
                    before: function () {
                    //loading层
                    var index = layer.load(1, {
                        shade: [0.1, '#fff'] //0.1透明度的白色背景
                    });
                },
                // 上传成功
                done: function (res) {
                    console.log(res);
                    layer.closeAll();
                    if (res.code == 0) {
                        layer.msg("上传成功", {
                            time: 2000,
                            icon: 6
                        })
                        var url = 'upload/' + res.file;
                        jquery('#turangfeiliaoPhoto').val(url);
                        vue.detail.turangfeiliaoPhoto = url;
                        jquery('#turangfeiliaoPhotoImg').attr('src', url);
                    } else {
                        layer.msg(res.msg, {
                            time: 2000,
                            icon: 5
                        })
                    }
                },
                //请求异常回调
                error: function () {
                    layer.closeAll();
                    layer.msg("请求接口异常", {
                        time: 2000,
                        icon: 5
                    })
                }
            });
            // 日期效验规则及格式
            dateTimePick();
            // 表单效验规则
            form.verify({
                // 正整数效验规则
                integer: [
                    /^[1-9][0-9]*$/
                    ,'必须是正整数'
                ]
                // 小数效验规则
                ,double: [
                    /^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/
                    ,'最大整数位为6为,小数最大两位'
                ]
            });

            // session独取
            let table = localStorage.getItem("userTable");
            http.request(table+"/session", 'get', {}, function (data) {
                // 表单赋值
                //form.val("myForm", data.data);
                // data = data.data;
                for (var key in data) {
                    vue.detail[table+"Id"] = data.id
                }
            });

            //修改
            if(http.getParam('turangfeiliaoId')){
                http.request(`turangfeiliao/info/${http.getParam('turangfeiliaoId')}`, 'get', {}, function(data) {
                    vue.detail = data.data
                });
            }

            // 提交
            form.on('submit(thisSubmit)', function (data) {
                data = data.field;
                data["yonghuId"]= localStorage.getItem("userid");
                if(http.getParam('turangfeiliaoId')){
                    data["id"]= http.getParam('turangfeiliaoId')
                }
                data["shangxia_types"]= 1;
                // 提交数据
                http.requestJson(`turangfeiliao/${http.getParam("turangfeiliaoId")?"update":"add"}`, 'post', data, function (res) {
                    if(res.code == 0){
                        layer.msg('提交成功', {
                            time: 2000,
                            icon: 6
                        }, function () {
                            vue.jump("../turangfeiliao/list.jsp");
                                http.remove('turangfeiliaoId')
                            // back();
                        });
                    }else{
                        layer.msg(res.msg, {
                            time: 5000,
                            icon: 5
                        });
                    }
                });
                return false
            });

        });
        // 日期框初始化
        function dateTimePick(){
            var myDate = new Date();  //获取当前时间
            /*
                ,change: function(value, date, endDate){
                    value       得到日期生成的值，如：2017-08-18
                    date        得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
                    endDate     得结束的日期时间对象，开启范围选择（range: true）才会返回。对象成员同上。
            */
        }




       // 土壤肥料类型的查询
       function turangfeiliaoTypesSelect() {
           //填充下拉框选项
           layui.http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=turangfeiliao_types", "GET", {}, (res) => {
               if(res.code == 0){
                   vue.turangfeiliaoTypesList = res.data.list;
               }
           });
       }


       // 是否上架的查询
       function shangxiaTypesSelect() {
           //填充下拉框选项
           layui.http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shangxia_types", "GET", {}, (res) => {
               if(res.code == 0){
                   vue.shangxiaTypesList = res.data.list;
               }
           });
       }



    </script>
</body>
</html>
