<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="border h-8 bg-green-300">
		${firstAnswer}
		${secondAnswer}
		${thirdAnswer}
	</div>
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		4.당신이 선호하는 언어는?
		<form class="border" method="GET" action="fifthQuestion">
			<input type="hidden" name="firstAnswer" value="${firstAnswer}" />
			<input type="hidden" name="secondAnswer" value="${secondAnswer}" />
			<input type="hidden" name="thirdAnswer" value="${thirdAnswer}" />
			<button class="border" type="submit" name="fourthAnswer" value="korean">한국어</button>
			<button class="border" type="submit" name="fourthAnswer" value="english">영어</button>
		</form>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>