<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/public.css"/>
    <link rel="stylesheet" type="text/css" href="../../xznstatic/css/login.css"/>

    <link rel="stylesheet" href="../../css/theme.css"/>

    <style type="text/css">
        .login {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
            height: 100%;
            background-attachment: fixed;
            background-size: cover;
            background-position: center;
            background-image: url(/zhinenghuazhongzhi/img/front-img-bg.jpg);
        }
        .login form {
            box-sizing: border-box;
            min-height: 400px;
            display: flex;
            flex-direction: column;
            justify-content: center !important;
            position: inherit;
        }
        .login .logo, .login .title {
            box-sizing: border-box;
        }
        .login .logo img {
            display: block;
        }
        .login .title {
            text-align: center;
        }
        .login .form-item {
            display: flex;
            align-items: center;
            flex-wrap: wrap;
            box-sizing: border-box;
        }
        .login .form-item input, .login .form-label {
            box-sizing: border-box;
        }
        .login .btn-submit {
            display: block;
            box-sizing: border-box;
        }
        .login form p.txt {
            width: 100%;
            margin: 0;
            box-sizing: border-box;
        }
        .l-redio .layui-form-radio {
            margin: 0;
        }

        #loginForm .codes {
            display: none;
        }

        #loginForm .codes input {
            width: calc(100% - 84px);
            height: 44px;
            margin: 0;
            color: #1e90ff;
            font-size: 14px;
            padding: 0 10px;
            border-radius: 0;
            border-width: 1px;
            border-style: solid;
            border-color: #1e90ff;
            background-color: #fff;
            box-shadow: 0 0 6px rgba(30, 144, 255, 0);
            outline: none;
        }

        #loginForm .codes .nums {
            width: 84px;
            height: 44px;
            margin: 0;
            color: $template2.front.login.code.nums.color;
            font-size: $template2.front.login.code.nums.fontSize;
            padding: 0;
            border-radius: 0;
            border-width: 1px 1px 1px 0;
            border-style: solid;
            border-color: #1e90ff;
            background-color: #f5f5f5;
            box-shadow: 0 0 6px rgba(30, 144, 255, 0);
            outline: none;
            box-sizing: border-box;
        }

    </style>
</head>
<body>
<div id="app" class="login">
<form id="loginForm" class="layui-form login-form" :style='{"padding":"20px","boxShadow":"0px 0px 0px 0px rgba(201,214,164,1)","borderColor":"var(--publicSubColor)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"20px","borderWidth":"40px 100px","width":"700px","borderStyle":"solid","justifyContent":"center","height":"auto"}'>
    <h1 class="logo" v-if="false" :style='{"padding":"5px 0","boxShadow":"0 0 6px rgba(255,0,0,.8)","borderColor":"rgba(0,0,0,.3)","backgroundColor":"#fff","borderRadius":"6px","borderWidth":"0","borderStyle":"solid"}'><img :style='{"boxShadow":"0 0 6px rgba(255,0,0,.8)","margin":"0 auto","borderColor":"rgba(0,0,0,.3)","borderRadius":"100%","borderWidth":"1px","width":"44px","borderStyle":"solid","height":"44px"}' src="http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg"></h1>

    <div class="msg-warn hide title" v-if="true" :style='{"padding":"0 10px","boxShadow":"0 0 0px rgba(255,0,0,.8)","margin":"20px auto","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"var(--publicMainColor)","isshow":true,"borderRadius":"8px","borderWidth":"0","width":"50%","lineHeight":"32px","fontSize":"20px","borderStyle":"solid"}'>公共场所不建议自动登录，以防账号丢失</div>
    <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"0 auto","borderColor":"rgba(0,0,0,1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"80%","borderStyle":"solid","height":"64px"}' class="form-item">
        <label v-if="false" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"transparent","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0","width":"84px","fontSize":"16px","borderStyle":"solid"}' class="form-label">账号</label>
        <input :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,.5)","borderColor":"#ccc","backgroundColor":"#fff","color":"#333","borderRadius":"8px","textAlign":"left","borderWidth":"0","width":"100%","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
    </div>
    <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"0 auto","borderColor":"rgba(0,0,0,1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"80%","borderStyle":"solid","height":"64px"}' class="form-item">
        <label v-if="false" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"transparent","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0","width":"84px","fontSize":"16px","borderStyle":"solid"}' class="form-label">密码</label>
        <input :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,.5)","borderColor":"#ccc","backgroundColor":"#fff","color":"#333","borderRadius":"8px","textAlign":"left","borderWidth":"0","width":"100%","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    <div v-if="false" :style='{"padding":"0","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"0 auto","borderColor":"rgba(0,0,0,1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"80%","borderStyle":"solid","height":"64px"}' class="form-item">
        <label v-if="false" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"transparent","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0","width":"84px","fontSize":"16px","borderStyle":"solid"}' class="form-label">验证码</label>
        <input :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(0,0,0,.5)","borderColor":"#ccc","backgroundColor":"#fff","color":"#333","borderRadius":"8px","textAlign":"left","borderWidth":"0","width":"70%","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="text" id="code" placeholder="请输入验证码"  class="layui-input">
        <div class="nums" id="nums" style="display: flex;justify-content: center;align-items: center; width: 30%">
        </div>
    </div>

    <button :style='{"padding":"45px 0","boxShadow":"0 0 0px rgba(255,0,0,.5)","margin":"10px auto","borderColor":"#ccc","backgroundColor":"var(--publicMainColor)","color":"#fff","borderRadius":"50%","borderWidth":"0","width":"100px","fontSize":"20px","lineHeight":"0","borderStyle":"solid","height":"44px"}' class="layui-btn layui-btn-fluid layui-btn-danger btn-submit" lay-submit lay-filter="login">登录</button>
    <p :style='{"color":"var(--publicMainColor)","textAlign":"center","fontSize":"12px"}'><a style="color: inherit;font-size: inherit;" href="javascript:registerClick('yonghu')">注册用户</a></p>
