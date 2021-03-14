<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="border h-8 bg-green-300">
		${firstAnswer}
		${secondAnswer}
	</div>
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		3.당신이 선호하는 유형은?
		<form class="border" method="GET" action="fourthQuestion">
			<input type="hidden" name="firstAnswer" value="${firstAnswer}" />
			<input type="hidden" name="secondAnswer" value="${secondAnswer}" />
			<button class="border" type="submit" name="thirdAnswer" value="wit">위트있게</button>
			<button class="border" type="submit" name="thirdAnswer" value="serious">진지하게</button>
		</form>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>