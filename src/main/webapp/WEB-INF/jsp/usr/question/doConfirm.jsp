<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="border h-8 bg-green-300">
		${firstAnswer}
		${secondAnswer}
		${thirdAnswer}
		${fourthAnswer}
		${fifthAnswer}
	</div>
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		이대로 검색하시겠습니까?
		<form class="border" method="GET" action="confirm">
			<input type="hidden" name="firstAnswer" value="${firstAnswer}" />
			<input type="hidden" name="secondAnswer" value="${secondAnswer}" />
			<input type="hidden" name="thirdAnswer" value="${thirdAnswer}" />
			<input type="hidden" name="fourthAnswer" value="${fourthAnswer}" />
			<input type="hidden" name="fifthAnswer" value="${fifthAnswer}" />
			<button class="border" type="submit" name="confirm" value="confirm">확인</button>
			<button class="border" type="submit" name="cancel" value="cancel">취소</button>
		</form>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>