</form></div>

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
<script type="text/javascript">
    var vue = new Vue({
        el: '#app',
        data: {
            menu: menu
        },
        methods: {
            jump(url) {
                jump(url)
            }
        }
    })
    var codes = [{
        num: 1,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 2,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 3,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 4,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }]


    layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
        var layer = layui.layer;
        var element = layui.element;
        var carousel = layui.carousel;
        var form = layui.form;
        var http = layui.http;
        var jquery = layui.jquery;

        function randomString() {
            var len = 4;
            var chars = [
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'
            ]
            var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
            var sizes = ['14', '15', '16', '17', '18']

            var output = []
            for (var i = 0; i < len; i++) {
                // 随机验证码
                var key = Math.floor(Math.random() * chars.length)
                codes[i].num = chars[key]
                // 随机验证码颜色
                var code = '#'
                for (var j = 0; j < 6; j++) {
                    var key = Math.floor(Math.random() * colors.length)
                    code += colors[key]
                }
                codes[i].color = code
                // 随机验证码方向
                var rotate = Math.floor(Math.random() * 45)
                var plus = Math.floor(Math.random() * 2)
                if (plus == 1) rotate = '-' + rotate
                codes[i].rotate = 'rotate(' + rotate + 'deg)'
                // 随机验证码字体大小
                var size = Math.floor(Math.random() * sizes.length)
                codes[i].size = sizes[size] + 'px'
            }

            var str = ''
            for(var i = 0;i<codes.length;i++) {
                str += '<span style="color:' + codes[i].color + ';transform:' + codes[i].rotate + ';fontSize:' + codes[i].size + ';padding: 0 3px;display:inline-block">'+codes[i].num+'</span>'
            }
            jquery('#nums').html('').append(str);
        }

        jquery('#nums').click(function(){
            randomString();
        })

        randomString();

        // 登录
        form.on('submit(login)', function(data) {


            data = data.field;
            data.role ='yonghu';
            if(false) {
                var arr = []
                for(var i = 0;i<codes.length;i++) {
                    arr.push(codes[i].num)
                }
                if(arr.join('').toLowerCase() != jquery('#code').val().toLowerCase()) {
                    alert("请输入正确的验证码");
                    randomString()

                    return false;
                }
            }
            http.request(data.role + '/login', 'get', data, function(res) {
                layer.msg('登录成功', {
                    time: 2000,
                    icon: 6
                });
                // 登录凭证
                localStorage.setItem('Token', res.token);
                localStorage.setItem('role', jquery('#role:checked').attr('title'));
                // 当前登录用户角色
                localStorage.setItem('userTable', data.role);
                localStorage.setItem('sessionTable', data.role);
                // 用户名称
                localStorage.setItem('adminName', data.username);
                http.request(data.role + '/session', 'get', {}, function(res) {
                    // 用户id
                    localStorage.setItem('userid', res.data.id);
                    // 路径访问设置
                    window.location.href = '../../index.jsp';
                })

            });
            return false
        });

    });

    /**
     * 跳转登录
     * @param {Object} tablename
     */
    function registerClick(tablename) {
        window.location.href = '../' + tablename + '/register.jsp?tablename=' + tablename;
    }



</script>
</body>
</html>
