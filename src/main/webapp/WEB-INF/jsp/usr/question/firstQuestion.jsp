<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		1.당신의 성별은?
		<form class="border" method="GET" action="secondQuestion">
			<button class="border" name="firstAnswer" value="남자" type="submit">남자</button>
			<button class="border" name="firstAnswer" value="여자" type="submit">여자</button>
		</form>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>