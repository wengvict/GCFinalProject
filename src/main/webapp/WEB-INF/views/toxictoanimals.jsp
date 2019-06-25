<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>

<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>
<h1>Pets Lives Matter</h1>
<form action="/searchtoxstring">
Search by name: <input type="text" name="toxstring" placeholder="Try 'aloe'"> 
<input type="submit" value="Pet Lives Matter">

</form>

<form action="toxictopets">

<br>
<br>
<h5>or search by category</h5>
<br>

Cats<input type="checkbox" name="cats" value="cats" checked>
Dogs<input type="checkbox" name="dogs" value="dogs">
Horse<input type="checkbox" name="horse" value="horse"><br>
<input type="submit" value="Pet Lives Matter">
</form>



 
<h3>Toxic Archive</h3>

    <table>

        <thead>

            <tr>

               <td>Name</td>

            </tr>

        </thead>

        <tbody>

            <c:forEach items="${all}" var="p" begin="${counterstart }" end="${counterend }">

                <tr>

                    <td><a href="/toxicdetails?id=${p.id }">${p.commonname}</a></td>

                 

                </tr>

            </c:forEach>

        </tbody>

    </table>
    <a class="btn btn-primary" href="/toxicitypagenext?counterend=${counterend}">NEXT PAGE</a><br>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=a">A</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=b">B</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=d">C</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=e">E</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=f">F</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=g">G</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=h">H</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=i">I</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=j">J</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=k">K</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=l">L</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=m">M</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=n">N</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=o">O</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=p">P</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=q">Q</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=r">R</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=s">S</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=t">T</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=u">U</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=v">V</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=w">W</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=x">X</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=y">Y</a>
    <a class="btn btn-primary" href="/toxicitypageletter?letter=z">Z</a>

  

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>