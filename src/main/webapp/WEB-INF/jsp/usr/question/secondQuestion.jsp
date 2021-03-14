<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="border h-8 bg-green-300">
		${firstAnswer}
	</div>
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		2.당신의 연령대는?
		<form class="border" method="GET" action="thirdQuestion">
			<input type="hidden" name="firstAnswer" value="${firstAnswer}" />
			<button class="border" type="submit" name="secondAnswer" value="young">1~30세</button>
			<button class="border" type="submit" name="secondAnswer" value="old">31~60세</button>
		</form>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>