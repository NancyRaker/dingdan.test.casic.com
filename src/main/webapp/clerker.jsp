<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>航空航天售票系统</title>
    <link rel="stylesheet" href="css/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo"><span class="shenfen"></span>航空航天售票系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1572957833051&di=00badbd6d711d002eacdedb49bfebbac&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20120209%2FImg334155491.jpg" class="layui-nav-img">
                    <span class="user"></span>
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="logout.jsp">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">机票查询</a>
                </li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">用户查询</a>
                </li>
                <li class="class layui-nav-item">
                    <a href="../class.ajax/ajax.html" target="ck">售票系统</a>
                </li>
                <li class="student layui-nav-item"><a href="../student111.ajax/ajax.html"target="ck">退票系统</a></li>
                <li class="teacher layui-nav-item"><a href="../teacher.ajax/ajax.html"target="ck">机票改签</a></li>
                <li class="teacher layui-nav-item"><a href="../teacher.ajax/ajax.html"target="ck">支付页面</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style=" width:100%;height:100%">

            <iframe name="ck" class="view"style=" width:100%;height:100%" src="huanying.html"></iframe>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="css/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>
      

