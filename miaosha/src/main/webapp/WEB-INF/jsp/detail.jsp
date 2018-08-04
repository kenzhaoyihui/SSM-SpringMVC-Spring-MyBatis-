<%--
  Created by IntelliJ IDEA.
  User: yzhao_sherry
  Date: 7/22/18
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>Seckill Detail</title>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- jQuery cookie操作插件 -->
    <script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
    <!-- jQery countDonw倒计时插件  -->
    <script src="https://cdn.bootcss.com/jquery.countdown/2.1.0/jquery.countdown.min.js"></script>
    <!-- 开始编写交互逻辑 -->
    <script src="${basePath}resources/js/seckill.js"  type="text/javascript"></script>

</head>
<body>
<input type="hidden" id="basePath" value="${basePath}" />
<div class="container">
    <div class="panel panel-default text-center">
        <div class="panel-heading">
            <h1>${seckill.name}</h1>
        </div>
        <div class="panel-body">
            <h2 class="text-danger">
                <span class="glyphicon glyphicon-time"></span>
                <span class="glyphicon" id="seckillBox"></span>
            </h2>
        </div>
    </div>
</div>

<!-- 登录弹出层，输入电话 -->
<div id="killPhoneModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title text-center">
                    <span class="glyphicon gluphicon-phone"></span>TelPhone:
                </h3>
            </div>

            <div class="modal-body">
                <div class="row">
                    <div class="col-xs-8 col-xs-offset-2">
                        <input type="text" name="killphone" id="killphoneKey"
                               placeholder="phone^O^" class="form-control" />
                    </div>
                </div>
            </div>

            <div class="modal-footer">
                <span id="killphoneMessage" class="glyphicon"></span>
                <button type="button" id="killPhoneBtn" class="btn btn-success">
                    <span class="glyphicon glyphicon-phone"></span> Submit
                </button>
            </div>

        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        //使用EL表达式传入参数
        seckill.detail.init({
            seckillId : ${seckill.seckillId},
            startTime : ${seckill.startTime.time},
            endtime : ${seckill.endTime.time}
        });
    });
</script>
</body>
</html>
