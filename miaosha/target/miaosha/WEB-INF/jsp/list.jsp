<%--
  Created by IntelliJ IDEA.
  User: yzhao_sherry
  Date: 7/22/18
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>Seckill List</title>
    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>Seckill List</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Seckill</th>
                    <th>StartTime</th>
                    <th>EndTime</th>
                    <th>CreateTime</th>
                    <th>Detail</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="sk" items="${list}">
                    <tr>
                        <td>${sk.name}</td>
                        <td>${sk.number}</td>
                        <td>
                            <fmt:formatDate value="${sk.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td>
                            <fmt:formatDate value="${sk.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td>
                            <fmt:formatDate value="${sk.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td>
                            <a class="btn btn-info" href="/seckill/${sk.seckillId}/detail" target="_blank">link</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>
</body>
</html>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
         <%--pageEncoding="UTF-8"%>--%>
<%--<!-- 引入jstl -->--%>
<%--<%@include file="common/tag.jsp" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="zh-CN">--%>
<%--<head>--%>
    <%--<%@include file="common/head.jsp"%>--%>
    <%--<title>秒杀列表页</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<!-- 页面显示部分 -->--%>
<%--<div class="container">--%>
    <%--<div class="panel panel-default">--%>
        <%--<div class="panel-heading text-center">--%>
            <%--<h2>秒杀列表</h2>--%>
        <%--</div>--%>
        <%--<div class="panel-body">--%>
            <%--<table class="table table-hover">--%>
                <%--<thead>--%>
                <%--<tr>--%>
                    <%--<th>名称</th>--%>
                    <%--<th>库存</th>--%>
                    <%--<th>开始时间</th>--%>
                    <%--<th>结束时间</th>--%>
                    <%--<th>创建时间</th>--%>
                    <%--<th>详情页</th>--%>
                <%--</tr>--%>
                <%--</thead>--%>
                <%--<tbody>--%>
                <%--<c:forEach var="sk" items="${list}">--%>
                    <%--<tr>--%>
                        <%--<td>${sk.name}</td>--%>
                        <%--<td>${sk.number}</td>--%>
                        <%--<td>--%>
                            <%--<fmt:formatDate value="${sk.startTime}" pattern="yyy-MM-dd HH:mm:ss"/>--%>
                        <%--</td>--%>
                        <%--<td>--%>
                            <%--<fmt:formatDate value="${sk.endTime}" pattern="yyy-MM-dd HH:mm:ss"/>--%>
                        <%--</td>--%>
                        <%--<td>--%>
                            <%--<fmt:formatDate value="${sk.createTime}" pattern="yyy-MM-dd HH:mm:ss"/>--%>
                        <%--</td>--%>
                        <%--<td>--%>
                            <%--<a class="btn btn-info" href="${basePath}seckill/${sk.seckillId}/detail" target="_blank">link</a>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                <%--</c:forEach>--%>
                <%--</tbody>--%>
            <%--</table>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<%--<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->--%>
<%--<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<%--<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->--%>
<%--<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>--%>
<%--</body>--%>
<%--</html>--%>


