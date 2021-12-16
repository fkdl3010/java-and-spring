<%--
  Created by IntelliJ IDEA.
  User: com.gil
  Date: 2021/09/28
  Time: 12:59 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <button onclick="fn_testBtn1()">버튼1</button>
  <table border="1">
    <thead>
    <tr>
      <th>이름</th>
      <th>나이</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>
        <input type="text" name="" id="name">
      </td>
      <td>
        <input type="text" name="" id="age">
      </td>
    </tr>
    </tbody>
  </table>
  <script>
    function fn_testBtn1(){
      fetch("/test1",{
        method: 'POST',
        headers:{
          "Content-Type":"application/json;charset=UTF-8"
        }
      })
      .then(res => res.json())
      .then((data) => {
        console.log(data)
        document.querySelector('#name').value = data.data.name
        document.querySelector('#age').value = data.data.age
      })
      .catch(e => console.log(e))
    }
  </script>
  </body>
</html>
