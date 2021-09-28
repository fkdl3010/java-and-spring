<%--
  Created by IntelliJ IDEA.
  User: com
  Date: 2021/09/09
  Time: 1:05 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  </head>
  <body>
  $END$
  <button onclick="location.href='/test'">버튼</button>
  <button onclick="test()">버튼</button>
  <button onclick="location.href='/insertTest'">insertTest버튼</button>
  </body>
<script>
  function test(){
    let testObj = {
      test: "Test",
      name: "gil"
    }
    let jsonObj = JSON.stringify(testObj)
    // $.ajax({
    //   contentType: 'application/json',
    //   data: jsonObj,
    //   type: 'POST',
    //   url:'/model',
    //   dataType: 'json',
    //   success: function(data) {
    //     console.log(data);
    //   }
    // })
    let xhtp = new XMLHttpRequest();
    xhtp.open("post", "/model")
    xhtp.setRequestHeader("Content-Type", "application/json");
    xhtp.send(jsonObj);
  }

</script>
</html>
